import java.util.ArrayList;
import java.util.List;
import house.*;
import housefactory.*;
import service.RealEstateService;

public class Main {
    public static void main(String[] args) {
        HouseFactory houseFactory = new HouseFactory();
        List<House> houses = houseFactory.getList();
        VillaFactory villaFactory = new VillaFactory();
        List<House> villas = villaFactory.getList();
        SummerHouseFactory summerHouseFactory = new SummerHouseFactory();
        List<House> summerHouses = summerHouseFactory.getList();

        // System.out.println("Houses: ");
        // houses.forEach(System.out::println);
        // System.out.println("Villas: ");
        // villas.forEach(System.out::println);
        // System.out.println("Summer houses: ");
        // summerHouses.forEach(System.out::println);
        List<House> allHouses = new ArrayList<House>();
        allHouses.addAll(houses);
        allHouses.addAll(villas);
        allHouses.addAll(summerHouses);

        // a. Evlerin toplam fiyatlarını dönen bir metot
        System.out.println(RealEstateService.totalPrice(houses));
        // b. Villaların toplam fiyatlarını dönen bir metot
        System.out.println(RealEstateService.totalPrice(villas));
        // c. Yazlıkların toplam fiyatlarını dönen metot
        System.out.println(RealEstateService.totalPrice(summerHouses));
        // d. Tüm tipteki evlerin toplam fiyatını dönen metot
        System.out.println(RealEstateService.totalPrice(allHouses));

        // e. Evlerin ortalama metrekaresini dönen bir metot
        System.out.println(RealEstateService.averageSquareMeter(houses));
        // f. Villaların ortalama metrekaresini dönen bir metot
        System.out.println(RealEstateService.averageSquareMeter(villas));
        // g. Yazlıkların ortalama metrekaresini dönen metot
        System.out.println(RealEstateService.averageSquareMeter(summerHouses));
        // h. Tüm tipteki evlerin ortalama metrekaresini dönen metot
        System.out.println(RealEstateService.averageSquareMeter(allHouses));

        // i. Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot
        // in my case it should return all the summer houses
        List<House> filteredHouses = RealEstateService.houseListFilteredByRoomAndLivingRoomCount(allHouses, 3, 1);
        System.out.println("House Object : Number of Rooms | Number of Living Rooms");
        filteredHouses.forEach(house -> System.out
                .println(house + " : " + house.getNumberOfRooms() + " | " + house.getNumberOfLivingRooms()));

    }
}
