package design_patterns.facade.shopping_cart;

class Main {
    public static void main(String[] args) {
        ShoppingCartFacade cartFacade = new ShoppingCartFacade();

        cartFacade.addItemToCart(new Item("Car", 1200));
        cartFacade.addItemToCart(new Item("Shoe", 25));

        cartFacade.checkout();
    }
}
