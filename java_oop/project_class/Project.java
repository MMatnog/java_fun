public class Project {
    private String name = "Null";
    private String description = "Description pending.";
    private double initialCost = 0.00;

    public Project(){
    }

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public double getInitialCost(){
        return this.initialCost;
    }

    public void setInitialCost(double cost){
        this.initialCost = cost;
    }

    public String elevatorPitch(){
        String cost = String.valueOf(this.initialCost);
        String pitch = this.name.concat(" ( $" + cost + " ) ").concat(": ").concat(this.description);
        return pitch;
    }
}