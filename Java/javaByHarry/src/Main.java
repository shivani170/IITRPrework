import java.lang.reflect.Constructor;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Q1. WAP to write hello world
//           System.out.println("Hello world! This is my first java program");


//       Q2.  Create a Java Program, declare variables of type
//       int, float, char, boolean, String, double

        int intVariable = 3;
        float varFloat = 0.23f;
        float varFloat2 = 12;

        char characterVar;
//       System.out.println(characterVar);
        boolean isValidAge = 20 > 18; // true
        String stringVariable = "test me";
        double doubleVariable = 123646232d;
//      System.out.println(doubleVariable);

//        double vaDouble2 = 12;
//        System.out.println(intVariable);
//
//        System.out.println(varFloat2);
//
//
//        System.out.println(isValidAge);
//
//        System.out.println(stringVariable);
//
//        System.out.println(vaDouble2);

        int grade = 'A';

//        System.out.println(grade);

        int no = 10;

        String res = 10 % 2 == 0 ? "even" : "odd";


//      System.out.println(res);


//         Work class 3
//        1. Taking input from the user through the scanner
//        2. if else and nested if


        //Constructor: Mechanism/technique,
        // using which we can take the course of
        // action of your
        //program in a specific way
        // based on a condition
//----------------------------------------------------
//        Constructs:
//        if else
//        ternary
//        if else if
//        nested if
//        switch case


//        Loops
//        while
//        do while
//        for


//        int score; //= 65;
//        Scanner scanInt = new Scanner(System.in);
//        System.out.println("Enter the score");
//        score = scanInt.nextInt();
//
//        if(score >= 0 && score <=100){
//            if ((score >= 50) && (score <= 60)) {
//                System.out.println("Good Passed...");
//            } else if((score > 60) && (score <= 70)) {
//                System.out.println("Very Good Second Class Grade");
//            } else if((score > 70) && (score <= 100)) {
//                System.out.println("Excellent! Secured Distinction");
//            }else {
//                System.out.println("Sorry! Not passed Try again");
//            }
//        } else{
//            System.out.println("Sorry! Invalid range");
//        }

//        Write a program to check the eligibility to vote

//        int age;
//        Scanner scanAge = new Scanner(System.in);
//        System.out.println("Enter the age:");
//        age = scanAge.nextInt();
//         if( age >= 60){
//            System.out.println("You are a senior citizen");
//        }else if(age >= 18){
//            System.out.println("User is Eligible to vote");
//        }else{
//            System.out.println("Sorry! User is not Eligible to vote");
//        }

// ____________________________________________________
//        package is a collection of related classes
//
//     Keyboard



//        object representing InputStream- data flows from keyboard into my program
//        scan1.nextInt();
//        nextDouble()
//        nextFloat()
//
//        Scanner scan1 = new Scanner(System.in);
//        System.out.println("Enter a double val");
//        double gstTax = scan1.nextDouble();
//
//        System.out.println("Enter a Long val");
//        long gstTaxLong = scan1.nextLong();
//
//        System.out.println("Enter a Float val");
//        float gstTaxFloat = scan1.nextFloat();
//
//        System.out.println("Enter a boolean val");
//        boolean isEligible = scan1.nextBoolean();
//
//        System.out.println("Enter a Integer val");
//        int scoreInt = scan1.nextInt();
////
//        System.out.println("The Double val is " +gstTax);
//        System.out.println("The Float val is " +gstTaxFloat);
//        System.out.println("The Long val is " +gstTaxLong);
//        System.out.println("The Integer val is " +scoreInt);
//        System.out.println("The Double val is " +gstTax);

//______________________________________________________

//      String empName = "";
//      String empAddress = "";
//      Scanner scan2 = new Scanner(System.in);
//        empName = scan2.nextLine();
////      System.out.println("Enter your name " +empName);

//------------------------------------------------
//        int number;
//        Scanner scanNumber = new Scanner(System.in);
//
////        System.out.println("Enter the score");
//
//        number = scanNumber.nextInt();
//        if(number % 2 == 0){
//            System.out.println("Number is even");
//        }else{
//            System.out.println("Number is odd");
//        }

//--------------------------------------------------
// SWITCH:
//
//                switch(variable1)
//                {
//                    case 10:
//                    {
//                       statement
//                    }
//                }

//-------------------------------------------------
//        Scanner scanSwitch = new Scanner(System.in);
//        System.out.println("Switch Main Menu");
//        System.out.println("1. Insert Record");
//        System.out.println("2. Delete Record");
//        System.out.println("3. Update Record");
//        System.out.println("4. View Record");
//
//        System.out.println("Enter your Choice");
//        int choice;
//        choice = scanSwitch.nextInt();
//        switch(choice){
//            case 1:
//            {
//                System.out.println("Inserting a Record");
//                break;
//            }
//            case 2:
//            {
//                System.out.println("Delete a Record");
//                break;
//            }
//            case 3:
//            {
//                System.out.println("Updating a Record");
//                break;
//            } case 4:
//            {
//                System.out.println("Viewing a Record");
//                break;
//            }
//            default:
//            {
//                System.out.println("Sorry! Invalid Record");
//
//            }
//        }





//-------------------------------------------------

        Scanner scanDay = new Scanner(System.in);
        System.out.println("Enter your Number of Day");
        String day;
        day = scanDay.nextLine();
        switch(day){
            case "one":
            {
                System.out.println("Today is Monday");
                break;
            }
            case "two":
            {
                System.out.println("Today is Tuesday");
                break;
            }
            case "three":
            {
                System.out.println("Today is Wednesday");
                break;
            } case "four":
            {
                System.out.println("Today is Thursday");
                break;
            } case "five":
            {
                System.out.println("Today is Friday");
                break;
            } case "six":
            {
                System.out.println("Today is Saturday");
                break;
            } case "seven":
            {
                System.out.println("Updating a Sunday");
                break;
            }
            default:
            {
                System.out.println("Sorry! Invalid Day");

            }
        }


//--------------------------------------------------



//        Q1. WAP to write sum of 100 random digits
//        int[] a;
//        a = new int[100];
//        int sum = 0;
//        Random rn = new Random();

//        for(int i=0; i<100; i++) {
//            System.out.println(i); // 1 2 3 4 5 6 ... 100

//            a[i] = rn.nextInt(100) + 1; // prints 100 random number digits under 100
//            System.out.println(a[i]);

//            sum = sum + a[i];
//        }
//        System.out.println(sum); // sum of all the 100 random digits


//        Q1. WAP to return double array

//        int [] [] A;
//        A = new int[5][];
//        for(int i = 0; i < 5; i++){
//            A[i] = new int[4];
//        }


//        int arr[][] = {{1,2,3},{2,3,4},{4,5,6}};
//        int arr1[][] = {{1,2,3},{2,3,4},{4,5,6}};
//
//        for (int i = 0; i < 2; i++){
//        for(int j=0; j<3;j++)
//        }

//        Type Conversion and Type Casting

//        }
//        while(true){
//            System.out.println("inside while");
//        }

    }
}