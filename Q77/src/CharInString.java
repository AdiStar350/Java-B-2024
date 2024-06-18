public class CharInString {
    public static void main(String[] args) {
        // Declare the variables.
        String str1 = "My name is Adi Strasser"; // -> A string.
        String str2 = "I have three cats and two dogs"; // -> A string.
        char rndChar = str1.charAt((int)(Math.random() * (str1.length() - 1))); // -> A random character from the first string.
        int rndCharIndex = str2.indexOf(rndChar); // -> The random character's index in the second string.

        // Print the strings.
        System.out.println(str1 + "\n" + str2);

        // Print the chosen character from the first string.
        System.out.println("The chosen character from the first string is " + rndChar);

        // Print the index.
        System.out.println(rndChar + (rndCharIndex == -1 ? " does not appear in the second string." : " appears in the second string at index " + rndCharIndex));
    }
}
