public class Lynx extends Carnivore {

    static final HabitatType HABITAT = HabitatType.LAND;
    static final String FOOD = "meet";
    static final int MAX_WEIGHT = 30;
    static final int SIZE_OF_AREA = 200;


    public Lynx(String name, String age) {
        super(name, age, SIZE_OF_AREA, MAX_WEIGHT, HABITAT);
    }
}
