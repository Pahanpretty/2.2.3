package dao;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDAO {
    private List<Car> cars = new ArrayList<>();
    private static int ID_COUNT;
    {
        cars.add(new Car(++ID_COUNT, "Mazda", 2001));
        cars.add(new Car(++ID_COUNT, "Volvo", 2002));
        cars.add(new Car(++ID_COUNT, "Lada", 2003));
        cars.add(new Car(++ID_COUNT, "Susuki", 2004));
        cars.add(new Car(++ID_COUNT, "BMW", 2005));
    }

    public List<Car> getCars() {
        return cars;
    }

//    public Car getSomeCars(int count) {
//        switch (count) {
//            case 1:
//                return cars.get(1);
//            case 2:
//                return cars.get(2);
//            case 3:
//                return cars.get(3);
//            case 4:
//                return cars.get(4);
//            default:
//                return cars.get(0);
//        }


//    }
}
