import java.util.Scanner;

public class Cat extends Tamagotchi{
    public String kitten;
    public String numbered;

    public Cat(String name, int age, String color, String kitten, String numbered) {
        super(name, age, color);
        this.kitten = kitten;
        this.numbered = numbered;
    }

    public void printCatFigure(){

        System.out.println("");
        System.out.println("    /\\_____/\\");
        System.out.println("   (  o   o   )");
        System.out.println("   (    ^     )");
        System.out.println("   (    \\/     ) ");
        System.out.println("   (             ) ");
        System.out.println("   (               ))))))))))) ");
        System.out.println("");
        System.out.println("");

    }


    public String shopping(int toyChoice){
        Scanner scanner = new Scanner(System.in);

        System.out.println(this.name + " is out to get new toys. Theres alot of options! What would you like to buy?\nPress the number of your choice:");
        System.out.println("1. garn wrench🧶\n2. fish\n3. drill stick");

        int getToyPick = scanner.nextInt();

        if (getToyPick == 1){
            System.out.println("A garn wrench! " + this.name + " loves garn wrenches! Good choice.");
        }else if (getToyPick == 2){
            System.out.println("yummy, fish! " + this.name + " loves sticking his teeth in fishes! Good choice.");
        }else if (getToyPick == 3){
            System.out.println("A drill stick! Nice! " + this.name + " loves running after the feather at the end of the drill stick! Good choice.");
        }else{
            System.out.println("Oh no, you forgot your money at home! Better luck next time..");
        }
        return "";

    }

    @Override
    public void tamagotchiSound(){
        System.out.println("           \nMiaaw 🐱");
    }


}
