public class Kangaroo extends Herbivorous {
    static final String habitat = "land";
    static final String food = "plants";
    static final int maxWeight = 85;
    static final int sizeOfArea = 300;

    public Kangaroo(String name, String age) {
        super(name, age,sizeOfArea,maxWeight,habitat);
    }


}
