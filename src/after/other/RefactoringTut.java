package after.other;

public class RefactoringTut {

    public static void main(String[] args) {
        String message = "\"screen_name\":\"SallyFields\"";
        String username = getValueFromField(message, "\"screen_name\":\"");
        System.out.println(username);

        String message_text = "\"text\":\"is an actress of the ages\"";
        final String fieldName = "\"text\":\"";
        String screen_name = getValueFromField(message_text, fieldName);
        System.out.println(screen_name);
    }

    static String getValueFromField(String message, String fieldName) {
        final int indexOfFieldValue = message.indexOf(fieldName) + fieldName.length();
        final int indexOfEndOfFieldValue = message.indexOf("\"", indexOfFieldValue);

        return message.substring(indexOfFieldValue, indexOfEndOfFieldValue);
    }
}
