// create a separate class of gorilla
public class Gorilla extends Mammal {
    public Gorilla() {
        super();
    }
    // can throw things at people, will lose energy(-5)
    public void throwSomething() {
        // print message indicating gorilla has thrown something
        System.out.println("Gorilla has thrown something.");
        this.energyLevel -= 5;
    }

    // eatBananas, regain energy (+10)
    public void eatBananas() {
        // print message indicating gorilla's satisfaction
        System.out.println("Yum yum!");
        this.energyLevel += 10;
    }

    // climb (-10)
    public void climb() {
        // print message indicating gorilla climbed a tree
        System.out.println("Gorilla has climbed a tree! ...and by tree I mean a skyscraper!");
        this.energyLevel -= 10;
    }
}