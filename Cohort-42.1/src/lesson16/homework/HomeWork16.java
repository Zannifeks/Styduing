package lesson16.homework;

import lesson16.Cat;
import lesson16.Plate;

public class HomeWork16 {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(12), new Cat(18), new Cat(20), new Cat(8)};
        Plate plate = new Plate(50);
        plate.add(40);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println("Cat: " +  ((double)cat.realVolume/cat.maxVolume)*100 + "%");
        }

        // task 2
        Car car = new Car(40);
        PetrolStation station = new PetrolStation(1000);
        System.out.println("Car: " + car.fuel);
        System.out.println("Station: " + station.fuel);

        car.refuel(station);
        System.out.println("Car: " + car.fuel);
        System.out.println("Station: " + station.fuel);
    }
}
