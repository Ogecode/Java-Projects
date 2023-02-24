import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal();


        Animal dog = new Animal("Jerry");


        Animal bird = new Animal("Kelly",9, "black");

        System.out.println("cat name " +cat.getName());

        cat.setName("New");
        cat.setAge(9);
        cat.setRace("white");

        System.out.println("cat name " +cat.getName());

        System.out.println("dog name " +dog.getName());

        System.out.println("bird name " +bird.getName());


    }

}