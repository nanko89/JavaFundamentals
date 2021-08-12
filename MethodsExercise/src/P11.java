import java.util.Arrays;
import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s+");
        String command = scanner.nextLine();

        while (!"end".equals(command)) {
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "exchange":
                    int exchangeIndex = Integer.parseInt(tokens[1]);
                    numbers = getNewArray(numbers, exchangeIndex);
                    break;
                case "max":
                    String maxEvenOrOdd = tokens[1];
                    if (maxEvenOrOdd.equals("even")) {
                        getMaxEven(numbers);
                    } else {
                        getMaxOdd(numbers);
                    }
                    break;
                case "min":
                    String minEvenOrOdd = tokens[1];
                    if (minEvenOrOdd.equals("even")) {
                        getMinEven(numbers);
                    } else {
                        getMinOdd(numbers);
                    }
                    break;
                case "first":
                    int firstCount = Integer.parseInt(tokens[1]);
                    String firstEvenOrOdd = tokens[2];
                    if (firstEvenOrOdd.equals("even")) {
                        findFirstEven(numbers, firstCount);
                    } else {
                        findFirstOdd(numbers, firstCount);
                    }
                    break;
                case "last":
                    int lastCount = Integer.parseInt(tokens[1]);
                    String lastEvenOrOdd = tokens[2];
                    if (lastEvenOrOdd.equals("even")) {
                        findLastEven(numbers, lastCount);
                    } else {
                        findLastOdd(numbers, lastCount);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.print("[");
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println("]");
    }


    private static void findLastOdd(String[] input, int count) {
        int[] numbers  = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        if (count > numbers.length) {
            System.out.println("Invalid count");
        } else {
            int countEven = 0;
            for (Integer num : numbers) {
                if (num % 2 != 0) {
                    countEven++;
                }
            }
            int[] array = new int[Math.min(countEven, count)];
            if (array.length > 0) {
                int index = 0;
                for (int i = numbers.length - 1; i >= 0; i--) {
                    if (numbers[i] % 2 != 0) {
                        array[index] = numbers[i];
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }
                }
                int[] reversedArray = new int[array.length];
                for (int i = 0; i <= reversedArray.length - 1; i++) {
                    reversedArray[i] = array[array.length - (i + 1)];
                }

                System.out.print("[");
                for (int i = 0; i <= reversedArray.length - 1; i++) {
                    if (i == reversedArray.length - 1) {
                        System.out.print(reversedArray[i]);
                    } else {
                        System.out.print(reversedArray[i] + ", ");
                    }
                }
                System.out.println("]");
            } else {
                System.out.println("[]");
            }
        }
    }


    private static void findLastEven(String[] inputAsArray, int count) {

        if (count > inputAsArray.length) {
            System.out.println("Invalid count");
        } else {
            int countEven = 0;
            for (int i = 0; i <= inputAsArray.length - 1; i++) {
                if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                    countEven++;
                }
            }
            int[] array = new int[Math.min(countEven, count)];
            if (array.length > 0) {
                int index = 0;
                for (int i = inputAsArray.length - 1; i >= 0; i--) {
                    if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                        array[index] = Integer.parseInt(inputAsArray[i]);
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }
                }
                int[] reversedArray = new int[array.length];
                for (int i = 0; i <= reversedArray.length - 1; i++) {
                    reversedArray[i] = array[array.length - (i + 1)];
                }

                System.out.print("[");
                for (int i = 0; i <= reversedArray.length - 1; i++) {
                    if (i == reversedArray.length - 1) {
                        System.out.print(reversedArray[i]);
                    } else {
                        System.out.print(reversedArray[i] + ", ");
                    }
                }
                System.out.println("]");
            } else {
                System.out.println("[]");
            }
        }
    }


    private static void findFirstOdd(String[] inputAsArray, int count) {

        if (count > inputAsArray.length) {
            System.out.println("Invalid count");
        } else {
            int countOdd = 0;
            for (int i = 0; i <= inputAsArray.length - 1; i++) {
                if (Integer.parseInt(inputAsArray[i]) % 2 != 0) {
                    countOdd++;
                }
            }
            int[] array = new int[Math.min(countOdd, count)];
            if (array.length > 0) {
                int index = 0;
                for (int i = 0; i <= inputAsArray.length - 1; i++) {
                    if (Integer.parseInt(inputAsArray[i]) % 2 != 0) {
                        array[index] = Integer.parseInt(inputAsArray[i]);
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }
                }
                System.out.print("[");
                for (int i = 0; i <= array.length - 1; i++) {
                    if (i == array.length - 1) {
                        System.out.print(array[i]);
                    } else {
                        System.out.print(array[i] + ", ");
                    }
                }
                System.out.println("]");
            } else {
                System.out.println("[]");
            }
        }
    }


    private static void findFirstEven(String[] inputAsArray, int count) {
        if (count > inputAsArray.length) {
            System.out.println("Invalid count");
        } else {
            int countEven = 0;
            for (int i = 0; i <= inputAsArray.length - 1; i++) {
                if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                    countEven++;
                }
            }
            int[] array = new int[Math.min(countEven, count)];
            if (array.length > 0) {
                int index = 0;
                for (int i = 0; i <= inputAsArray.length - 1; i++) {
                    if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                        array[index] = Integer.parseInt(inputAsArray[i]);
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }
                }
                System.out.print("[");
                for (int i = 0; i <= array.length - 1; i++) {
                    if (i == array.length - 1) {
                        System.out.print(array[i]);
                    } else {
                        System.out.print(array[i] + ", ");
                    }
                }
                System.out.println("]");
            } else {
                System.out.println("[]");
            }
        }
    }

    private static void getMinOdd(String[] inputAsArray) {
        int minElement = Integer.MAX_VALUE;
        int indexOfMinElement = -1;
        for (int i = 0; i <= inputAsArray.length - 1; i++) {
            if (Integer.parseInt(inputAsArray[i]) % 2 != 0) {
                if (Integer.parseInt(inputAsArray[i]) <= minElement) {
                    minElement = Integer.parseInt(inputAsArray[i]);
                    indexOfMinElement = i;
                }
            }
        }
        if (indexOfMinElement > -1) {
            System.out.println(indexOfMinElement);
        } else {
            System.out.println("No matches");
        }
    }

    private static void getMinEven(String[] inputAsArray) {
        int minElement = Integer.MAX_VALUE;
        int indexOfMinElement = -1;
        for (int i = 0; i <= inputAsArray.length - 1; i++) {
            if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                if (Integer.parseInt(inputAsArray[i]) <= minElement) {
                    minElement = Integer.parseInt(inputAsArray[i]);
                    indexOfMinElement = i;
                }
            }
        }
        if (indexOfMinElement > -1) {
            System.out.println(indexOfMinElement);
        } else {
            System.out.println("No matches");
        }
    }

    private static void getMaxEven(String[] inputAsArray) {
        int maxElement = Integer.MIN_VALUE;
        int indexOfMaxElement = -1;
        for (int i = 0; i <= inputAsArray.length - 1; i++) {
            if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                if (Integer.parseInt(inputAsArray[i]) >= maxElement) {
                    maxElement = Integer.parseInt(inputAsArray[i]);
                    indexOfMaxElement = i;
                }
            }
        }
        if (indexOfMaxElement > -1) {
            System.out.println(indexOfMaxElement);
        } else {
            System.out.println("No matches");
        }
    }

    private static void getMaxOdd(String[] inputAsArray) {
        int maxElement = Integer.MIN_VALUE;
        int indexOfMaxElement = -1;
        for (int i = 0; i <= inputAsArray.length - 1; i++) {
            if (Integer.parseInt(inputAsArray[i]) % 2 != 0) {
                if (Integer.parseInt(inputAsArray[i]) >= maxElement) {
                    maxElement = Integer.parseInt(inputAsArray[i]);
                    indexOfMaxElement = i;
                }
            }
        }
        if (indexOfMaxElement > -1) {
            System.out.println(indexOfMaxElement);
        } else {
            System.out.println("No matches");
        }
    }


    private static String[] getNewArray(String[] inputAsArray, int index) {
        String[] newArray = new String[inputAsArray.length];
        if (index < 0 || index >= inputAsArray.length) {
            System.out.println("Invalid index");
            return inputAsArray;
        } else {
            int x = 0;
            for (int newStart = index + 1; newStart < inputAsArray.length; newStart++) {
                newArray[x] = inputAsArray[newStart];
                x++;
            }
            for (int newEnd = 0; newEnd <= index; newEnd++) {
                newArray[x] = inputAsArray[newEnd];
                x++;
            }

        }
        return newArray;
    }
}