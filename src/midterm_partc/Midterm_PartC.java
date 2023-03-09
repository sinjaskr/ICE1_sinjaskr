/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midterm_partc;

import java.util.Scanner;

/**
 *
 * @author jaska
 */
public class Midterm_PartC {

    /**
     * @param args the command line arguments
     */

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (1-7)");
        int code = in.nextInt();
        Day[] days = Day.values();
        System.out.println(days[code - 1]);
        System.out.println("All the days:");
        for (Day day : days) {
            System.out.println(day);
        }
    }
}

