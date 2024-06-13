
abstract class Computer{

    public abstract void code();
    }        



class Desktop extends Computer{

    public void code(){
        System.out.println("code at ease...");
}
}


class Laptop extends Computer{

    public void code(){
        System.out.println("code at ease...");
}
}

class dev extends Computer{

    public void code(){

        System.out.println("code at ease...");
    }}

    

public class inte{
    public static void main(String[] args) {
        Computer c =new dev();

        c.code(); 

        Computer lap =new Laptop();

        lap.code();
        Computer desk =new Desktop();

        desk.code();

        
    }

}
    

