import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Body Mass Index : weight(kg) / (height(m) * height(m)

        double weight,BodyMassIndex,height;

        //Getting information from the user

        Scanner scanner = new Scanner(System.in);
        System.out.println(" What is your weight (kg) ?  ");
        weight = scanner.nextDouble();
        System.out.println("How tall are you ? (m) ");
        height = scanner.nextDouble();


        BodyMassIndex = weight / (height * height ) ;

        System.out.println("Your body mass index: " + BodyMassIndex);

         // body mass index category placement

             if (BodyMassIndex>=50) {
            System.out.println("Category: Super Obese");
        }
            else if (40<=BodyMassIndex && BodyMassIndex<50) {
            System.out.println("Category: Morbidly Obese");
        }
            else if (30<=BodyMassIndex && BodyMassIndex<40) {
            System.out.println("Category: Obese");
        }
             else if (25<=BodyMassIndex && BodyMassIndex<30) {
            System.out.println("Category: Overweight");
        }
             else if (18.5<BodyMassIndex && BodyMassIndex<25) {
            System.out.println("Category: Normal");
        }
             else {
            System.out.println("Category: Weak");
        }







    }
}