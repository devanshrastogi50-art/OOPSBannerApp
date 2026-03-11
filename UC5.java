public class UC5 {

    public static void main(String[] args) {

        String[] banner = {
                String.join("", "+", "-".repeat(26), "+"),
                String.join("", "|", " ".repeat(26), "|"),
                String.join("", "|", centerText("WELCOME TO JAVA", 26), "|"),
                String.join("", "|", centerText("OOPS BANNER APP", 26), "|"),
                String.join("", "|", " ".repeat(26), "|"),
                String.join("", "|", centerText("UC5", 26), "|"),
                String.join("", "+", "-".repeat(26), "+")
        };

        
        for (String line : banner) {
            System.out.println(line);
        }
    }

    
    public static String centerText(String text, int width) {
        int padding = width - text.length();
        int left = padding / 2;
        int right = padding - left;
        return " ".repeat(left) + text + " ".repeat(right);
    }
}
