import java.util.ArrayList;
public class BookStore {
    public ArrayList<member> allMembers = new ArrayList<member>();
    public ArrayList<products> allProds = new ArrayList<products>();
    private static int nextID = 0;
    private boolean isTheStoreOpen = true;


    private int storeTotalBooks = 1000;
    private int storeTotalCDs = 1000;
    private int storeTotalDVDs = 1000;




    public int getNextID(){
        return nextID;
    }

    private static void incrementNextID(){
        nextID += 1;
        return;
    }

    public BookStore(){ // start the book store just like the fast food kitchen
        member newMember = new member(nextID, false, 0,0,0, 0.0, false, false);
        incrementNextID();
        allMembers.add(newMember);
    }


    public int addMember(boolean isPremium, boolean payment ){
        boolean temp = false;
        if(isPremium){
            temp = true;
        }
        member curNewMember = new member(nextID, isPremium, 0,0,0, 0.0, temp, payment);
        allMembers.add(curNewMember);
        incrementNextID();
        System.out.println("Your user ID is " + curNewMember.getID() + " and your premium status is " + isPremium);
        return curNewMember.getID();
    }

    public void setOpenStore(boolean h){
        if(h==true){
            isTheStoreOpen = true;
        }
        else{
            isTheStoreOpen = false;
        }
    }
    public boolean isOpen(){
        if(isTheStoreOpen){
            return true;
        }
        else{
            return false;
        }
    }

    public ArrayList<member> getMembers(){
        return allMembers;
    }

    public ArrayList<products> getProds(){
        return allProds;
    }


    public void addProd(int books, int CDs, int DVDs, int id){
        products curNewOrder = new products(books, CDs, DVDs, id);
        allProds.add(curNewOrder);
    }
}