import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan?");
        String dataName = reader.nextLine();

        ArrayList<SportsStatistics> list = SportsStatistics.readData(dataName);

        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String name = reader.nextLine();
        int matches = 0;
        int wins = 0;
        int losses = 0;

        for (SportsStatistics team: list) {
            if (team.getHomeTeam().equals(name) ) {
                matches++;
               if (team.getHomePoints() > team.getGuestPoints()) {
                   wins++;
               } else {
                   losses++;
               }
            } else  if (team.getGuestTeam().equals(name) ) {
                matches++;
                if (team.getHomePoints() < team.getGuestPoints()) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }

        System.out.println("Otteluita: " + matches);
        System.out.println("Voittoja: " +  wins);
        System.out.println("Tappioita: " + losses);

    }
}