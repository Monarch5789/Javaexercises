public class televisionStation{
    public String stationName;
    public double stationPrice;
    public int numUniqueShows;
    public static int yearFounded = 1970;

    public televisionStation(String aName, double aPrice, int numUnique){
        this.stationName = aName;
        this.stationPrice = aPrice;
        this.numUniqueShows = numUnique;
        
    }

    public televisionStation(String aName, int numUnique){
        this.stationName = aName;
        this.stationPrice = 0;
        this.numUniqueShows = numUnique;
    }

    
    /** 
     * @param new_name
     */
    public void setStationName(String new_name){
        stationName = new_name;
    }

    public void setStationPrice(int new_price){
        stationPrice = new_price;
    }

    public static void getCreateYear(){
        System.out.println(yearFounded);
    }
}