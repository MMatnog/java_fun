import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class Puzzling {
    // Print the sum of all Numbers and return an array of numbers greater than a given number
    public ArrayList<Integer> getNumbersGreaterThanY(int[] array, int y) {
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int number : array){    
            sum += number;           
            if (number > y){         
                result.add(number);  
            }
        }

        System.out.println("Sum of Array : " + sum);
        return result;
    }

    // Shuffle Array of Names, Print Names and Return Array of Names longer than X length
    public ArrayList<String> shuffleAndGetNamesLongerThanX(ArrayList<String> array, int x) {
        ArrayList<String> result = new ArrayList<String>();

        Collections.shuffle(array);
        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));

            if ((array.get(i)).length() > x){
                result.add(array.get(i));
            }
        }
        return result;
    }

    // Shuffle Array of the Alphabet, Print Last Letter, and Checks First Index if Vowel
    public void shuffleAlphabet(char[] array){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char letter : array){
            alphabet.add(letter);
        }

        Collections.shuffle(alphabet);
        char first = alphabet.get(0);
        char last = alphabet.get(25);
        if (first != 'a' && first != 'e' && first != 'i' && first != 'o' && first != 'o'){
            System.out.println(first);
            System.out.println("The First Letter is a Consonant");
        } else {
            System.out.println(first);
            System.out.println("The First Letter is a Vowel");
        }
        System.out.println("The Last Letter is " + last);
    } 

    // Generate and Return an Array of 10 Random Numbers between start and end numbers
    public ArrayList<Integer> getRandomArray(int min, int max){
        ArrayList<Integer> randomNums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            Random random = new Random();
            int num = random.nextInt((max - min) + 1) + 55;
            randomNums.add(num);
        }
        return randomNums;
    }

    // Generate a Sorted Array of 10 Random Numbers between start and end numbers, and print min and max of array
    public ArrayList<Integer> getRandomWithMinMax(int min, int max){
        ArrayList<Integer> randomNums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            Random random = new Random();
            int num = random.nextInt((max - min) + 1) + 55;
            randomNums.add(num);
        }
        Collections.sort(randomNums);
        int arrayMin = randomNums.get(0);
        int arrayMax = randomNums.get(9);
        System.out.println("The Smallest Number is " + arrayMin);
        System.out.println("The Largest Number is " + arrayMax);
        return randomNums;
    }

    // Generate a random String with Random Characters
    public String getRandomString(int length){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
        'o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] word = new char[length];
        Random r = new Random();
        for (int i = 0; i < length; i++){
            int randomInt = r.nextInt(26);
            word[i] = alphabet[randomInt];
        }
        String result = Arrays.toString(word);
        return result;
    }

    // Generate an Array with Random Strings with a Specified Length
    public ArrayList<Object> getArrayOfRandomStrings(int wordLength, int arrayLength){
        int count = 0;
        ArrayList<Object> result = new ArrayList<Object>();
        while (count < arrayLength){
            result.add(getRandomString(wordLength));
            count++;
        }
        return result;
    }
}