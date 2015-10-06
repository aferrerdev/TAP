import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Exercici Clousures.
public class Main {

    public static void main(String[] args) throws IOException
    {
        List<Account> accounts = new LinkedList<Account>();

        // Parsing accounts.txt.
        FileReader fis = new FileReader("accounts.txt");
        BufferedReader dis = new BufferedReader(fis);
        String line;
        while ((line = dis.readLine()) != null)
        {
            StringTokenizer tokens = new StringTokenizer(line, ",");
            while (tokens.hasMoreTokens())
            {
                Account a = new Account(tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), Double.parseDouble(tokens.nextToken()));
                accounts.add(a);
            }

        }
        dis.close();


        System.out.println("Exercise 1: MAP");

        // Use stream.map to increment the balance of all accounts in 10 euros
        List<Account> result0 = accounts.stream().map((Account c) -> { c.setBalance(c.getBalance() + 10); return c;}).collect(Collectors.toList());
        // Mostrar els canvis.
        accounts.forEach((Account c) -> System.out.println(c.toString()));

        System.out.println("Exercise 2: FILTER");

        Stream<Account> result = accounts.stream().filter(acc -> acc.getType().equals(AccType.IF));
        result.forEach(e -> System.out.println(e));

        System.out.println("Exercise 2: MAX");

        Stream<Account> result1 = accounts.stream().filter(acc -> acc.getType().equals(AccType.IF));
        Account resultacc = result1.max((e1,e2)->Double.compare(e1.getBalance(),e2.getBalance())).get();
        System.out.println(resultacc);



    }
}
