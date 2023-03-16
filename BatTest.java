public class BatTest {
    public static void main(String[] args) {
        Bat bruce = new Bat();

        // attack three towns
        bruce.attackTown();
        bruce.attackTown();
        bruce.attackTown();

        // eat two humans
        bruce.eatHumans();
        bruce.eatHumans();

        // fly twice
        bruce.fly();
        bruce.fly();

        // display energyLevel
        bruce.displayEnergy();
    }
}