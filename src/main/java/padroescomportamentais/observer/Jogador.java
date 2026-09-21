package padroescomportamentais.observer;

import java.util.Observable;
import java.util.Observer;

public class Jogador implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void entrarNoTime(Time time) {
        time.addObserver(this);
    }

    @Override
    public void update(Observable time, Object arg1) {
        this.ultimaNotificacao = this.nome + ", atualização no " + time.toString();
    }
}