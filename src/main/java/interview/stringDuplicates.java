package interview;

public class stringDuplicates {


    public static void printDuplicateCharacters(String a) {
        char[] characters = a.toCharArray();

        System.out.println("Duplicate characters in the string:");

        for (int i = 0; i < characters.length; i++) {
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    System.out.print(characters[j] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void stringReverse(String b) {

        // convert String to character array
        // by using toCharArray
        char[] resultArray = b.toCharArray();
        int l = resultArray.length;
        //iteration
        for (int i = l - 1; i >= 0; i--)
            // print reversed String
            System.out.print(resultArray[i]);

    }


    public static void main(String[] args) {

        String str = "Great Responsibility";
        System.out.println(str);
        printDuplicateCharacters(str);
        System.out.println("Reverse of string");
        stringReverse(str);

    }
}
