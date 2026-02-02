package org.example;

import java.util.Scanner;

public class Fibonacci_Series {
    static Scanner scanner=new Scanner(System.in);
    static void main() {
        System.out.print("Enter the How many Fibonacci Number:");
        int input=scanner.nextInt();
        int first=0;
        int second=first+1;
        for(int i=0;i<input;i++){
            System.out.println(first);
            int next=first+second;
            first=second;
            second=next;
        }
    }
}
