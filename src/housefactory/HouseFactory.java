package housefactory;

import java.util.List;

import house.House;

public class HouseFactory implements ListFactory {

    @Override
    public List<House> getList() {
        House house1 = new House(1_000_000L, 200, 4, 1);
        House house2 = new House(1_000_000L, 200, 4, 1);
        House house3 = new House(1_000_000L, 200, 4, 1);

        return List.of(house1, house2, house3);

    }

}
