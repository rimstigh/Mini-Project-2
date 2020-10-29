import java.util.ArrayList;
import java.util.Random;
import java.lang.reflect.Constructor;

class Pillowcase {
  
  //Declare variables
  ArrayList<Candy> candyList = new ArrayList<Candy>();
  int candyCount;

  //Default constructor
  Pillowcase() {
    //candyList.setCandyName("");
    candyCount = 0;
  }

  //Accessor method for the number variable
  //@return returns the candy candy count
  int getCandyCount() {
    return candyCount;
  }

  //getCandy function 
  void getNewCandy() {
  System.out.println("Trick or Treat!");
  String candy;

  //random num to decide candy
  Random r = new Random();
  int randomNum = r.nextInt(101);
  //Select candy depending on random 
  if (randomNum <= 10) {
    candy = "M&Ms";
  } else if (randomNum > 10 && randomNum <= 30) {
    candy = "Pink Starburts";
  } else if (randomNum > 30 && randomNum <= 47) {
    candy = "Hershey's Bar";
  } else if (randomNum > 47 && randomNum <= 55) {
    candy = "Milky Way";
  } else if (randomNum > 55 && randomNum <= 68) {
    candy = "Twix";
  } else if (randomNum > 68 && randomNum <= 93) {
    candy = "Reese's";
  } else {
    candy = "Kit Kat";
  }

  //Add new candy object to the Pillowcase
  Candy candy1 = new Candy(candy);
  candyList.add(candy1);
  candyCount += 1;
}
  //printNumCandies function
  void printNumCandies() {
    //create array for candies 
    int candyCounter[] = new int[7];
    //initialize candyCounter 
    for (int i = 0; i < candyCounter.length; i++) {
      candyCounter[i] = 0;
    }
    //loop through candyList to see how many of each candy there are 
    for (int i = 0; i < candyList.size(); i++) {
      if (candyList.get(i).getCandyName().equals("M&Ms")) {
        candyCounter[0] += 1;
      } else if (candyList.get(i).getCandyName().equals("Pink Starburst")) {
        candyCounter[1] += 1;
      } else if (candyList.get(i).getCandyName().equals("Hershey's Bar")) {
        candyCounter[2] += 1;
      } else if (candyList.get(i).getCandyName().equals("Milky Way")) {
        candyCounter[3] += 1;
      } else if (candyList.get(i).getCandyName().equals("Twix")) {
        candyCounter[4] += 1;
      } else if (candyList.get(i).getCandyName().equals("Reese's")) {
        candyCounter[5] += 1;
      } else {
        candyCounter[6] += 1;
      }
    }
    //Print counts of each candy
    System.out.println("We got...");
    if (candyCounter[0] > 0) {
      System.out.println(candyCounter[0] + " M&Ms");
    }
    if (candyCounter[1] > 0) {
      System.out.println(candyCounter[1] + " Pink Startburst");
    }
    if (candyCounter[2] > 0) {
      System.out.println(candyCounter[2] + " Hershey's Bar");
    }
    if (candyCounter[3] > 0) {
      System.out.println(candyCounter[3] + " Milky Way");
    }
    if (candyCounter[4] > 0) {
      System.out.println(candyCounter[4] + " Twix");
    }
    if (candyCounter[5] > 0) {
      System.out.println(candyCounter[5] + " Reese's");
    }
    if (candyCounter[6] > 0) {
      System.out.println(candyCounter[6] + " Kit Kat");
    }
    }}

