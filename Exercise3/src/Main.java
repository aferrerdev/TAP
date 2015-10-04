import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException
    {
        List<Account> accounts = new LinkedList<Account>();

        // Parsing accounts.txt.
        FileReader fis = new FileReader("accounts.txt");
        BufferedReader dis = new BufferedReader(fis);
        String line;
        while ((line = dis.readLine()) != null) {
            System.out.println("Account: ------------------------------");
            StringTokenizer tokens = new StringTokenizer(line, ",");
            Account a = new Account(Double.parseDouble(tokens.nextToken()),tokens.nextToken(),tokens.nextToken(),AccType.valueOf(tokens.nextToken()));
            accounts.add(a);
        }
        dis.close();

        // Use stream.map to increment the balance of all accounts in 10 euros
        List<Account> addaccounts = accounts.stream().map(p -> {p.setBalance(p.getBalance() + 10);});





    }
}
