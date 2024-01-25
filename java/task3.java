//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a number=");
        int num = scn.nextInt();
        System.out.println("Entter second number=");
        int num1 = scn.nextInt();
        System.out.println(num+num1);
        System.out.println(num-num1);
        System.out.println(num*num1);
        System.out.println(num/num1);
        System.out.println(num%num1);
    }
}
