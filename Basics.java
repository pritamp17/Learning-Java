
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");    // printing or similar to cout in c++
        System.out.println("Main.main");   /// shortcut using sout

        // variables  ******************************
        int num1 = 10;
        int num2 = 10;
        int res = num1 + num2;
        System.out.println(res);

        double p1 = 3.14;
        boolean flag = true;
        char a = 'A';

        int amount = 1_1000_00_008;
        System.out.println(amount);

        double d_amount = 1_100_00_008.00;
        System.out.println(d_amount);

        // arithmetic opertors ***************************

        int number1 = 10;
        int number2 = 3;
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);
        System.out.println(number1 % number2);

        // BODMAS

        // B -> brackets
        // O -> orders (powers/indices or roots)
        // D -> division
        // M -> multipliction
        // A -> addition
        // s -> substraction

        System.out.println((2+2) * (3/1) * 3);

        // increment and decrement operators ***************

        int number = 0;
        System.out.println(number++);  // 0
        System.out.println(number);   // 1
        System.out.println(number--); // 1
        System.out.println(number); // 0

        number = 0;

        System.out.println(++number);  // 1
        System.out.println(--number); // 0

        // comparison operators  *********************
        // <. <= , > , >= , == , !=
        System.out.println(10 > 10); // false
        System.out.println(10 >= 10); // true

        // naming of variable (camelCase) ********************

        int nameOfVariable = 0;
        System.out.println(nameOfVariable);

        // string *****************************

        String var = "pritam pawar";
        String firstName = "pritam";
        String lastName = "pawar";

        System.out.println(var); // pritam pawar
        System.out.println(firstName + lastName); // pritampawar
        System.out.println(firstName + " " + lastName); // pritam pawar

        System.out.println(var.toUpperCase()); // PRITAM PAWAR
        System.out.println(var.substring(0,6));  // pritam

        System.out.println("  ".isEmpty()); // false
        System.out.println("  ".isBlank()); // true
        System.out.println("  p  ".trim()); // p

        // Refrence types and objects
        int age = 21;
        Point pointA = new Point(10, 10);  // point class imported from "import java.awt.*;"
        System.out.println("pointA =" + pointA);
        pointA.move(10,11);
        System.out.println("pointA =" + pointA);

        // Array ***********************

//        int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//
//        System.out.println(
//                Arrays.toString(numbers)
//        );
//        System.out.println(numbers.length);

        String[] nam = {"pritam","aditya","piyush"};

        // Array null values *****************
        int[] numbers = new int[3];
        numbers[2] = 2;

        System.out.println(
                Arrays.toString(numbers)
        );    // [0,0,2]

        Arrays.fill(numbers,-1);  // [-1,-1,2]

        // LOOPS ********************************

        String[] names = {
                "pritam",
                "Aditya",
                "piyush"
        };

        for (int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }

        // If statements ********************
        boolean isTrue = true;
        if(true){
            System.out.println("this code runs");
        }else{
            System.out.println("this code does not runs");
        }
        System.out.println("this code will always runs");

        // Packges ********************************
            // it is a folder that allows you to structure your project

        // Methods
            // block of code that only runs when it is invoked

            /*
            - Acess modifier
            - Optionl static
            - return type
            - Name
            - optionla Parameters
            - Method Body
            - Optional return value
            **/ //  public static void main(String[] args) {}

        int result = add(10,20);
        System.out.println(result);
    // cat ***********************
        Cat cat = new Cat();
        cat.name = "k";
        cat.meow();  /// k :meo..
    }

    // creating a new method
    private static int add(int n1, int n2)
    {
        return n1 + n2;
    }

    // creating new class
    static class Cat{
        String name;   /// property
        void meow(){    // behavior
            System.out.println(name + ": meo...");
        }
    }
}
