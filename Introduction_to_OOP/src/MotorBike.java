public class MotorBike {

    // a motorbike class was created using the start METHOD
    // Encapsulation>>>> only the main should have access to data on a
    // specific class all other class should access through the method/behaviour
    // you make the variable private when made private it cannot be access outside  the class
    // to make the speed visible by other clases you create a new method
    // to create this new METHOD you need 1. Input(int speed) 2. output (void)  3. name (setSpeed)

   private int speed;  // member variable
    // any speed called from the block without adding 'this.'  e. System.out. print speed is stored in the local variable speed, to store the argument i
    // n the intitialized speedon privated introduce this.    System.out.print this.speed



   public void setSpeed(int speed) {  // local variable
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }


MotorBike( int speed){  //constructor
       this.speed = speed;
}
    void start (){
 System.out.println("Bike Started");
    }
    //create a new method


}
