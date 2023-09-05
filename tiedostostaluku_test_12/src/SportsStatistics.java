import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportsStatistics {
    private String homeTeam;
    private String guestTeam;
    private int homePoints;
    private int guestPoints;

    public SportsStatistics(String h, String g, int homeP, int guestP ) {
        this.homeTeam = h;
        this.guestTeam = g;
        this.homePoints = homeP;
        this.guestPoints = guestP;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getGuestTeam() {
        return guestTeam;
    }

    public void setGuestTeam(String guestTeam) {
        this.guestTeam = guestTeam;
    }

    public int getHomePoints() {
        return homePoints;
    }

    public void setHomePoints(int homePoints) {
        this.homePoints = homePoints;
    }

    public int getGuestPoints() {
        return guestPoints;
    }

    public void setGuestPoints(int geastPoints) {
        this.guestPoints = geastPoints;
    }

    public static ArrayList<SportsStatistics> readData (String data) {
        ArrayList<SportsStatistics> list = new ArrayList<>();

        try(Scanner reader = new Scanner(Paths.get(data))) {
            while (reader.hasNextLine()) {
                String[] splits = reader.nextLine().split(",");

                list.add(new SportsStatistics(splits[0], splits[1], Integer.valueOf(splits[2]) , Integer.valueOf(splits[3])));
            }

        } catch (Exception e) {
            System.out.println("virhe: " + e.getMessage());
        }

        return  list;
    }






}
