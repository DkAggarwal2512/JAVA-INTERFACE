
interface A{
    int add(int a, int b);
}

public class inter2 {
    public static void main(String[] args){
        A obj =new A(){
        public int add(int a, int b){
            return a+b;
            
        }
    };


    int res = obj.add(20, 15);
    System.out.println(res);

}
}


