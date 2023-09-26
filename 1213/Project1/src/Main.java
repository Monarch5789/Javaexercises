import java.util.*;

public class Main {
    public static void main(String[] args){
        Bookstore bookstore01 = new Bookstore();
        Scanner console = new Scanner(System.in);

        while(bookstore01.isOpen() == true){
            System.out.println("Please select an option from the following");
            System.out.println("\t 1. Order an item");
            System.out.println("\t 2. View Membership");
            System.out.println("\t 3. View Payment Methods");
            System.out.println("\t 4. View Member Profile");
            System.out.println("\t 5. View Store Inventory");
            System.out.println("\t 6. Exit");

            int num = console.nextInt();
            switch(num){
                case 1: 
                System.out.println("How many Books would you like to order?");
                int books01 = console.nextInt();
                System.out.println("How many movies would you like to order?");
                int movies01 = console.nextInt();
                System.out.println("How many CDs would you like to order?");
                int compactDisks01 = console.nextInt();
                break;

                case 2:
                System.out.println("Please input member ID");
                console.nextInt();
                member temp = memberList.get(ID);
                boolean isPreem = temp.isPremium();
                System.out.println(isPreem);
                break;

                case 3:
                System.out.println("Please input member ID");
                console.nextInt();
                member temp = memberList.get(ID);
                    if(temp.isPremium()){
                    System.out.println(temp.getPayMethod());
                    System.out.println(temp.feeDue());

                    }
                    else{
                    System.out.println("You are not a premium user and thus do not have a payment method or a fee!");
                    }
                break;

                case 4: // view member info
                System.out.println("Please input ID");
                int tempID = console.nextInt();
                member temp = members.get(tempID)
                System.out.println(temp.isPreem() + temp.booksPurchased() + temp.compactDisksPurchased() + temp.DVDsPurchased() + temp.totalSpent());

                break;

                case 5: // view store inventory
                System.out.println(bookstore01.getInventoryCDs() + " " + bookstore01.getInventoryDVDs() + " " + bookstore01.getInventoryBooks);
                break;

                case 6: // exit
                bookstore01.close();
                break;
                default:
                System.out.println("Please input a number between 1 and 6");
            }
        }

console.close();
    }
}
