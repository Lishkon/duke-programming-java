package week02.StringsFirstAssignments;
/**
 * Implementation of the Week's 2 home work
 * Part 1: Finding a Gene - Using the Simplified Algorithm
 *
 * @author alychak
 */
public class Part1 {

  String dna;

  Part1(String dna) {
    this.dna = dna;
  }
  /**
   * @param dna Method does following:
   *            <p>
   *            - Finds the index position of the start codon “ATG” (If there is no “ATG”, return the empty string.)
   *            - Finds the index position of the first stop codon “TAA” appearing after the “ATG” that was found.
   *            If there is no such “TAA”, return the empty string.
   *            - If the length of the substring between the “ATG” and “TAA” is a multiple of 3,
   *            then return the substring that starts with that “ATG” and ends with that “TAA”.
   */

  public String findSimpleGene(String dna) {
    String result = "";

    int startCodonPosition = dna.indexOf("ATG");
    if (startCodonPosition == -1) {
      result = "";
    }

    int stopCodonPosition = dna.indexOf("TAA",startCodonPosition+3);
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
    System.out.println("Gene is \'" + findSimpleGene(dna) + "\'");
  }

  public static void main(String[] args) {
    Part1 p1 = new Part1("CTAHSHJATGCCCAAAHHHCCHJJJCCCHHHAAASSSHHHKKKJJJTAA");
    p1.testSimpleGene();

    Part1 p2 = new Part1("ATGTAA");
    p2.testSimpleGene();

    Part1 p3 = new Part1("ATGCCCHHHCCCGGGSSS");
    p3.testSimpleGene();

    Part1 p4 = new Part1("ATGCCCHHHGGGSTAA");
    p4.testSimpleGene();
  }
}
