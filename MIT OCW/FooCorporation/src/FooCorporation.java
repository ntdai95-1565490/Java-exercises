public class FooCorporation {

    public static void main(String[] args) {

        // Employee 1
        calculateSalary(7.50, 35);

        // Employee 2
        calculateSalary(8.20, 47);

        // Employee 3
        calculateSalary(10.00, 73);
    }

    private static void calculateSalary(double base_pay, double hours_worked) {
        if (base_pay < 8.00) {
            System.out.println("Error: Employee's base payment is less than the minimum of $8.00 an hour");
        } else if (hours_worked > 60) {
            System.out.println("Error: Employee's working hours are more than the maximum of 60 hours");
        } else if (hours_worked <= 40){
            System.out.println("Employee's salary is: " + hours_worked * base_pay);
        } else {
            System.out.println("Employee's salary is: " + (40 * base_pay + (hours_worked - 40) * base_pay * 1.5));
        }
    }
}
