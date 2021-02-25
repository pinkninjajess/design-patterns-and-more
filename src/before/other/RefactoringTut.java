package before.other;

import java.util.Arrays;

public class RefactoringTut {
    public static void main(String[] args) {
        String message = "\"screen_name\":\"SallyFields\"";
        String message_text = "\"text\":\"is an actress of the ages\"";
        String[] wordsInMessage = getTextFromMessage(message_text).split("\\s");
        String username = getUsernameFromMessage(message);
        System.out.println(Arrays.toString(wordsInMessage));
        System.out.println(message);
    }

    static String getUsernameFromMessage(String message) {
        return message.substring(message.indexOf("\"screen_name\":\"") + 15,
                message.indexOf("\"", message.indexOf("\"screen_name\":\"") + 15));
    }

    static String getTextFromMessage(String message) {
        return message.substring(message.indexOf("\"text\":\"") + 8,
                message.indexOf("\"", message.indexOf("\"text\":\"") + 8));

    }
}
