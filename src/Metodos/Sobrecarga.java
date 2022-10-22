package Metodos;

public class Sobrecarga {
    public static void main(String[] args) {
        area(3);
        area(5, 5);
        area(7, 8, 9);
    }

    public static void area(double lado) {
        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double lado, double lado2) {
        System.out.println("Área do retângulo: " + lado * lado2);
    }

    public static void area(double baseMenor, double baseMaior, double h) {
        System.out.println("Área do quadrado: " + ((baseMaior + baseMenor ) * h) / 2);
    }

    public static void area(float diagonal, float diagonal2) {
        System.out.println("Área do losango: " + (diagonal * diagonal2) / 2);
    }
}
