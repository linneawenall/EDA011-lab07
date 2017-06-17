package pair;

import java.util.Random;

public class PairSequence {
	private int n;
	private Pair[] pairs;
	private static Random rand = new Random();
	

	/**
	 * Skapar en sekvens av alla talpar (a,b) sådana att 0 <= a < rows och 0 <=
	 * b < cols
	 */
	public PairSequence(int rows, int cols) {
		n = rows * cols; // n är antal kort
		pairs = new Pair[n];
		int h = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				pairs[h] = new Pair(i, j);
				h++;
			}
		}

	}

	/** Undersöker om det finns fler par i sekvensen. */
	public boolean more() {
		if(n <= 0){
			return false;
		}else{
		return true;
		}
	}

	/** Hämtar ett slumpmässigt valt talpar ur sekvensen. Sekvensen
    	blir ett element kortare. Om sekvensen är tom returneras null. */
	public Pair pick() {
		if(this.more()){
				int pair = rand.nextInt(n);
				Pair c = pairs[pair];
				pairs [pair] = pairs [n-1];
				pairs[n-1] = null; //n-1 betyder 51. n-- betyder att efter denna minskar n med 1
				n--;
				return c;
				}
				else{
					return null;
		}
	}
}