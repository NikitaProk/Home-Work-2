public abstract class Animal {
    private final String nameOfAnimal;
    private final String dateOfBirth;
    private final int sizeOfArea;
    private final int maxWeight;
    private final String habitat;

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getSizeOfArea() {
        return sizeOfArea;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public String getHabitat() {
        return habitat;
    }


    public Animal(String name, String dateOfBirth, int sizeOfArea, int maxWeight, String habitat) {
        this.nameOfAnimal = name;
        this.dateOfBirth = dateOfBirth;
        this.sizeOfArea = sizeOfArea;
        this.maxWeight = maxWeight;
        this.habitat = habitat;
    }

    public String eat(String food) {
        if ("meet".equals(food)) {
            return "I will eat!";
        } else {
            return "I will not eat!";
        }
    }
}
