public class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("id = " + id + " name = " + name );
    }

    public void study() {
        System.out.println("Emp " + name + " is studying");
    }

    public void doAssignments() {
        System.out.println("Emp " + name + " is doing the assignments");
    }
}
