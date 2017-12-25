
public class cardGame {

	public static void main(String[] args) {
		
		cardSet cardPack = new cardSet();
		cardPack.makePack();
	}

}

 class cardSet {
	String[] set = {"Ace", "2", "3","4","5","6","7","8","9","10","Jack","Queen","King"};
	String[] suite = {"Diamonds","Spades","Hearts","Clubs"};
	
	String[] pack = new String[52];
	
	void makePack () {
		for(int i=0; i<4; i++) {
			for(int x=0; x<13; x++) {
				pack[x]=(set[x]+" of "+suite[i]);
				System.out.println(pack[x]);
			}
		}
	}
}