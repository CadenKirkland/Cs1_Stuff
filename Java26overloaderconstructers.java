//CadenK
//demonstrate using Overloaded Constructors...each has a different parameter list
class SportsTeam {
    private String name;
    private String city;
    private String sport;
    private int wins;
    private int losses;

    //empty parameter constructor; used as placeholder 4 expansion team
    public SportsTeam() {
        name = "expansion team";
        city = "unknown";
        sport = "basketball";
        wins = 0;
        losses = 0;
        System.out.println("sportsteam called..." + name);
    }

    //one parameter only
    public SportsTeam(String name) {
        name = name;
        city = "unknown";
        sport = "basketball";
        wins = 0;
        losses = 0;
        System.out.println("sportsteam called..." + name + " sport: " + sport);
    }

    // two parameters
    public SportsTeam(String name, String city) {
        name = name;
        city = city;
        sport = "basketball";
        wins = 0;
        losses = 0;
        System.out.println("sportsteam called..." + name + " city: " + city + " sport: " + sport);
    }


    // four parameters
    public SportsTeam(String name, int wins, int losses) {
        name = name;
        city = "unknown";
        sport = "basketball";
        wins = wins;
        losses = losses;
        System.out.println("sportsteam called..." + name + " wins: " + wins + " losses" + losses);
    }

    // all parameters
    public SportsTeam(String name, String city, String sport, int wins, int losses) {
        name = name;
        city = city;
        sport = sport;
        wins = wins;
        losses = losses;
        System.out.println("sportsteam called..." + name + " city: " + city + " sport: " + sport + " wins: " + wins + " losses" + losses);

    }
}
public class Java26overloaderconstructers {
    public static void main(String[] args) {
        System.out.println("creating teaml with no arguments");
        SportsTeam T1 = new SportsTeam();
        System.out.println("creating team2 with name argument");
        SportsTeam T2 = new SportsTeam("Thunderhawks");
        System.out.println("creating team3 with name & city arguments");
        SportsTeam T3 = new SportsTeam("River Foxes", "SpringField");
        System.out.println("creating team4 with name & record");
        SportsTeam T4 = new SportsTeam("Iron Bison", 18, 6);
        System.out.println("creating team5 with all fields");
        SportsTeam T5 = new SportsTeam("Comets", "Lakeview", "Soccer", 18, 6);

    }
}
