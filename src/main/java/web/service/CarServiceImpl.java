package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {



    @Override
    public List<Car> carList(Integer count) {
        List<Car> cars;
            cars = new ArrayList<>();
            cars.add(new Car(2, "Ford", 2004));
            cars.add(new Car(1, "Fiat", 2006));
            cars.add(new Car(3, "BMW", 2019));
            cars.add(new Car(4, "Tayota", 2018));
            cars.add(new Car(5, "Kia", 2020));

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}