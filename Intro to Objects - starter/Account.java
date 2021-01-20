import java.text.NumberFormat;
import java.util.Scanner; 
public class Account
{
   private NumberFormat fmt = NumberFormat.getCurrencyInstance();

   private final double RATE = 0.035;  // interest rate of 3.5%
   private int acctNumber;
   private double balance;
   private String name, password;

   /**----------------------------------------------------------------
   *  Sets up the account by defining its owner, account number,
   *  and initial balance.
   *  @param String owner, int account number, double intial balance 
   */
   
   public Account (String owner, int account, double initial, String pass)
 {
   name = owner;
   acctNumber = account;
   balance = initial;
   Scanner keyboard = new Scanner(System.in); 
   while (pass.length() < 8) 
   {
       System.out.print("Password is not 8 chars, please re enter");
       pass = keyboard.nextLine(); 
       
    }
  password = pass; 
  
 }
 public double deposit (double amount, String input)
 {
     if (pass.equals(password))
     {
         balance += amount; 
         return balance; 
        }
     else
     {
         System.out.print("No workey password"); 
         return 0;
        }
    }
 private double calc_Interest (double amount)
 {
     double interest = balance * rate; 
     balance =+ interest; 
    }
    
  /**
   * Transfer Method 
   * @param rAccount
   * @return new balance
   */  
  public double transfer (Account obj)
  
  {
      // direct access to objects
      //obj.deposit (-1000);
      balance += amount; 
      obj.balance -= amount; 
      
      return balance; 
  }
    /**
     * Returns a one - line description of the account as a string
     * @ return string 
     */
 public String toString()
 {   
     
    }
}