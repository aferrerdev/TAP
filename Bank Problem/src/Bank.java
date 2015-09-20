import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Alex on 15/09/2015.
 */
public class Bank
{
    private ArrayList<Customer> customers;
    private ArrayList<Account> accounts;

    // Bank Constructor
    public Bank()
    {
        this.customers = new ArrayList<Customer>();
        this.accounts = new ArrayList<Account>();
    }
    // Add new customer to customers array.
    public void addCustomer(Customer client)
    {
        customers.add(client);
    }
    // Add new account to accounts array.
    public void addAccount(Account account)
    {
        accounts.add(account);
    }
    public Account lottery() throws Exception {
        int max = accounts.size();
        if(max > 0)
        {
            Random random = new Random();
            int num = random.nextInt(max);
            Account winner = accounts.get(num);
            winner.depositMoney(300);
            return accounts.get(num);
        }
        else
            throw new Exception("Empty accounts list in bank.");
    }
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
