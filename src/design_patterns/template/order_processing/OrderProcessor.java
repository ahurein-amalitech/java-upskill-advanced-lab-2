package design_patterns.template.order_processing;

abstract class OrderProcessor {

    public final void processOrder() {
        selectItems();
        makePayment();
        if (isInternationalOrder()) {
            arrangeInternationalShipping();
        } else {
            arrangeDomesticShipping();
        }
        deliver();
    }

    protected void selectItems() {
        System.out.println("Selecting items for the order.");
    }

    protected void makePayment() {
        System.out.println("Processing payment.");
    }

    protected void deliver() {
        System.out.println("Delivering the order.");
    }

    protected abstract void arrangeDomesticShipping();
    protected abstract void arrangeInternationalShipping();

    protected boolean isInternationalOrder() {
        return false;
    }
}