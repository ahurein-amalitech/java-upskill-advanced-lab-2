package design_patterns.facade.shopping_cart;

import java.util.List;

class CheckoutProcessor {
    public void processCheckout(List<Item> items, double discount) {
        double total = items.stream().mapToDouble(Item::getPrice).sum();
        double finalAmount = total - discount;
        System.out.println("Final amount after discount: $" + finalAmount);
        System.out.println("Checkout processed successfully.");
    }
}