package Task1;

import java.util.*;
class TemperatureConverter{
    static Scanner sc = new Scanner(System.in);

    static double C_F(double C){
        double F = (C * 9/5) + 32;
        return F;
    }

    static double C_K(double C){
        double K = C + 273.15;
        return K;
    }

    static double F_C(double F){
        double C = (F - 32) * 5/9;
        return C;
    }

    static double F_K(double F){
        double K = (F - 32) * 5/9 + 273.15;
        return K;
    }

    static double K_C(double K){
        double C = K - 273.15;
        return C;
    }

    static double K_F(double K){
        double F = (K - 273.15) * 9/5 + 32;
        return F;
    }

    static double input(String word){
        System.out.println("Enter "+word+" value:");
        double val = sc.nextDouble();
        return val;
    }

    static void output(double val, String word){
        System.out.printf("%s value: %.2f",word,val);
    }

    public static void main(String args[]){
        System.out.println("1. Celcius to Fahrenheit\n2. Celcius to Kelvin\n"+
                "3. Fahrenheit to Celcius\n4. Fahrenheit to Kelvin\n"+
                "5. Kelvin to Celcius\n6. Kelvin to Fahrenheit\n7. Exit");
        do{
            System.out.println("\nEnter Choice: ");
            int ch = sc.nextInt();
            double num = 0;
            switch(ch){
                case 1: num = input("Celcius");
                    output(C_F(num), "Fahrenheit");
                    break;
                case 2: num = input("Celcius");
                    output(C_K(num), "Kelvin");
                    break;
                case 3: num = input("Fahrenheit");
                    output(F_C(num), "Celcius");
                    break;
                case 4: num = input("Fahrenheit");
                    output(F_K(num), "Kelvin");
                    break;
                case 5: num = input("Kelvin");
                    output(K_C(num), "Celcius");
                    break;
                case 6: num = input("Kelvin");
                    output(K_F(num), "Fahrenheit");
                    break;
                case 7: System.exit(0);
                    break;
                default: System.out.println("Invalid Input");
            }
        }
        while(true);
    }
}
