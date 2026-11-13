package padraoiterator;

import java.util.Iterator;

public class Estatistica {

    public static Integer contarMusicasFavoritasPlaylist(Playlist playlist) {
        int quantidade = 0;
        for (Musica musica : playlist) {
            if (musica.isFavorita()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalMusicasPlaylist(Playlist playlist) {
        int quantidade = 0;
        for (Iterator m = playlist.iterator(); m.hasNext(); ) {
            quantidade++;
            m.next();
        }
        return quantidade;
    }

}
