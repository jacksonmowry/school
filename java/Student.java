import java.util.Vector;

class Student {
    public String last;
    public String first;
    public double gpa;
    public Student(String first, String last, double gpa) {
        this.first = first;
        this.last = last;
        this.gpa = gpa;
    }
}

class test {
    public static void main(String[] args) {
        Vector<Student> studs =new Vector<>(10);
        studs.add(new Student("John", "Doe", 3.4));
        studs.add(new Student("Jane", "Doe", 4.0));
        studs.add(new Student("Joey", "Bagodonuts", 3.9));
        studs.add(new Student("Ivan", "Petrovich", 2.1));
        studs.add(new Student("Nomen", "Bran", 1.9));
        studs.add(new Student("Never", "Showup", 0.1));

        for (Student s : studs) {
            System.out.println(s.last + " " + s.first + " " + s.gpa);
        }
    }
}
