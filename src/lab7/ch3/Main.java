package lab7.ch3;

public class Main {
    public Player findWinner(Player p1, Player p2) {
        Player winner = null;
        if (p1.getOption().equals("Rock")) {
            if (p2.getOption().equals("Paper"))
                winner = p2;
            else if (p2.getOption().equals("Scissors"))
                winner = p1;
        }

        if (p1.getOption().equals("Paper")) {
            if (p2.getOption().equals("Rock"))
                winner = p1;
            else if (p2.getOption().equals("Scissors"))
                winner = p2;
        }

        if (p1.getOption().equals("Scissors")) {
            if (p2.getOption().equals("Paper"))
                winner = p1;
            else if (p2.getOption().equals("Rock"))
                winner = p2;
        }

        return winner;
    }

    public static void main(String[] args) throws InterruptedException{
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");

        p1.start();
        p2.start();

        p1.join();
        p2.join();

        Player winner = new Main().findWinner(p1, p2);
        if (winner != null) {
            System.out.println("The Winner is: " + winner);
        }
        else
            System.out.println("Draw");
    }
}
