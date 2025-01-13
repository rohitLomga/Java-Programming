package Assignment_17;

import java.security.PublicKey;

public class TestModifiers {
    public static void main(String [] args){
        PublicAndPrivate p = new PublicAndPrivate();
        p.publicMethod();
//        p.privateMethod();
    }
}

class PublicAndPrivate{
//    Public method
    public void publicMethod(){
        System.out.println("Public method");
    }

    // Private Method
    private void privateMethod(){
        System.out.println("Private method");
    }
}
