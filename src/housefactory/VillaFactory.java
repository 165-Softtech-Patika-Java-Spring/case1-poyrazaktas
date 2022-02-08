package housefactory;

import java.util.List;

import house.House;
import house.Villa;

public class VillaFactory implements ListFactory {

    @Override
    public List<House> getList() {
        House house1 = new Villa(10_000_000L, 400, 8, 3);
        House house2 = new Villa(10_000_000L, 400, 8, 3);
        House house3 = new Villa(10_000_000L, 400, 8, 3);

        return List.of(house1, house2, house3);

    }

}
