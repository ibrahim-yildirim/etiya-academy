package rentacar.dataAccess.abstracts;

import rentacar.entities.Car;

import java.util.List;

public interface CarDao {

    void add(Car car);
    void delete(Car car);
    Car update(int id);
    List<Car> getAll();

}
