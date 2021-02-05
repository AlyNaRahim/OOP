package ps12;

public class IsbnVerifier {
    String isbnNumber;

    public IsbnVerifier() {
    }

    public boolean isValid(String isbnNumber) {
        String isbnEdited = isbnNumber.replace("-", "");
        if (isbnEdited.length() != 10) {
            return false;
        }

        char[] chars = isbnEdited.toCharArray();
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            if (Character.isDigit(chars[i])) {
                sum += Integer.parseInt(String.valueOf(chars[i])) * (10 - i);
            } else if (chars[i] == 'X') {
                sum += 10 * (10 - i);
            } else {
                return false;
            }
        }

        return sum % 11 == 0;
    }
}
