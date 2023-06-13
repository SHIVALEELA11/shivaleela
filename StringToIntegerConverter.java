public class StringToIntegerConverter {
    public static int convertToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: " + input);
        }
    }
    

    public static void main(String[] args) {
        String[] inputs = {"23", "45.67", "test", "123f"};

        for (String input : inputs) {
            try {
                int result = convertToInt(input);
                System.out.println("Input: " + input + " => Output: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("Input: " + input + " => Exception: " + e.getMessage());
            }
        }
    }
}
