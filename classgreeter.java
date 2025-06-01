public class Greeter {

    void greet() {                          
        System.out.println("Hey there");     
    }

    public static void main(String[] args) {  //main   
        (new Greeter()).greet();                 
    }

}
