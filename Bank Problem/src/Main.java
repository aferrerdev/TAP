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
        bank.addCustomer(alex);
        bank.addCustomer(adria);
        bank.addCustomer(jon);
        bank.addCustomer(adria);
        showCustomers(bank);

        // Creating Bank Accounts.
        bank.addAccount(new InvestFund("1",alex,5000));
        bank.addAccount(new CheckingAccount("2",adria,2000));
        bank.addAccount(new BonusAccount("3", adria, 3000));
        bank.addAccount(new SaveAccount("4", javi, 6000));
        showAccounts(bank);

        try
        {
            Account win_account = bank.lottery();
            System.out.println("\nWinner Account:"+win_account.toString());
        }
        catch (Exception e)
        {
            // If account list in bank is empty will show an Exception.
            System.out.println(e.getMessage());
        }
    }
    /**
     * Show customer information using toString method.
     * @param bank
     */
    public static void showCustomers(Bank bank) {
         ArrayList<Customer> customers = bank.getCustomers();
         System.out.println("\nBank Customers:");
         for(Customer client: customers)
         {
             System.out.println(client.toString());
         }
    }
    public static void showAccounts(Bank bank) {
    ArrayList<Account> accounts = bank.getAccounts();
    System.out.println("\nBank Accounts:");
    for(Account account: accounts)
    {
        System.out.println(account.toString());
    }
}
}
