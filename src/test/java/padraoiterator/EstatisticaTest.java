package padraoiterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstatisticaTest {

    @Test
    void deveContarMusicasFavoritasPlaylist() {
        Playlist playlist = new Playlist(
                new Musica("Garota de Ipanema", true),
                new Musica("Aquarela", true),
                new Musica("Asa Branca", false),
                new Musica("Trem das Onze", true)
        );
        assertEquals(3, Estatistica.contarMusicasFavoritasPlaylist(playlist));
    }

    @Test
    void deveContarTotalMusicasPlaylist() {
        Playlist playlist = new Playlist(
                new Musica("Garota de Ipanema", true),
                new Musica("Aquarela", true),
                new Musica("Asa Branca", false),
                new Musica("Trem das Onze", true)
        );
        assertEquals(4, Estatistica.contarTotalMusicasPlaylist(playlist));
    }

}
