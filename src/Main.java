import house.House;
import house.SummerHouse;
import house.Villa;

public class Main {
    public static void main(String[] args) {
        House house = new House(1_100_400L, 200, 4, 1);
        House house2 = new Villa(2_100_400L, 300, 6, 2);
        House house3 = new SummerHouse(100_400L, 100, 3, 1);

    }
}
