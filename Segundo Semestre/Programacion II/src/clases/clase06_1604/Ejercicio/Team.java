package clases.clase06_1604.Ejercicio;

import java.util.Iterator;
import java.util.List;

public class Team implements Iterable<Player> {
    private List<Player> players;

    public Team(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public Iterator<Player> iterator() {
        return new PlayerIterator();
    }

    //     Clase de iterador personalizado
    private class PlayerIterator implements Iterator<Player> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < players.size();
        }

        @Override
        public Player next() {
            return players.get(index++);
        }
    }

}
