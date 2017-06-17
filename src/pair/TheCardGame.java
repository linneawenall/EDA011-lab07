package pair;

public class TheCardGame {
	private PairSequence game = new PairSequence (4,13);

	public static void main(String[] args) {
		
	}
	
	public boolean start(){
		int count = 1;
		while (game.more()){
			if(game.pick().second()==count){
				System.out.println("You lost");
				return false;
			}
			if(count >= 3){
				count = 1;
			}
		}
		System.out.println("Korten är slut så spelet är slut.");
		return true;
	}

	}


