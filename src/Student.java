//option 1
//public abstract class Student implements Rules {
public class Student implements Rules {

    private int roll;
    private String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void study() {
        System.out.println(name + " is Studying");
    }

    @Override
    public void doAssignments() {
        System.out.println(name + " is doing assignments");
    }

    public void display() {
        System.out.println("roll = " + roll + " name = " + name);
    }
}
