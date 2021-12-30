package final_exam.services;


import final_exam.common.AppConstant;
import final_exam.common.FileHelper;

import final_exam.models.Account;
import final_exam.models.PaymentAccount;
import final_exam.models.SavingAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BankAccount implements IAccountManager {
    private FileHelper<BankAccount> fileHelper = new FileHelper<>();
    private static List<Account> bankAccounts = getFromFile();

    @Override
    public void getAll() {
        int size = bankAccounts.size();
        for (int i = 0; i < size; i++) {
            System.out.println(bankAccounts.get(i).toString());
        }
    }

    @Override
    public List search() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of account : ");
        String name = scanner.nextLine();
        return bankAccounts.stream().filter(e -> e.getNameAccount().contains(name)).collect(Collectors.toList());

    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        int choose = inputYourChoose();
        int id;
        if (bankAccounts.size() == 0) {
            id = 0;
        } else {
            id = bankAccounts.get(bankAccounts.size() - 1).getId() + 1;
        }
        System.out.printf("Code of account : ");
        int codeOfAccount = Integer.parseInt(scanner.nextLine());
        System.out.printf("Name account : ");
        String nameOfAccount = scanner.nextLine();
        System.out.printf("Date created : ");
        String dateCreated = scanner.nextLine();
        if (choose == 1) {
            System.out.printf("Saved money : ");
            double savedMoney = Double.parseDouble(scanner.nextLine());
            System.out.printf("Savings day : ");
            String savingsDay = scanner.nextLine();
            System.out.printf("Interest rate : ");
            double interestRate = Double.parseDouble(scanner.nextLine());
            System.out.printf("Period : ");
            int period = Integer.parseInt(scanner.nextLine());
            Account savingAccount = new SavingAccount(id, codeOfAccount, nameOfAccount, dateCreated, savedMoney, savingsDay, interestRate, period);
            bankAccounts.add(savingAccount);
        } else {
            System.out.printf("Number of card : ");
            int numbersOfCard = Integer.parseInt(scanner.nextLine());
            System.out.printf("Amount of money : ");
            double money = Double.parseDouble(scanner.nextLine());
            Account paymentAccount = new PaymentAccount(id, codeOfAccount, nameOfAccount, dateCreated, numbersOfCard, money);
            bankAccounts.add((PaymentAccount) paymentAccount);
        }
        System.out.println("Created successful!");
        fileHelper.write(AppConstant.Path.bankAccount, bankAccounts, true);
    }

    @Override
    public void delete() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input code of account : ");
        int code = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i).getCodeOfAccount() == code) {
                System.out.println("Yes or No (Y/N) : ");
                if (scanner.nextLine() == "Y") {
                    bankAccounts.removeIf(e -> e.getCodeOfAccount() == code);
                }
            }


        }
    }

    private static int inputYourChoose() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("1. Saving Account\n2. Payment Account\n");
        int choose;
        do {
            System.out.printf("Input your choose: ");
            choose = Integer.parseInt(scanner.nextLine());
        } while (choose <= 0 || choose > 2);

        return choose;
    }

    private static List<Account> getFromFile() {
        List<Account> res = new ArrayList<>();

        List<String> lines = FileHelper.read(AppConstant.Path.bankAccount);
        if (lines.size() > 0 && lines.size() == 8) {
            for (String line : lines) {
                String[] tmp = line.split(",");
                int id = Integer.parseInt(tmp[0]);
                int codeOfAccount = Integer.parseInt(tmp[1]);
                String nameAccount = tmp[2];
                String dateCreated = tmp[3];
                double savedMoney = Double.parseDouble(tmp[4]);
                String savingsDay = tmp[5];
                double interestRate = Double.parseDouble(tmp[6]);
                int period = Integer.parseInt(tmp[7]);
                Account savingAccount = new SavingAccount(id, codeOfAccount, nameAccount, dateCreated, savedMoney, savingsDay, interestRate, period);
                res.add((PaymentAccount) savingAccount);
            }
        } else if (lines.size() > 0 && lines.size() == 6) {
            for (String line : lines) {
                String[] tmp = line.split(",");
                int id = Integer.parseInt(tmp[0]);
                int codeOfAccount = Integer.parseInt(tmp[1]);
                String nameAccount = tmp[2];
                String dateCreated = tmp[3];
                int numberOfCard = Integer.parseInt(tmp[4]);
                double amountOfMoney = Double.parseDouble(tmp[5]);

                Account paymentAccount = new PaymentAccount(id, codeOfAccount, nameAccount, dateCreated, numberOfCard, amountOfMoney);
                res.add((PaymentAccount) paymentAccount);
            }
        }

        return res;
    }
}
