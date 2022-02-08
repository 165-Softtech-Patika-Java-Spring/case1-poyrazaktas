import java.util.List;
import house.*;
import housefactory.*;

public class Main {
    public static void main(String[] args) {
        HouseFactory houseFactory = new HouseFactory();
        List<House> houses = houseFactory.getList();
        VillaFactory villaFactory = new VillaFactory();
        List<House> villas = villaFactory.getList();
        SummerHouseFactory summerHouseFactory = new SummerHouseFactory();
        List<House> summerHouses = summerHouseFactory.getList();

        System.out.println("Houses: ");
        houses.forEach(System.out::println);
        System.out.println("Villas: ");
        villas.forEach(System.out::println);
        System.out.println("Summer houses: ");
        summerHouses.forEach(System.out::println);

    }
}
