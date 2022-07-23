package Codewars;

public class MessiGoals {
    public static int laLigaGoals;
    public static int championsLeagueGoals;
    public static int copaDelReyGoals;
    public static int totalGoals = laLigaGoals+championsLeagueGoals+championsLeagueGoals;

    public static void main(String[] args) {
        laLigaGoals = 43;
        championsLeagueGoals = 10;
        copaDelReyGoals = 5;
        totalGoals = laLigaGoals+championsLeagueGoals+copaDelReyGoals;
        System.out.println(totalGoals);
    }
}
