//********************************************************************
//  Banking.java       Author: Lewis/Loftus/Cocking
//
//  Driver to exercise the use of multiple Account objects.
//********************************************************************
import java.util.*;
public class Banking
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   
   public static void main (String[] args)
   {
      Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
      Account acct2 = new Account ("Anita Gomez", 69713, 40.00);
      Account acct3 = new Account ("Sanchit Reddy", 93757, 759.32);
      Account acct4 = new Account ("Pushkar",72847,0); //opens account with no balance
      
      
      Scanner keyboard = new Scanner (System.in);   
      boolean exit = false;
      while (exit == false){
      System.out.println("Please choose your option: 1 for Deposit, 2 for Withdraw and 3 for Transfer 4 for Exit");
      int choice = keyboard.nextInt();  
      if (choice == 1)
      {
          acct1.deposit (321);
          acct1.addInterest();
          acct2.addInterest();
          acct3.addInterest();
          System.out.println("You have made a sucessful deposit");
        }
      else if (choice == 2)
      {
          acct1.withdraw(29.45,1);
          acct1.addInterest();
          acct2.addInterest();
          acct3.addInterest();
          System.out.println("You have made a sucessful withdrawl");
        }
      else if (choice == 3)
      {
          acct3.transfer(acct2);
          acct1.addInterest();
          acct2.addInterest();
          acct3.addInterest();
          System.out.println("You have made a sucessful transfer");
        }
      else if (choice == 4)
      {
          exit = true;
          
        }
      else
        System.out.println("Please enter a valid option");
      
     

      System.out.println ();
      System.out.println (acct1);
      System.out.println (acct2);
      System.out.println (acct3);
   }
   /*Please choose your option: 1 for Deposit, 2 for Withdraw and 3 for Transfer 4 for Exit
    * 1
    * You have made a sucessful deposit

    * Name: Ted Murphy 	 Account Number: 72354 	 Balance: 438.3846
    * Name: Anita Gomez 	 Account Number: 69713 	 Balance: 41.4
    * Name: Sanchit Reddy 	 Account Number: 93757 	 Balance: 785.8962
    * Please choose your option: 1 for Deposit, 2 for Withdraw and 3 for Transfer 4 for Exit
    * 2
    * You have made a sucessful withdrawl

    * Name: Ted Murphy 	 Account Number: 72354 	 Balance: 422.212311
    * Name: Anita Gomez 	 Account Number: 69713 	 Balance: 42.849
    * Name: Sanchit Reddy 	 Account Number: 93757 	 Balance: 813.402567
    * Please choose your option: 1 for Deposit, 2 for Withdraw and 3 for Transfer 4 for Exit
    * 3
    * Enter amount to transfer100
    * Please transfer a valid amount
    * You have made a sucessful transfer

    * Name: Ted Murphy 	 Account Number: 72354 	 Balance: 436.989741885
    * Name: Anita Gomez 	 Account Number: 69713 	 Balance: 44.348715
    * Name: Sanchit Reddy 	 Account Number: 93757 	 Balance: 841.871656845
    * Please choose your option: 1 for Deposit, 2 for Withdraw and 3 for Transfer 4 for Exit
    * 4

    * Name: Ted Murphy 	 Account Number: 72354 	 Balance: 436.989741885
    * Name: Anita Gomez 	 Account Number: 69713 	 Balance: 44.348715
    * Name: Sanchit Reddy 	 Account Number: 93757 	 Balance: 841.871656845
    * 
    */
}
}