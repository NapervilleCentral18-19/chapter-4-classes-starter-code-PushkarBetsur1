import java.text.DecimalFormat;
import java.text.NumberFormat;

//import javax.swing.*;

public class mathy
{   // scope of var is entire class
    private int area=0; // we do not ini when we create

    /**
        default constructor - stubed in
        will ini all variables
    */
    public mathy( )
    {   // scope of var is local, not ini area in the class
        area = 0; 
        //stubbing in method 
        System.out.println ("hi from default constructor" );

    }//end of default const
     public static double abs(double value)
   {    if (value < 0 )
            value = -value;
       
      return value;  
    }
    
    /**
     * add method takes two int and returns the sum 
     * @param int value, int value
     * @return sum of value  + value 
     */
    
    public int add(int value1, int value2)
    {   
        return value1 + value2;  
    }
    public String toString()
    {
        return ("Hi what do you want?, I'm just Mathy");

    }

    /**
    take the absoulute value of the number
    must change the parameters - number of or type of 
    @param double value
    @return absoulute value of number
    */

   //public  double abs(double value)
   //{    if (value < 0 )
  //          value = -value;
       
     // return 0.0;  
   // }
}//end of class