package singleton;

public class ViolateSingleton {
    public static void main(String[] args) {
        Game x = new Game();
        Game y = new Game();

        x.playGame();
        y.playGame();

        System.out.println(String.format("Hascode of Obj X %s", x.hashCode()));
        System.out.println(String.format("Hascode of Obj Y %s", y.hashCode()));
        System.out.println(String.format("Are both objects same:", x.equals(y)));

    }
}

class Game {

    public Game() {
    }

    void playGame() {
        System.out.println("Playing Game");
    }
}