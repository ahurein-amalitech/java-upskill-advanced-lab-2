package design_patterns.decorator.message_decorator;

class CompressedMessageDecorator extends MessageDecorator {
    public CompressedMessageDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return compress(message.getContent());
    }

    private String compress(String content) {
        return content.replaceAll("\\s", "");
    }
}