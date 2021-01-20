// student outline of Pair of Dice

public class PairOfDice
{
    //private data-- 2 die





    /**---------- Default Constructor
        Creates two six-sided Die objects, both with an initial
        face value of one.
    */
   public PairOfDice()
   {
     die1 = new Die(); 
     die2 = new Die(); 
     value1 = 1; 
     value2 = 1;
     total = value1 + value2; 
     
    }



    /**----------- roll()
        Rolls both dice and returns the combined result.
        @return
    */
   public int roll()
   {
     //Random gen = new Random(); we already did this 
     die1.roll(); 
     die2.roll(); 
     
     return die1.getFaceValue()+die2.getFaceValue(); 
    }


    /**-------------- getTotal()
        Returns the current combined dice total.
        @return
    */

   public int getTotal()
   {
       return die1.getFaceValue()+die2.getFaceValue();
    }


    /**---------------- getDie1()
        Returns the current value of the first die.
        @return
    */


    /**------------- getDie2()
        Returns the current value of the second die.
        @return
    */


    /**------------- toString()
            Returns the current data for each die
            hint: use methods in die to build the String to return
            @return
    */




}
