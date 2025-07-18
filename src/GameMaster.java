import java.util.ArrayList;
public class GameMaster {
    public static void main(String[] args) {

        Hero hero= new Hero("勇者",100,"剣");
        ArrayList<Character> names = new ArrayList<>();
        names.add(hero);
        names.add(new Wizard("魔法使い", 60, 20));
        names.add(new Thief("盗賊", 70));

        System.out.println("---味方パーティ---");
        for (Character party : names) {
            party.showStatus();
        }

        ArrayList<Monster> monster = new ArrayList<>();
        monster.add(new Matango("お化けキノコ", 'A',45));
        monster.add(new Goblin("ゴブリン", 'A',50));
        monster.add(new Slime("スライム", 'A',40));
        System.out.println("---敵グループ---");
        for (Monster monsters : monster) {
            monsters.showStatus();
        }
            System.out.println("味方の総攻撃！");
            for (Character party : names) {
                for (Monster monsters : monster) {
                    party.attack(monsters);
                }
            }

            System.out.println("敵の総攻撃！");
            for (Monster monsters : monster) {
                for (Character party : names) {
                    monsters.attack(party);
                }
            }
            System.out.println("ダメージを受けた勇者が光りだした！");
            //Hero hero = new Hero("勇者", 100, "剣");
            SuperHero superHero = new SuperHero(hero);
            names.set(0, superHero);
            System.out.println("勇者はスーパーヒーローに進化した！");
            for (Monster monsters : monster) {
                superHero.attack(monsters);
            }
        System.out.println("---味方パーティ最終ステータス---");
        for (Character party : names) {
            party.showStatus();
            party.isAlive();
            if (party.getHp() <= 0) {
                System.out.println("生存状況:戦闘不能");
            }else{
                System.out.println("生存状況:生存");
            }
        }

        System.out.println("---敵グループ最終ステータス---");
        for (Monster monsters : monster) {
            monsters.showStatus();
            monsters.isAlive();
            if (monsters.getHp() <= 0) {
                System.out.println("生存状況:戦闘不能");
            }else {
                System.out.println("生存状況:生存");
            }
            }
        }
    }

