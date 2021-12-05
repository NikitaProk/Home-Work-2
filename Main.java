import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lynx lynx = new Lynx("Lynxy", "02.12.2012");
        Raccoon raccoon = new Raccoon("Little raccoon", "06.09.2012");
        Kangaroo kangaroo = new Kangaroo("Big boss", "10.10.2014");
        Eagle eagle = new Eagle("Sky storm", "07.08.2020");
        Ostrich ostrich = new Ostrich("Runner", "25.12.2007");
        Carp carp = new Carp("Wet dude", "03.10.2021");
        Searoach searoach = new Searoach("Chika", "30.11.2021");


        List<Animal> animals = new ArrayList<>();
        animals.add(lynx);
        animals.add(raccoon);
        animals.add(kangaroo);
        animals.add(eagle);
        animals.add(ostrich);
        animals.add(carp);
        animals.add(searoach);

        Zoo zoo = new Zoo();
        zoo.addAnimal(lynx, 5);
        zoo.addAnimal(raccoon, 4);
        zoo.addAnimal(kangaroo, 2);
        zoo.addAnimal(eagle, 7);
        zoo.addAnimal(ostrich, 3);
        zoo.addAnimal(carp, 15);
        zoo.addAnimal(searoach, 7);


        printAnimals(zoo);

        System.out.println("\nNeeded area for all animals: " + zoo.sizeOfZoo() + " km" + "\u00B2");
        System.out.println("\nNeede car with lifting capacity for land animals: " + zoo.getLiftingCapacityForLandResidenceAnimals() + " kg");
        System.out.println("\nNeede car with lifting capacity for flying animals: " + zoo.getLiftingCapacityForFlyingResidenceAnimals() + " kg");
        System.out.println("\nNeede car with lifting capacity for waterfowl animals: " + zoo.getLiftingCapacityForWaterfowlResidenceAnimals() + " kg");
    }

    private static void printAnimals(Zoo zoo) {
        zoo.getAnimals().stream()
                .map(ZooAnimal::getAnimal)
                .forEach(animal -> {
                    System.out.println();
                    System.out.println("Name of animal: " + animal.getNameOfAnimal()
                            + "; Date of Birth: " + animal.getDateOfBirth()
                            + "; Kind of food meet: " + animal.eat("meet")
                            + "; Kind of food plants: " + animal.eat("plants"));
                });

    }
}