public class StringManipulatorTester {
    public static void main(String[] args) {
        // Import String Manipulator
        StringManipulator manipulator = new StringManipulator();

        // Trim and Concatenate
        String concatString = manipulator.trimAndConcat("   Hello   ", "   World   ");
        System.out.println(concatString); // prints HelloWorld

        // Index of String (Single Char)
        char letter = 'o';
        Integer indexOfString1 = manipulator.getIndexOrNull("Hello World", letter);
        Integer indexOfString2 = manipulator.getIndexOrNull("Engineer", letter); 
        System.out.println(indexOfString1); // prints 4 
        System.out.println(indexOfString2); // prints null

        // Index of String (Substring)
        String substring = "llo";
        Integer indexOfString3 = manipulator.getIndexOrNull("Hello World", substring);
        Integer indexOfString4 = manipulator.getIndexOrNull("Engineer", substring); 
        System.out.println(indexOfString3); // prints 2
        System.out.println(indexOfString4); // prints null

        // Get Substring and Concatenate
        String substringConcat = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(substringConcat); // prints eworld
    }   
}