package design_patterns.decorator.message_decorator;

class EncryptedMessageDecorator extends MessageDecorator {
    public EncryptedMessageDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return encrypt(message.getContent());
    }

    private String encrypt(String content) {
        // Simple mock encryption by reversing the string
        return new StringBuilder(content).reverse().toString();
    }
}
