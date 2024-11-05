package design_patterns.builder.user_builder;

public class Main {
    public static void main(String[] args) {
        User user = new UserBuilder().firstName("ebenezer").lastName("ahurein").build();
        System.out.println(user.getFirstName());
    }
}
