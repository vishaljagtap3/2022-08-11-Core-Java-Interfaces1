public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(11, "Suraj");
        Student s2 = new Student(22, "Sakshi");

        s1.display();
        s1.study();
        s1.doAssignments();

        System.out.println();

        s2.display();
        s2.study();
        s2.doAssignments();

        System.out.println();

        Employee e1 = new Employee(123, "Prashant");
        Employee e2 = new Employee(234, "Aniket");

        e1.display();
        e1.study();
        e1.doAssignments();

        System.out.println();

        e2.display();
        e2.study();
        e2.doAssignments();
    }
}
