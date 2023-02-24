import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count;
        int i;
        float totalMarks = 0;
        float percentage;
        float average;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();

        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
        System.out.println("Total MArks : " + totalMarks);

        average = totalMarks / count;
        System.out.println("Average Mark: " + average);

        percentage = (totalMarks / (count * 100)) * 100;
        System.out.println("percentage : " + percentage);

        switch ((int) percentage / 10) {
            case 9:
                System.out.println("Grade : A+");
                break;
            case 8:
                System.out.println("Grade : A");
                break;
            case 7:
                System.out.println("Grade : B");
                break;
            case 6:
                System.out.println("Grade : C");
                break;
            default:
                System.out.println("Grade : D");
                break;
        }
    }

}