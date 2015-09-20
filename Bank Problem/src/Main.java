import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // Creating Bank instance.
        Bank bank = new Bank();

        // Createting Bank Customers.
        bank.addCustomer(new Customer("1","Alex","El Vendrell","666000000"));
        bank.addCustomer(new Customer("2","Adria","Coma-Ruga","666000000"));
        bank.addCustomer(new Customer("3","Jon","Bellvei","666000000"));
        bank.addCustomer(new Customer("4","Javi","Tarragona","666000000"));
        showCustomers(bank.getCustomers());

        // Creating Bank Accounts.
        bank.addAccount(new InvestFund());
    }
    /**
     * Show customer information using toString method.
     * @param customers
     */
    public static void showCustomers(ArrayList<Customer> customers) {
         System.out.println("\nBank Customers:");
         for(Customer client: customers)
         {
             System.out.println(client.toString());
         }
    }
}
