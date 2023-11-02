package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class Programme_3_MarkSheet {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student Name     \t \t:\t");
        String name = scanner.next();
        System.out.print("Enter Student Roll Number \t \t:\t");
        int rollNum = scanner.nextInt() ;
        System.out.print("Enter Marks of Subject Maths \t\t:\t");
        int matsMarks =scanner.nextInt();
      //  if(matsMarks < 0 || mathsMarks > 100) {
            System.out.print("\nInvalid input, Mark should between 0 to 100");
            System.out.print("\nPlease enter correct marks \t\t:\t");
          //  mathsMarks = scanner.nextInt();
        }
    }
//}
