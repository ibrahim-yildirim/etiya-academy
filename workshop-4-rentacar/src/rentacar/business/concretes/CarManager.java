package rentacar.business.concretes;

import rentacar.business.abstracts.CarService;
import rentacar.dataAccess.abstracts.CarDao;
import rentacar.dataAccess.concretes.InMemoryCarDao;
import rentacar.entities.Car;

import java.util.List;

public class CarManager implements CarService {

    CarDao carDao;

    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public void add(Car car) {

        // Validation Rule
        if(car.getPrice() <=  0){
            System.out.println("Araç fiyatı 0 veya daha düşük olamaz!");
            return;
        }

        // Business Rule
        if(isValid(car.getId()) == false){
            return;
        }

        // After check 2 rules correct, add car to database
        carDao.add(car);

    }

    @Override
    public void delete(Car car) {
        carDao.delete(car);
    }

    @Override
    public Car update(int id) {
        return carDao.update(id);
    }

    @Override
    public List<Car> getAll() {
        return carDao.getAll();
    }

    // Car id validation check (Are there any same id?)
    @Override
    public boolean isValid(int id) {

        boolean carIdCheck = carDao.getAll().stream().anyMatch(car -> car.getId() == id);

        if(carIdCheck == true){
            System.out.println("Bu id ile kayıtlı bir araba zaten var!");
            return false;
        } else {
            return true;
        }

    }
}
