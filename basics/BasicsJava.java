import java.util.ArrayList;

public class BasicsJava {
    public static void main(String[] args){
        BasicsJava basics = new BasicsJava();

        // Parameters
        int startNum = 1;
        int endNum = 255;
        int givenNum = 3;
        int[] sampleArray = {1,3,5,7,9,13};
        int[] negativeArray = {-3, -5, -7};
        double[] sampleArray2 = {1,5,10,-2};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(-2);

        // Print 1 - 255;
        basics.printNumbers(startNum, endNum);

        // Print Odd Numbers from 1 - 255
        basics.printOddNumbers(startNum, endNum);

        // Print Numbers from 0 - 255 && current Sum
        basics.printNumbersAndSum(startNum, endNum);

        // Iterate and Print Array Values
        basics.printArrayValues(sampleArray);

        // Print Max Value Array
        basics.printMaxValue(negativeArray);

        // Print Average of Array
        basics.printArrayAverage(sampleArray);

        // Print New Array of Odd Numbers from 1 - 255
        basics.printArrayOfOddNumbers(startNum, endNum);

        // Return Number of Values Greater than a Given Number
        int result = basics.getNumberGreaterThanY(sampleArray, givenNum);
        System.out.println(result);


        // Square All Values in an Array of Numbers
        basics.squareValues(sampleArray);
        for (int number : sampleArray){
            System.out.println(number);
        }

        // Eliminate Negative Numbers in an Array
        basics.eliminateNegatives(arrayList);
        System.out.println(arrayList);

        // Find Max, Min and Average of a Given Array
        double[] result = basics.findMaxMinAvg(sampleArray2);
        for (double number : result){
            System.out.println(number);
        // }

        // Shift Values one Forward
        basics.shiftValuesForward(arrayList);
        System.out.println(arrayList);
    }

    // Basic Methods

    // Print Numbers from Start and End Points
    public void printNumbers(int startNum, int endNum){
        for (int i = startNum; i < endNum + 1; i++){
            System.out.println(i);
        }
    }

    // Print Odd Numbers from Start and End Points
    public void printOddNumbers(int startNum, int endNum){
        for (int i = startNum; i < endNum + 1; i++){
            if (i % 2 > 0){
                System.out.println(i);
            }
        }
    }

    // Print Numbers from Start and End Points and Current Sum
    public void printNumbersAndSum(int startNum, int endNum){
        int sum = 0;
        for (int i = startNum; i < endNum + 1; i++) {
            sum += i;
            System.out.println("Number : " + i + ", Current Sum : " + sum);
        }
    }

    // Iterating Through an Array of Numbers
    public void printArrayValues(int[] mainArray){
        for (int number : mainArray){
            System.out.println(number);
        }
    }

    // Find Max Value in an Array of Numbers
    public void printMaxValue(int[] mainArray){
        int max = mainArray[0];
        if (mainArray.length > 1) {
            for (int number : mainArray){
                if(number > max){
                    max = number;
                }
            }
        }
        System.out.println(max);
    }

    // Print Average of an Array of Numbers
    public void printArrayAverage(int[] mainArray){
        int sum = 0;
        for (int number : mainArray){
            sum += number;
        }
        double average = (sum / mainArray.length);
        System.out.println(average);
    }

    // Make New Array with Odd Numbers from Start and End Points
    public void printArrayOfOddNumbers(int startNum, int endNum){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = startNum; i < endNum + 1; i++){
            if (i % 2 > 0){
                y.add(i);
            }   
        }
        System.out.println(y);
    }

    // Return Number of Values Greater than a Given Number
    public int getNumberGreaterThanY(int[] array, int y){
        int result = 0;
        for (int number : array){
            if (number > y){
                result += 1;
            }
        }
        return result;
    }

    // Square all Values in an Array of Numbers
    public int[] squareValues(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = (array[i] * array[i]);
        }
        return array;
    }
    
    // Eliminate Negatives in an Array of Numbers
    public ArrayList<Integer> eliminateNegatives(ArrayList<Integer> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i) < 0){
                array.set(i, 0);
            }
        }
        return array;
    }

    // Find Max, Min and Average of an Array of Numbers
    public double[] findMaxMinAvg(double[] array){
        double max = array[0];
        double min = array[0];
        double sum = 0;

        for (double number : array) {
            sum += number;
            if (number > max){
                max = number;
            } else if (number < min){
                min = number;
            }            
        }
        double average = (sum / array.length);
        double[] result = {max, min, average};
        return result;
    }

    // Shift Values of Array one Forward
    public ArrayList<Integer> shiftValuesForward(ArrayList<Integer> array){
        for (int i = 1; i < array.size(); i++){
            if(i == array.size()-1){
                int temp = array.get(i);
                array.set(i-1, temp);
                array.set(i, 0);
            } else {
                int temp = array.get(i);
                array.set(i-1, temp);
            }   
        }
        return array;
    }
}