import com.sun.org.apache.bcel.internal.generic.LAND;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final List<ZooAnimal> animals = new ArrayList<>();

    public void addAnimal(Animal animal, int count) {
        animals.add(new ZooAnimal(animal, count));
    }

    public List<ZooAnimal> getAnimals() {
        return animals;
    }

    public int sizeOfZoo() {
        return animals.stream()
                .map(animal -> animal.getAnimal().getSizeOfArea() * animal.getCount())
                .reduce(0, Integer::sum);
    }

    public int getLiftingCapacityForLandResidenceAnimals() {
        return animals.stream()
                .filter(animal -> animal.getAnimal().getHabitat().equals("land"))
                .map(animal -> animal.getAnimal().getMaxWeight() * animal.getCount())
                .reduce(0, Integer::sum);
    }

    public int getLiftingCapacityForFlyingResidenceAnimals() {
        return animals.stream()
                .filter(animal -> animal.getAnimal().getHabitat().equals("flying"))
                .map(animal -> animal.getAnimal().getMaxWeight() * animal.getCount())
                .reduce(0, Integer::sum);
    }

    public int getLiftingCapacityForWaterfowlResidenceAnimals() {
        return animals.stream()
                .filter(animal -> animal.getAnimal().getHabitat().equals("waterfowl"))
                .map(animal -> animal.getAnimal().getMaxWeight() * animal.getCount())
                .reduce(0, Integer::sum);
    }
}

