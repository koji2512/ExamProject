public abstract class Monster implements Creature{
    private String name;
    private int hp;
    private char suffix;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public char getSuffix() {
        return suffix;
    }

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }

    public Monster(String name,char suffix, int hp) {
        this.name = name;
        this.suffix = suffix;
        if(hp < 0){
            throw new IllegalArgumentException("初期値に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.hp = hp;
    }
    public final boolean isAlive(){return hp>0;}
    public void showStatus(){
        System.out.println(this.name + suffix+":HP　" + this.hp);
    }


}
