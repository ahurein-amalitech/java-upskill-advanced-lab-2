package design_patterns.builder.user_builder;

public class UserBuilder {
    private String firstName;
    private String lastName;

    public UserBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public User build() {
        return new User(firstName, lastName);
    }
}
