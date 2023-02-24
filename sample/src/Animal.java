
public class Animal { //class is a design use to create object of similar fields and methods
    private String name;
    private int age;
    private String race;

    private String secretCode;

    public Animal() {

    }

    public Animal(String aa) {
        this.name = aa;
        this.secretCode = "secret-" + aa;
    }


    public Animal(String name, int age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.secretCode = "secret-" + name;

    }



    public void sleep() {
        System.out.println("i amsleeping");
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race.toUpperCase();
    }

    public void setName(String name) {

        if (name == null) {
            return;
        }

        if (name.length() < 3) {
            return;
        }
        this.name = name;
        this.secretCode = "secret-" + name;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
