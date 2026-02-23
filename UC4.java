
public class UC4 {

    static String gap = "   ";

    
    static String buildLine(String... parts) {
        return String.join(gap, parts);
    }

    public static void main(String[] args) {

        
        String[] banner = {
                buildLine("OOOOO", "OOOOO", "PPPPP", "SSSSS"),
                buildLine("O   O", "O   O", "P   P", "S"),
                buildLine("O   O", "O   O", "PPPPP", "SSSSS"),
                buildLine("O   O", "O   O", "P", "        S"),
                buildLine("OOOOO", "OOOOO", "P","    SSSSS")
        };

        
        for(String line : banner) {
            System.out.println(line);
        }
    }
}
