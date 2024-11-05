package design_patterns.template.order_processing;

class Main {
    public static void main(String[] args) {
        OrderProcessor domesticOrder = new DomesticOrderProcessor();
        domesticOrder.processOrder();
        System.out.println("---");
        OrderProcessor internationalOrder = new InternationalOrderProcessor();
        internationalOrder.processOrder();
    }
}
