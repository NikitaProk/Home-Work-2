public class ZooAnimal {
    private final Animal animal;
    private final int count;

    public ZooAnimal(Animal animal, int count) {
        this.animal = animal;
        this.count = count;
    }

    public Animal getAnimal() {
        return animal;
    }

    public int getCount() {
        return count;
    }
}
