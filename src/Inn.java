public class Inn {
    public void checkIn(Hero h) {
        System.out.println("宿屋で回復中...");

        int hp = h.getHp();
        h.setHP(100);
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());
        h.sleep();
    }
}