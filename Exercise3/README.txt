Exercise 3: We will import information from the accounts.txt file in CSV format (Comma separated values). Use TAP1/other/Tokens.
Import this information in a List of Accounts where the four parameters correspond to:
  id :String, owner:String, type:enum[IF,CA,BA,SA], balance:double
Perform the following operations:
 Use stream.map to increment the balance of all accounts in 10 euros
 Use stream.filter to obtain all account of type IF
 Use stream.max to obtain the account with the highest balance
 Combine filter and max to obtain the IF account with higher balance