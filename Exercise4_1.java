/**
 * Ad Soyad: [Alaa Madi]
 * Öğrenci No: [240541609]
 * Proje: [university system grade calculator]
 * Tarih: [29/11/2025]
 */

import java.util.Scanner;

public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input day
        System.out.print("Enter the day (e.g., Monday): ");
        String day = input.nextLine();

        // Input date with validation
        System.out.print("Enter the date (1 - 31): ");
        int date = input.nextInt();
        if (date < 1 || date > 31) {
            System.out.println("Invalid date! Must be between 1 and 31.");
            return;
        }

        input.nextLine(); // Clear buffer

        // Input month
        System.out.print("Enter the month (e.g., November): ");
        String month = input.nextLine();

        // Input year with validation
        System.out.print("Enter the year (0 - 2025): ");
        int year = input.nextInt();
        if (year < 0 || year >= 2025) {
            System.out.println("Invalid year! Must be between 0 and 2025.");
            return;
        }

        System.out.println("\nAmerican format:");
        printAmerican(day, date, month, year);

        System.out.println("European format:");
        printEuropean(day, date, month, year);

        
    }
}
