/**
 * Created by Alex on 15/09/2015.
 */
public class SaveAccount extends Account
{
    public SaveAccount(String ID, Customer customer, double startMoney) {
        super(ID, customer,startMoney);
        this.setInterest_rate(0.2);
    }
}
