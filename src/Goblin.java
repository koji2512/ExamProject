public class Goblin extends Monster{
    public Goblin(String name,char suffix, int hp){
        super(name,suffix,hp);

    }

    public void attack(Creature target) {
        System.out.println("ゴブリン" +getSuffix() + "はナイフで切り付けた！" +target.getName() + "に8のダメージを与えた！");
        target.setHp(target.getHp()-8);
    }
}
