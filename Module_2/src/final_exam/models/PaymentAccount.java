package final_exam.models;

public class PaymentAccount extends Account{
    private int numberOfCard;
    private double amountOfMoney;

    public PaymentAccount(int id, int codeOfAccount, String nameAccount, String dateCreated, int numberOfCard, double amountOfMoney) {
        super(id, codeOfAccount, nameAccount, dateCreated);
        this.numberOfCard = numberOfCard;
        this.amountOfMoney = amountOfMoney;
    }

    public int getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(int numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
    @Override
    public String toString(){
        return  "Payment Account{ ID : " + getId() +
                ", " + getCodeOfAccount() +
                ", " + getNameAccount() +
                ", " + getDateCreated() +
                ", " + getNumberOfCard() +
                ", " + getAmountOfMoney() +
                "}";
    }
}
