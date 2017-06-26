class Triangle {
  public int mSideOne;
  public int mSideTwo;
  public int mSideThree;

  public Triangle(int sideOne, int sideTwo, int sideThree) {
    mSideOne = sideOne;
    mSideTwo = sideTwo;
    mSideThree = sideThree;
  }

  public String whatType(int sideOne, int sideTwo, int sideThree){
    if ( (sideOne == sideTwo) && (sideOne == sideThree) ) {
      return "an equilateral";
    } else if ((sideOne + sideTwo < sideThree) || (sideOne + sideThree < sideTwo) || (sideTwo + sideThree < sideOne) ) {
      return "not a valid";
    } else if ( (sideOne == sideTwo) || (sideOne == sideThree) || (sideTwo == sideThree) ) {
      return "an isosceles";

    } else {
      return "a scalene";
    }
  }
}
