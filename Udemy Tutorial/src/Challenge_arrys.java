public class Challenge_arrys {
    public static void main(String[] args) {
        int count=0;
        double sum = 0;
        double [] doubleArr = new double[6];
        doubleArr [0] =20;
                doubleArr [1] =230;
                doubleArr [2] =24;
                doubleArr [3] =56;
                doubleArr [4] =67;
                doubleArr [5] =27;

        for (double i =0; i < doubleArr.length; i++){
          sum += doubleArr[(int)i];}
        double mean = sum / doubleArr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);


    }
}
