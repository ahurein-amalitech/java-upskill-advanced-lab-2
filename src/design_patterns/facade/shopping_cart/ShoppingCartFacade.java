package design_patterns.facade.shopping_cart;

import java.util.List;

class ShoppingCartFacade {
    private final CartManager cartManager = new CartManager();
    private final DiscountCalculator discountCalculator = new DiscountCalculator();
    private final CheckoutProcessor checkoutProcessor = new CheckoutProcessor();

    public void addItemToCart(Item item) {
        cartManager.addItem(item);
    }

    public void checkout() {
        List<Item> items = cartManager.getItems();
        double discount = discountCalculator.calculateDiscount(items);
        checkoutProcessor.processCheckout(items, discount);
    }
}