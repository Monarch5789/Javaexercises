import java.util.*;
/**
    ITSC1213 FA2023 - D.I. von Briesen

    Assignment Name: ITSC1213 Project 1 - Book Store
    Description: The purpose of this project is to create a system that allows a bookstore owner to keep track of their inventory and members.
    The program is currently capable of the following:
    1) Registering new members (and determining whether or not a new member is a premium member or not)
    2) Making an order of a number of CDs, DVDs, and Books (Note that inputting a number greater than the store's inventory will cause a transaction to be cancelled, though a record of the attempt will be left on the users profile)
    3) Viewing payment methods for each user (Whether or not they have decided to pay via a card or cash)
    4) Viewing a members profile, which will inform them if they are a premium member, the number of products they have purchased, as well as the total they have spent, and their payment method.
    5) Viewing the stores inventory.
    It should also be noted that all functions require an active user ID. Creating an order without a user will not work, nor will attempting to access the stores inventory.


    @author Aidan Perkins
    @date 09/29/23
    @version 1.0
*/
public class Main {
    
    /** 
     * @param args
     */
    public static void main(String[] args){
        BookStore bookstore01 = new BookStore();
        Scanner console = new Scanner(System.in);
        bookstore01.addProd(0, 0, 0, 0);
        while(bookstore01.isOpen() == true){
            System.out.println("Please select an option from the following. Please note that you must create a profile before placing an order, as we do not support guest memberships.");
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
                case 1:  // Lets make an order
                    System.out.println("How many Books would you like to order?");
                    int books01 = console.nextInt();
                    System.out.println("How many movies would you like to order?");
                    int movies01 = console.nextInt();
                    System.out.println("How many CDs would you like to order?");
                    int compactDisks01 = console.nextInt();
                    System.out.println("What is your user ID");
                    int tempID = console.nextInt();
                
                    member curActiveUser = bookstore01.getMembers().get(tempID); // here to line 37 is just creating the order and linking the order to the user
                    curActiveUser.setBooksPurchased(curActiveUser.getBooksPurchased()+books01);
                    curActiveUser.setCDsPurchased(curActiveUser.getCompactDisksPurchased()+compactDisks01);
                    curActiveUser.setDVDsPurchased(curActiveUser.getDVDsPurchased()+movies01);
                
                    bookstore01.addProd(books01, compactDisks01, movies01, tempID);
                    products order01 = bookstore01.getProds().get(tempID-1);
                    order01.setTotalPurchaseCost(curActiveUser.getTotalSpent()+(books01 * 9.99) + (movies01 * 14.99) + (compactDisks01 * 2.99));
                    curActiveUser.setTotalSpent(order01.getTotalPurchaseCost());
                    System.out.println("You have ordered " + books01 + " book(s) " + movies01 + " movie(s), and " + compactDisks01 + " CD(s).");
                    order01.setNumberCDs(order01.getNumberCDs()-compactDisks01);
                    order01.setNumberDVDs(order01.getNumberDVDs()-movies01);
                    order01.setNumberofBooks(order01.getNumberOfBooks()-books01);
                    System.out.println("The store has " + (order01.getNumberCDs()) + " CDs Remaining, " + (order01.getNumberDVDs()) + " DVDs remaining, and " + (order01.getNumberOfBooks()) + " books remaining.");

                break;

                case 2: // Create a member
                
                    System.out.println("Would you like to be a premium member? 1 for Yes / 0 for No");
                    int premiumYesNo = console.nextInt(); // Theres probably a better way to do this whole switch case, but I don't really care
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
 
                    bookstore01.addMember(temporaryPremium, paymentType);
                break;

                case 3: // View payment method for a user
                    System.out.println("Please input member ID");
                    int ID03 = console.nextInt();
                    member tempMember = bookstore01.getMembers().get(ID03);
                    if(tempMember.getPremium()){
                        System.out.println("Do you pay with a card? " + tempMember.getPayMethod());
                        System.out.println("Is your payment due? " + tempMember.getFeeDue());

                    }
                    else{ // This will likely be used more often
                        System.out.println("You are not a premium user and thus do not have a payment method or a fee!");
                    }
                break;

                case 4: // view member info
                    System.out.println("Please input ID");
                    int tempID01 = console.nextInt();
                    member tempMember04 = bookstore01.getMembers().get(tempID01); // Get the member out of the arraylist
                    System.out.println("Premium Status: " + tempMember04.getPremium() + " | Number of Books Purchased: " + tempMember04.getBooksPurchased() + " | Number of CDs Purchased: " + tempMember04.getCompactDisksPurchased() + " | Number of DVDs Purchased: " +tempMember04.getDVDsPurchased() +" | Total Spent: "+ tempMember04.getTotalSpent() + " Paying with card? " + tempMember04.getPayMethod());

                break;

                case 5: // view store inventory
                    System.out.println("Viewing store inventory is only accessible to verified members, please input a user ID ");
                    int tempIDInv = console.nextInt();
                    products temProducts = bookstore01.getProds().get(tempIDInv-1); // get the order out of its arraylist -- Does not work if 0 is the input, 
                    System.out.println(("CDs Remaining: " + temProducts.getNumberCDs()) + " | DVDs Remaining: " + (temProducts.getNumberDVDs()) + " | Books Remaining: " + (temProducts.getNumberOfBooks()));
                break;

                case 6: // exit
                    System.exit(0);
                break;
                default:
                    System.out.println("Please input a number between 1 and 6");
                break;
            }
        }

console.close();
    }
}
