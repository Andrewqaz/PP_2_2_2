package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static List<Car> cars;

    private List<Car> getCars() {
        if (cars == null) {
            cars = new ArrayList<>(5);
            cars.add(new Car("Mark 1", "Model 1", 2017));
            cars.add(new Car("Mark 2", "Model 2", 2018));
            cars.add(new Car("Mark 3", "Model 3", 2019));
            cars.add(new Car("Mark 4", "Model 4", 2020));
            cars.add(new Car("Mark 5", "Model 5", 2021));
        }
        return cars;
    }

    @Override
    public List<Car> getCars(Integer count) {
        cars = getCars();
        List<Car> resultList = new ArrayList<>();
        if (count == null || count >= 5) {
            resultList.addAll(cars);
        } else {
            switch (count) {
                case 1: {
                    resultList.add(cars.get(0));
                    break;
                }
                case 2: {
                    resultList.add(cars.get(0));
                    resultList.add(cars.get(1));
                    break;
                }
                case 3: {
                    resultList.add(cars.get(0));
                    resultList.add(cars.get(1));
                    resultList.add(cars.get(2));
                    break;
                }
                case 4: {
                    resultList.add(cars.get(0));
                    resultList.add(cars.get(1));
                    resultList.add(cars.get(2));
                    resultList.add(cars.get(3));
                    break;
                }
            }
        }
        return resultList;
    }
}
