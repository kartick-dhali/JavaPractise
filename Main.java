package BtechSem5java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScan=new Scanner(System.in);
        double var = 10.2758;
        System.out.format("\n %.2f", var);
        System.out.println("\nThe value in String format is : "+String.format("%.2f",var));
    }
}
