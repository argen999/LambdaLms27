package main;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Print number:");
        System.out.println(sqrt(sc.nextInt() ) );
    }
    public static Double sqrt(Integer num) {
       UnaryOperator<Double> sqrt = x -> Math.sqrt(num);
       return sqrt.apply(num.doubleValue() );
    }
}
