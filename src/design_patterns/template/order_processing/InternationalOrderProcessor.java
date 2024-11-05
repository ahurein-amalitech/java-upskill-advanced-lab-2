package design_patterns.template.order_processing;

class InternationalOrderProcessor extends OrderProcessor {
    @Override
    protected void arrangeDomesticShipping() {
    }

    @Override
    protected void arrangeInternationalShipping() {
        System.out.println("Arranging international shipping with customs clearance.");
    }

    @Override
    protected boolean isInternationalOrder() {
        return true;
    }
}