/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pw;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
    
import java.util.Scanner;

    public class PerfectWeight {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter your height in cm: ");
            double height = scanner.nextDouble();
    
            double idealWeight = 22 * Math.pow((height / 100), 2);
    
            System.out.println("Your ideal weight is: " + idealWeight + " kg");
            scanner.close();
        }
    }