package Bank;

public class Customer {
    private String name;
    private String id;
    private BankAccount bankAccount;

    public Customer(String name, String id, BankAccount bankAccount) {
        this.name = name;
        this.id = id;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void viewAccountDetails() {
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: " + bankAccount.getBalance());
    }
}
