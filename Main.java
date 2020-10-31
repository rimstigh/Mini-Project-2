import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Create a new pillowcase object
    Pillowcase pillowcase1 = new Pillowcase();

    //use scanner to ask the user the number of houses
    Scanner s = new Scanner(System.in);

    //prompt the user for input
    System.out.println("Happy Halloween! How many houses should we trick or treat at?");
    int numHouses;
    numHouses = s.nextInt();

    //Call getNewCandy() on pillowcase object for # of houses 
    for (int i = 0; i < numHouses; i++) {
      pillowcase1.getNewCandy();
    }

    //print how many candies are in the pillowcase
    System.out.println("We have " + pillowcase1.getCandyCount() + " candies");

    //call printNumCandies on the pillowcase object
    pillowcase1.printNumCandies();
  
  }
}