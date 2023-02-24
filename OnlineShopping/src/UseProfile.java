public class UseProfile {
    int bvn;
    String name;
    String homeAddress;
    String emailAddress;
    String password;
    String sex;

    UseProfile(String name, String homeAddress, String emailAddress, String password, String sex, int bvn) {
        this.name = name;
        this.homeAddress = homeAddress;
        this.emailAddress = emailAddress;
        this.password = password;
        this.sex = sex;
        this.bvn = bvn;
    }

    UseProfile(String name, String homeAddress){
        this.name =name;
        this.homeAddress = homeAddress;
    }
    UseProfile(int bvn) {
        this.bvn = bvn;
    }


    public void setBvn(int bvn) {  // local variable
        this.bvn = bvn;
    }

    public void setName(String name) {  // local variable
        this.name = name;
    }

    public void setHomeAddress(String homeAddress) {  // local variable
        this.homeAddress = homeAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    int getBvn() {
        return bvn;
    }

    String getName() {
        return name;
    }

    String getHomeAddress() {
        return homeAddress;
    }

    String getEmailAddress() {
        return emailAddress;
    }

    String getPassword() {
        return password;
    }

    String getSex() {
        return sex;
    }

    void sigIn() {
        System.out.println("Logout");
    }

    void signOut() {
        System.out.println("Login");
    }

    void modify() {
        System.out.println("Modify you profile");
    }

    void delete() {
        System.out.println("Delete profile");
    }
}