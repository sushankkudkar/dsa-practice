package com.sushank.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateAverageTemperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = getNumberOfDays(scanner);
        double[] temperatures = getTemperatures(scanner, days);
        double average = calculateAverage(temperatures);

        System.out.printf("Average Temperature: %.2f%n", average);

        scanner.close();
    }

    private static int getNumberOfDays(Scanner scanner) {
        int days;
        do {
            System.out.print("How many days' temperatures do you want to enter? ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a positive integer: ");
                scanner.next();
            }
            days = scanner.nextInt();
        } while (days <= 0);
        return days;
    }

    private static double[] getTemperatures(Scanner scanner, int days) {
        double[] temps = new double[days];
        for (int i = 0; i < days; i++) {
            System.out.printf("Enter temperature for day %d: ", i + 1);
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Enter a valid number: ");
                scanner.next();
            }
            temps[i] = scanner.nextDouble();
        }
        return temps;
    }

    private static double calculateAverage(double[] temperatures) {
        return Arrays.stream(temperatures).average().orElse(0);
    }
}
