import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Player choose their Tamagotchi pet
        System.out.println("\nWelcome to your new Tamagotchi!\n");
        System.out.println("Do you want a dog 🐶 or a cat 🐱 to play with?\nPress 1 for a dog and press 2 for a cat:");

        int playersPetChoice = scanner.nextInt();


        //GameMode
        if (playersPetChoice == 1){

            //Player creates a dog
            System.out.println("You chose a dog as your pet 🐶 What would you like to name your dog:");
            String dogName = scanner.next();

            System.out.println("Cute name! How old is " + dogName + "?");
            int dogAge = scanner.nextInt();

            System.out.println("Awesome! What color is " + dogName + "?");
            String dogColor = scanner.next();

            System.out.println("And is " + dogName + " a puppy?");
            String dogOrPuppy = scanner.next();

            System.out.println("Last question! Tell me with a number.. How long " + dogName + "'s fur is:");
            int dogFurLength = scanner.nextInt();

            //Players dog
            System.out.println("Well done - now you have created your dog and " + dogName + " is ready to play with you!👏🏼\n" );
            Dog dog = new Dog(dogName,dogAge,dogColor,dogOrPuppy,dogFurLength);
            dog.tamagotchiSound();
            dog.printDogFigure();

            //Game Rounds
            for (int i = 0; i < 5; i++) {

                dog.printPlayChoices();
                int playersChoice = scanner.nextInt();

                if (playersChoice == 1){
                    dog.feed();
                } else if (playersChoice == 2){
                    dog.sleep();
                } else if (playersChoice == 3){
                    dog.play();
                } else if (playersChoice == 4){
                    dog.walk();
                } else if (playersChoice == 5){
                    dog.shopping(3);
                } else if (playersChoice == 6){
                    System.out.println("You quit the game");
                    break;
                } else {
                    System.out.println("that is not a choice");
                }
            }
            //Finished the Game
            dog.printFinishPlaying();


        }else if (playersPetChoice == 2){

            //Player creates Cat
            System.out.println("You chose a cat as your pet 🐱 What would you like to name your cat:");
            String catName = scanner.next();

            System.out.println("Cute name! How old is " + catName + "?");
            int catAge = scanner.nextInt();

            System.out.println("Awesome! What color is " + catName + "?");
            String catColor = scanner.next();

            System.out.println("And is " + catName + " a kitten?");
            String catOrKitten = scanner.next();

            System.out.println("Last question! Tell me if " + catName + " is numbered or not - just in case if " + catName + " run away:");
            String catNumberedInEar = scanner.next();


            //Players Cat
            System.out.println("Well done - now you have created your cat and " + catName + " is ready to play with you!👏🏼\n" );
            Cat cat = new Cat(catName,catAge,catColor,catOrKitten,catNumberedInEar);
            cat.tamagotchiSound();
            cat.printCatFigure();


            //Game Rounds
            for (int i = 0; i < 5; i++) {

                cat.printPlayChoices();
                int playersChoice = 6;

                if (playersChoice == 1){
                    cat.feed();
                } else if (playersChoice == 2){
                    cat.sleep();
                } else if (playersChoice == 3){
                    cat.play();
                } else if (playersChoice == 4){
                    cat.walk();
                } else if (playersChoice == 5){
                    cat.shopping(3);
                } else if (playersChoice == 6){
                    System.out.println("You quit the game.. ");
                    break;
                } else {
                    System.out.println("that is not a choice");
                }

            }
            //Finished the Game
            cat.printFinishPlaying();


        } else {
            System.out.println("Please choose 1 or 2");
        }

    }
}
