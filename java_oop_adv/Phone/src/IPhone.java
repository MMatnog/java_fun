public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
       String result = ("iPhone " + this.getVersionNumber() + " says "
    		   + this.getRingTone());
       return result;
    }
    @Override
    public String unlock() {
        return "Unlocking via facial recognition.";
    }
    @Override
    public void displayInfo() {
        System.out.println("iPhone " + this.getVersionNumber() + " from " + this.getCarrier());            
    }
}
