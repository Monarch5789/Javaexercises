import java.util. *;
import java.io.*;

/**
 *
 * @author Adam Whaley and Aidan Perkins
 */


public class Main {

    public static void main(String[] args) {

        

        Scanner scnr = new Scanner(System. in);
        Scanner fileScanner;
        PetStore ps = new PetStore("Ai's Petstore");
        System.out.println("**** Welcome to " + ps.getStoreName() + "****");
        int newRegisteredUsersThisDay = 0;
        while (true) {
            
            System.out.println("Please select from one of the following menu otions");
            System.out.println("\t1. Adopt a new pet");
            System.out.println("\t2. Register a new member");
            System.out.println("\t3. Start adoption drive (add new pets)");
            System.out.println("\t4. Check current inventory");
            System.out.println("\t5. Register new pet to Owner profile");
            System.out.println("\t6. Exit");
            System.out.println("\t7. Compare the price of two pets.");

            int choice1 = scnr.nextInt();
            ArrayList<Pet> allPets = new ArrayList<Pet>();
            ArrayList<Cat> allCats = ps.getAvailableCats();
            ArrayList<Dog> allDogs = ps.getAvailableDogs();
            ArrayList<ExoticPet> allExoticPets = ps.getAvailableExoticPets();
            ArrayList<Member> allMembers = ps.getMemberList();
            ArrayList<PremiumMember> allPremiumMembers = ps.getPremiumMemberList(); 

            try{ 
                fileScanner = new Scanner(new File("C:\\TNGRP\\Javaexercises\\1213\\Projects\\Project 3\\src\\inventory.csv"));
                String line;
                while(fileScanner.hasNext()){
                    line = fileScanner.nextLine();
                    String[] values = line.split(",");
                    try{
                        if(values[0].equalsIgnoreCase("class ExoticPet")){
                            ExoticPet newPet = new ExoticPet(values[2], values[1], values[5], Integer.parseInt(values[6]), Double.parseDouble(values[7]), Integer.parseInt(values[3]), Double.parseDouble(values[4]));
                            allExoticPets.add(newPet);
                        }
                        else if(values[0].equalsIgnoreCase("class Dog")){
                            Dog newDog = new Dog(values[2], values[1], values[5], Integer.parseInt(values[6]), Double.parseDouble(values[7]), Integer.parseInt(values[3]), Double.parseDouble(values[4]));
                            allDogs.add(newDog);
                        }
                        else if(values[0].equalsIgnoreCase("class Cat")){
                            Cat newCat = new Cat(values[2], values[1], values[5], Integer.parseInt(values[6]), Double.parseDouble(values[7]), Integer.parseInt(values[3]), Double.parseDouble(values[4]));
                            allCats.add(newCat);
                        }
                    }
                    catch(ArrayIndexOutOfBoundsException ex){
                        System.out.println("Caught ArrayIndexOutOfBoundsException when closing output stream, try again.");
                    }
                }

            }
            catch(FileNotFoundException ex){
                System.out.println(" Caught FileNotFoundException for inputData.txt. Try again making sure the file name and path are correct.");
            }

            for(Dog dog : allDogs){
                allPets.add(dog);
            }
            for(Cat cat : allCats){
                allPets.add(cat);
            }
            for(ExoticPet exoticPet : allExoticPets){
                allPets.add(exoticPet);
            }

            switch (choice1) {
                case 1:
                    System.out.println("-----------------------------------");
                    purchase(ps, scnr, new ArrayList<Pet>());
                    /** 
                     * 
                     * @TODO checkout 
                    */
                    break;
                case 2:
                    System.out.println("-----------------------------------");
                    registerNewMember(ps, scnr);
                    newRegisteredUsersThisDay += 1;
                    break;
                case 3: // Adoption Drive
                ArrayList<Pet> newPets = new ArrayList<Pet>();
                System.out.println("How many pets are being adopted?");
                
                int numAdoptionDrive = scnr.nextInt();
                for(int i = 0; i < numAdoptionDrive; i++){
                    System.out.println("Please input the new pets name");
                    scnr.nextLine();
                    String tempPetName = scnr.nextLine();
                    System.out.println("Please input the new pets Sex: M/F");
                    String tempPetSex = scnr.nextLine().toLowerCase();
                    if (tempPetSex == "m"){
                        tempPetSex = "Male";
                    }
                    else if (tempPetSex == "f"){
                        tempPetSex = "Female";
                    }
                    System.out.println("Please input the new pets age: ");
                    int tempPetAge = scnr.nextInt();
                    System.out.println("Please input the new pets weight: ");
                    double tempPetWeight = scnr.nextDouble();
                    System.out.println("What is this pets ID?: ");
                    int tempPetID = scnr.nextInt();
                    System.out.println("What is the new pets price?: ");
                    double tempPetPrice = scnr.nextDouble();
                    scnr.nextLine();
                    System.out.println("Is the new pet a dog, a cat, or an exotic animal? (D/C/E)");
                    String tempPetSpecies = scnr.nextLine().toLowerCase();
                    //System.out.println(tempPetSpecies);
                    if(tempPetSpecies.equalsIgnoreCase("d")){
                        System.out.println("What breed of dog is this?");
                        String tempDogBreed = scnr.nextLine();
                        Dog newDog = new Dog(tempPetName, tempDogBreed, tempPetSex, tempPetAge, tempPetWeight, tempPetID, tempPetPrice);
                        newPets.add(newDog);
                    }
                    else if(tempPetSpecies.equalsIgnoreCase("c")){
                        System.out.println("What breed of cat is this? ");
                        String tempCatBreed = scnr.nextLine();
                        Cat newCat = new Cat(tempPetName, tempCatBreed, tempPetSex, tempPetAge, tempPetWeight, tempPetID, tempPetPrice);
                        newPets.add(newCat);
                    }
                    else if(tempPetSpecies.equalsIgnoreCase("e")){
                        System.out.println("What species of exotic animal is this? ");
                        String tempExoticSpecies = scnr.nextLine();
                        ExoticPet newExoticPet = new ExoticPet(tempPetName, tempExoticSpecies, tempPetSex, tempPetAge, tempPetWeight, tempPetID, tempPetPrice);
                        newPets.add(newExoticPet);
                    }
                    else{
                        System.out.println("That is not a valid input, please input D, C, or E");
                    }
                    ps.adoptionDrive(newPets);

                    //Pet newPet = new Pet();
                }
                    break;
                case 4: // Check inventory
                    System.out.println("Listing pets available for purchase or registration.");
                    
                    for(Pet pet : allPets){
                        System.out.println(pet.toString());
                    }
                    System.out.println("The total value of all pets combined is: " + ps.inventoryValue());
                    //System.out.println("\n " + allPets);

                
                    break;
                case 5: // Link pet to owner
                    System.out.println("Registering a new pet to an owner. \n Input the owner name: ");
                    
                    scnr.nextLine();
                    String tempOwnerName = scnr.nextLine();
                    Member petOwner = null; // Null in place of 0
                    for (Member member : ps.getMemberList()){ // Check all members and if their name = the input, they are the one we're registering
                        if(member.getName().equalsIgnoreCase(tempOwnerName)){
                            petOwner = member;
                            //break;
                        }
                    }
                    if(petOwner == null){ // if they're still null after that, it's because they're a premium member, so repeat the process (make sure PremiumMember extends Member)
                        for(PremiumMember premiumMember : ps.getPremiumMemberList()){
                            if(premiumMember.getName().equalsIgnoreCase(tempOwnerName)){
                                petOwner = premiumMember;
                                //break;
                            }
                        }
                    }
                    if(petOwner != null){ // Once the pet owner is established, register a pet to them
                        System.out.println("What type of pet are you registering? D/C/E");
                        String tempPetType = scnr.nextLine().toLowerCase(); // remember to convert to lowercase or D != d
                        if(tempPetType.equalsIgnoreCase("d")){ // if they are doing this for a dog.
                            ArrayList<Dog> availableDogs = ps.getAvailableDogs();
                            if(availableDogs.size() == 0){ // If there are no dogs, they can't register the dog
                                System.out.println("There are no dogs to register.");
                            }
                            else{ // If there are dogs, get the one they want (by name) and add it to their list of dogs (petOwner.addDog(Dog))
                                System.out.println("Pick a dog to register. ");
                                for(int i = 0; i < availableDogs.size(); i++){
                                    Dog dog = availableDogs.get(i);
                                    System.out.println((i + 1) + ". " + dog.getName() + " ID: " + dog.getID());

                                }
                                int choice = scnr.nextInt();
                                if(choice >= 1 && choice <= availableDogs.size()){
                                    Dog chosenOne = availableDogs.remove(choice - 1);
                                    petOwner.addDog(chosenOne);
                                    System.out.println("Selected dog has been registered to: " + petOwner.getName());
                                }
                                else{
                                    System.out.println("You have not selected a dog on the list, please try again");
                                }
                            }
                            
                        }
                        else if(tempPetType.equalsIgnoreCase("c")){ // do the same for a cat
                            ArrayList<Cat> availableCats = ps.getAvailableCats();
                            if(availableCats.size() == 0){
                                System.out.println("There are no cats to register");
                            }
                            else{
                                System.out.println("Pick a cat to register. ");
                                for(int i = 0; i < availableCats.size(); i++){
                                    Cat cat = availableCats.get(i);
                                    System.out.println((i+1) + ". " + cat.getName() + " ID: " + cat.getID());
                                }
                                int choice = scnr.nextInt();
                                if(choice >= 1 && choice <= availableCats.size()){
                                    Cat chosenOne = availableCats.remove(choice -1);
                                    petOwner.addCat(chosenOne);
                                    System.out.println("Selected cat has been registered to: " + petOwner.getName());
                                }
                                else{
                                    System.out.println("You have not selected a cat on the list, please try again.");
                                }
                            }

                        }
                        else if(tempPetType.equalsIgnoreCase("e")){
                            ArrayList<ExoticPet> availableExoticPets = ps.getAvailableExoticPets();
                            if(availableExoticPets.size() == 0){
                                System.out.println("There are no exotic pets to register");
                            }
                            else{
                                System.out.println("Pick an exotic pet to register");
                                for(int i=0; i< availableExoticPets.size(); i++){
                                    ExoticPet exoticPet = availableExoticPets.get(i);
                                    System.out.println((i+1) + ". " + exoticPet.getName() + " ID: " + exoticPet.getID());
                                }
                                int choice = scnr.nextInt();
                                if(choice >= 1 && choice <= availableExoticPets.size()){
                                    ExoticPet chosenOne = availableExoticPets.remove(choice -1);
                                    petOwner.addExoticPet(chosenOne);
                                    System.out.println("Selected exotic pet has been registered to: " + petOwner.getName());
                                }
                                else{
                                    System.out.println("You have not selected an exotic pet on the list, please try again.");
                                }
                            }
                        }
                        else{
                            System.out.println("Please input D, C, or E.");
                        }

                    }
                

                    break;
                case 6:
                    //System.out.println(newRegisteredUsersThisDay);
                    System.out.println("Thanks for visiting!");
                    try {
                    FileOutputStream fs = new FileOutputStream("C:\\TNGRP\\Javaexercises\\1213\\Projects\\Project 3\\src\\inventory.csv");
                    PrintWriter outFS = new PrintWriter(fs);
                    //outFS.println("class,species,name,id,price,sex,age,weight");
                    FileOutputStream fsMember = new FileOutputStream("C:\\TNGRP\\Javaexercises\\1213\\Projects\\Project 3\\src\\members.csv");
                    PrintWriter outFSMember = new PrintWriter(fsMember);
                    FileOutputStream endOfDayReport = new FileOutputStream("C:\\TNGRP\\Javaexercises\\1213\\Projects\\Project 3\\src\\endOfDayReport.csv");
                    PrintWriter outEndofDayReport = new PrintWriter(endOfDayReport);
                    for(Dog d : allDogs){
                        outFS.println(d);
                    }
                    for(Cat c : allCats){
                        outFS.println(c);
                    }
                    for(ExoticPet e : allExoticPets){
                        outFS.println(e);
                    }
                    for(Member m : allMembers){
                        outFSMember.println(m);
                    }
                    for(PremiumMember p : allPremiumMembers){
                        outFSMember.println(p);
                    }
                    outEndofDayReport.println("Total new users registered today: " + newRegisteredUsersThisDay);

            outEndofDayReport.close();
            outFS.close();
            outFSMember.close();
            }
            catch (FileNotFoundException ex) {
                System.out.println("Caught FileNotFoundException for inventory.csv. Try again making sure the file name and path are correct.");
            }
            // catch(IOException ex){
            //     System.out.println("Caught IOException when closing output stream. Try again.");
            // }
                    return;
                case 7:
                System.out.println("Please input two pets you wish to compare the price of (by the pets ID)");
                Pet tempPet01 = null;
                Pet tempPet02 = null;
                System.out.println("Input first pet: ");
                int tempPetSelection = scnr.nextInt();
                System.out.println("Input Second Pet: ");
                int temp2PetSelection = scnr.nextInt();
                for(Pet pet : allPets){
                    if(tempPetSelection == pet.getID()){
                        int tempPet01Index = allPets.indexOf(pet);
                        tempPet01 = allPets.get(tempPet01Index);
                        
                                
                            }
                        
                    
                        }
                for(Pet pet02 : allPets){
                    if(temp2PetSelection == pet02.getID()){
                        int tempPet02Index = allPets.indexOf(pet02);
                        tempPet02 = allPets.get(tempPet02Index);
                    }
                }
                if(tempPet01 != null && tempPet02 != null){
                    tempPet01.compareTo(tempPet02);
                }
                break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
        
    }

    private static void purchase(PetStore petStore, Scanner scnr, ArrayList<Pet> cart) {
        System.out.println("What type of pet are you here to purchase?");
        System.out.println("\t1. Dogs");
        System.out.println("\t2. Cats"); 
        System.out.println("\t3. Exotic Pets");

        int petTypeChoice = scnr.nextInt();

        // display inventory menu
        int itemNum = 1;
        if (petTypeChoice == 1) {
            ArrayList<Dog> inventory = petStore.getAvailableDogs();
            if (!inventory.isEmpty()) {

                System.out.println("Which of the following dogs would you like to purchase?:");

                for (Dog pet : inventory) {
                    System.out.println(
                        "\t" + itemNum + ". $" + pet.getPrice() + " - " + pet.getBreed() + "(" + pet.getName() +
                        ")"
                    );
                    itemNum++;
                }
                // get user selection for product to add arraylist (cart)
                int choice = scnr.nextInt();
                if (choice <= inventory.size()) {
                    cart.add(inventory.get(choice - 1));
                    //update inventory for this item
                    petStore.removePet("dog", choice - 1);
                    //cart summary
                    System.out.println(
                        "You have " + cart.size() + " items in your cart. Are you done shopping?"
                    );
                    System.out.println("\t1. Yes");
                    System.out.println("\t2. No");

                    int doneShopping = scnr.nextInt();
                    if (doneShopping == 1) {
                        //System.out.println("TO DO - CHEKOUT ");
                        checkout(petStore, scnr, cart);
                    } else if (doneShopping == 2) { // more shopping
                        purchase(petStore, scnr, cart); // recursively call purchase(...) until done
                    } else {
                        System.out.println("Invalid Choice.");
                    }
                } else {
                    System.out.println("Please enter a valid product number. Try again");
                    purchase(petStore, scnr, cart);
                }
            } else {
                System.out.println("Sorry! we currently have no dogs available.");
            }

        }
        else if(petTypeChoice == 2){ // cats
            ArrayList<Cat> inventory = petStore.getAvailableCats();
            if (!inventory.isEmpty()) {

                System.out.println("Which of the following dogs would you like to purchase?:");

                for (Cat pet : inventory) {
                    System.out.println(
                        "\t" + itemNum + ". $" + pet.getPrice() + " - " + pet.getBreed() + "(" + pet.getName() +
                        ")"
                    );
                    itemNum++;
                }
                // get user selection for product to add arraylist (cart)
                int choice = scnr.nextInt();
                if (choice <= inventory.size()) {
                    cart.add(inventory.get(choice - 1));
                    //update inventory for this item
                    petStore.removePet("cat", choice - 1);
                    //cart summary
                    System.out.println(
                        "You have " + cart.size() + " items in your cart. Are you done shopping?"
                    );
                    System.out.println("\t1. Yes");
                    System.out.println("\t2. No");

                    int doneShopping = scnr.nextInt();
                    if (doneShopping == 1) {
                        //System.out.println("TO DO - CHEKOUT ");
                        checkout(petStore, scnr, cart);
                    } else if (doneShopping == 2) { // more shopping
                        purchase(petStore, scnr, cart); // recursively call purchase(...) until done
                    } else {
                        System.out.println("Invalid Choice.");
                    }
                } else {
                    System.out.println("Please enter a valid product number. Try again");
                    purchase(petStore, scnr, cart);
                }
            } else {
                System.out.println("Sorry! we currently have no cats available.");
            }
        }
        else if(petTypeChoice == 3){
            ArrayList<ExoticPet> inventory = petStore.getAvailableExoticPets();
            if (!inventory.isEmpty()) {

                System.out.println("Which of the following dogs would you like to purchase?:");

                for (ExoticPet pet : inventory) {
                    System.out.println(
                        "\t" + itemNum + ". $" + pet.getPrice() + " - " + pet.getSpecies() + "(" + pet.getName() +
                        ")"
                    );
                    itemNum++;
                }
                // get user selection for product to add arraylist (cart)
                int choice = scnr.nextInt();
                if (choice <= inventory.size()) {
                    cart.add(inventory.get(choice - 1));
                    //update inventory for this item
                    petStore.removePet("exoticPet", choice - 1);
                    //cart summary
                    System.out.println(
                        "You have " + cart.size() + " items in your cart. Are you done shopping?"
                    );
                    System.out.println("\t1. Yes");
                    System.out.println("\t2. No");

                    int doneShopping = scnr.nextInt();
                    if (doneShopping == 1) {
                        //System.out.println("TO DO - CHEKOUT ");
                        checkout(petStore, scnr, cart);
                    } else if (doneShopping == 2) { // more shopping
                        purchase(petStore, scnr, cart); // recursively call purchase(...) until done
                    } else {
                        System.out.println("Invalid Choice.");
                    }
                } else {
                    System.out.println("Please enter a valid product number. Try again");
                    purchase(petStore, scnr, cart);
                }
            } else {
                System.out.println("Sorry! we currently have no exotic pets available.");
            }
        }
    }

    private static void checkout(PetStore petStore, Scanner scnr, ArrayList<Pet> cart) {
        // calculate total
        double total = 0;
        for (Pet pet : cart) {
            total += pet.getPrice();
        }
        System.out.println(
            "Your total comes to " + total + ". \nPlease select which member is making this" +
            " purchase."
        );

        // list members and option to register
        int num = 1;
        for (Member member : petStore.getMemberList()) {
            System.out.println(num + ". " + member.getName());
            num++;
        }
        for (PremiumMember member : petStore.getPremiumMemberList()) {
            System.out.println(num + ". " + member.getName());
            num++;
        }
        System.out.println(num + ". Register a new Member.");

        System.out.println(""); // space line
        int memberSelect = scnr.nextInt();
        Member purchaser = null;
        PremiumMember premiumPurchaser = null;

        if (memberSelect > petStore.getMemberList().size() + petStore.getPremiumMemberList().size() + 1) { // invalid selection
            System.out.println("Invalid Selection");
            checkout(petStore, scnr, cart); // recursive call if valid user input

        } else { // valid selection
            if (memberSelect == (petStore.getMemberList().size() + petStore.getPremiumMemberList().size()) + 1) { // adding a new member
                boolean premium = registerNewMember(petStore, scnr);
                if (premium) {
                    premiumPurchaser = petStore.getPremiumMemberList().get(
                        petStore.getPremiumMemberList().size() - 1
                    );
                } else {
                    purchaser = petStore.getMemberList().get(petStore.getMemberList().size() - 1);
                }
            } else if (memberSelect <= (petStore.getMemberList().size())) {
                purchaser = petStore.getMemberList().get(memberSelect - 1);
            } else { // existing premium member
                premiumPurchaser = petStore.getPremiumMemberList().get(
                    memberSelect - petStore.getMemberList().size() - 1
                );
            }

            // check if premium member and fees are due
            if (purchaser == null && premiumPurchaser != null) {
                if( !premiumPurchaser.isDuesPaid()){
                System.out.println(
                    "Premium Membership dues unpaid, $5 will be added to purchase total to cover du" +
                    "es."
                );
                total += 5;
                }
                premiumPurchaser.setDuesPaid(true);
                // update amount of purchases for this member
                premiumPurchaser.setAmountSpent(total);
                // done
                System.out.println("Your purchase total was: " + total);
                System.out.println(
                    "Congrats on your purchase " + premiumPurchaser.getName()
                );

            } else {
                // update amount of purchases for this member
                purchaser.setAmountSpent(total);
                System.out.println("Your purchase total was: " + total);
                System.out.println("Congrats on your purchase " + purchaser.getName());

            }
        }
    }

    private static boolean registerNewMember(PetStore petStore, Scanner scnr) {
        // prompt user to select membership type
        System.out.println("Let's get you registered as a new Member!");
        System.out.println( "Would you like to register as a free-tier or premium member?");
        System.out.println("\t1. Free-tier");
        System.out.println("\t2. Premium");

        // user selection
        int choice1 = scnr.nextInt();
        // if user selects a wrong choice 
        if (choice1 > 2 || choice1 < 1) {
            System.out.println("Invalid choice.");
            registerNewMember(petStore, scnr); // try again

        } else {
            // prompt user for name 
            System.out.println("Please enter your name:");
            scnr.nextLine();
            String name = scnr.nextLine();
             System.out.println("Welcome to our membership program! Thank you for registering.");
            if (choice1 == 1) { // regular membership
                petStore.addNewMember(name, false);
                return false;
            } else { // user entered 2 - premimum membership
                petStore.addNewMember(name, true);
                return true;
            }
        }
        return false;
    }

}