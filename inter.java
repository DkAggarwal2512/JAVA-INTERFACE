interface A{
    void show();
}


public class inter {
    public static void main(String[] args) {


        // B obj = new B();
        // obj.show();
        
        A obj =new A(){
            public void show(){
                System.out.println("interfaces");
            }
        };
        obj.show();
    }
    
}
