import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        // Import Puzzling class
        Puzzling puzzle = new Puzzling();
        
        // Parameters
        int[] array1 = {3,5,1,2,7,9,8,13,25,32};
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
        'o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<String> arrayNames = new ArrayList<String>();
        arrayNames.add("Nancy");
        arrayNames.add("Jinichi");
        arrayNames.add("Fujibayashi"); 
        arrayNames.add("Momochi");
        arrayNames.add("Ishikawa");

        // Print the sum of all Numbers and return an array of numbers greater than a given number
        // ArrayList<Integer> result = new ArrayList<Integer>(); 
        // result = puzzle.getNumbersGreaterThanY(array1, 10);
        // System.out.println(result);

        // Shuffle Array of Names, Print Each Name, and Return all Names longer than 5 characters
        // ArrayList<String> result = new ArrayList<String>();
        // result = puzzle.shuffleAndGetNamesLongerThanX(arrayNames, 5);
        // System.out.println(result);

        // Shuffle Array of the Alphabet, Print Each Letter, and Checks First Index if Vowel
        // puzzle.shuffleAlphabet(alphabet);

        // Generate and Return an Array of 10 Random Numbers between 55 - 100
        // ArrayList<Integer> result = new ArrayList<Integer>();
        // result = puzzle.getRandomArray(55, 100);
        // System.out.println(result);

        // Generate a Sorted Array of 10 Random Numbers between 55 - 100, and Print Min and Max of Array
        // ArrayList<Integer> result = new ArrayList<Integer>();
        // result = puzzle.getRandomWithMinMax(55, 100);
        // System.out.println(result);

        // Generate a random String with 5 random Characters
        // String randomWord = puzzle.getRandomString(5);
        // System.out.println(randomWord);


        // Generate an Array of 10 Random Strings with 5 Characters each
        ArrayList<Object> randomArray = puzzle.getArrayOfRandomStrings(5,10);
        System.out.println(randomArray);
    }
}
