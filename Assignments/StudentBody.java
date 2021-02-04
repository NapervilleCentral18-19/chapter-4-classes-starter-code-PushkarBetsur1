//********************************************************************
//  StudentBody.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of an aggregate class.
//********************************************************************
//Pushkar Betsur
public class StudentBody 
{
   //-----------------------------------------------------------------
   //  Creates some Address and Student objects and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      //Address NCHSaddress = new Address ("440 Aurora Ave.", "Naperville",
                                    //"IL", 60532);
      
       // address for the simpsons
      Address simpsonshome = new Address ( "742 Evergreen Terrace","Springfield","IL",60231);
      // my address 
      Address myhome = new Address ("5751 OakRidge Way", "Lisle","IL", 60532);
     
      
      Student stu1 = new Student("Lisa" , "Simpson" , simpsonshome );
      
      stu1.setTestScore(1,99);
      stu1.setTestScore(2,99);
      stu1.setTestScore(3,99);
      stu1.average();
      System.out.println (stu1);
      System.out.println();
      
      
      Student stu2 = new Student("Bart", "Simpson", simpsonshome);
      stu2.setTestScore(1,45);
      stu2.setTestScore(2,35);
      stu2.setTestScore(3,25);
      stu2.average();
      System.out.println(stu2);
      stu2.equals(stu1);
      System.out.println();
      System.out.println();
      
      
      Student stu3 = new Student("Pushkar", "Betsur", myhome); // student from user
      stu3.setTestScore(1,54);
      stu3.setTestScore(2,123);
      stu3.setTestScore(3,86);
      stu3.average();
      System.out.println(stu3);
      stu3.equals(stu2);
      
   }
}
