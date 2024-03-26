package ejercicios.repasoHerencia.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Motorcycle moto = new Motorcycle("Red", 2, "sport", 120, 150);
        Bicycle bike = new Bicycle("Blue", 2, "urban");
        Truck truck = new Truck("White", 18, 2000, 3000);
        Car car = new Car("Black", 4, 180, 2000);

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(moto);
        vehicleList.add(bike);
        vehicleList.add(truck);
        vehicleList.add(car);

        catalog(vehicleList);

        catalog(vehicleList, 0);
        catalog(vehicleList, 2);
        catalog(vehicleList, 4);
    }

    public static void catalog(List<Vehicle> vehicleList) {
        System.out.println("\nVehicle Catalog:");
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.getClass().getSimpleName() + ":");
            System.out.println("- Color: " + vehicle.getColor());
            System.out.println("-Number of wheels: " + vehicle.getNumberOfWheels());
            System.out.println();
        }
    }

    public static void catalog(List<Vehicle> vehicleList, int wheels) {
        int count = 0;
        System.out.println("\nVehicle Catalog with " + wheels + " wheels:");
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getNumberOfWheels() == wheels) {
                System.out.println(vehicle.getClass().getSimpleName() + ":");
                System.out.println("- Color: " + vehicle.getColor());
                System.out.println("- Number of wheels: " + vehicle.getNumberOfWheels());
                System.out.println();
                count++;
            }
        }
        if (wheels >= 0) {
            System.out.println("Found " + count + " vehicles with " + wheels +
                    " whees.");
        }
    }
}
