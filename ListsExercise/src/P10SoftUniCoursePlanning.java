import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> courses = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String input =scanner.nextLine();

        while (!input.equals("course start")){
            String[] token = input.split(":");
            String command = token[0];
            String title = token[1];

            if ("Add".equals(command)) {
                if (!courses.contains(title)) {
                    courses.add(title);
                }
            } else if ("Insert".equals(command)) {
                int index = Integer.parseInt(token[2]);
                if (!courses.contains(title)) {
                    courses.add(index, title);
                }
            } else if ("Remove".equals(command)) {
                if (courses.contains(title)) {
                    courses.remove(title);
                }
                int removeIndex = courses.indexOf(title);
                if (courses.get(removeIndex + 1).equals(title + "-Exercise")) {
                    courses.remove(removeIndex + 1);
                }
            } else if ("Swap".equals(command)) {
                String title2 = token[2];
                if (courses.contains(title) && courses.contains(title2)) {
                    int swapIndex1 = courses.indexOf(title);
                    int swapIndex2 = courses.indexOf(title2);
                    courses.set(swapIndex1, title2);
                    courses.set(swapIndex2, title);

                    String exOne = title + "-Exercise";
                    String exTwo = title2 + "-Exercise";
                    if (courses.contains(exOne)) {
                        courses.remove(exOne);
                        courses.add(courses.indexOf(title + 1), exOne);
                    }
                    if (courses.contains(exTwo)) {
                        courses.remove(exTwo);
                        courses.add(courses.indexOf(title2) + 1, exTwo);
                    }
                }
            } else if ("Exercise".equals(command)) {
                String exercise = title + "-Exercise";
                //слагаме упражнение ако има лекция и го няма
                int indexLessonTitle = courses.indexOf(title);
                if (courses.contains(title)) {
                    //има ли упражнение
                    if (indexLessonTitle == courses.size() - 1) {
                        courses.add(indexLessonTitle + 1, exercise);
                    } else if (!courses.get(indexLessonTitle + 1).equals(exercise)) {
                        courses.add(indexLessonTitle + 1, exercise);
                    }
                } else {
                    courses.add(title);
                    courses.add(exercise);
                }
            }

            input = scanner.nextLine();

        }
        for (int i = 0; i < courses.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, courses.get(i));

        }
    }


}
