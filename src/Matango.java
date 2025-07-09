public class Matango {
    int hp;
    final int LEVEL = 10;
    char suffix;

    Matango() {
        hp = 100;
        suffix = 'A';
    }

    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
}