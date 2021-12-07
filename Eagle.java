public class Eagle extends Carnivore {
    static final HabitatType HABITAT = HabitatType.FLYING;
    static final String FOOD = "meet";
    static final int MAX_WEIGHT = 7;
    static final int SIZE_OF_AREA = 100;

    public Eagle(String name, String age) {
        super(name, age, SIZE_OF_AREA, MAX_WEIGHT, HABITAT);
    }
}
