import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;
        Scanner bhavya = new Scanner(System.in);
        System.out.println("enter your age:");
        //this is a comment
        /*this is another
        coment to end here */

        age = bhavya.nextInt();
        switch (age) {
            case 6:
                System.out.println("you can crawl");
                break;
            case 9:
                System.out.println("you can talk");
                break;
            case 10:
                System.out.println("you can get in trouble");
                break;
            default:
                System.out.println("i dnt know how old you are");
                break;
    }
}
}
