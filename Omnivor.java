public class Omnivor extends Animal {
    public Omnivor(String name, String dateOfBirth, int sizeOfArea, int maxWeight, String habitat) {
        super(name, dateOfBirth, sizeOfArea, maxWeight, habitat);
    }

    @Override
    public String eat(String food) {
        return "I will eat!";
    }

}