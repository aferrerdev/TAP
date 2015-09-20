/**
 * Created by Alex on 15/09/2015.
 */
public class CheckingAccount extends Account
{
    public CheckingAccount(String ID, Customer customer, double startMoney) {
        super(ID, customer,startMoney);
        this.setInterest_rate(0.1);
        this.setAccout_comission(0);
    }
}
