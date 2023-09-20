import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        RecipeInterface recipeInterface = new RecipeInterface(reader);
        recipeInterface.launch();
    }
}