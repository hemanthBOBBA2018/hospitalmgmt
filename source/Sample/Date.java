//Program to check whether the given date is vaalid or not 

public class Date
{
  public static void main ( String str[])
  {
     int day = 32, month = 11, year = 2017;
     
       if ( day <= 0 || day > 31)
         System.out.println("Invalid day");
         
         if ( month <= 0 || month > 12)
         System.out.println("Invalid month");
         
         if ( (month == 1) && (month == 3) && (month == 5) && (month == 7)
              &&( month == 8) && (month == 10) && ( month == 12) && (day > 31))
                System.out.println("Invalid Day");
                
         if ( (month == 4) && (month == 6) && (month == 9) && (month == 11) && (day > 31))
               System.out.println("Invalid Day");
         
         if ( (month == 2) && (year % 4) == 0 && ( day > 29) )
              System.out.println("Invalid date in the month of feb in leap year"); 
               
         if ( (month == 2) && (year % 4) != 0 && (day > 28) )
              System.out.println("Invalid date in the month of feb in non leap year"); 
          else
              System.out.println("Its a valid date");
              
               }
               }