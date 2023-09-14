// I stg I'm obfuscating my code next time for the meme. https://media.discordapp.net/attachments/1083052516851335232/1083052722959425556/4xy5yj8jnui91.png 

import java.util.Scanner; // Mister Spock, what's on the scanners?

public class Candleshop {  // buckle up kiddos, here we go

public static void main(String[] args) { // I know this should probably be indented but to fix it I'd have to indent everything else and I don't feel like it
    

  double cost = 0; // set initial cost to zero

  double priceF, priceS, priceT; // initialize the prices for all three candle types

  int nOne = 0, nTwo = 0, nThree = 0; // initialize the number of each candle type

  int fBurn, sBurn, tBurn; // initialize burn times

  int burnTime = 0; // set default total burn time to zero


  boolean isEnd = true; // Set our end condition
  Scanner in = new Scanner(System.in); // give us a scanner to work with



   while(isEnd){ // while loop active while we're starting the order
    System.out.println("Input candle type: (1, 2, or 3) "); // Tell the user to give the candle type as an int between 1 and 3
      

      int option = in.nextInt();
      in.nextLine(); // prevent skipping

      if (option == 1){ // for candle type one

            priceF = 2.50;

            fBurn = 5;

            System.out.print("Enter number of items: ");

            nOne += in.nextInt();
            in.nextLine(); // Prevent skipping

            burnTime += fBurn * nOne;

            cost += priceF * nOne;

        } else if (option== 2){ // candle type two

            priceS = 3.75;

            sBurn = 7;

            System.out.print("Enter number of items: ");

            nTwo += in.nextInt();
            in.nextLine(); // Prevent skipping 

            burnTime += sBurn * nTwo;

            cost += priceS * nTwo;

        } else if(option == 3){ // candle type 3

            priceT = 5.99;

            tBurn = 12;

            System.out.print("Enter number of items: ");

            nThree += in.nextInt();
            in.nextLine(); // P r e v e n t  s k i p p i n g

            burnTime += tBurn * nThree ;

            cost += priceT * nThree;

        } else{ // keep it between 1-3 idiot

            System.out.println("option must be between 1 and 3");

        }

      System.out.print("Do you want to end the order? y/n: "); // ask if user wants to continue ordering, please stop buying candles
      
    isEnd = !in.nextLine().equals("y"); // remember to end our loop
    //System.out.println(isEnd); DEEEEEBUUUUUUGGGG
    
      
    


  }
in.close(); // VScode doesn't like resource leaks, and neither do I
// Print our shit
  //totalbought = nOne + nTwo + nThree; This doesn't work right, unnecessary too, remove
  //System.out.println("Total number of candles bought: " + totalbought); As above

  if(cost > 20){ // I hate discounts, they always attract so many more people to the store
    if(cost<35){ // between 20-35
        cost = cost - (cost * 0.05);
    }
    else if(cost<55){ // between 35-55
        cost = cost - (cost * 0.07);
    }
    else if(cost<100){ // 55-100, that's a lotta money for candles fam
        cost = cost - (cost * 0.1);
    }
    else if (cost>100){ // 100+, why are you spending that much on fucking candles
        cost = cost - (cost * 0.2);
    }
  }

// Continue printing requirements
  System.out.println("Number of Type 1 candles bought : "+nOne); // Number of type 1 candles

  System.out.println("Number of Type 2 candles bought : "+nTwo); // num type 2 candles

  System.out.println("Number of Type 3 candles bought : "+nThree); // Can you see the pattern?

  System.out.println("Total cost is : "+cost); // fuck rounding I cba

  System.out.println("Total burn time is : "+burnTime); // This *should* be giving consecutive burn time, but I don't want to math it out

  double cpm = (burnTime * 60) / cost; // Cost/minute

  System.out.println("Cost per minute : "+cpm); // fuck rounding I cba
  for (int i = 1; i <= 10; i++)
  {
     System.out.print(i + " ");
  }
}//end main

}// End Candleshop
