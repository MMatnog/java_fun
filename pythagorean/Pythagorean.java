public class Pythagorean {
    public double calculateHypothenuse( int legA, int legB ){
        double legC = Math.sqrt((legA * legA) + (legB * legB));
        return legC;
    }
}