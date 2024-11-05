package design_patterns.decorator.message_decorator;

class TextMessage implements Message {
    private final String content;

    public TextMessage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}