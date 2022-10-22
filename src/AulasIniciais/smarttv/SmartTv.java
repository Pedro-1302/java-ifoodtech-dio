package AulasIniciais.smarttv;


public class SmartTv {
    boolean ligada = false;
    int canal = 223;
    int volume = 7; // Volume 1 - 10

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void avancarCanal() {
        canal++;
    }

    public void voltarCanal() {
        canal--;
    }
}
