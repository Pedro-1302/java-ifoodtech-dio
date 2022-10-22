package AulasIniciais.smarttv;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smTv = new SmartTv();

        System.out.println("Estado Inicial");
        System.out.println("Tv Ligada? " + smTv.ligada);
        System.out.println("Tv Ligada? " + smTv.canal);
        System.out.println("Tv Ligada? " + smTv.volume);

        System.out.println("Chamando Metodo Ligar TV");
        smTv.ligar();
        System.out.println("TV Ligada ? " + smTv.ligada);

        System.out.println("Chamando Metodo Desligar TV");
        smTv.desligar();
        System.out.println("TV Ligada ? " + smTv.ligada);

        System.out.println("Chamando Metodo Aumentar Volume ");
        smTv.aumentarVolume();
        System.out.println("TV Ligada ? " + smTv.volume);

        System.out.println("Chamando Metodo Diminuir Volume ");
        smTv.diminuirVolume();
        System.out.println("TV Ligada ? " + smTv.volume);

        System.out.println("Chamando Metodo Avançar Canal ");
        smTv.avancarCanal();
        System.out.println("TV Ligada ? " + smTv.canal);

        System.out.println("Chamando Metodo Voltar Canal ");
        smTv.voltarCanal();
        System.out.println("TV Ligada ? " + smTv.canal);
    }
}
