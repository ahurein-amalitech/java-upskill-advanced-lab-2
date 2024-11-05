package design_patterns.decorator.message_decorator;

public class Main {
    public static void main(String[] args) {
        Message message = new TextMessage("How are you doing");

        System.out.println("Original Message: " + message.getContent());

        Message encryptedMessage = new EncryptedMessageDecorator(message);
        System.out.println("Encrypted Message: " + encryptedMessage.getContent());

        Message compressedMessage = new CompressedMessageDecorator(message);
        System.out.println("Compressed Message: " + compressedMessage.getContent());

        Message encryptedAndCompressedMessage = new CompressedMessageDecorator(encryptedMessage);
        System.out.println("Encrypted and Compressed Message: " + encryptedAndCompressedMessage.getContent());
    }
}
