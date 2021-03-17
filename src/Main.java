public class Main {
    public static void main(String[] args) {
    Medic medic = new Medic();
    Warrior warrior = new Warrior();
    Magic magic = new Magic();

    HavingSuperAbility[] havingSuperAbilities = {magic,medic,warrior};
        for (int i = 0; i <havingSuperAbilities.length ; i++) {
            havingSuperAbilities[i].applySuperAbility(" CRITICAL DAMAGE");


        }
    }
}
