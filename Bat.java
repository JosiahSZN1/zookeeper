public class Bat extends Mammal {
    public Bat() {
        super();
        this.energyLevel = 300;
    }
    // attacks towns, will lose energy(-5)
    public void attackTown() {
        // print sound of a town on fire, decrease energy by 100
        System.out.println("Crackle! Boom! Crash! Mayday! MAYDAY! Evacuate immediately! Wee-oo-wee-oo!");
        this.energyLevel -= 100;
    }

    // eats humans, regain energy (+25)
    public void eatHumans() {
        System.out.println("No! HELP! Aaarrgh!!!...");
        this.energyLevel += 25;
    }

    // fly (-10)
    public void fly() {
        // print sound of bat taking off and decrease energyLevel by 50
        System.out.println("Whoosh! WHOOSH!");
        this.energyLevel -= 50;
    }
}