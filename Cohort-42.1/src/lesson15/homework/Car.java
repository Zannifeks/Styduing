//package lesson15.homework;
//
//public class Car {
//    double fuel;
//
//    double maxFuel = 30;
//
//    boolean engineOn;
//
//    public Car(double fuel, double maxFuel) {
//        this.fuel = fuel;
//        this.maxFuel = maxFuel;
//        this.engineOn = false;
//    }
//
//    public void refuel(double fuel) {
//        if (this.fuel + fuel > maxFuel) {
//            this.fuel = maxFuel;
//            return;
//        }
//        this.fuel += fuel;
//    }
//
//    public double drive(int distance) {
//        if (!engineOn) {
//            return 0;
//        }
//        // TODO recalculate real distance if fuel not enought
//        fuel -= 0.05 * distance;
//        return distance;
//    }
//
//    public boolean startEngine() {
//        engineOn = fuel > 0;
//        return engineOn;
//    }
//
//}
