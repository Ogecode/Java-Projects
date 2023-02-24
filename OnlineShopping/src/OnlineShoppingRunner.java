public class OnlineShoppingRunner {
    public static void main(String[] args) {
        ShoppingCart myShoppingCart = new ShoppingCart(10);
        ShoppingCart myProduct = new ShoppingCart(10);
        ShoppingCart customer = new ShoppingCart(20);

       myShoppingCart .reduceQuantity();
        myShoppingCart.increaseQuantity();
        myShoppingCart.deleteQuantity();
        myShoppingCart.checkOut();

        myProduct.selectProduct();
        myProduct.order();

        customer.logIn();
        customer.logOut();


    }
}
