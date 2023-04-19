package OOPsPractice;

public class EmployeeManager {
    public static void main(String[] args) {

    }
}

class Manager implements IWorker {
    IWorker worker;


    public void setWorker(IWorker worker) {
        this.worker = worker;
    }

    public void manageWork() {
        this.worker.work();
    }

    @Override
    public void work() {

    }
}

interface IWorker {
    public void work();
}

class Employee implements IWorker {
    public void work() {
        System.out.println("Employee Working");
    }
}

class Security implements IWorker {
    public void work() {
        System.out.println("Security is Watching");
    }
}





