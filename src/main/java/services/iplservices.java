package services;

import dao.ipldao;
import entity.Player;

import java.util.List;

public class iplservices {

    ipldao dao = new ipldao();

    public void insertPlayer(Player p) {
        dao.insertPlayer(p);
    }

    public List<Player> getallplayer() {
        return dao.getallplayer();
    }

    public List<Player> getTopBatters() {
        return dao.getTopBatters();
    }

    public List<Player> getTopBowlers() {
        return dao.getTopBowlers();
    }
}
