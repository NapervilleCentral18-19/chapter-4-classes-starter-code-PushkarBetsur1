//********************************************************************
//  Student.java       Author: Lewis/Loftus/Cocking
//
//  Represents a college student.
//********************************************************************
//Pushkar Betsur 
public class Student
{
   private String firstName, lastName;
   private Address homeAddress;
   private int t1, t2, t3;
   private double avg;
   private Address schoolAddress = new Address ("440 Aurora Ave.", "Naperville",
                                    "IL", 60532);
   //-----------------------------------------------------------------
   //  Sets up this Student object with the specified initial values.
   //-----------------------------------------------------------------
   public Student (String first, String last, Address home)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      //schoolAddress = school;
     
     
   }
   public Student (String fn, String ln, Address H, Address School)
   {
      firstName = fn;
      lastName = ln;
      homeAddress = H;
      t1 = 0;
      t2 = 0;
      t3 = 0;
     
   }
   //suhas helped me implement switches for the following code
   /**
    * these will set the test scores 
    * @param - will take scores and the number for the test
    */
   public void setTestScore(int tnum, int tscore)
        {
            switch(tnum)
            {
                case 1:
                    t1 = tscore;
                    break;

                case 2:
                    t2 = tscore;
                    break;

                case 3:
                    t3 = tscore;
                    break;

                default:
                    return;

            }
        }
      public int getTestScore(int tnum)
      {
            switch(tnum)
            {
                case 1:
                    return t1;

                case 2:
                    return t2;

                case 3:
                    return t3;

                default:
                    return 0;

            }
        }
        /**
         * this method finds the average of the 3 test scores
         */
   public double average()
     {
            avg = (t1 + t2 + t3)/3;
            return avg;
    }
    /**
    * Copy Constructor - will copy all info into new object
    * @param student object
    */
   public Student ( Student other)
   {
       this.firstName = other.firstName;
       this.lastName = other.lastName;
       homeAddress = other.homeAddress;
       schoolAddress = new Address(other.schoolAddress);
       
    }
    /**
     * this is the equals method to compare two students names
     * @param - the name of the student ie its object. 
     */
   public void equals(Student op)
   {
       if( this.firstName.equals(op.firstName))
       {
           if (this.lastName.equals(op.lastName))
           {
               System.out.print( "Student 1 is the same as Student 2");
               
            }
        }
       System.out.print("Student 1 is not the same as Student2");
       
       
    }
   //-----------------------------------------------------------------
   //  Returns this Student object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String data;

      data = firstName + " " + lastName + "\n";
      data += "Home Address:\n" + homeAddress + "\n";
      data += "School Address:\n" + schoolAddress+"\n";
      data += "Test Scores:\n";
      data += "Test #1: " + t1 + "\n";
      data += "Test #2: " + t2 + "\n";
      data += "Test #3: " + t3 + "\n";
      data += "Average Score: " + average() ;
      
      
      return data;
   }
}
