public class Omnivore extends Animal {
    public Omnivore(String name, String dateOfBirth, int sizeOfArea, int maxWeight, HabitatType habitat) {
        super(name, dateOfBirth, sizeOfArea, maxWeight, habitat);
    }

    public String eat(String food) {
        return "I will eat!";
    }

}