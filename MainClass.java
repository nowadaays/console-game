import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Приветствуем вас! Начнём небольшую игру! Как вас зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Ваше имя теперь знаем " + name + ". Теперь выберем вашу проффессию!");
        int step = scanner.nextInt();
        System.out.println("Выберите число от 1 до 3 , чтобы определиться с выбором класса!");
        switch (step) {
            case 1:
                Guardian guardian = new Guardian(150, 10, name);
                guardianWave(scanner, guardian);
                break;
            case 2:
                Pilot pilot = new Pilot(300, 15, name);
                pilotWave(scanner, pilot);
                break;
            case 3:
                Tehnical tehnical = new Tehnical(100, 20, name);
                technicalWave(scanner, tehnical);
                break;
        }
    }

    public static void guardianWave(Scanner scanner, Guardian guardian) {
        int count = 0;
        System.out.println("Класс защитник! У вас есть 3 варианта развития вашешго персонажа!");
        System.out.println(
                "Заниматься вашим проффесиональным делом, пойти в бой , чтобы заработать золотые монеты или же востановить ваше здоровье!");
        while (count != 3) {
            System.out.println(
                    "Введите 1 , чтобы отправиться в бой! Введите 2 чтобы заниматься вашем проф. делом. Введите 3 чтобы восстановить ресурсы!");
            switch (scanner.nextInt()) {
                case 1:
                    guardian.goRaid();
                    count++;
                    break;
                case 2:
                    guardian.levlUp();
                    count++;
                    break;
                case 3:
                    guardian.healing();
                    count++;
                    break;
            }
            if (count == 3) {
                System.out.println("Поздравляем , вы попробывали все варианты развития вашего перснонажа!");
                guardian.getInfo();
            }
        }
    }

    public static void pilotWave(Scanner scanner, Pilot pilot) {
        int count = 0;
        System.out.println("Класс пилот! У вас есть 3 варианта развития вашего перснонажа!");
        System.out.println(
                "Заниматься вашим проф. делом , пойти в бой , чтобы заработать золотые монеты или же восстановить ваши ресурсы!");
        while (count != 3) {
            System.out.println(
                    "Введите 1 , чтобы отправиться в бой! Введите 2 чтобы заниматься вашем проф. делом. Введите 3 чтобы восстановить ресурсы!");
            switch (scanner.nextInt()) {
                case 1:
                    pilot.goRaid();
                    count++;
                    break;
                case 2:
                    pilot.proffecionalWork();
                    count++;
                    break;
                case 3:
                    pilot.healing();
                    count++;
            }
            if (count == 3) {
                System.out.println("Поздравляем , вы попробывали все варианты развития вашего персонажа!");
                pilot.getInfo();
            }
        }
    }

    public static void technicalWave(Scanner scanner, Tehnical tehnical) {
        int count = 0;
        System.out.println("Класс техник! У вас есть 3 варианта развития вашего персонажа!");
        System.out.println(
                "Заниматься вашим проф. делом , пойти в бой , чтобы заработать золотые монеты или же восстановить ваши рессурсы!");
        while (count != 3) {
            System.out.println(
                    "Введите 1 , чтобы отправиться в бой! Введите 2 чтобы заниматься вашем проф. делом. Введите 3 чтобы восстановить ресурсы!");
            switch (scanner.nextInt()) {
                case 1:
                    tehnical.goRaid();
                    count++;
                    break;
                case 2:
                    tehnical.workhard();
                    count++;
                    break;
                case 3:
                    tehnical.workheal();
                    count++;
                    break;
            }
            if (count == 3) {
                System.out.println("Поздравляем , вы попробывали все варианты развития вашего перснонажа!");
                tehnical.getInfo();
            }
        }
    }
}
