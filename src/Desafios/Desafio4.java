package Desafios;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        int resultadoTres = num % 3;
        int resultadoCinco = num % 5;

        if (resultadoTres == 0) {
            if (resultadoCinco == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println("Fizz");
            }
        }
        else if (resultadoCinco == 0) {
            System.out.println("Buzz");
        }  else {
            System.out.println("" + num);
        }
    }
}
