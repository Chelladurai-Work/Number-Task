package org.example;

import java.util.Scanner;

public class Reverse_Number {
    static Scanner scanner=new Scanner(System.in);
    public static void main() {
        System.out.println("Enter the Number");
        int inPutNumber=scanner.nextInt();
        int reverseNumber=0;
      while (inPutNumber>0){//121
          int number=inPutNumber%10;
          reverseNumber=number+reverseNumber*10;
          inPutNumber=inPutNumber/10;
      }
        System.out.println(reverseNumber);
    }
}
