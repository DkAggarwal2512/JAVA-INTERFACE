// class A{
//     int a; int b; int c;
// }




// enum marks{
//     Eighty,
//     ninty,
//     fifty,
//     sixty;
// }


enum Students{
    Seema,
    DK,
    RK;


    public void show(){
        System.out.println("Students Are Watching Video");
    }

    public String display(){
        return "Watching";
    }

}



public class ENUM {


    public static void main(String[] args) {
        Students obj= Students.Seema;
        System.out.println(obj);
        
        obj.show();


    }

}


