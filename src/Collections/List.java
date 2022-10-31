package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<>();

        notas.add(1.0);
        notas.add(2.0);
        notas.add(3.0);
        notas.add(4.0);
        notas.add(5.0);
        notas.add(6.0);
        notas.add(7.0);

        System.out.println("Notas: " + notas);

        System.out.println("Nota na posição 5: " + notas.indexOf(5d));

        // Adicionando a nota 8.0 na posição 4

        notas.add(4, 8.0);

        System.out.println("Notas Atualizadas: " + notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");

        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Existe 5 na lista? ");
        System.out.println(notas.contains(5d));

        for (Double nota : notas) {
            System.out.println(nota);
        }


        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Soma: " + soma);

        double somaMelhor = 0d;
        for (Double nota : notas) {
            somaMelhor += nota;
        }

        System.out.println("Soma: " + somaMelhor);

        System.out.println("Média: " + somaMelhor / notas.size());

        System.out.println("Removendo a nota 1");
        notas.remove(1d);
        System.out.println("Sem a nota 1: " + notas);

        System.out.println("Removendo a nota na primeira posição");
        notas.remove(0);
        System.out.println("Sem a nota na primeira posição: " + notas);

        System.out.println("Sem as notas menores que 7: ");

        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }

        System.out.println(notas);


        System.out.println("Apagando a lista: ");
        notas.clear();

        System.out.println(notas);

        System.out.println("A lista está vazia? " + (notas.isEmpty() ? "Sim" : "Nao"));



    }
}
