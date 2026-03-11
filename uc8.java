import java.util.HashMap;
import java.util.Map;

public class uc8 {

    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    static Map<Character, CharacterPattern> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));
    }

    public static void displayBanner(String word) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (char c : word.toCharArray()) {

                CharacterPattern cp = patternMap.get(c);

                if (cp != null) {
                    System.out.print(cp.getPattern()[i] + "  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayBanner("OOPS");
    }
}
