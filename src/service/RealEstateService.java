package service;

import java.util.ArrayList;
import java.util.List;

import house.House;

public class RealEstateService {
    public static long totalPrice(List<House> houses) {
        long totalPrice = 0;
        for (House house : houses) {
            totalPrice += house.getPrice();
        }
        return totalPrice;
    }

    public static long averageSquareMeter(List<House> houses) {
        long totalSquareMeter = 0;
        for (House house : houses) {
            totalSquareMeter += house.getSquareMeter();
        }
        int numberOfHouses = houses.size();
        return totalSquareMeter / numberOfHouses;
    }

    public static List<House> houseListFilteredByRoomAndLivingRoomCount(List<House> houses, int roomCount,
            int livingRoomCount) {
        List<House> filteredHouses = new ArrayList<House>();
        for (House house : houses) {
            if (house.getNumberOfRooms() == roomCount && house.getNumberOfLivingRooms() == livingRoomCount) {
                filteredHouses.add(house);
            }
        }

        return filteredHouses;
    }
}
