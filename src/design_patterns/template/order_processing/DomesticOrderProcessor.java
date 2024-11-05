package design_patterns.template.order_processing;


class DomesticOrderProcessor extends OrderProcessor {
    @Override
    protected void arrangeDomesticShipping() {
        System.out.println("Arranging domestic shipping.");
    }

    @Override
    protected void arrangeInternationalShipping() {
    }
}

