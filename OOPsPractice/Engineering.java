package OOPsPractice;


import java.util.Scanner;

class Student {
    private int studentId;
    private String studentName;
    private String college;

    Student(int studentId, String studentName, String college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public String getCollege() {
        return this.college;
    }


    public void setStudentId(int id) {
        this.studentId = id;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void getDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College: " + college);
    }
}

class EngineeringStudent extends Student {

    String stream;


    EngineeringStudent(int studentId, String studentName, String college, String stream) {
        super(studentId, studentName, college);
        this.stream = stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getStream() {
        return stream;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Stream: " + stream);
    }
}


public class Engineering {
    public static void main(String[] args) {

        String t;
        String stream, name, college;
        int id;

        Scanner sc = new Scanner(System.in);
        t = sc.nextLine();
        if (t.equals("Student")) {
            id = Integer.valueOf(sc.nextInt());
            name = sc.nextLine();
            college = sc.nextLine();
            Student s = new Student(id, name, college);
            s.getDetails();
        } else if (t.equals("EngineeringStudent")) {
            id = Integer.valueOf(sc.nextInt());
            name = sc.nextLine();
            college = sc.nextLine();
            stream = sc.nextLine();
            EngineeringStudent es = new EngineeringStudent(id, name, college, stream);
            es.getDetails();
        } else {
            System.out.println("Invalid Input");
        }

    }
}
