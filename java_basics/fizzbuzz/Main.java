public class Main {
    public static void main(String[] args){
        FizzBuzz test1 = new FizzBuzz();
        FizzBuzz test2 = new FizzBuzz();
        FizzBuzz test3 = new FizzBuzz();
        FizzBuzz test4 = new FizzBuzz();
        String result1 = test1.fizzBuzz(3);
        String result2 = test2.fizzBuzz(5);
        String result3 = test3.fizzBuzz(15);
        String result4 = test4.fizzBuzz(2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}