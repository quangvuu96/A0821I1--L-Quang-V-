package final_exam.models;

public class SavingAccount extends Account{
    private double savedMoney;
    private String savingsDay;
    private double interestRate;
    private int period;

    public SavingAccount(int id, int codeOfAccount, String nameAccount, String dateCreated, double savedMoney, String savingsDay, double interestRate, int period) {
        super(id, codeOfAccount, nameAccount, dateCreated);
        this.savedMoney = savedMoney;
        this.savingsDay = savingsDay;
        this.interestRate = interestRate;
        this.period = period;
    }

    public double getSavedMoney() {
        return savedMoney;
    }

    public void setSavedMoney(double savedMoney) {
        this.savedMoney = savedMoney;
    }

    public String getSavingsDay() {
        return savingsDay;
    }

    public void setSavingsDay(String savingsDay) {
        this.savingsDay = savingsDay;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
    @Override
    public String toString(){
        return  "Payment Account{ ID : " + getId() +
                ", " + getCodeOfAccount() +
                ", " + getNameAccount() +
                ", " + getDateCreated() +
                ", " + getSavedMoney() +
                ", : " + getSavingsDay() +
                ", : " + getInterestRate() +
                ", : " + getPeriod() +
                "}";
    }
}
