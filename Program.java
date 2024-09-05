//import stuff here

//Your code here
import java.util.Scanner;

public class Program{
    public static void main(String arg[]){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Number 2 ");
        int num2 = scanner.nextInt();

        System.out.println("Sum: " +  (num1+num2));
        System.out.println("Difference: " +  (num1-num2));
        System.out.println("Product: " +  (num1*num2));
        System.out.println("Average: " +  (num1+num2)/2);
        System.out.println("Distance: " +  Math.abs((num1+num2)));
        System.out.println("Max: " +  ((num1+num2 + Math.abs(num1-num2))/2));
        System.out.println("Min " + ((num1+num2 - Math.abs(num1-num2))/2));

    }
}

//Paste console output below:
/*
Enter Number 1: 
5
Enter Number 2 
4
Sum: 9
Difference: 1
Product: 20
Average: 4
Distance: 9
Max: 5
Min 4

 */
