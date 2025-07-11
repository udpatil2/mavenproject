package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Player;

public class ipldao {

    String url = "jdbc:mysql://localhost:3306/jdbc_db";
    String username = "root";
    String password = "Pradip@1234.";

    public void insertPlayer(Player p) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO player (pid, jn, pname, runs, wickets, tname) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, p.getPid());
            pstmt.setInt(2, p.getJn());
            pstmt.setString(3, p.getPname());
            pstmt.setInt(4, p.getRuns());
            pstmt.setInt(5, p.getWickets());
            pstmt.setString(6, p.getTname());

            pstmt.executeUpdate();
            pstmt.close();
            con.close();

            System.out.println("Inserted: " + p);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public List<Player> getallplayer() {
        List<Player> players = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM player");

            while (rs.next()) {
                Player p = new Player(
                        rs.getInt("pid"),
                        rs.getInt("jn"),
                        rs.getString("pname"),
                        rs.getInt("runs"),
                        rs.getInt("wickets"),
                        rs.getString("tname")
                );
                players.add(p);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return players;
    }

    public List<Player> getTopBatters() {
        List<Player> batters = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM player WHERE runs > 10000";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Player p = new Player(
                        rs.getInt("pid"),
                        rs.getInt("jn"),
                        rs.getString("pname"),
                        rs.getInt("runs"),
                        rs.getInt("wickets"),
                        rs.getString("tname")
                );
                batters.add(p);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return batters;
    }

    public List<Player> getTopBowlers() {
        List<Player> bowlers = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM player WHERE wickets > 100";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Player p = new Player(
                        rs.getInt("pid"),
                        rs.getInt("jn"),
                        rs.getString("pname"),
                        rs.getInt("runs"),
                        rs.getInt("wickets"),
                        rs.getString("tname")
                );
                bowlers.add(p);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bowlers;
    }
}
