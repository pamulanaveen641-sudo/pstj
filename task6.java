import java.util.*;

abstract class Vehicle {
    protected double ratePerKm;

    Vehicle(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    abstract double calculateFare(double distance);
}

class Bike extends Vehicle {
    Bike() {
        super(5);
    }

    @Override
    double calculateFare(double distance) {
        return ratePerKm * distance;
    }
}

class Auto extends Vehicle {
    Auto() {
        super(12);
    }

    @Override
    double calculateFare(double distance) {
        return ratePerKm * distance;
    }
}

class Cab extends Vehicle {
    Cab() {
        super(12);
    }

    @Override
    double calculateFare(double distance) {
        return ratePerKm * distance;
    }
}

class Driver {
    String name;
    Vehicle vehicle;

    Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }
}

class Rider {
    String name;

    Rider(String name) {
        this.name = name;
    }
}

class Trip {
    Rider rider;
    Driver driver;
    double distance;

    Trip(Rider rider, Driver driver, double distance) throws Exception {
        if (distance <= 0) {
            throw new Exception("Invalid distance");
        }
        this.rider = rider;
        this.driver = driver;
        this.distance = distance;
    }

    double getFare() {
        return driver.vehicle.calculateFare(distance);
    }
}

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Rider rider = new Rider("Rider");

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double distance = sc.nextDouble();

            try {
                Vehicle vehicle;

                switch (type) {
                    case "Bike":
                        vehicle = new Bike();
                        break;
                    case "Auto":
                        vehicle = new Auto();
                        break;
                    case "Cab":
                        vehicle = new Cab();
                        break;
                    default:
                        throw new Exception("Invalid ride type");
                }

                Driver driver = new Driver("Driver", vehicle);
                Trip trip = new Trip(rider, driver, distance);

                System.out.println((int) trip.getFare());

            } catch (Exception e) {
                System.out.println("Invalid booking");
            }
        }

        sc.close();
    }
}
