public class Faculty implements Rules {

    private int id;
    private String name;
    private String technology;

    public Faculty(int id, String name, String technology) {
        this.id = id;
        this.name = name;
        this.technology = technology;
    }

    public void display() {
        System.out.println("id = " + id + " name = " + name + " tech = " + technology);
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

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Override
    public void study() {
        System.out.println("Faculty + " + name + " Study");
    }

    @Override
    public void doAssignments() {
        System.out.println("Faculty " + name + " assignments");
    }
}
