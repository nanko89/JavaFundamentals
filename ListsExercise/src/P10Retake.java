import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10Retake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lessons = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("course start")){
            String[] token = input.split(":");
            String command = token[0];
            String lessonTitle = token[1];
            switch (command) {
                case "Add":
                    if (!lessons.contains(lessonTitle)) {
                        lessons.add(lessonTitle);
                    }

                    break;
                case "Insert":
                    int index = Integer.parseInt(token[2]);
                    if (!lessons.contains(lessonTitle)) {
                        lessons.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    lessons.remove(lessonTitle);
                    int currentIndex = lessons.indexOf(lessonTitle);
                    if (lessons.get(currentIndex + 1).equals(lessonTitle + "-Exercise")) {
                            lessons.remove(currentIndex +1);
                    }
                    break;
                case "Swap":
                    String lessonTitle2 = token[2];
                    if (lessons.contains(lessonTitle) && lessons.contains(lessonTitle2)) {
                        int firstIndex = lessons.indexOf(lessonTitle);
                        int secondIndex = lessons.indexOf(lessonTitle2);
                        lessons.set(firstIndex, lessonTitle2);
                        lessons.set(secondIndex, lessonTitle);
                        String exOne = lessonTitle + "-Exercise";
                        String exTwo = lessonTitle2 + "-Exercise";

                        if (lessons.contains(exOne)) {
                            lessons.remove(exOne);
                            lessons.add(secondIndex + 1, exOne);
                        }
                        if (lessons.contains(exTwo)) {
                            lessons.remove(exTwo);
                            lessons.add(firstIndex + 1, exTwo);
                        }
                    }

                    break;
                case "Exercise":
                    String exercise = lessonTitle + "-Exercise";
                    int indexLesson = lessons.indexOf(lessonTitle);
                    if (lessons.contains(lessonTitle) ) {

                        if (indexLesson == lessons.size() - 1){
                            lessons.add(indexLesson + 1, exercise);
                        }else if (!lessons.get(indexLesson + 1).equals(exercise)){
                            lessons.add(indexLesson + 1, exercise);
                        }

                    } else {
                        lessons.add(lessonTitle);
                        lessons.add(exercise);
                    }
                    break;
            }

            input = scanner.nextLine();

        }
        for (int i = 0; i < lessons.size(); i++) {
            System.out.printf("%d.%s%n",i+1,lessons.get(i));
        }
    }
}
