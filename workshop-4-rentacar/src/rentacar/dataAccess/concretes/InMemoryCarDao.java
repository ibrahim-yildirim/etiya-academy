package rentacar.dataAccess.concretes;

import rentacar.dataAccess.abstracts.CarDao;
import rentacar.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCarDao implements CarDao {

    List<Car> cars = new ArrayList<>();

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public void delete(Car car) {
        cars.remove(car);
    }

    @Override
    public Car update(int id) {
        return cars.stream().filter(car -> car.getId() == id).findFirst().orElseThrow();
    }

    @Override
    public List<Car> getAll() {
        return cars;
    }
}
