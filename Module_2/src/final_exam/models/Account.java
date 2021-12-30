package final_exam.models;

public abstract class Account {
    private int id;
    private int codeOfAccount;
    private String nameAccount;
    private String dateCreated;

    public Account() {
    }

    public Account(int id, int codeOfAccount, String nameAccount, String dateCreated) {
        this.id = id;
        this.codeOfAccount = codeOfAccount;
        this.nameAccount = nameAccount;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodeOfAccount() {
        return codeOfAccount;
    }

    public void setCodeOfAccount(int codeOfAccount) {
        this.codeOfAccount = codeOfAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
