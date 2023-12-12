public class Pilot extends Hero {
    int maxHp = 300;

    public Pilot(int hp, int damage, String name) {
        super(hp, damage, name);
    }

    public void healing() {
        System.out.println("Ваша транспортное средство поврежденно , стоит его отремонтировать!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("До восстановления осталось 4 секунды!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("До восстановления осталось 2 секунды!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ваше траноспортное средство отремонтиорованно!");
        hp = maxHp;
    }

    public void proffecionalWork() {
        System.out.println("Вы управляете космическим кораблём! Это ответственная работа!");
        System.out.println(
                "На вас лежит не только ответственность за управлением кораблём , но и умменние правлиьно обращаться с оружием!");
        damage += 10;
    }
}
