public class Amigo {
    public static void main(String[] args) {

        // after creating the class you now create the objects
        Lens lensOne = new Lens( "sony","78mm", true);
        Lens lensTwo = new Lens ("techno", "56mm", false);

        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);

        System.out.println();

        System.out.println("Lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);

        lensOne.setBrand("");
        lensTwo.setBrand("");

    }

    // create your new class here
    static class Lens {
        String brand;
        String focalLength;

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        Boolean isPrime;

        // create a constructor
        Lens(String brand, String focalLength, Boolean isPrime){
            this.brand = brand;
            this.focalLength = focalLength;
            this. isPrime = isPrime;
        }

    }
}
