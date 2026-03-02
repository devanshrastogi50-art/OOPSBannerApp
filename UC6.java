
    public class UC6 {

    // Height of each character pattern
    private static final int HEIGHT = 7;

    public static void main(String[] args) {
        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Banner order: OOPS
        String[][] banner = {O, O, P, S};

        renderBanner(banner);
    }

    // ---------------- Helper Methods ----------------

    static String[] buildO() {
        return new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        };
    }

    static String[] buildP() {
        return new String[]{
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    static String[] buildS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }

    // Render banner using loops
    static void renderBanner(String[][] banner) {
        for (int row = 0; row < HEIGHT; row++) {
            for (String[] letter : banner) {
                System.out.print(letter[row] + "  ");
            }
            System.out.println();
        }
    }
}


