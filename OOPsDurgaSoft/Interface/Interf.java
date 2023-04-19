package OOPsDurgaSoft.Interface;

interface Interf {
     void m1();


    int age=10;

    public void m2();
}

abstract class ServiceProvider implements Interf{
    public void m1() {

    }
}

class SubServiceProvider extends ServiceProvider{
    @Override
    public void m2() {

    }
}