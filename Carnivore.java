public abstract class Carnivore extends Animal {
    public Carnivore(String name, String age, int sizeOfArea, int maxWeight, HabitatType habitat) {
        super(name, age, sizeOfArea, maxWeight, habitat);
    }

    public String eat(String food) {
        if ("meet".equals(food)) {
            return "I will eat!";
        } else {
            return "I will not eat!";
        }
    }
}
