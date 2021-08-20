package FinalExam03;

import java.util.*;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCars = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> carMileage = new HashMap<>();
        Map<String, Integer> carFuel = new HashMap<>();

        for (int i = 0; i < numberCars; i++) {
            String[] currentCar = scanner.nextLine().split("\\|");
            //{car}|{mileage}|{fuel}
            String car = currentCar[0];
            int mileage = Integer.parseInt(currentCar[1]);
            int fuel = Integer.parseInt(currentCar[2]);

            carMileage.put(car,mileage);
            carFuel.put(car,fuel);

        }
            String command = scanner.nextLine();
            while (!command.equals("Stop")){
                String commandName = command.split(" : ")[0];

                switch (commandName){
                    case "Drive":
                        String carDriveName = command.split(" : ")[1];
                        int distanceDrive = Integer.parseInt(command.split(" : ")[2]);
                        int fuelDrive = Integer.parseInt(command.split(" : ")[3]);

                        if (carFuel.get(carDriveName) >= fuelDrive){
                            carFuel.put(carDriveName, carFuel.get(carDriveName) - fuelDrive);
                            carMileage.put(carDriveName, carMileage.get(carDriveName) + distanceDrive);
                            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carDriveName,distanceDrive,fuelDrive);
                            if (carMileage.get(carDriveName) >= 100000){
                                System.out.printf("Time to sell the %s!%n", carDriveName);
                                carFuel.remove(carDriveName);
                                carMileage.remove(carDriveName);
                            }
                        }else {
                            System.out.println("Not enough fuel to make that ride");
                        }
                        break;
                    case "Refuel":
                        String carName = command.split(" : ")[1];
                        int fuel = Integer.parseInt(command.split(" : ")[2]);
                        int totalFuel = fuel + carFuel.get(carName);
                        if (totalFuel > 75){
                            carFuel.put(carName, 75);
                            fuel = fuel - (totalFuel - 75);
                        }else {
                            carFuel.put(carName, totalFuel);
                        }
                        System.out.printf("%s refueled with %d liters%n", carName, fuel);
                        break;
                    case "Revert":
                        String revertCar = command.split(" : ")[1];
                        int kilometers = Integer.parseInt(command.split(" : ")[2]);

                        if (carMileage.get(revertCar) >= 10000 && carMileage.get(revertCar) - kilometers < 10000){
                            carMileage.put(revertCar,10000);

                        }else {
                            carMileage.put(revertCar, carMileage.get(revertCar) - kilometers) ;
                            System.out.printf("%s mileage decreased by %d kilometers%n", revertCar,kilometers);
                        }
                        break;
                }
                command = scanner.nextLine();

            }
            carMileage.entrySet()
                    .stream()
                    .sorted(Map.Entry.<String,Integer>comparingByValue()
                            .reversed()
                            .thenComparing(Map.Entry.comparingByKey()))
                    .forEach(n -> {
                        System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n", n.getKey(), n.getValue(), carFuel.get(n.getKey()));
                    });

    }
}
