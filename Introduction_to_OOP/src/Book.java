public class Book {

    //state
  private int noOfCopies;
  public void SetNoOfCopies(int noOfCopies){
     this.noOfCopies = noOfCopies;
 }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    //behaviour
    void read(){
        System.out.println("Read a book");
    }
    void write(){
        System.out.println("Write on a book");
    }

    void close(){
        System.out.println("Close a book");
    }
}
