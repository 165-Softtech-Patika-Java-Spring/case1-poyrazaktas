package housefactory;

import java.util.List;

import house.House;
import house.SummerHouse;

public class SummerHouseFactory implements ListFactory {

    @Override
    public List<House> getList() {
        House house1 = new SummerHouse(400_000L, 150, 3, 1);
        House house2 = new SummerHouse(400_000L, 150, 3, 1);
        House house3 = new SummerHouse(400_000L, 150, 3, 1);

        return List.of(house1, house2, house3);

    }

}
