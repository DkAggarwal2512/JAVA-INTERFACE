class Add extends Sub{
    public int add(int a , int b){
        return a+b;
}}



// Substraction
class Sub{
    public int sub(int c , int d){
        return c-d;
    }
}

// Division
class Div{
    public int div(int e , int f){
        return e/f;
    }
}




// Multiplication
class Mult{
    public int mult(int g , int h){
        return g*h;
    }
}




public class InHerit{
    public static void main(String[]args){

Add obj  = new Add();
int res = obj.add(2, 8);

Div obj1 = new Div();   
int res1 = obj1.div(12,2);

Sub obj2 = new Sub();
int res2 = obj2.sub(8,2);

Mult obj3 = new Mult();
int res3 = obj3.mult(8,2);


                System.out.println(res);
                System.out.println(res1);
                System.out.println(res2);
                System.out.println(res3); 

    }
}