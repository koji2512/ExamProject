public abstract class Character implements Creature{
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private int hp;
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

    public Character(String name, int hp) {
        this.name = name;
        if(hp < 0){
            throw new IllegalArgumentException("初期値に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.hp = hp;
    }
    public final boolean isAlive(){return hp>0;}

   public void showStatus(){
        System.out.println(this.name+":HP　" + this.hp);
    }


}
