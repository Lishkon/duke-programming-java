package week02.StringsFirstAssignments;

/**
 * Implementation of the Week's 2 home work
 * Part 3: Problem Solving with Strings
 *
 * This assignment will give you additional practice using String methods.
 * You will write two methods to solve some problems using strings and a third method to test these two methods.
 *
 * @author alychak
 * @date Feb 11, 2019
 */

public class Part3 {
  /**
   * @param stringa
   * @param stringb
   *
   * @return true if stringa appears at least twice in stringb, otherwise it returns false.
   * */

  public boolean twoOccurrences(String stringa, String stringb) {
    int aPosition = stringb.indexOf(stringa);
    return stringb.substring(aPosition+stringa.length()).contains(stringa);
  }


  /**
   *  Finds the first occurrence of stringa in stringb, and returns the part of stringb that follows stringa.
   *  If stringa does not occur in stringb, then returns stringb.
   *
   *  lastPart(“an”, “banana”) -> “ana”
   *  lastPart(“zoo”, “forest”) -> “forest”
   * */
  public String lastPart(String stringa, String stringb) {
    int aPosition = stringb.indexOf(stringa);
    if (stringb.contains(stringa)) {
      return stringb.substring(aPosition+stringa.length());
    }
    return stringb;
  }

  /**
   * Calling twoOccurances on several pairs of strings and printing the strings and the result of calling the
   * twoOccurances for each pair.
   *
   * Add code to the method testing to call the method lastPart with several pairs of strings.
   * For each call print the strings passed in and the result. For example, the output for the two calls above might be:
   *
   * The part of the string after an in banana is ana.
   * The part of the string after zoo in forest is forest.
   * */
  public void testing() {
    String a1 = "ana";
    String b1 = "banana";
    System.out.println("For following strings - a1: '" + a1 + "' and b1: '" + b1 + "'");
    System.out.println("the result of using the 'twoOccurances' is " + twoOccurrences(a1, b1) + "\n");

    String a2 = "cool";
    String b2 = "coldingfarm";
    System.out.println("For following strings - a2: '" + a2 + "' and b2: '" + b2 + "'");
    System.out.println("the result of using the 'twoOccurances' is " + twoOccurrences(a2, b2) + "\n");

    String lastPartPre = "an";
    String lastPartPost = "banana";

    // Uncomment this when need to test on different values:
    // String lastPartPre = "zoo";
    // String lastPartPost = "forest";

    System.out.println("For following strings - lastPartPre: '" + lastPartPre + "' and lastPartPost: '" + lastPartPost + "'");
    System.out.println("the result of using the 'lastPart' is " + lastPart(lastPartPre, lastPartPost) + "\n");
  }

  /**
   * Running the @testing here
   * @param args
   */
  public static void main(String[] args) {
    Part3 p3 = new Part3();
    p3.testing();
  }
}
