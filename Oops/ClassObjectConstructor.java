package Oops;

public class ClassObjectConstructor {

    public static void main(String[] args) {

        Student Brajesh =new Student();
        System.out.println(Brajesh.name);
        System.out.println(Brajesh.marks);
        System.out.println(Brajesh.regdNo);

        System.out.println();
        Student random =new Student("Random",1801229032,73.7f);
        System.out.println(random.name);
        System.out.println(random.marks);
        System.out.println(random.regdNo);
        random.changeName("Rahul");
        random.studentInfo();


        Student test = new Student(Brajesh);

    }

}

class Student{
    String name;
    int regdNo;
    float marks;



    void changeName(String name){
        this.name=name;
    }

    void studentInfo(){
        System.out.println("Student name: "+this.name+" Regd No: "+this.regdNo+" Marks"+this.marks);
    }

    Student(){

//        this how we call another constructor from another constructor
       this ("Default value",180,99.4f);
    }

    Student(String name,int regdNo,float marks){
        this.name=name;
        this.regdNo=regdNo;
        this.marks=marks;
    }

    Student(Student otherObject){
        this.name=otherObject.name;
        this.regdNo= otherObject.regdNo;
        this.marks= otherObject.marks;
    }




}

