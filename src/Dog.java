import java.util.Scanner;

public class Dog extends Tamagotchi{
    public String puppy;
    public int furLength;

    public Dog(String name, int age, String color, String puppy, int furLength) {
        super(name, age, color);
        this.puppy = puppy;
        this.furLength = furLength;
    }

    //Methods
    public String shopping(int toyChoice){
        Scanner scanner = new Scanner(System.in);

        System.out.println(this.name + " is out to get new toys. Theres alot of options! What would you like to buy?\nPress the number of your choice:");
        System.out.println("1. stuffed animal 🧸\n2. bone 🦴\n3. ball ⚽");

        int getToyPick = scanner.nextInt();

        if (toyChoice == 1){
            System.out.println("A stuffed animal 🧸! " + this.name + " loves stuffed animals! Good choice.");
        }else if (toyChoice == 2){
            System.out.println("yummy, a bone 🦴! " + this.name + " loves sticking his teeth in bones! Good choice.");
        }else if (toyChoice == 3){
            System.out.println("A ball ⚽️! Nice! " + this.name + " loves running after the ball! Good choice.");
        }else{
            System.out.println("Oh no, you forgot your money at home! Better luck next time..");
        }
        return "";

    }


    public void printDogFigure(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("            /~~~~~~~~\\                           _");
        System.out.println("    ##\\__/ @)      ~~~~~~~~\\                     \\ \\ ) )");
        System.out.println("    |              /~~\\~~~~~                ((    |  \\");
        System.out.println("     \\    /           |                          /   |");
        System.out.println("      (~~~   /         \\____________/~~~~~~~~~~~~   /");
        System.out.println("       ~~~~|~                                     /");
        System.out.println("           :                                      |");
        System.out.println("            \\                                     |");
        System.out.println("            |                               /      \\");
        System.out.println("             \\  \\_         :         \\     /~~~\\    |");
        System.out.println("             /   :~~~~~|   :~~~~~~~~~~|   :     :   :");
        System.out.println("            /    :    /    :         /    :    /    :");
        System.out.println("        (~~~     )(~~~     )     (~~~     )(~~~     )");
        System.out.println("         ~~~~~~~~  ~~~~~~~~       ~~~~~~~~  ~~~~~~~~");
        System.out.println(" ");

    }

    @Override
    public void tamagotchiSound(){
        System.out.println("Woof 🐶");
    }


    //toString
    @Override
    public String toString() {
        return "Dog{" +
                "puppy='" + puppy + '\'' +
                ", furLength=" + furLength +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
