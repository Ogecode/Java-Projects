public class BookRunner {
    public static void main(String[] args) {

        Book cleanCode = new Book();
       Book  artOfComputerProgramming = new Book();
       Book effectiveJava = new Book();

        cleanCode.read();
        artOfComputerProgramming.write();
        effectiveJava.close();


        cleanCode.SetNoOfCopies(200);
        System.out.println(cleanCode.getNoOfCopies());
        artOfComputerProgramming.SetNoOfCopies(13);
        System.out.println(artOfComputerProgramming.getNoOfCopies());
        effectiveJava.SetNoOfCopies(230);
        System.out.println(effectiveJava.getNoOfCopies());
    }
}
