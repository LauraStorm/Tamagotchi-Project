import java.util.Random;

public class Tamagotchi {
    public String name;
    public int age;
    public String color;

    public Tamagotchi(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //Methods
    public void printPlayChoices(){
        System.out.println("\nWhat would you like to do with " + this.name + "?\nPlease press the number of your choice:");
        System.out.println("1. Feed\n2. Sleep\n3. Play\n4. Go for a Walk\n5. Go shopping\n6. Quit the game");
    }

    public void feed(){
        System.out.println("yaay! " + this.name + " loves food!\nNow " + this.name + " is full and happy!\n");
    }

    public void sleep(){
        System.out.println(this.name + " is sleeping nice and safe💤");

    }

    public void play(){
        System.out.println(this.name + " is running around and having fun with a ball\n");
    }

    public void walk(){
        Random random = new Random();

        int minimum = 1;
        int maximum = 3;
        int randomNumber = random.nextInt(maximum);

        if (randomNumber == 1){
             System.out.println(this.name + " is now out for a walk! Theres a lot of funny and different smells. Is that a poop?💩\n");
        }else if (randomNumber == 2){
            System.out.println(this.name + " is now out for a walk in the park. OHH look a friend!. Aw they are now playing and having fun!\n");
        } else {
            System.out.println(this.name + " is now out for a walk! " + this.name + " is in a funny mood. Keep an extra eye out!\n");
        }

    }


    public void tamagotchiSound(){
        System.out.println("...");
    }

    public void printFinishPlaying(){
        System.out.println("\nWAUW! It has been an amazing and eventful day! " + this.name + " loved it!");
        System.out.println("Thanks for today! " + this.name + " is tired and done for today! Thanks for playing, sleep tight!!👋👋");
    }


    //toString()
    @Override
    public String toString() {
        return "Tamagotchi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
