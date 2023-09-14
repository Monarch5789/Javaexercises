public class TimeConversion {
    
    /**
     * Constructor
     */
    public void TimeConversion(){
        
    }

    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    public void showDecaseconds(int Seconds){ 
    // add your code here
    System.out.println("A decasecond is 10 seconds");
    double decaseconds = (Seconds / 10.0);
    System.out.println(Seconds + " seconds converted to decaseconds is " + decaseconds + " decaseconds");
    }
   


    // /**
    //  * TO DO: showJiffies method
    //  * Given a number of seconds calculates 
    //  * and display jiffies
    // */
    public void showJiffies(int seconds){
    // // add your code here
    System.out.println("A jiffy is a unit of time used in computer operating systems. It is 10 milliseconds");
    double jiffies = (seconds * 100.0);
    System.out.println(seconds + " seconds converted to jiffies is " + jiffies + " jiffies");

    }

    // /** 
    //  * TO DO: showNewYorkMinutes method
    //  * Given a number of seconds calculates 
    //  * and display New York minutes
    // */
    public void showNewYorkMinutes(int seconds){
    // // add your code here
    System.out.println("A New York Minute is the period of time between traffic lights turning green and the cab behind you honking. It is 1/20th of 1 second");
    double newYorkMinute = (seconds * 1/(0.05));
    System.out.println(newYorkMinute);
    }

    // /**
    //  * TO DO: showNanoCenturies method
    //  * Given a number of seconds calculates 
    //  * and display Nanocenturies
    // */ 
    public void showNanoCenturies(int seconds){
    // // add your code here
    System.out.println("A Nanocentury is a computing measurement coined from the expression - 'never to let the user wait more than a few nanoccenturies for a response'. It is 3.156 seconds.");
    double nanoCenturies = (seconds/3.156);
    System.out.println(seconds + " seconds converted to nanocenturies is " + nanoCenturies + " nanocenturies");
    }

    //  /**
    //  * TO DO: showScaramuccis method
    //  * Given a number of seconds calculates 
    //  * and display Scaramuccis
    // */ 
    public void showScaramuccis(int seconds){
    // // add your code here
    System.out.println("A scaramucci is the tenure of former White House Communications Director Anthony Scaramucci. It is 11 days.");
    double scaramuccis = (seconds / 950400.0); // 950400 seconds = 11 days.
    System.out.println(seconds + " seconds converted to Scaramuccis is " + scaramuccis + " scaramuccis");
    }


    
}//end class