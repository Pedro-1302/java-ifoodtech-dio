package Metodos;

public class Retornos {
    public static void main(String[] args) {
            double quadrado = area(4);
            System.out.println("Área do quadrado: " + quadrado);

            double retangulo = area(4.2, 3.1);
            System.out.println("Área do retângulo: " + retangulo);

            double trapezio = area(2, 5, 12);
            System.out.println("Área do trapezio: " + trapezio);

            float losango = area(3, 9);
            System.out.println("Área do losango: " + losango);
    }
    public static double area(double lado) {
        return  lado * lado;
    }

    public static double area(double lado, double lado2) {
        return lado * lado2;
    }

    public static double area(double baseMenor, double baseMaior, double h) {
        return  ((baseMaior + baseMenor ) * h) / 2;
    }

    public static float area(float diagonal, float diagonal2) {
        return  (diagonal * diagonal2) / 2;
    }
}
