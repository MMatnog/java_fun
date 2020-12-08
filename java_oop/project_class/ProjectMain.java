public class ProjectMain {
    public static void main(String[] args){
        Project p1 = new Project();
        p1.setInitialCost(23.69);
        String projectName = p1.elevatorPitch();
        System.out.println(projectName);
    }
}