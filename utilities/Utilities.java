package csd.uoc.gr.A23.utilities;
import java.util.Random;
/**
* @author kpapantoniou
*/
public class Utilities {
 /**
 * Finds and returns a random integer number
 *
 * @param min the minimum value of the integer
 * @param max the maximum value of the integer
 * @return the random integer
 */
 public static int getRandomVal(int min, int max) {
 Random rand = new Random();
 int n = rand.nextInt(max - min + 1) + min;
 return n;
 }
}