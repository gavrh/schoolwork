import java.util.Scanner;

public class Lab3 {

    public static class Team {

        // fields
        private String  name;
        private int     wins;
        private int     losses;

        // mutators
        public void setName(String name) {
            this.name = name;
        }
        public void setWins(int wins) {
            this.wins = wins;
        }
        public void setLosses(int losses) {
            this.losses = losses;
        }

        // accessors
        public String getName() {
            return name;
        }
        public int getWins() {
            return wins;
        }
        public int getLosses() {
            return losses;
        }
        
        public double getWinPercentage() {
            return wins / (wins + losses * 1.0);
        }

        public void printStanding() {
            double winPercent = getWinPercentage();
            System.out.printf("Win percentage: %.2f\n", winPercent);
            System.out.printf("%s\n", 
            winPercent >= 0.5 ? "Congratulations, Team " + name + " has a winning average!"
            : "Team " + name + " has a losing average."
            );
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        Team team = new Team();
        
        String name = scnr.next();
        int wins = scnr.nextInt();
        int losses = scnr.nextInt();
        
        team.setName(name);
        team.setWins(wins);
        team.setLosses(losses);
        
        team.printStanding();
    }
}

