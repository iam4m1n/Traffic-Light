import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 16; j++) {
                if(j==6 || j==11)
                    System.out.print("|");
                else
                    System.out.print(" ");
            }
            System.out.println();

            if(i==5){
                System.out.println("      light");
            }


        }



        Street street1 = new Street(2, 3, 5);
        Street street2 = new Street(4, 7, 8);
        Street street3 = new Street(9, 6, 1);
        Street street4 = new Street(7, 5, 2);

        Intersection charRah = new Intersection(street1, street2, street3, street4);


        for (int i = 0; i < 4; i++) {


            int driverSide;
            System.out.println("the driver is in which side?");
            Scanner scanner = new Scanner(System.in);
            driverSide = scanner.nextInt();
            int currentGreen = charRah.algorithm();


            if (currentGreen == driverSide)
                System.out.println("Yes!");
            else
                System.out.println("No!");


        }
    }
}