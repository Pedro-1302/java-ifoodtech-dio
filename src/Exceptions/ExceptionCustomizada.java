package Exceptions;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\n Com exception ou não, o programa continua");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {
        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();

            BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);

            bw.flush();
            br.close();
        } catch (ImpossivelAberturaArquivoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro esperado, por favor, fale com o suporte. " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAberturaArquivoException extends Exception {
    private String nomeDoArquivo;
    public String diretorio;

    public ImpossivelAberturaArquivoException( String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}