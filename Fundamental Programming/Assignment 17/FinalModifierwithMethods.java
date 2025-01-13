package Assignment_17;

public class FinalModifierwithMethods {
    final void finalMethod(){
        System.out.println("Final Method");
    }
}

class AccessFinal extends FinalModifierwithMethods{
    // Overriding the method
    /*public void finalMethod(){
        System.out.println("Overrided method");
    }*/
    public static void main(String [] args){
        AccessFinal aF = new AccessFinal();
        aF.finalMethod();
    }
}
