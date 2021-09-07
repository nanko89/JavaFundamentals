package FinalExam01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P03ThePianist {
    static class Pieces{
        String piece;
        String compositor;
        String key;



        public void setKey(String key) {
            this.key = key;
        }

        public String getCompositor() {
            return compositor;
        }

        public String getKey() {
            return key;
        }

        public Pieces(String piece, String compositor, String key) {
            this.piece = piece;
            this.compositor = compositor;
            this.key = key;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Pieces> pieces = new HashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] information = scanner.nextLine().split("\\|");
            String pieceName = information[0];
            String compositor = information[1];
            String key = information[2];
            Pieces piece = new Pieces(pieceName,compositor,key);
            pieces.put(pieceName,piece);
        }
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
        String[] command = input.split("\\|");
            switch (command[0]) {
                case "Add":

                    String addPiece = command[1];
                    String addCompositor = command[2];
                    String addKey = command[3];
                    if (!pieces.containsKey(addPiece)) {
                        Pieces piece = new Pieces(addPiece, addCompositor, addKey);
                        pieces.put(addPiece, piece);
                        System.out.printf("%s by %s in %s added to the collection!%n", addPiece, addCompositor, addKey);
                    } else {
                        System.out.printf("%s is already in the collection!%n", addPiece);
                    }
                    break;
                case "Remove":
                    String removePiece = command[1];
                    if (!pieces.containsKey(removePiece)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", removePiece);
                    } else {
                        pieces.remove(removePiece);
                        System.out.printf("Successfully removed %s!%n", removePiece);
                    }
                    break;
                case "ChangeKey":
                    String changePiece = command[1];
                    String changeKey = command[2];
                    if (!pieces.containsKey(changePiece)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", changePiece);
                    } else {
                        Pieces change = pieces.get(changePiece);
                        change.setKey(changeKey);
                        System.out.printf("Changed the key of %s to %s!%n", changePiece, changeKey);
                    }
                    break;


            }
            input = scanner.nextLine();

        }
        pieces.entrySet()
                .stream()
                .sorted((a,b)->{
                    if(!a.getKey().equals(b.getKey())){
                        return a.getKey().compareTo(b.getKey());
                    }else {
                        return a.getValue().getCompositor().compareTo(b.getValue().getCompositor());
                    }
                })
                .map(p -> p.getKey() + " -> Composer: " +p.getValue().getCompositor() + ", Key: " + p.getValue().getKey() )
                .forEach(System.out::println);
    }
}
