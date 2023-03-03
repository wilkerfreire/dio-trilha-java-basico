package entities;

public class SmartTV {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 30;

    public SmartTV() {
    }

    public SmartTV(boolean ligada, Integer canal, Integer volume){
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void ligarTV() {
        ligada = true;
    }

    public void desligarTV() {
        ligada = false;
    }

    public Integer getCanal() {
        return canal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void escolherCanal(int novoCanal) {
        canal = novoCanal;
    }

    public Integer getVolume() {
        return volume;
    }

    public void aumentarVolume() {
        volume++;
    }
    public void diminuirVolume() {
        volume--;
    }

}
