public class ShoppingCart {

    int productList;
    int productPrice;
    String productName;

    public void setProductList(int productList) {
        this.productList= productList;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    int getProductList() {
        return productList;
    }


    ShoppingCart(int productList) {
        this.productList = productList;
    }

    void reduceQuantity(){
        System.out.println("Do you want to reduce quantity");
    }
   public void increaseQuantity(){
        System.out.println("Do you want to increase quantity");
    }

   public void deleteQuantity(){
        System.out.println("Do you want to delete quantity");
    }
    void checkOut(){
        System.out.println("Checkout");
    }
    void logOut(){
        System.out.println("Logout");
    }
    void logIn() {
        System.out.println("Login");

    }
    void order(){
            System.out.println("Confirm Order");
        }
    void selectProduct(){
        System.out.println("Select a product");
    }
    }






