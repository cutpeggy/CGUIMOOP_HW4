
public class Card {
	public static void main(String[] args) {}
		public enum Suit{Club,Diamond,Heart,Spade};
		private Suit suit; //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
		private int rank; //1~13
		public Card(Suit s,int value){
			suit=s;
			rank=value;
		}	
		
		public void printCard(){
			
				
			System.out.println(suit+","+rank);
				
				
			
		}
		public Suit getSuit(){
			return suit;
		}
		public int getRank(){
			return rank;
		}
	}