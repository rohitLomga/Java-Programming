package Assignment10;

public class BlockScopeandShadowing {

    public static void calculate(){
        int x = 5;

        for(int i = 1; i <= 2; i++){
//            int x = 10;
            x = 10;
            System.out.println("Inside the loop : " + x);
        }

        System.out.println("Outside the loop : " + x);
    }

    public static void main(String[] args){
        calculate();
    }
}
