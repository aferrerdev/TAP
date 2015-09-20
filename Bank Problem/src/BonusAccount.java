/**
 * Created by Alex on 15/09/2015.
 */
public class BonusAccount extends Account
{
    public BonusAccount()
    {
        super();
        this.setInterest_rate(0.6);
    }
    @Override
    public double retrieveMoney(double money) throws Exception {
        if(balance > 0 && balance-money > 0)
        {
            balance = balance-money;
            return balance;
        }
        else
            throw new Exception("Not enought money!");
    }
}
