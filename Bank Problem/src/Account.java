/**
 * Created by Alex on 15/09/2015.
 */
public abstract class Account
{
    protected String ID;
    protected Customer customer;
    protected double accout_comission;
    protected double balance;
    protected double interest_rate;

    public Account(String ID, Customer customer, double startMoney) {
        this.ID = ID;
        this.customer = customer;
        this.balance = startMoney;
    }
    public void depositMoney(double moneyToDeposit)
    {
        this.balance = this.balance + moneyToDeposit;
    }
    public double retrieveMoney(double money) throws Exception {
        if(balance > 0 && balance-money > 0)
        {
            balance = balance-money;
            return balance;
        }
        else
            throw new Exception("Not enought money!");
    }
    public double checkBalance(){
        return balance;
    }
    public void changeClient(Customer client){
        this.customer = client;
    }
    public void monthlyRevision()
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

    @Override
    public String toString() {
        return "Account{" +
                "ID='" + ID + '\'' +
                ", customer=" + customer +
                ", accout_comission=" + accout_comission +
                ", balance=" + balance +
                ", interest_rate=" + interest_rate +
                '}';
    }
}
