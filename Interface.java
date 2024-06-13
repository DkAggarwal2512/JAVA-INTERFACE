
abstract class Car{
    abstract void start();
    abstract void stop();

    public void ac(){
        System.out.println("Ac Is On");
    }
}

class maruti800 extends Car{
   public void start(){
        System.out.println("Start");
    }


    public void stop(){
        System.out.println("Stop");
    }

}

public class Interface{
    public static void main(String[] args) {
        Car c=new maruti800();
        c.start();
        c.ac();
        c.stop();
    }

}