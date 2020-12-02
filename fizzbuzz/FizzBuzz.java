public class FizzBuzz {
    int Fizz = 3;
    int Buzz = 5;
    public String fizzBuzz(Integer number) {
        if ((number%Fizz) == 0 && (number%Buzz) == 0 ){
            return "FizzBuzz";
        } else if ((number%Buzz) == 0){
            return "Buzz";
        } else if ((number%Fizz) == 0){
            return "Fizz";
        } else {
            return Integer.toString(number);
        }
    }
}