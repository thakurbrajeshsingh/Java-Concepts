package OOPsPractice;


abstract class Player {
    String firstName, lastName;

    Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }
    abstract int getRating();

}

class CricketPlayer extends Player {
    double averageRuns;

    CricketPlayer(String firstName, String lastName, double averageRuns) {
        super(firstName, lastName);
        this.averageRuns = averageRuns;
    }

    int getRating() {
        if (averageRuns > 55) {
            return 7;
        } else if (averageRuns > 50) {
            return 6;
        } else if (averageRuns > 40) {
            return 5;
        } else if (averageRuns > 30) {
            return 3;
        } else if (averageRuns > 20) {
            return 2;
        } else if (averageRuns > 10) {
            return 1;
        } else {
            return 0;
        }
    }
}

class FootballPlayer extends Player {
    int goals;

    FootballPlayer(String firstName, String lastName, int goals) {
        super(firstName, lastName);
        this.goals = goals;
    }

    int getRating() {
        if (goals > 20) {
            return 5;
        } else if (goals > 15) {
            return 4;
        } else if (goals > 10) {
            return 3;
        } else if (goals > 5) {
            return 2;
        } else if (goals <= 5) {
            return 1;
        } else {
            return 0;
        }
    }

}


public class PlayerRating {
    public static void main(String[] args) {
        Player p = new CricketPlayer("Dev", "Dutta", 10);
        p.getRating();

    }
}
