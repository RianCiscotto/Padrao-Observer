package padroescomportamentais.observer;

import java.util.Observable;

public class Time extends Observable {
    private Integer ano;
    private Integer temporada;
    private String nomeEsporte;
    private String nomeTime;

    public Time(Integer ano, Integer temporada, String nomeEsporte, String nomeTime) {
        this.ano = ano;
        this.temporada = temporada;
        this.nomeEsporte = nomeEsporte;
        this.nomeTime = nomeTime;
    }

    public void atualizarTime() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Time{" +
                "ano=" + ano +
                ", temporada=" + temporada +
                ", nomeEsporte='" + nomeEsporte + '\'' +
                ", nomeTime='" + nomeTime + '\'' +
                '}';
    }
}