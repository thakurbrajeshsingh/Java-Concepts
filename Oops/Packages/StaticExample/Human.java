package Oops.Packages.StaticExample;

public class Human {
    String name;
    int age;
    int salary;
   static int population;

    public Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population+=1;
    }

}
