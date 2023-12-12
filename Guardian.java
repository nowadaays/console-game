import java.util.Scanner;

public class Guardian extends Hero {
    private int maxHp;

    public Guardian(int hp, int damage, String name) {
        super(hp, damage, name);
    }

    public void healing() {
        System.out.println("Вы отправляетесь на базу , чтобы востановить ресурсы!");
        System.out.println("Сейчас ваше здоровье будет восстановленно до максимального!");
        hp = maxHp;
    }

    public void levlUp() {
        System.out.println("Здесь вы можете улучшить своего перснонажа!");
        System.out.println("Купите катану , которая увеличит ваш урон на 10! Цена катаны 20 монет!");
        int damagekatana = 10;
        int moneykatana = 20;
        System.out.println("Купите лук, который увеличит ваш урон на 20! Цена лука 30 монет!");
        int damageshoot = 20;
        int moneyshoot = 30;
        System.out.println("Купите нож , который увеличит ваш урон на 5! Цена ножа 5 монет!");
        int damageknife = 5;
        int moneyknife = 5;
        System.out.println("Выбирите улучшение для вашего персонажа!");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Хороший выбор , ваш урон увеличен на 10");
                damage += damagekatana;
                money -= moneykatana;
                break;
            case 2:
                System.out.println("Хороший выбор , ваш урон увеличен на 20");
                damage += damageshoot;
                money -= moneyshoot;
                break;
            case 3:
                System.out.println("Хороший выбор , ваш урон увеличен на 5");
                damage += damageknife;
                money -= moneyknife;
                break;
            default:
                System.out.println("Неправильный выбор. Выбрано значение по умолчанию: 0");
                choice = 0;
        }
    }
}
