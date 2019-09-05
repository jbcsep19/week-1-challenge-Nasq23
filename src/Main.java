import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        //give a level number 1-4
        //then give an option for each level 1-5
        //at end of game tell user if they survived or not
        Integer level1;
        Integer level2;
        Integer level3;
        Integer level4;
        String cabinet ="";
        String bedroomdoor ="";
        String trashbin ="";
        String mattress ="";
        String kitchen ="";
        Scanner key = new Scanner(System.in);

        System.out.print("Enter level from 1 to 4: ");
        level1 = key.nextInt();
        System.out.print("Enter level from 1 to 4: ");
        level2 = key.nextInt();
        System.out.print("Enter level from 1 to 4: ");
        level3 = key.nextInt();
        System.out.print("Enter level from 1 to 4: ");
        level4 = key.nextInt();
        if(level1 == 1){
            kitchen = "go to soap,go to linen,go to cans";
            if(level2 == 1){
                trashbin = "go to bag,go to ties,go to peanutbag";
            }
            else if(level2 == 2){
                cabinet = "go to salt,go to sugar,go to oil,go to milk";
            }
            else if (level3 == 3){
                mattress = "go to blindfold,go to towel,go to pillow";
            }
            else if (level4 == 4){
                bedroomdoor = "go to sheets, go to blinds,go to shoes,go to jeans,grab rings,go to bows,grab vinyl,go to pants,go to shirts";
            }
            else {
                System.out.println("Wrong job");
            }
        }
        System.out.println("Your level is" + kitchen + ", The next place to go to is ");

    }
}
