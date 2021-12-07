public abstract class Animal {
    private final String NAME_OF_ANIMAL;
    private final String DATE_OF_BIRTH;
    private final int SIZE_OF_AREA;
    private final int MAX_WEIGHT;
    private final HabitatType HABITAT;

    public String getNameOfAnimal() {
        return NAME_OF_ANIMAL;
    }

    public String getDateOfBirth() {
        return DATE_OF_BIRTH;
    }

    public int getSizeOfArea() {
        return SIZE_OF_AREA;
    }

    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    public HabitatType getHabitat() {
        return HABITAT;
    }


    public Animal(String name, String dateOfBirth, int sizeOfArea, int maxWeight, HabitatType habitat) {
        this.NAME_OF_ANIMAL = name;
        this.DATE_OF_BIRTH = dateOfBirth;
        this.SIZE_OF_AREA = sizeOfArea;
        this.MAX_WEIGHT = maxWeight;
        this.HABITAT = habitat;
    }

    public abstract String eat(String food);

}
