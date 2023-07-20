// package edu.kit.informatik;

/** This class contains 5 different methods to manipulate Strings.
 *
 * @author upiol
 * @version 1.0
 */

public final class StringUtility {

    /**
     *Private constructor
     */

    private StringUtility() {
    }

    /**  Removes all repeated characters of a string.
     *
     * @param word string to be removed of repeated characters.
     * @return new version of given string without repeated characters
     */
    public static String removeDuplicates(String word) {

        String output = "";

        for (int i = 0; i < word.length(); i++) {

            char current = word.charAt(i);

            if (output.indexOf(current) == -1) { // checks if current char has already been encountered.

                output += current;
            }
        }

        return output;
    }

    /** Makes all first characters of words in a string upper case if it is a letter
     *
     * @param sentence string to have words with uppercase first letters.
     * @return new version of given sentence with words that have uppercase first letters.
     */

    public static String capitalizeWords(String sentence) {

        String space = " ";

        boolean endsWithSpace = sentence.endsWith(space);

        String output;

        String[] words = sentence.split(space);

        int wordNumber = 0;

        for (String word : words) { // With this loop number of words is determined

            wordNumber++;
        }

        for (int i = 0; i < wordNumber; i++) {

            if (!words[i].isEmpty()) {

                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);

                //First character of all words turns upper case.

            }
        }

        output = words[0];

        for (int i = 1; i < wordNumber; i++) { //new words with upper case letters gather to a new string

            output += space + words[i];
        }

        if (endsWithSpace) output += space;

        return output;

    }

    /**
     * Compares if the second given string is a prefix of the first given string regardless of upper or lower cases
     *
     * @param word string to be checked if the second string is a prefix of it regardless of upper or lower cases
     * @param prefix string to be checked if it is a prefix of first input regardless of upper or lower cases
     * @return boolean if the condition is met
     */

    public static boolean startsWithIgnoreCase(String word, String prefix) {

        boolean returnBoolean;

        if (prefix.length() > word.length()) { //prefixes cannot be longer than the actual string

            returnBoolean = false;
        }

        else {

            String realPrefix = word.substring(0, prefix.length());

            returnBoolean = realPrefix.equalsIgnoreCase(prefix);

        }

        return returnBoolean;
    }

    /**
     * Reverses the given string.
     *
     * @param word string to be reversed
     * @return reversed string
     */

    public static String reverse(String word) {

        int wordLength = word.length();

        char [] wordChars = word.toCharArray();

        char[] outputChars = new char[wordLength];

        for (int i = 0; i < wordLength; i++) { // with this loop order of chars in the word are reversed

            outputChars[i] = wordChars[wordLength - 1 - i];
        }

        return new String(outputChars);

    }

    /**
     *
     * Reverses the order of words in the given sentence
     *
     * @param sentence string whose order of its words will be reversed
     * @return string with reversed order of its words
     */

    public static String reverseSentence(String sentence) {

        String output = "";

        String space = "\s";

        String[] words = sentence.split(space);

        int wordNumber = 0;

        for (String word : words) { // With this loop number of words is determined

            wordNumber++;
        }

        if (wordNumber == 1) {

            output = sentence; // if there is just one word then the return is the input
        }

        else {

            for (int i = wordNumber - 1; i >= 0; i--) {

                if (i == wordNumber - 1) { // last word of input is first word of output

                    output = words[i];
                }
                else {

                    output += space + words[i];
                }
            }

        }

        return output.trim(); // output should not have leading of trailing spaces
    }
}