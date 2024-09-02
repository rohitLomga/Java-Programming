import java.util.Scanner;

public class EligibilityForAdmission {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int physics;
        int maths;
        int chemistry;
        int totalOfAll;
        int totalOfMathsAndPhysics;

        System.out.println("Enter the marks obtained in Physics : ");
        physics = scanner.nextInt();

        System.out.println("Enter the marks obtained in Chemistry");
        chemistry = scanner.nextInt();

        System.out.println("Enter the marks obtained in Maths");
        maths = scanner.nextInt();

        totalOfAll = physics + maths + chemistry;

        totalOfMathsAndPhysics = maths + physics;

        if(maths >= 65 && physics >= 55 && chemistry >= 50){
            if(totalOfAll >= 190 || totalOfMathsAndPhysics >= 140){
                System.out.println("The candidate is eligible for the admission");
            }else {
                System.out.println("The candidate is not eligible for the admission");
            }
        }else {
            System.out.println("The candidate is not eligible for the admission");
        }

    }
}
