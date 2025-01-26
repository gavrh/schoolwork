import java.util.Scanner;

public class Lab5 {

    public static class Artist {
        
        private String  artistName;
        private int     birthYear;
        private int     deathYear;

        public Artist() {
            artistName = "unknown";
            birthYear = -1;
            deathYear = -1;
        }
        public Artist(String name, int birth, int death) {
            artistName = name;
            birthYear = birth;
            deathYear = death;
        }

        public String getName() { return artistName; }
        public int getBirthYear() { return birthYear; }
        public int getDeathYear() { return deathYear; }

        public void printInfo() {
            String timeAlive = "";
            if (birthYear >= 0) {
                if (deathYear >= 0) {
                    timeAlive = String.format("%d to %d", birthYear, deathYear);
                } else {
                    timeAlive = String.format("%d to present", birthYear);
                }
            } else {
                timeAlive = "unknown";
            }
            System.out.printf("Artist: %s (%s)\n", artistName, timeAlive);
        }

    }

    public static class Artwork {

        private String  title;
        private int     yearCreated;
        private Artist  artist;

        public Artwork() {
            title = "unknown";
            yearCreated = -1;
        }
        public Artwork(String title, int created, Artist artist) {
            this.title = title;
            this.yearCreated = created;
            this.artist = artist;
        }

        public String getTitle() { return title; }
        public int getYearCreated() { return yearCreated; }

        public void printInfo() {
            artist.printInfo();
            System.out.printf("Title: %s, %d\n", title, yearCreated);
        }

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        String userTitle, userArtistName;
        int yearCreated, userBirthYear, userDeathYear;
        
        userArtistName = scnr.nextLine();
        userBirthYear = scnr.nextInt();
        scnr.nextLine();
        userDeathYear = scnr.nextInt();
        scnr.nextLine();
        userTitle = scnr.nextLine();
        yearCreated = scnr.nextInt();
        
        Artist userArtist = new Artist(userArtistName, userBirthYear, userDeathYear);
        
        Artwork newArtwork = new Artwork(userTitle, yearCreated, userArtist);
        
        newArtwork.printInfo();
    }
}
