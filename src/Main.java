public class Main {
    public static void main(String[] args) {

        Hero h = new Hero();
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());
        King k = new King();
        k.talk(h);
        Inn i = new Inn();
        i.checkIn(h);
        h.attack(new Matango());
    }
}