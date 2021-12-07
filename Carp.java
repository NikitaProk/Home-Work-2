public class Carp extends Omnivore {
    static final HabitatType HABITAT = HabitatType.WATERFOWL;
    static final String FOOD = "meet and plants";
    static final int MAX_WEIGHT = 4;
    static final int SIZE_OF_AREA = 8;

    public Carp(String name, String age) {
        super(name, age, SIZE_OF_AREA, MAX_WEIGHT, HABITAT);
    }


}
