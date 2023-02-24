public class LaptopRunner {
    public static void main(String[] args) {
        Laptop macBook = new Laptop( 89076,56789, 7890, 670,6800);
        Laptop hp = new Laptop(89076,56789, 7890, 670,6800);
        Laptop levono = new Laptop("Mark");
        Laptop dell = new Laptop(89076,56789, 7890, 670,6800);
        Laptop asus = new Laptop(89076,56789, 7890, 670,6800);


        macBook.view();
        macBook.delete();
        macBook.install();

        /*hp.view();
        hp.delete();
        hp.install();

        levono.view();
        levono.delete();
        levono.install();

        dell.view();
        dell.delete();
        dell.install();

        asus.view();
        asus.delete();
        asus.install();

         */
    }
}
