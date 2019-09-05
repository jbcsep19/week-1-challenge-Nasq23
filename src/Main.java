import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //give a level number 1-4
        //then give an option for each level 1-5
        //at end of game tell user if they survived or not
        Integer level1;
        Integer level2;
        Integer level3;
        Integer level4;
        String cabinet = "";
        String bedroomdoor = "";
        String trashbin = "";
        String mattress = "";
        String kitchen = "";
        String soap = "";
        String linen = "";
        String cans = "";
        String bag = "";
        String ties = "";
        String peanutbag ="";
        String salt ="";
        String sugar ="";
        String oil = "";
        String milk = "";
        String blindfold = "";
        String towel = "";
        String pillow = "";
        String sheets ="";
        String blinds =  "";
        String shoes = "";
        String jeans = "";
        String rings = "";
        String bows = "";
        String vinyl = "";
        String pants = "";
        String shirts ="";
        Scanner key = new Scanner(System.in);



        System.out.print("Enter level from 1 to 4: ");
        level1 = key.nextInt();
        System.out.print("Enter first place to go: ");
        System.out.print("Enter second place to go: ");
        System.out.print("Enter third place to go: ");

        System.out.print("Enter level from 1 to 4: ");
        level2 = key.nextInt();
        System.out.print("Enter first place to go: ");
        System.out.print("Enter second place to go: ");
        System.out.print("Enter third place to go: ");

        System.out.print("Enter level from 1 to 4: ");
        level3 = key.nextInt();
        System.out.print("Enter first place to go: ");
        System.out.print("Enter second place to go: ");
        System.out.print("Enter third place to go: ");

        System.out.print("Enter level from 1 to 4: ");
        level4 = key.nextInt();
        System.out.print("Enter first place to go: ");
        System.out.print("Enter second place to go: ");
        System.out.print("Enter fourth place to go: ");
        System.out.print("Enter fifth place to go: ");
        System.out.print("Enter sixth place to go: ");
        System.out.print("Enter seventh place to go: ");
        System.out.print("Enter eighth place to go: ");
        System.out.print("Enter nineth place to go: ");
        {
            System.out.println("You have survived your levels!");
        if (level1 == 1) {
            kitchen = "soap,linen,cans";
            if (level2 == 1) {
                trashbin = "bag,ties,peanutbag";
            } else if (level2 == 2) {
                cabinet = "salt,sugar,oil,milk";
            } else if (level3 == 3) {
                mattress = "blindfold,towel,pillow";
            } else if (level4 == 4) {
                bedroomdoor = "sheets,blinds,shoes,eans,rings,bows,vinyl,pants,shirts";
            } else {
                System.out.println("Wrong job");
            }
        }
        {
        System.out.println("Your level is" + kitchen + ", The next place to go to is ");
    }
 }
    }
}
