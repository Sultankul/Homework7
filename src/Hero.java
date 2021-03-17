public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String tyoeOfAttack;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTyoeOfAttack() {
        return tyoeOfAttack;
    }

    public void setTyoeOfAttack(String tyoeOfAttack) {
        this.tyoeOfAttack = tyoeOfAttack;
    }

}
