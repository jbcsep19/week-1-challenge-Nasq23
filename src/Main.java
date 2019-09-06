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
        Integer level5;
        String Youhavesurvived = "";
        String cabinet = "";
        String bedroomcloset = "";
        String mattress = "";
        String livingroom = "";
        String soap = "";
        String linen = "";
        String cans = "";
        String peanutbag = "";
        String salt = "";
        String sugar = "";
        String oil = "";
        String milk = "";
        String blindfold = "";
        String towel = "";
        String pillow = "";
        String sheets = "";
        String blinds = "";
        String shoes = "";
        String jeans = "";
        String rings = "";
        String bows = "";
        String vinyl = "";
        String pants = "";
        String shirts = "";
        String placetogo = "";
        String thingtograb = "";
        String Yourlevelis = "";
        String endofchallenge = "";
        String Enterfirstthingtograb = "";
        String Entersecondthingtograb = "";
        String Enterthirdthingtograb = "";
        String Enterfourththingtograb = "";
        String Enterfifththingtograb = "";
        String Entersixthtthingtograb = "";
        String Entersevengththingtograb = "";
        String Entereigththingtograb = "";
        String Enternineththingtograb = "";
        String Yourthingtograbis = "";
        String Yourplacetogois = "";
        String level = "";
        Scanner key = new Scanner(System.in);


        // get inputs
        System.out.print("Enter level from 1 to 4: ");
        level1 = key.nextInt();
        System.out.print("Enter first place to go: ");
        livingroom = key.nextLine();
        System.out.print("Enter first thing to grab: ");
        soap = key.nextLine();
        System.out.print("Enter second thing to grab: ");
        linen = key.nextLine();
        System.out.print("Enter third thing to grab ");
        cans = key.nextLine();

        {
            System.out.println("You've completed level 1!");

            System.out.print("Enter level from 1 to 4: ");
            level2 = key.nextInt();
            System.out.print("Enter first place to go: ");
            mattress = key.nextLine();
            System.out.print("Enter first thing to grab: ");
            blindfold = key.nextLine();
            System.out.print("Enter second thing to grab: ");
            towel = key.nextLine();
            System.out.print("Enter third thing to grab: ");
            pillow = key.nextLine();
            {
                System.out.println("You've completed level 2!");

                System.out.print("Enter level from 1 to 4: ");
                level3 = key.nextInt();
                System.out.print("Enter first place to go: ");
                cabinet = key.nextLine();
                System.out.print("Enter first thing to grab: ");
                salt = key.nextLine();
                System.out.print("Enter second thing to grab: ");
                sugar = key.nextLine();
                System.out.print("Enter third thing to grab: ");
                oil = key.nextLine();
                System.out.print("Enter fourth thing to grab: ");
                milk = key.nextLine();

                {
                    System.out.println("You've completed level 3!");

                    System.out.print("Enter level from 1 to 4: ");
                    level4 = key.nextInt();
                    System.out.print("Enter first place to go: ");
                    bedroomcloset = key.nextLine();
                    System.out.print("Enter first thing to grab: ");
                    sheets = key.nextLine();
                    System.out.print("Enter second thing to grab: ");
                    blinds = key.nextLine();
                    System.out.print("Enter third thing to grab: ");
                    shoes = key.nextLine();
                    System.out.print("Enter fourth thing to grab: ");
                    jeans = key.nextLine();
                    System.out.print("Enter fifth thing to grab: ");
                    rings = key.nextLine();
                    System.out.print("Enter sixth thing to grab: ");
                    bows = key.nextLine();
                    System.out.print("Enter sevength thing to grab: ");
                    vinyl = key.nextLine();
                    System.out.print("Enter eighth thing to grab: ");
                    pants = key.nextLine();
                    System.out.print("Enter nineth thing to grab: ");
                    shirts = key.nextLine();
                    if (level1 == 1) {
                        placetogo = "livingroom";
                        if (level1 == 1) {
                            thingtograb = "soap,linen,cans";
                            if (level2 == 1) {
                                placetogo = "mattress";
                                thingtograb = "blindfold,towel,pillow";
                            }
                        } else if (level3 == 2) {
                            placetogo = "cabinet";
                            thingtograb = "salt,sugar,oil,milk";

                        } else if (level4 == 3) {
                            placetogo = "bedroomcloset";
                            thingtograb = "shoes,shirts,rings,sheets,blinds,pants,vinyl,jeans,bows";
                        }
                    }
                    System.out.println("You have survived!");
                }
            }
        }
    }
}