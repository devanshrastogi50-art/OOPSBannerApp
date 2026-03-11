import java.util.HashMap;
import java.util.Map;

public class uc71 
{

    public static void main(String[] args) {

        String banner = "OOPS";

        displayBanner(banner);
    }

    static class CharacterPattern {
        private char character;
        private String[] pattern;

      
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

       
        public String[] getPattern() {
            return pattern;
        }
    }

  
    static class CharacterPatternMap {

        private static Map<Character, CharacterPattern> patternMap = new HashMap<>();

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

        public static CharacterPattern getPattern(char c) {
            return patternMap.get(c);
        }
    }

  
    public static void displayBanner(String text) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : text.toCharArray()) {

                CharacterPattern cp = CharacterPatternMap.getPattern(c);

                if (cp != null) {
                    line.append(cp.getPattern()[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    
}