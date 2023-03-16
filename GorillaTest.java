public class GorillaTest {
    public static void main(String[] args) {
        Gorilla joe = new Gorilla();

        // throw things 3 times
        joe.throwSomething();
        joe.throwSomething();
        joe.throwSomething();

        // eat bananas twice
        joe.eatBananas();
        joe.eatBananas();

        // climb once
        joe.climb();

        // print gorilla's energyLevel
        joe.displayEnergy();
    }
}