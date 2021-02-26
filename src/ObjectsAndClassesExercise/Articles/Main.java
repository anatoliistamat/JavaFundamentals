package ObjectsAndClassesExercise.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];

        Articles article = new Articles(title, content, author);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scan.nextLine();
            String typeCommand = command.split(": ")[0];
            String newData = command.split(": ")[1];

            switch (typeCommand) {
                case "Edit":
                    article.edit(newData);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(newData);
                    break;
                case "Rename":
                    article.rename(newData);
                    break;
            }
        }
        System.out.println(article);
    }
}