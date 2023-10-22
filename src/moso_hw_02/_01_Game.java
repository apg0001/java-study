package moso_hw_02;

import java.util.Random;

abstract class Character {
    int hitPoint; // 캐릭터의 체력
    int portionNumber; // 보유 물약 개수

    abstract void initialize(); // 체력, 물약 초기화

    abstract void attack(Character c); // 캐릭터 c에게 데미지를 줌

    abstract int getDamage(int damage); // 특정 데미지를 받아 자신의 체력에 반영, 필요하다면 recover()메소드로 체력 회복

    // 특정 데미지를 받아 자신의 체력에 반영, 필요하다면 recover()메소드로 체력 회복
    abstract void recover(); // 물약을 먹고 캐릭터 특성에 따라 회복.

    boolean isDie() {
        // 자신이 죽었는지 아닌지 판단
        if (this.hitPoint <= 0)
            return true;
        else
            return false;
    }

    void whoAmI() {
        // 자신이 어떤 클래스에 속하는지 출력
        System.out.println("class: Character");
    }
}

class Human extends Character {
    int maxHP = 200;
    int healHP = 40;
    int damage = 50;

    public Human() {
        initialize();
    }

    void initialize() {
        this.hitPoint = maxHP;
        this.portionNumber = 5;
    }

    void attack(Character c) {
        System.out.print("Human attacks with damage " + damage + ". ");
        c.getDamage(damage);
    }

    int getDamage(int damage) {
        this.hitPoint -= damage;
        System.out.println("Human has " + this.hitPoint + "hit point now.");
        if (portionNumber > 0 && healHP + hitPoint <= maxHP)
            recover();
        return this.hitPoint;
    }

    void recover() {
        this.hitPoint += healHP;
        System.out.println("Human eats portion and " + this.hitPoint + "hit point now.");
        this.portionNumber--;
    }

    void whoAmI() {
        System.out.print("Human");
    }
}

class CyberDaemon extends Character {
    int maxHP = 250;
    int healHP; // 30, 30% 확률로 50
    int damage; // 40, 30% 확률로 60

    public CyberDaemon() {
        initialize();
    }

    void initialize() {
        this.hitPoint = maxHP;
        this.portionNumber = 5;
    }

    void attack(Character c) {
        Random rand = new Random();
        int n = rand.nextInt(100);

        if (n < 30)
            damage = 60;
        else
            damage = 40;

        System.out.print("Cyber Daemon attacks with damage " + damage + ". ");
        c.getDamage(damage);
    }

    int getDamage(int damage) {
        this.hitPoint -= damage;
        System.out.println("Cyber Daemon has " + this.hitPoint + " hit point now.");

        Random rand = new Random();
        int n = rand.nextInt(100);

        if (n < 30)
            healHP = 50;
        else
            healHP = 30;

        if (portionNumber > 0 && healHP + hitPoint <= maxHP)
            recover();
        return this.hitPoint;
    }

    void recover() {
        this.hitPoint += healHP;
        System.out.println("Cyber Daemon eats portion and " + this.hitPoint + " hit point now.");
        this.portionNumber--;
    }

    void whoAmI() {
        System.out.print("Cyber Daemon");
    }
}

class Balog extends Character {
    int maxHP = 170;
    int healHP = 30; // 한 번에 물약 두 병 먹기 가능
    int damage; // 25씩 두 번 공격, 각 공격에 20% 확률로 35

    public Balog() {
        initialize();
    }

    void initialize() {
        this.hitPoint = maxHP;
        this.portionNumber = 5;
    }

    void attack(Character c) {
        Random rand = new Random();
        int n = rand.nextInt(100);
        if (n < 20)
            damage = 35;
        else
            damage = 25;
        System.out.print("Balog attacks with damage " + damage + ". ");
        c.getDamage(damage);

        n = rand.nextInt(100);
        if (n < 20)
            damage = 35;
        else
            damage = 25;
        System.out.print("Balog attacks with damage " + damage + ". ");
        c.getDamage(damage);
    }

    int getDamage(int damage) {
        this.hitPoint -= damage;
        System.out.println("Balog has " + this.hitPoint + "hit point now.");

        for (int i = 0; i < 2; i++) {
            if (portionNumber > 0 && healHP + hitPoint <= maxHP)
                recover();
        }
        return this.hitPoint;
    }

    void recover() {
        this.hitPoint += healHP;
        System.out.println("Balog eats portion and " + this.hitPoint + "hit point now.");
        this.portionNumber--;
    }

    void whoAmI() {
        System.out.print("Balog");
    }
}

class Elf extends Character {
    int maxHP = 180;
    int healHP; // 30, 30% 확률로 60
    int damage; // 35, 30% 확률로 70

    public Elf() {
        initialize();
    }

    void initialize() {
        this.hitPoint = maxHP;
        this.portionNumber = 5;
    }

    void attack(Character c) {
        Random rand = new Random();
        int n = rand.nextInt(100);

        if (n < 30)
            damage = 70;
        else
            damage = 35;

        System.out.print("Elf attacks with damage " + damage + ". ");
        c.getDamage(damage);
    }

    int getDamage(int damage) {
        this.hitPoint -= damage;
        System.out.println("Elf has " + this.hitPoint + " hit point now.");

        Random rand = new Random();
        int n = rand.nextInt(100);

        if (n < 25)
            healHP = 60;
        else
            healHP = 30;

        if (portionNumber > 0 && healHP + hitPoint <= maxHP)
            recover();
        return this.hitPoint;
    }

    void recover() {
        this.hitPoint += healHP;
        System.out.println("Elf eats portion and " + this.hitPoint + " hit point now.");
        this.portionNumber--;
    }

    void whoAmI() {
        System.out.print("Elf");
    }
}

public class _01_Game {
    static Character battle(Character blue, Character red) {
        blue.initialize();
        red.initialize();

        Random rand = new Random();
        int n = rand.nextInt(2);
        if (n == 1) {
            Character temp = blue;
            blue = red;
            red = temp;
        }
        while (true) {
            blue.attack(red);
            if (red.isDie()) {
                blue.whoAmI();
                System.out.println(" win!");
                return blue;
            }

            red.attack(blue);
            if (blue.isDie()) {
                red.whoAmI();
                System.out.println(" win!");
                return red;
            }
        }
    }

    static void tournament(Character hu, Character cyber, Character bar, Character el) {
        // 각 인스턴스는 다른 캐릭터
        // 1:1로 2경기 후 승자간에 결승전
        System.out.println("------ battle #1 ------");
        Character winner1 = battle(hu, cyber);
        System.out.println("------ battle #2 ------");
        Character winner2 = battle(bar, el);
        System.out.println("------ battle #Final ------");
        Character finalWinner = battle(winner1, winner2);
        finalWinner.whoAmI();
        System.out.println(" won the final battle!!");
    }

    public static void main(String[] args) {
        Human h1 = new Human();
        CyberDaemon c1 = new CyberDaemon();
        Balog b1 = new Balog();
        Elf e1 = new Elf();

        tournament(h1, c1, b1, e1);
    }
}
