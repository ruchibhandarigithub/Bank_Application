import java.util.UUID;

public class SBI implements Bank{
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateOfInterest;

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance+=amount;
        return "Your balance has been added";
    }

    public SBI(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.rateOfInterest=5.5;
    }

    public String getName() {
        return name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    @Override
    public String withdrawMoney(int amount, String password) {
        if(password.equals(password)){
            if(balance<amount){
                return "insufficent balance";
            }
            else{
                balance=balance - amount;
                return "Money withdrawal";

            }
        }
        else {
            return "Wrong password !!";
        }
    }

    @Override
    public double calculateInterest(int year) {

        return (balance*year*rateOfInterest)/100;
    }
}
