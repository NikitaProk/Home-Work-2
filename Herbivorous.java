public abstract class Herbivorous extends Animal {


    public Herbivorous(String name, String age, int sizeOfArea, int maxWeight, HabitatType habitat) {
        super(name, age, sizeOfArea, maxWeight, habitat);
    }

    public String eat(String food) {
        if ("meet".equals(food)) {
            return "I will not eat!";
        } else {
            return "I will eat!";
        }
    }
}
