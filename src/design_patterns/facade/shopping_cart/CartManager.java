package design_patterns.facade.shopping_cart;

import java.util.ArrayList;
import java.util.List;

class CartManager {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " added to the cart.");
    }

    public List<Item> getItems() {
        return items;
    }
}