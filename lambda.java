
interface A{
    int add(int a, int b);
}

public class lambda {
    public static void main(String[] args){
        A obj =(a, b) -> a+b;
        A obj1 =(a, b) -> a-b;
        
        
    //     {
    //     public int add(int a, int b){
    //         return a+b;
            
    //     }
    // };


    int res = obj.add(20, 15);
    int res1 = obj1.add(25,30);
    System.out.println(res);
    System.out.println(res1);


}
}


