package user;

import java.util.List;
import controller.iplcontroller;
import entity.Player;

public class usermain {
    public static void main(String[] args) {

        iplcontroller iplc = new iplcontroller();

        // Insert 10 players with different data
        Player p1 = new Player(101, 18, "Virat", 12000, 4, "RCB");
        Player p2 = new Player(102, 45, "Rohit", 11000, 2, "MI");
        Player p3 = new Player(103, 7, "MS Dhoni", 10500, 1, "CSK");
        Player p4 = new Player(104, 63, "Jasprit", 300, 150, "MI");
        Player p5 = new Player(105, 33, "Hardik", 12500, 120, "GT");
        Player p6 = new Player(106, 1, "KL Rahul", 14500, 0, "LSG");
        Player p7 = new Player(107, 67, "Rishabh", 3500, 140, "DC");
        Player p8 = new Player(108, 77, "Shubman", 12200, 0, "GT");
        Player p9 = new Player(109, 98, "Yuzvendra", 500, 120, "RR");
        Player p10 = new Player(110, 53, "Jadeja", 2500, 180, "CSK");
//
//        iplc.insertPlayer(p1);
//        iplc.insertPlayer(p2);
//        iplc.insertPlayer(p3);
//        iplc.insertPlayer(p4);
//        iplc.insertPlayer(p5);
//        iplc.insertPlayer(p6);
//        iplc.insertPlayer(p7);
//        iplc.insertPlayer(p8);
//        iplc.insertPlayer(p9);
//        iplc.insertPlayer(p10);

        System.out.println("\nAll Players:");
        List<Player> players = iplc.getallplayer();
        for (Player p : players) {
            System.out.println(p);
        }
      System.out.println("**************************************************");
        System.out.println("\nTop Batters (Runs > 10,000):");
        List<Player> topBatters = iplc.getTopBatters();
        for (Player p : topBatters) {
            System.out.println(p);
        }
 System.out.println("***********************************************************");
        System.out.println("\nTop Bowlers (Wickets > 100):");
        List<Player> topBowlers = iplc.getTopBowlers();
        for (Player p : topBowlers) {
            System.out.println(p);
        }
System.out.println("*****************************************************************");
        System.out.println("\nThis is the end of the main method");
    }
}
