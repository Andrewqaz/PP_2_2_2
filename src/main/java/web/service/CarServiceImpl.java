package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static List<Car> cars;

    static {
        cars = new ArrayList<>(5);
        cars.add(new Car("Mark 1", "Model 1", 2017));
        cars.add(new Car("Mark 2", "Model 2", 2018));
        cars.add(new Car("Mark 3", "Model 3", 2019));
        cars.add(new Car("Mark 4", "Model 4", 2020));
        cars.add(new Car("Mark 5", "Model 5", 2021));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
