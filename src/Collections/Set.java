package Collections;

import java.util.*;

public class Set {
    public static void main(String[] args) {
        HashSet<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println(notas.toString());

        System.out.println("Confirindo se a nota 4 está no conjunto: " + notas.contains(5d));

        System.out.println("Menor nota: " + Collections.min(notas));

        System.out.println("Maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();

        Double soma = 0.0;

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibindo a soma dos valores: " + soma);

        System.out.println("Media: " + (soma / notas.size()));

        System.out.println("Removendo a nota 0");
        notas.remove(0d);

        System.out.println(notas);

        System.out.println("Removendo as notas menores que 7");
        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()){
            double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);


    }
}
