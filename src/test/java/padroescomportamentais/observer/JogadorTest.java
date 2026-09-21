package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveNotificarUmJogador() {
        Time time = new Time(2026, 1, "Futebol", "Time A");
        Jogador jogador = new Jogador("Jogador 1");

        jogador.entrarNoTime(time);
        time.atualizarTime();

        assertEquals(
                "Jogador 1, atualização no Time{ano=2026, temporada=1, nomeEsporte='Futebol', nomeTime='Time A'}",
                jogador.getUltimaNotificacao()
        );
    }

    @Test
    void deveNotificarJogadores() {
        Time time = new Time(2026, 1, "Futebol", "Time A");
        Jogador jogador1 = new Jogador("Jogador 1");
        Jogador jogador2 = new Jogador("Jogador 2");

        jogador1.entrarNoTime(time);
        jogador2.entrarNoTime(time);

        time.atualizarTime();

        assertEquals(
                "Jogador 1, atualização no Time{ano=2026, temporada=1, nomeEsporte='Futebol', nomeTime='Time A'}",
                jogador1.getUltimaNotificacao()
        );

        assertEquals(
                "Jogador 2, atualização no Time{ano=2026, temporada=1, nomeEsporte='Futebol', nomeTime='Time A'}",
                jogador2.getUltimaNotificacao()
        );
    }

    @Test
    void naoDeveNotificarJogador() {
        Time time = new Time(2026, 1, "Futebol", "Time A");
        Jogador jogador = new Jogador("Jogador 1");

        time.atualizarTime();

        assertNull(jogador.getUltimaNotificacao());
    }
}