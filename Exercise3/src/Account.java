/**
 * Created by Alex on 29/09/2015.
 */
public class Account
{
    String id;
    String owner;
    AccType type;
    double balance;

    public Account(String id, String owner, String type, double balance) {
        this.balance = balance;
        this.id = id;
        this.owner = owner;

        // Set type.
        switch (type)
        {
            case "IF":
                this.type = AccType.IF;
                break;
            case "CA":
                this.type = AccType.CA;
                break;
            case "SA":
                this.type = AccType.SA;
                break;
            case "BA":
                this.type = AccType.BA;
                break;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", id='" + id + '\'' +
                ", owner='" + owner + '\'' +
                ", type=" + type +
                '}';
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public AccType getType() {
        return type;
    }

    public void setType(AccType type) {
        this.type = type;
    }
}
