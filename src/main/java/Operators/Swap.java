package Operators;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("Enter the values of a and b : ");
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        System.out.println("Values before swapping: " +a+ " " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Values After swapping: " +a+ " "+b);
    }
}
