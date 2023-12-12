public class Tehnical extends Hero {
    int maxHp = 100;

    public Tehnical(int hp, int damage, String name) {
        super(hp, damage, name);
    }

    public void workheal() {
        System.out.println("Ваше оружие поврежденно , стоит его починить и улучшить!");
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
        damage += 15;
        money -= 30;
        System.out.println("С вас также взымается плата за обслуживание!");
    }

    public void workhard() {
        System.out.println("За столь долгий проделанный путь вам присваевается бонус , в виде улучшения вашего оружия");
        damage += 30;
        money -= 20;
        System.out.println("С вас также взымается плата за обслуживание!");
    }
}
