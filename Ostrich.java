public class Ostrich extends Herbivorous {

    static final HabitatType HABITAT = HabitatType.LAND;
    static final String FOOD = "plants";
    static final int MAX_WEIGHT = 140;
    static final int SIZE_OF_AREA = 150;

    public Ostrich(String name, String age) {
        super(name, age, SIZE_OF_AREA, MAX_WEIGHT, HABITAT);
    }


}
