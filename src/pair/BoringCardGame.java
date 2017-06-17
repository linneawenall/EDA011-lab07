package pair;

public class BoringCardGame {
	private static final int NBR_ITERATIONS = 1000000;

	public static void main(String[] args) {
		int lost = 0;
		for (int i = 0; i < NBR_ITERATIONS; i++){
			PairSequence game = new PairSequence (4, 13);
			int count = 0;
			while(game.more()){
					Pair card = game.pick();
					if (card.second() == count){
						lost++;
						break;
					}
					count++;
					if(count == 3){
						count = 0;
					}
			}
	
	}
		
	
		double win = (double)(NBR_ITERATIONS - lost)/NBR_ITERATIONS;
		System.out.println("Sannolikheten är "+ win);
	
	}
}
