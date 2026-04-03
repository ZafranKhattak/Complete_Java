class Student {
    String name;
}

class Teacher {
    void teach(Student s) {
        System.out.println("Name: " + s.name);
    }
}

class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        Student student = new Student();
        student.name = "Zafran Khan";
        teacher.teach(student);
    }
}