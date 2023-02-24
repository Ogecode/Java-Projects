public class MotorBikeRunner {
    public static void main(String[] args) {
// creating instances of the motorbike
        // Motor Bike = class, ducati and honda are the instances od the class and start is the method(behaviour)

        MotorBike ducati = new MotorBike(200);
        MotorBike honda = new MotorBike(30);


        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        System.out.println(ducati.getSpeed());
        honda.setSpeed(80);
        System.out.println(honda.getSpeed());

        ducati.setSpeed(42);
        System.out.println(ducati.getSpeed());
        honda.setSpeed(0);
        System.out.println(honda.getSpeed());

        MyClass mine = new MyClass();
        String nonStaticName = mine.name;
        String noneStaticMethod = mine.getName();

        String staticName = MyClass.name2;
        String staticMethod = MyClass.getName2();



    }
}
