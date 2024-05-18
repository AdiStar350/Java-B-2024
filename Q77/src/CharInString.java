public class CharInString {
    public static void main(String[] args) {
        // TODO Declare the variables.
        String str1 = "My name is Adi Strasser"; // [x] -> A string.
        String str2 = "I have three cats and two dogs"; // [x] -> A string.
        char rndChar = str1.charAt((int)(Math.random() * (str1.length() - 1))); // [x] -> A random character from the first string.
        int rndCharIndex = str2.indexOf(rndChar); // [x] -> The random character's index in the second string.

        // TODO Print the strings.
        System.out.println(str1 + "\n" + str2);

        // TODO Print the chosen character from the first string.
        System.out.println("The chosen character from the first string is " + rndChar);

        // TODO Print the index.
        System.out.println(rndChar + (rndCharIndex == -1 ? " does not appear in the second string." : " appears in the second string at index " + rndCharIndex));
    }
}
