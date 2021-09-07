package FinalExam03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P03NeedForSpeedIII {
    static class Cars {
        String car;
        int mileage;

        public int getMileage() {
            return mileage;
        }

        public int getFuel() {
            return fuel;
        }

        int fuel;

        public Cars(String car, int mileage, int fuel) {
            this.car = car;
            this.mileage = mileage;
            this.fuel = fuel;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Cars> catalog = new HashMap<>();
        for (int i = 0; i < n; i++) {


            String[] input = scanner.nextLine().split("\\|");
            String car = input[0];
            int mileage = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);
            Cars cars = new Cars(car, mileage, fuel);
            catalog.put(car, cars);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")){
            String currentCommand = command.split(" : ")[0];
            switch (currentCommand){
                case "Drive":
                    String driveCar = command.split(" : ")[1];
                    int distance = Integer.parseInt(command.split(" : ")[2]);
                    int driveFuel = Integer.parseInt(command.split(" : ")[3]);
                    if (catalog.get(driveCar).fuel >= driveFuel ){
                    Cars cars1 = catalog.get(driveCar);
                    cars1.fuel = cars1.fuel - driveFuel;
                    cars1.mileage = cars1.mileage + distance;
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", driveCar,distance,driveFuel);
                        if (cars1.mileage >= 100000){
                            catalog.remove(driveCar);
                            System.out.printf("Time to sell the %s!%n", driveCar);
                        }
                    }else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
                    String refuelCar = command.split(" : ")[1];
                    int refuelFuel = Integer.parseInt(command.split(" : ")[2]);
                    Cars cars1 = catalog.get(refuelCar);
                    cars1.fuel = cars1.fuel + refuelFuel;
                    if (cars1.fuel > 75){
                        refuelFuel = refuelFuel -(cars1.fuel-75);
                        cars1.fuel = 75;
                    }
                    System.out.printf("%s refueled with %d liters%n", refuelCar,refuelFuel);
                    break;
                case "Revert":
                    String revertCar = command.split(" : ")[1];
                    int kilometers = Integer.parseInt(command.split(" : ")[2]);
                    Cars cars2 = catalog.get(revertCar);

                    if (cars2.mileage >= 10000 && cars2.mileage - kilometers < 10000){
                        cars2.mileage = 10000;
                    }else {
                        cars2.mileage = cars2.mileage - kilometers;
                        System.out.printf("%s mileage decreased by %d kilometers%n", revertCar,kilometers);
                    }
                    break;
            }

            command = scanner.nextLine();

        }
        catalog.entrySet()
                .stream()
                .sorted((a,b) ->{
                    if (a.getValue().getMileage() != b.getValue().getMileage()){
                      return  Integer.compare(b.getValue().getMileage(), a.getValue().getMileage());
                    }else {
                       return a.getKey().compareTo(b.getKey());
                    }
                })
                .map(entry -> entry.getKey()+ " -> Mileage: " + entry.getValue().getMileage() + " kms, Fuel in the tank: " + entry.getValue().getFuel() + " lt.")
                .forEach(System.out::println);

    }
}
