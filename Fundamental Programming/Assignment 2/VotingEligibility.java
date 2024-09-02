public class VotingEligibility {
    public static void main(String[] args){
        int age = 21;

        if(age < 18){
            System.out.println("Sorry! You are not eligible for casting your vote");
        }else{
            System.out.println("Congratulations! You are eligible for casting your vote");
        }
    }
}
