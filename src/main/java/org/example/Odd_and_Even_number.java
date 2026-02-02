package org.example;

import java.util.Scanner;

class Odd_number {
    static Scanner scanner=new Scanner(System.in);
    static void main() {
        System.out.println("Enter the Filter odd number");
        int input=scanner.nextInt();
        for (int i=0;i<=input;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}
