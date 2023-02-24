public class Laptop {
    int deviceId;
    String deviceName;
    int modelOfLaptop;
    int yearOfProduction;
    int noOfKeys;
    int ram;

    Laptop(String deviceName,int deviceId, int modelOfLaptop, int yearOfProduction, int noOfKeys, int ram) {
        this.deviceName = deviceName;
        this.deviceId = deviceId;
        this.modelOfLaptop = modelOfLaptop;
        this.yearOfProduction = yearOfProduction;
        this.noOfKeys = noOfKeys;
        this.ram = ram;
    }

    Laptop(String deviceName){
        this.deviceName = deviceName;
    }
    Laptop(int deviceId, int modelOfLaptop, int yearOfProduction, int noOfKeys, int ram) {
        this.deviceId = deviceId;
        this.modelOfLaptop = modelOfLaptop;
        this.yearOfProduction = yearOfProduction;
        this.noOfKeys = noOfKeys;
        this.ram = ram;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setModelOfLaptop(int modelOfLaptop) {  // local variable
        this.modelOfLaptop = modelOfLaptop;
    }

    public void setNoOfKeys(int noOfKeys) {  // local variable
        this.noOfKeys = noOfKeys;
    }

    public void setRam(int ram) {  // local variable
        this.ram = ram;
    }


    int getDeviceId() {
        return deviceId;
    }
    String getDeviceName() {
        return deviceName;
    }
    int getYearOfProduction() {
        return yearOfProduction;
    }
    int getModelOfLaptop() {
        return modelOfLaptop;
    }
    int getRam() {
        return ram;
    }
    int getNoOfKeys() {
        return noOfKeys;
    }



    void install (){
        System.out.println("Install device");
    }
    void delete (){
        System.out.println("Delete ");
    }
    void view (){
        System.out.println("view product");
    }
}


