package Exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "test.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo! " + e.getCause());
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Ocorreu um erro Inesperado! Entre em contato com o suporte " + e.getCause());
            throw new RuntimeException(e);
        } finally {
            System.out.println("Chegou no finally! ");
        }

        System.out.println("Apesar da exception ou não, o programa continua rodando... ");
    }

    public static void imprimirArquivoNoConsole (String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);

        bw.flush();
        br.close();
    }
}
