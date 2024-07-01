
class A{
    public void show(){
        System.out.println("aaa-class");

    }
}



class B{
    public void show(){
        System.out.println("bbb-class");

    }
}


public class thread {
    public static void main(String[] args){
        A obj =new A();
        B obj1 =new B();
        obj.show();
        obj1.show();
    }
    
}
