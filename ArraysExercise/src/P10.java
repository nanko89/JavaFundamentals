import java.util.Arrays;
import java.util.Scanner;

public class P10 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int fieldSize = Integer.parseInt(scanner.nextLine());
            int[] indexes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int[] field = new int[fieldSize];
            for (int index : indexes) {
                if (index >= 0 && index < fieldSize) {
                    field[index] = 1;
                }
            }

            String commands = scanner.nextLine();

            while (!commands.equals("end")){
                String[] cmdArgs = commands.split(" ");
                int index = Integer.parseInt(cmdArgs[0]);
                String cmd = cmdArgs[1];
                int flyLength = Integer.parseInt(cmdArgs[2]);

                if (index < 0 || index > fieldSize - 1 || field[index] == 0){
                    commands = scanner.nextLine();
                    continue;
                }
                field[index] = 0;
                if (cmd.equals("right")) {
                    index += flyLength;

                    while (index < fieldSize && field[index] == 1) {
                        index += flyLength;
                    }
                    if (index < fieldSize) {
                        field[index] = 1;
                    }
                }else {
                    index -= flyLength;

                    while (index >= 0 && field[index] == 1){
                        index -= flyLength;
                    }
                    if (index >= 0){
                        field[index] = 1;
                    }
                }
                commands = scanner.nextLine();

            }
            for (int j : field) {
                System.out.print(j + " ");
            }
        }
    }


