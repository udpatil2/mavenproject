package controller;

import java.util.List;
import services.iplservices;
import entity.Player;

public class iplcontroller {

    iplservices iplserv = new iplservices();

    public void insertPlayer(Player p) {
        iplserv.insertPlayer(p);
    }

    public List<Player> getallplayer() {
        return iplserv.getallplayer();
    }

    public List<Player> getTopBatters() {
        return iplserv.getTopBatters();
    }

    public List<Player> getTopBowlers() {
        return iplserv.getTopBowlers();
    }
}
