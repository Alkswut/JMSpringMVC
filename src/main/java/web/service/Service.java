package web.service;

import java.util.ArrayList;
import java.util.List;

public class Service {
    Car car1 = new Car("BMW", 320, "Black");
    Car car2 = new Car("Opel", 1, "White");
    Car car3 = new Car("Mercedes-Benz", 220, "Black");
    Car car4 = new Car("Suzuki", 5, "Yellow");
    Car car5 = new Car("Nissan", 350, "Grey");
    static List<Car> listCars = new ArrayList<>();

    public Service() {
        listCars.add(car1);
        listCars.add(car2);
        listCars.add(car3);
        listCars.add(car4);
        listCars.add(car5);
    }

    public static List<Car> getCars(int count) {
        int index;
        List<Car> newListCars = new ArrayList<>();
        if (count > listCars.size()) {
            index = listCars.size();
        } else {
            index = count;
        }
        for (int i = 0; i < index; i++) {
            newListCars.add(listCars.get(i));
        }
        return newListCars;
    }
}
