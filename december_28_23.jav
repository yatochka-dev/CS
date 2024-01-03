import java.util.*;
/* Class for declaring the in(Scanner), for reusing purposes. */
public class Base {
    public static Scanner in = new Scanner(System.in);

    public static void main(String []args) {}
}

/* Assignment Number 12 */
public class TemperatureCalculator extends Base {
    
    public static void main(String []args) {
        int farenheit;
        System.out.print("Enter the temperature in farenheit.");
        farenheit = in.nextInt();
        float celc = (farenheit - 32) * 5/9;
        System.out.println(celc);
    }
    
}

/* Assignment Number 13 */
public class SalaryCalculator extends Base {
   
    public static void main(String [] args) { 
        int dayHourPay, dayHours, nightHours, weekendHours; 
        int paymentForDay, paymentForNight, paymentForWeekend;

        System.out.println("Enter your hourly rate");
        dayHourPay = in.nextInt();

        System.out.println("Enter home many hours you worked on day shift");
        dayHours = in.nextInt();

        System.out.println("Enter home many hours you worked on night shift");
        nightHours = in.nextInt();

        System.out.println("Enter home many hours you worked on weekend shift");
        weekendHours = in.nextInt();

        paymentForDay = dayHourPay * dayHours;
        paymentForNight = (dayHourPay * nightHours) * 1.5;
        paymentForWeekend = (dayHourPay * weekendHours) * 2;

        System.out.println("Your monthly payment is: {0}", (
            paymentForDay + paymentForNight + paymentForWeekend
        ));
        
    }
}

/* Assignment Number 14 */
public class AgeCalculator extends Base{

    public static void main(String [] args) { 
        int age, days, hours, seconds; 
        System.out.println("Enter your age");
        age = in.nextInt();

        days = age * 365; 
        System.out.println("Your age in days is {0}", days);

        hours = age * 365 * 24;
        System.out.println("Your age in hours is {0}", hours);

        seconds = age * 365 * 24 * 60 * 60; 
        System.out.println("Your age in seconds is {0}", seconds);
        
    }

}

/* Assignment Number 15 */
public class AdvancedCalculator extends Base { 
    public static void main(String[] args){ 
        double a, b, c;
        System.out.print("Enter the value of 'a'.");
        a = in.nextDouble();
        System.out.print("Enter the value of 'a'.");
        b = in.nextDouble();
        System.out.print("Enter the value of 'a'.");
        c = in.nextDouble();

        double x = (c - b) / a; 
        System.out.print("The equation was solved with a result of {0}", x);

    }
}
