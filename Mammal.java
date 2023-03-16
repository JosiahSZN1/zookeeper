// tracking the mammals
public class Mammal {
    // every mammal should have an energy level (default 100)
    protected static int energyLevel = 100;

    // displayEnergy method, should print/return energyLevel
    public int displayEnergy() {
        System.out.println(this.energyLevel);
        return this.energyLevel;
    }
}