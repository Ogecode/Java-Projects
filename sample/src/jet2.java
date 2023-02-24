import java.util.Scanner;

public class jet2 {
    public static void main(String[] args) {

     /*  Scanner scanner = new Scanner(System.in);

       //int val1 = 0;
       int val = scanner.nextInt();
        int a =5; // it's initialized by a value
        int b = 6; // it's initialized by a value
        String result = a == b ? "equal" :
                a > b ? "more" : "less";
      //  if (val == 10) { System.out.println("val = 10"); } else if (val >= 20 && val < 50) { System.out.println("20 <= val < 50"); } else { if (val < 20) { System.out.println("val < 20"); } else { System.out.println("val >= 50"); } }
       /* int n = 0;
        System.out.println("Enter Numbers to make a traingle");
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if ( num + num1 > num2 && num + num2 > num1 && num2 + num1 > num){
            System.out.println("Yes");}

        else  {
            System.out.println("NO");
        }

        /*int n = 0;
        System.out.println("Enter number 1900 and 3000 ");
        int Leap = scanner.nextInt();
        if ( Leap%4 == 0 && Leap%100 !=0 || Leap%400 == 0) {
            System.out.println("The is a Leap year");
        }
        else {
            System.out.println("The is a Leap year");
        }

         */
        /*System.out.println("Enter your name");
        String firstName = scanner.next();
        System.out.println("Enter years of experience");
        String yearsOfExperience= scanner.next();
        System.out.println("Enter your prefer dish");
        String cuisinePreference = scanner.next();

        System.out.println("The form for " + firstName + " is completed. " +
                "We will contact you if we need a chef who cooks " + cuisinePreference +  " dishes and has " + yearsOfExperience+ " years of experience.");


        String day1 = scanner.next();
        String day2 = scanner.next();
        String day3  = scanner.next();
        String day4  = scanner.next();
        // start coding here
        System.out.println(day1);
        System.out.println(day2);
        System.out.println(day3);
        System.out.println(day4);

         */

        int r = 0;
        System.out.println("Enter number of army");
        int army = scanner.nextInt();
        if (army < 1) {
            System.out.println("no army");

        }
        else if (army <=19) {
            System.out.println("pack");
        }
        else if (army <=249) {
            System.out.println("Throng");
        }
        else if (army <=999) {
            System.out.println("zonds");

        }
       else {
            System.out.println("legion");
        }


        boolean b1 = false;
        boolean b2 = true;
        boolean b3 = false;
        System.out.println(b1 && b2 || b3);

        int h1= scanner.nextInt();
        int h2= scanner.nextInt();
        int h3 = scanner.nextInt();

  Boolean height = h1 <= h2 && h2 <= h3 || h3 <= h2  && h2 <= h1;
  System.out.println(height);






        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int ageDividedBy3 = scanner.nextInt();
        int ageDividedBy5 = scanner.nextInt();
        int ageDividedBy7 = scanner.nextInt();
        int age = (ageDividedBy3%3 * 70 + ageDividedBy5%5 *21 + ageDividedBy7%7 *15)  %105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        String str = " Inside Main";
        String subs = str.substring(0, 6);
        long n = subs.trim().length();
        System.out.println(n);

        String nameOfCity = scanner.nextLine();
        boolean endsWith = nameOfCity.endsWith("burg");
        System.out.println(endsWith);


        int noOfDays = scanner.nextInt();
        int costOfFoodPerDay = scanner.nextInt();
        int oneWayFlightTicket = scanner.nextInt();
        int costOfOneNight = scanner.nextInt();
        System.out.println(((noOfDays - 1)* costOfOneNight) + (noOfDays * costOfFoodPerDay) + (oneWayFlightTicket *2));


        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");
        String name2 = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");



    }
}
