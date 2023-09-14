public class Budget {

    public static void main(String[] args) {
        int hrWage = 10; // $10/hour
        int rent = 625; // $625/month
        int netServ = 27; // $27/month
        int food = 250; // $250/month
        int costFun = 150; // $150/month
        int totalCostMonth = rent + netServ + food + costFun; // Adds all costs into one total monthly bill
        double totalCostWeek = totalCostMonth / 4; // Let's break this down into weekly prices, it'll be easier to work with later. You could technically multiply everything else by four, but the project is asking for hours per week.
        double requiredHours = totalCostWeek / hrWage; // This is the number of hours requried to break even
        System.out.println("The hourly wage is : $" + hrWage + " per hour"); // Prints hourly wage
        System.out.println("The cost of rent is: $" + rent + " per month."); // Prints cost of rent
        System.out.println("The cost of internet Service is: $" + netServ + " per month"); // prints cost of internet
        System.out.println("The cost of food is: $" + food + " per month"); // Prints cost of food
        System.out.println("The total monthly cost is: $" + totalCostMonth + " per month"); // Prints total monthly cost
        // System.out.println(totalCostWeek); This was me testing to make sure it gave the right number
        System.out.println("The number of hours required per week to break even is: " + requiredHours + " hours."); // This simply prints the number we established earlier to break even.

        
        double requiredPluSave = requiredHours + 2.5; // Gets us a variable that we can put our required hours in order to save $100/month.

        System.out.println("The number of hours required per week to save $100/month is: " + requiredPluSave + "hours"); // Prints out our requirements per week.
        // double test = requiredPluSave * 4;

    }

}
