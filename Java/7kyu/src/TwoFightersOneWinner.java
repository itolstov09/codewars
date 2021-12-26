// https://www.codewars.com/kata/577bd8d4ae2807c64b00045b/train/java

public class TwoFightersOneWinner {
    public static void main(String[] args) {
        System.out.println(mySolution(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        System.out.println(mySolution(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
        System.out.println(otherSolution(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        System.out.println(otherSolution(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }

    private static String mySolution(Fighter fighter1, Fighter fighter2, String firstAttackerName) {
        float fighter1StrikesCount = (float) fighter2.health / fighter1.damagePerAttack;
        float fighter2StrikesCount = (float) fighter1.health / fighter2.damagePerAttack;

        if ( fighter1StrikesCount == fighter2StrikesCount ) {
            return firstAttackerName;
        } else if ( fighter1StrikesCount < fighter2StrikesCount) {
            return fighter1.name;
        }
        return fighter2.name;
    }

    private static String otherSolution(Fighter fighter1, Fighter fighter2, String firstAttackerName) {
        double attacksToKill1 = Math.ceil((double) fighter2.health / fighter1.damagePerAttack) + (fighter1.name.equals(firstAttackerName) ? 0 : 1);
        double attacksToKill2 = Math.ceil((double) fighter1.health / fighter2.damagePerAttack);

        return attacksToKill1 <= attacksToKill2 ? fighter1.name : fighter2.name;
    }

}

    class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
}