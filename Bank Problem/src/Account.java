/**
 * Created by Alex on 15/09/2015.
 */
public abstract class Account
{
    private String ID;
    private Customer customer;
    private double accout_comission;
    private double balance;
    private double interest_rate;

    private void depositMoney(double moneyToDeposit)
    {
        this.balance = this.balance + moneyToDeposit;
    }
    private double withdrawMoney(double money) throws Exception {
        if(balance > 0 && balance-money > 0)
        {
            balance = balance-money;
            return balance;
        }
        else
            throw new Exception("Not enought money!");
    }
    private double checkBalance(){
        return balance;
    }
    private void changeClient(Customer client){
        this.customer = client;
    }
    private void monthlyRevision()
    {
        balance = balance + balance * interest_rate - accout_comission;
    }
    public String getID()
    {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getAccout_comission() {
        return accout_comission;
    }
    public void setAccout_comission(double accout_comission) {
        this.accout_comission = accout_comission;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance + balance;
    }
    public double getInterest_rate() {
        return interest_rate;
    }
    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

}
