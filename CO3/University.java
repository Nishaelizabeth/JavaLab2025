
abstract class Person {
    private String name;
    private int id;


    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public abstract String getRole();
}


class Student extends Person {
    public Student(String name, int id) {
        super(name, id);
    }


    public String getRole() {
        return "Student";
    }
}


class Professor extends Person {
    public Professor(String name, int id) {
        super(name, id);
    }

    public String getRole() {
        return "Professor";
    }
}


public class University {
    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        Professor p = new Professor("Dr. Bob", 201);

        System.out.println(s.getName() + " (ID: " + s.getId() + ") is a " + s.getRole());
        System.out.println(p.getName() + " (ID: " + p.getId() + ") is a " + p.getRole());
    }
}



