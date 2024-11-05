package design_patterns.facade.shopping_cart;

import java.util.List;

class DiscountCalculator {
    public double calculateDiscount(List<Item> items) {
        double total = items.stream().mapToDouble(Item::getPrice).sum();
        return total > 100 ? total * 0.10 : 0;
    }
}
