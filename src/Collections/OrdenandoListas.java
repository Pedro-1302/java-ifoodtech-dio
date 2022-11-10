package Collections;

// Ordenando elementos dentro de uma list

// Gato 1 = nome : Core - idade : 12 - cor : preto
// Gato 2 = nome : Jenerson - idade : 23 - cor : vermeio
// Gato 3 = nome : Fuba - idade : 4 - cor : branco

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenandoListas {
    public static void main(String[] args) {
        ArrayList<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Core", 12, "Preto"));
            add(new Gato("Jenerson", 23, "Vermeio"));
            add(new Gato("Fuba", 4, "Branco"));
        }};

        // Ordem de Inserção

        System.out.println(gatos);

        // Ordem de Aleatória

        Collections.shuffle(gatos);
        // Shuffle
        System.out.println(gatos);

        // Ordem natural (Nome)
        Collections.sort(gatos);
        System.out.println(gatos);

        // Ordem idade

       /* Collections.sort(gatos, new CompartorIdade());
        System.out.println(gatos);*/
        gatos.sort(new CompartorIdade());
        System.out.println(gatos);

        // Ordem cor
        Collections.sort(gatos, new ComparatorCor());
        System.out.println(gatos);

        // Order nome, idade e cor
        gatos.sort(new ComparatorCorNomeIdade());
        System.out.println(gatos);

    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }


    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class CompartorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorCorNomeIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}