package Ueb03test;
import java.util.Scanner;
public class MySolution {

    public static boolean isEven(int number) {
        while(number % 2 == 0) return true;
        return false;
    }

    public static boolean isPrime(int number) {
        if(number < 2) return false;
        for(int i = 2; i < number; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }

    public static boolean isTriangular(int number) {
        if(number < 0) return false;
        int sum = 0;
        for(int i = 1; sum <= number; i++) {
            sum = sum + i;
            if(sum == number) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner zahl = new Scanner(System.in);
        System.out.println("geben Sie eine Zahl als untere Grenze!");
        int untereGrenze = zahl.nextInt();
        System.out.println("geben Sie eine Zahl als obere Grenze!");
        int obereGrenze = zahl.nextInt();

        do {
            System.out.println(untereGrenze + " gerade: " + isEven(untereGrenze) + " prim: " + isPrime(untereGrenze) + " dreieck: " + isTriangular(untereGrenze));
            untereGrenze++;
        } while(untereGrenze <= obereGrenze);
    }
}
