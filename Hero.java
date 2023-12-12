public class Hero {
    private String name;
    protected int hp;
    protected int damage;
    protected int money;

    public Hero(int hp, int damage, String name) {
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.money = 100;
    }

    public void hello() {
        System.out.println("Привет " + name);
    }

    public void goRaid() {
        System.out.println("Перед вами трое врагов, вам надо победить их");
        int firsthpenamy = (int) (Math.random() * 30);
        int firstdamageenamy = (int) (Math.random() * 10);
        int secondhpenamy = (int) (Math.random() * 30);
        int seconddamageenamy = (int) (Math.random() * 10);
        int thirdhpenamy = (int) (Math.random() * 30);
        int thirddamgeenamy = (int) (Math.random() * 10);
        while (firsthpenamy > 0) {
            hp -= firstdamageenamy;
            System.out.println("Первое сражение! Враг наносит вам урон! Ваше здоровье " + hp);
            firsthpenamy -= damage;
            System.out.println("Вы наносите ему удар! Здоровте врага " + secondhpenamy);
        }
        System.out.println("Первый враг повержен , но вас уже ждёт следующий !");
        while (secondhpenamy > 0) {
            hp -= seconddamageenamy;
            System.out.println("Второе сражение! Враг наносит вам урон! Ваше здоровье " + hp);
            secondhpenamy -= damage;
            System.out.println("Вы наносите ему удар! Здоровте врага " + secondhpenamy);
        }
        System.out.println("Второй враг повержен , но вас уже ждёт следующий !");
        while (thirdhpenamy > 0) {
            hp -= thirddamgeenamy;
            System.out.println("Третье сражение! Враг наносит вам урон! Ваше здоровье " + hp);
            thirdhpenamy -= damage;
            System.out.println("Вы наносите ему удар! Здоровте врага " + thirdhpenamy);
        }
        if (hp < 0) {
            System.out.println("Вы погибли!");
            System.exit(0);
        }
        int randomMoney = (int) (Math.random() * 100);
        this.money += randomMoney;
        System.out.println("Поздравляем , вы одержали победу , за это вам заплатили " + randomMoney + " золотых монет");
        System.out.println("Теперь у вас " + money + " золотых монет!");
        System.out.println("После сражения советуем вернуться на восстановление!");
    }

    public void getInfo() {
        System.out.println("Ваше здоровье " + hp);
        System.out.println("Ваш урон " + damage);
        System.out.println("Ваши средства " + money);
    }
}
