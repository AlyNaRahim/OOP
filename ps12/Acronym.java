package ps12;

public class Acronym {
    private final String acronym;

    Acronym(String input) {
        String[] splitInput = input.split("[ -]_?");
        StringBuilder acronym = new StringBuilder();

        for (String word : splitInput) {
            if (word.isEmpty()) {
                continue;
            }
            acronym.append(word.charAt(0));
        }
        this.acronym = acronym.toString().toUpperCase();
    }

    String get() {
        return acronym;
    }
}

