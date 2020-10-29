import java.lang.reflect.Constructor;

class Candy {
  //Declare variable
  String candyName;


  //Default constructor with no parameters
  Candy() {
    candyName = "";
  }

  //Constructor with one parameter
  //@param aName is the name of the candy being passed in
  Candy(String aName) {
    candyName = aName;
  }

  //Mutator method
  void setCandyName(String theCandyName) {
    candyName = theCandyName;
  }

  //Accessor method
  //@return returns the name of the candy
  String getCandyName() {
    return candyName;
  }


  //print method
  void printCandy() {
    System.out.println(candyName);
  }
}