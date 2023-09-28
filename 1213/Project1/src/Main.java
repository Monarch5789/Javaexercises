import java.util.*;

public class Main {
    public static void main(String[] args){
        BookStore bookstore01 = new BookStore();
        Scanner console = new Scanner(System.in);

        while(bookstore01.isOpen() == true){
            System.out.println("Please select an option from the following");
            System.out.println("\t 1. Order an item");
            System.out.println("\t 2. Create a Member Profile");
            System.out.println("\t 3. View Payment Methods");
            System.out.println("\t 4. View Member Profile");
            System.out.println("\t 5. View Store Inventory");
            System.out.println("\t 6. Exit");
            
            //products order01 = new products(0, 0, 0, 0);
            int num = console.nextInt();
            console.nextLine();
            switch(num){
                case 1: 
                System.out.println("How many Books would you like to order?");
                int books01 = console.nextInt();
                System.out.println("How many movies would you like to order?");
                int movies01 = console.nextInt();
                System.out.println("How many CDs would you like to order?");
                int compactDisks01 = console.nextInt();
                System.out.println("What is your user ID");
                int tempID = console.nextInt();
                member curActiveUser = bookstore01.getMembers().get(tempID);
                curActiveUser.setBooksPurchased(curActiveUser.getBooksPurchased()+books01);
                curActiveUser.setCDsPurchased(curActiveUser.getCompactDisksPurchased()+compactDisks01);
                curActiveUser.setDVDsPurchased(curActiveUser.getDVDsPurchased()+movies01);
                
                bookstore01.addProd(books01, movies01, compactDisks01, tempID);
                products order01 = bookstore01.getProds().get(tempID-1);
                order01.setTotalPurchaseCost(curActiveUser.getTotalSpent()+(books01 * 9.99) + (movies01 * 14.99) + (compactDisks01 * 2.99));
                curActiveUser.setTotalSpent(order01.getTotalPurchaseCost());
                System.out.println("You have ordered " + books01 + " book(s) " + movies01 + " movie(s), and " + compactDisks01 + " CD(s).");
                order01.setNumberCDs(order01.getNumberCDs()-compactDisks01);
                order01.setNumberDVDs(order01.getNumberDVDs()-movies01);
                order01.setNumberofBooks(order01.getNumberOfBooks()-books01);
                System.out.println("The store has " + (order01.getNumberCDs()+10) + " CDs Remaining, " + (order01.getNumberDVDs()+10) + " DVDs remaining, and " + (order01.getNumberOfBooks()+10) + " books remaining.");

                break;

                case 2:
                
                System.out.println("Would you like to be a premium member? 1/0");
                int premiumYesNo = console.nextInt();
                boolean temporaryPremium = false;
                boolean paymentType = false;
                //System.out.println(premiumYesNo);
                if(premiumYesNo == 1){
                    temporaryPremium = true;
                    System.out.println("Would you like to pay via card or cash? 1 for Card / 0 for cash");
                    int paymentMethod = console.nextInt();
                    if(paymentMethod == 1){
                        paymentType = true;
                    }
                    else{
                        paymentType = false;
                    }
                }
                else{
                    System.out.println("wtf bro");
                }
 
                bookstore01.addMember(temporaryPremium, paymentType);
                break;

                case 3:
                System.out.println("Please input member ID");
                int ID03 = console.nextInt();
                member tempMember = bookstore01.getMembers().get(ID03);
                    if(tempMember.getPremium()){
                    System.out.println("Do you pay with a card? " + tempMember.getPayMethod());
                    System.out.println("Is your payment due?" + tempMember.getFeeDue());

                    }
                    else{
                    System.out.println("You are not a premium user and thus do not have a payment method or a fee!");
                    }
                break;

                case 4: // view member info
                System.out.println("Please input ID");
                int tempID01 = console.nextInt();
                member tempMember04 = bookstore01.getMembers().get(tempID01);
                System.out.println(tempMember04.getPremium() + " " + tempMember04.getBooksPurchased() + " " + tempMember04.getCompactDisksPurchased() + " " +tempMember04.getDVDsPurchased() +" "+ tempMember04.getTotalSpent() + " Paying with card? " + tempMember04.getPayMethod());

                break;

                case 5: // view store inventory
                System.out.println("Viewing store inventory is only accessible to verified members, please input a user ID ");
                int tempIDInv = console.nextInt();
                products temProducts = bookstore01.getProds().get(tempIDInv-1);
                System.out.println((temProducts.getNumberCDs()+10) + " " + (temProducts.getNumberDVDs()+10) + " " + (temProducts.getNumberOfBooks()+10));
                break;

                case 6: // exit
                System.exit(0);
                break;
                default:
                System.out.println("Please input a number between 1 and 6");
            }
        }

console.close();
    }
}
