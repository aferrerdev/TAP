/**
 * Created by Alex on 15/09/2015.
 */
public class InvestFund extends Account
{
    public InvestFund()
    {
        super();
        this.setInterest_rate(0.34);
    }
    @Override
    public double retrieveMoney(double money) throws Exception {
            throw new Exception("Cannot retrieve money of IF account!");
    }
}
