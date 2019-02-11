package week02.StringsFirstAssignments;

/**
 * Implementation of the Week's 2 home work
 * Part 2: Finding a Gene - Using the Simplified Algorithm Reorganized
 *
 * This assignment will determine if a DNA strand has a gene in it by using the simplified algorithm from the lesson,
 * but organizing the code in a slightly different way.
 *
 * @author alychak
 * @date Feb 11, 2019
 */
public class Part2 {
  /**
   * @param dna
   * @param startCodon
   * @param stopCodon
   *
   * Method does following:
   *
   * 1) Finds the index position of the start codon “ATG” (If there is no “ATG”, return the empty string.)
   * 2) Finds the index position of the first stop codon “TAA” appearing after the “ATG” that was found. If there is
   * no such “TAA”, returns the empty string.
   * 3) If the length of the substring between the “ATG” and “TAA” is a multiple of 3, then returns the substring that
   * starts with that “ATG” and ends with that “TAA”.
   * 4) Works both with all UPPERCASE or lowercase letters
   * */
  public String findSimpleGene(String dna, String startCodon, String stopCodon) {

    String result = "";

    int startCodonPosition = dna.indexOf(startCodon);
    if (startCodonPosition == -1) {
      result = "";
    }

    int stopCodonPosition = dna.indexOf(stopCodon,startCodonPosition+3);
    if (stopCodonPosition == -1) {
      result = "";
    }

    if ((stopCodonPosition - startCodonPosition) % 3 == 0) {
      result = dna.substring(startCodonPosition,stopCodonPosition+3);
    }
    return result;
  }

  /**
   * Testing method for findSimpleGene method
   */
  public void testSimpleGene() {
    String test = "TAASHJAHHHTGCCCTAF";
    String startCodon = "TAA";
    String stopCodon = "TAF";
    String result = findSimpleGene(test,startCodon,stopCodon);
    String expResult = "TAASHJATGCCCHHHTAF";

    if (test.equals(result)) {
      System.out.println("You nailed it!");
    } else {
      System.out.println("mistake for input: " + test);
      System.out.println("Expected result: " + expResult);
    }

  }

  public static void main(String[] args) {
    Part2 p2 = new Part2();
    p2.testSimpleGene();
  }
}
