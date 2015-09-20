import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // Creating Bank instance.
        Bank bank = new Bank();

        // Createting Bank Customers.
        Customer alex = new Customer("1","Alex","El Vendrell","666000000");
        Customer adria = new Customer("2","Adria","Coma-Ruga","666000000");
        Customer jon = new Customer("3","Jon","Bellvei","666000000");
        Customer javi = new Customer("4","Javi","Tarragona","666000000");
        // Add Customers to Bank.
        bank.addCustomer(alex); bank.addCustomer(adria); bank.addCustomer(jon); bank.addCustomer(adria);
        // Show Bank Customers.
        showCustomers(bank);

        // Creating Bank Accounts.
        InvestFund account1 = new InvestFund("1",alex);
        account1.depositMoney(400);
        bank.addAccount(account1);
        showAccounts(bank);
    }
    /**
     * Show customer information using toString method.
     * @param customers
     */
    public static void showCustomers(Bank bank) {
         ArrayList<Customer> customers = bank.getCustomers();
         System.out.println("\nBank Customers:");
         for(Customer client: customers)
         {
             System.out.println(client.toString());
         }
    }public static void showAccounts(Bank bank) {
    ArrayList<Account> accounts = bank.getAccounts();
    System.out.println("\nBank Accounts:");
    for(Account account: accounts)
    {
        System.out.println(account.toString());
    }
}
}
