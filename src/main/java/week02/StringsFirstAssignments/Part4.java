package week02.StringsFirstAssignments;

import edu.duke.URLResource;

/**
 * Implementation of the Week's 2 home work
 * Part 4: Finding Web Links
 *
 * Write a program that reads the lines from the file at this URL location,
 * http://www.dukelearntoprogram.com/course2/data/manylinks.html, and prints each URL on the page that is a link to
 * youtube.com. Assume that a link to youtube.com has no spaces in it and would be in the format
 * (where [stuff] represents characters that are not verbatim): “http:[stuff]youtube.com[stuff]”
 *
 * Use URLResource to read the file at http://www.dukelearntoprogram.com/course2/data/manylinks.html word by word.
 *
 * For each word, check to see if “youtube.com” is in it. If it is, find the double quote to the left and right of the
 * occurrence of “youtube.com” to identify the beginning and end of the URL. Note, the double quotation mark is a
 * special character in Java. To look for a double quote, look for (\”), since the backslash (\) character indicates
 * we want the literal quotation marks (“) and not the Java character. The string you search for would be written “\””
 * for one double quotation mark.
 *
 * In addition to the String method indexOf(x, num), you might want to consider using the String method
 * lastIndexOf(s, num) that can be used with two parameters s and num. The parameter s is the string or character to
 * look for, and num is the last position in the string to look for it. This method returns the last match from the
 * start of the string up to the num position, so it is a good option for finding the opening quotation mark of a
 * string searching backward from “youtube.com.” More information on String methods can be found in the Java
 * documentation for Strings: http://docs.oracle.com/javase/7/docs/api/java/lang/String.html.
 *
 * Caution: The word Youtube could appear in different cases such as YouTube, youtube, or YOUTUBE.
 * You can find the URLs more easily by converting the string to lowercase. However, you will need the original string
 * (with uppercase and lowercase letters) to view the YouTube URL to answer a quiz question because YouTube links are
 * case sensitive. The link https://www.youtube.com/watch?v=ji5_MqicxSo is different than the
 * link https://www.youtube.com/watch?v=ji5_mqicxso, where all the letters are lowercase.
 *
 * @author alychak
 * @date 12th Feb, 2019
 */

public class Part4 {
  /*
   * It turns out that here's much more simple algorithm to solve this task:
   * 1. Create a resource that would parse the url
   * 2. Create a temp String variable
   * 3. Go through each word, make it lowercase and put it to the temp String variable you just created
   * 4. Check the occurrence / position of "youtube.com" in this word (you'll just skip it if there's no one), store it to another int variable pos
   * 5. While pos is not a negative number, do the following:
   * 5.1 find the last occurrence of the brackets in the non-capitalized string that goes before the pos, store it to new int value called beg
   * 5.2 find the first occurrence of the brackets in the non-capitalized string, starting from pos+1, store it to new int value called end
   * 5.3 print out the substring of the non-capitalized string variable in range of (beg+1, end)
   * @param url
   */
  public void findURL(String url) {
    URLResource file = new  URLResource(url);
    for (String item : file.words()) {
      String itemLower = item.toLowerCase();
      int pos = itemLower.indexOf("youtube.com");
      if (pos != -1) {
        int beg = item.lastIndexOf("\"",pos);
        int end = item.indexOf("\"", pos+1);
        System.out.println(item.substring(beg+1,end));
      }
    }
  }


  public static void main(String[] args) {
    Part4 p4 = new Part4();
    String linksURL = "http://www.dukelearntoprogram.com/course2/data/manylinks.html";
    p4.findURL(linksURL);

  }
}
