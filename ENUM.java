class A{
    int a; int b; int c;
}
enum Students{
    Seema,
    DK,
    RK;

// this is called methods
//     public void show(){
//         System.out.println("Students Are Watching Video");
//     }

//     public String display(){
//         return "Watching";
//     }

}



public class ENUM {


    public static void main(String[] args) {

       
        // Students obj= Students.Seema;
        // System.out.println(obj);   
        // obj.show();



        // Students obj[] = Students.values();
        // System.out.println(obj);
        // for(int i =0; i<obj.length;i++){
        //     System.out.println(obj[i]);


        // }


        for(Students s : Students.values()){
            // System.out.println(s.ordinal()+1+" "+s);
            System.out.println(s.name());
            System.out.println(s.toString());
            System.out.println(s.valueOf("Seema"));
        }


    }

}


