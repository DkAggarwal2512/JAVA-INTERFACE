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


        obj.show();
        int a =10;
        String b ="10";
        System.out.println(a*2 + " " + b+2);
    }
    
}
