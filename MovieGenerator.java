import java.util.Scanner;
import java.util.Arrays;

public class MovieGenerator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String welcome = "Welcome to the Movie Generator!";
        System.out.println(welcome);

        String[] oldMovies = {"Emperors New Groove", "Cars", "Toy Story 1", "Toy Story 2", "Toy Story 3", "Despicable Me",
                            "Tangled", "Hercules", "Top Gun", "Ice Age 1", "Ice Age 2", "Ice Age 3", "Shrek",
                            "Secret Life of Pets", "Mulan", "Princess Diaries", "Hereditary", "Insidious"};

        String[] newMovies = {};

        String result = "";

        boolean comedy = true;
        boolean romantic = true;
        boolean scary = true;
        boolean action = true;
        boolean disney = true;

        // PART 1 -- Ask User what mood they are in and if they want to rewatch something or try a new movie
                    // Get User answer and tie it in with either the oldMovie array or newMovie array
        System.out.println("Pick a genre: \n1 - Comedy\n2 - Romantic\n3 - Scary\n4 - Action\n5 - Disney");
        int genreChoice = keyboard.nextInt();

        String newOrOld;
        if (genreChoice == 1) {
            System.out.println("You selected Comedy: \nDo you want to watch something new? ");
            newOrOld = keyboard.nextLine();
            if (newOrOld.equalsIgnoreCase("yes")) {
                //TODO connect the newMovie array
            }
        } else {
            //TODO connect oldMovie array
        }

        if (genreChoice == 2) {
            System.out.println("You selected Romantic: \nDo you want to watch something new? ");
            newOrOld = keyboard.nextLine();
            if (newOrOld.equalsIgnoreCase("yes")) {
                //TODO connect the newMovie array
            }
        } else {
            //TODO connect oldMovie array
        }

        if (genreChoice == 3) {
            System.out.println("You selected Scary: \nDo you want to watch something new? ");
            newOrOld = keyboard.nextLine();
            if (newOrOld.equalsIgnoreCase("yes")) {
                //TODO connect the newMovie array
            }
        } else {
            //TODO connect oldMovie array
        }

        if (genreChoice == 4) {
            System.out.println("You selected Action: \nDo you want to watch something new? ");
            newOrOld = keyboard.nextLine();
            if (newOrOld.equalsIgnoreCase("yes")) {
                //TODO connect the newMovie array
            }
        } else {
            //TODO connect oldMovie array
        }

        if (genreChoice == 5) {
            System.out.println("You selected Disney: \nDo you want to watch something new? ");
            newOrOld = keyboard.nextLine();
            if (newOrOld.equalsIgnoreCase("yes")) {
                //TODO connect the newMovie array
            }
        } else {
            //TODO connect oldMovie array
        }

        // PART 2 -- Create questions to get information on what user is in mood for



//      // PART 3 -- Create case statements for the category of oldMovies
//                    // This is where I want to add all information from User input and add it together to pick a movie
//        switch (choice) {
//            case 1: //TODO create a case for a comedy movie
//                //
//                break;
//            case 2: //TODO create a case for romantic movie
//                //
//                break;
//            case 3: //TODO create a case for scary movie
//                //
//                break;
//            case 4: //TODO create a case for action movie
//                //
//                break;
//            case 5: //TODO create case for disney movie
//                //
//                break;
//            default:
//                System.out.println("Genre not yet entered :(\nComing Soon!");
//
//        }

    }
}
