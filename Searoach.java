public class Searoach extends Herbivorous {

    static final HabitatType HABITAT = HabitatType.WATERFOWL;
    static final String FOOD = "meet";
    static final int MAX_WEIGHT = 2;
    static final int SIZE_OF_AREA = 5;


    public Searoach(String name, String age) {
        super(name, age, SIZE_OF_AREA, MAX_WEIGHT, HABITAT);
    }
}
