package pw;

import java.util.Scanner;

public class PerfectWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Health Reminder: Maintain a healthy lifestyle with proper nutrition and exercise, regardless of your weight. Consult a healthcare provider if needed.");


        System.out.print("Enter your height in cm: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().toUpperCase().charAt(0);

        double bmiFactor;
        if (gender == 'M') {
            bmiFactor = 22; // Average BMI for male
        } else if (gender == 'F') {
            bmiFactor = 21; // Average BMI for female
        } else {
            System.out.println("Invalid gender entered. Please enter 'M' or 'F'.");
             scanner.close();
            return;
        }

        double idealWeight = bmiFactor * Math.pow((height / 100), 2);

        System.out.printf("Your ideal weight is: %.2f kg\n", idealWeight);
        System.out.print("Enter your actual weight in kg: ");
        double actualWeight = scanner.nextDouble();
           
            if (actualWeight < idealWeight) {
            System.out.println("You are underweight. Consider consulting a healthcare provider for advice on a healthy weight gain plan.");
        } else if (actualWeight > idealWeight) {
            System.out.println("You are overweight. It's important to maintain a balanced diet and increase physical activity. Please consider consulting a healthcare provider.");
        } else {
            System.out.println("You are at your ideal weight! Keep maintaining a healthy lifestyle.");
        }
        scanner.close();
    
    
         
           
    }
}
