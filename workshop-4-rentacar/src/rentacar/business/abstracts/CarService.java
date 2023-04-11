package rentacar.business.abstracts;

import rentacar.entities.Car;

import java.util.List;

public interface CarService {

    void add(Car car);
    void delete(Car car);
    Car update(int id);
    List<Car> getAll();
    boolean isValid(int id);

}
