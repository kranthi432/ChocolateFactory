import java.util.*;
abstract class Chocolate {
    public abstract void addChocolateTypeToppings(String type,String topping);
}

class MilkChocolate extends Chocolate {
    public void addChocolateTypeToppings(String type,String topping) {
        System.out.println("Enjoy your "+type+" chocolate with " + topping);
    }
}

class DarkChocolate extends Chocolate {
    public void addChocolateTypeToppings(String type,String topping) {
        System.out.println("Enjoy your "+type+" chocolate with " + topping);
    }
}

class WhiteChocolate extends Chocolate {
    public void addChocolateTypeToppings(String type,String topping) {
        System.out.println("Enjoy your "+type+" chocolate with " + topping);
    }
}
//client can add more products here 
class ChocolateFactory {
    public Chocolate createChocolate(String selection) {
        Chocolate chocolate = null;
        switch (selection.toLowerCase()) {
            case "milk":
                chocolate = new MilkChocolate();
                break;
            case "dark":
                chocolate = new DarkChocolate();
                break;
            case "white":
                chocolate = new WhiteChocolate();
                break;
            default:
                System.out.println("Please select a valid input!!!");
        }
        return chocolate;
    }
}

public class DriverCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Chocolate chocolate = null;
        ChocolateFactory choco = new ChocolateFactory();
while(true){
        System.out.println("Select your chocolate?");
        System.out.println("1. White");
        System.out.println("2. Dark");
        System.out.println("3. Milk");
        int choice1 = sc.nextInt();
        String n="";
        switch (choice1) {
            case 1:
                chocolate = choco.createChocolate("White");
                n="White";
                break;
            case 2:
                chocolate = choco.createChocolate("Dark");
                n="Dark";
                break;
            case 3:
                chocolate = choco.createChocolate("Milk");
                n="Milk";
                break;
            default:
                System.out.println("Please select a valid input!!!");
        }

        System.out.println("Select your toppings");
        System.out.println("1. Sugar balls");
        System.out.println("2. Coconut powder");
        System.out.println("3. Nuts");
        System.out.println("4. Choco chips");
        int choice2 = sc.nextInt();

        switch (choice2) {
            case 1:
                chocolate.addChocolateTypeToppings(n,"sugar balls");
                break;
            case 2:
                chocolate.addChocolateTypeToppings(n,"Coconut powder");
                break;
            case 3:
                chocolate.addChocolateTypeToppings(n,"Nuts");
                break;
            case 4:
                chocolate.addChocolateTypeToppings(n,"Choco chips");
                break;
            default:
                System.out.println("Please select a valid input!!!");
        }
    }
    }
}
