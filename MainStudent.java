package BtechSem5java;

import java.util.*;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] st = new Student[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter Details For Student: " + (i + 1));
            System.out.println("\nEnter Roll No: ");
            int r = sc.nextInt();
            sc.nextLine();
            System.out.println("\nEnter Name: ");
            String n = sc.nextLine();
            System.out.println("\n Enter Marks:");
            double m = sc.nextDouble();
            st[i] = new Student(r, n, m);
        }
        showDetails(st);
        showGrade(st);
    }

    public static void showDetails(Student[] arr) {
        System.out.println("\nThe Details of Students are: ");
        for (Student obj : arr) {
            System.out.println(obj.roll + " " + obj.name + " " + obj.marks);
        }
    }

    public static void showGrade(Student[] arr) {
        System.out.println("\n The Grade of the students are given below:  ");
        for (Student obj : arr) {
            String grade = "";
            double mark = obj.marks;
            if (mark >= 90)
                grade = "A+";
            else if (mark < 90 && mark >= 80)
                grade = "A";
            else if (mark < 80 && mark >= 70)
                grade = "B+";
            else if (mark < 70 && mark >= 60)
                grade = "B";
            else
                grade = "C";

            System.out.println("\n " + obj.name + " got " + grade);
        }
    }
}

class Student {
    int roll;
    String name;
    double marks;

    Student() {

    }

    Student(int r, String n, double m) {
        this.roll = r;
        this.name = n;
        this.marks = m;
    }

}