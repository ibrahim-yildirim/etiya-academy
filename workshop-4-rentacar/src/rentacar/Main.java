package rentacar;

import rentacar.business.abstracts.CarService;
import rentacar.business.concretes.CarManager;
import rentacar.dataAccess.concretes.InMemoryCarDao;
import rentacar.entities.Car;

public class Main {

    public static void main(String[] args) {

        // Create new cars using Car entity
        Car car1 = new Car(1,"mercedes","black",500000);
        Car car2 = new Car(2,"audi","white",600000);
        Car car3 = new Car(3,"supra","orange",800000);
        Car car4 = new Car(3,"sameId","sameId",700000);

        // Initialize InMemoryCarDao (Data access method) from CarService Interface
        CarService manager = new CarManager(new InMemoryCarDao());

        // Add created car entities to List
        manager.add(car1);
        manager.add(car2);
        manager.add(car3);
        manager.add(car4);

        // List our cars list
        for(Car car : manager.getAll()){
            System.out.println(car.getBrand());
        }
        System.out.println("-----------------------------");

        // Update car attribute using id
        manager.update(1).setBrand("Deneme");

        manager.delete(car2);

        // List again after update and delete process
        for(Car car : manager.getAll()){
            System.out.println(car.getBrand());
        }

    }

}
