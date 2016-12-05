import java.util.ArrayList;
import java.util.Random;



public class Deck {
	public static void main(String[] args) {}
		
		private ArrayList<Card> cards;
		
		public ArrayList<Card> usedCard;
		private ArrayList<Card> openCard; 
		
		public int nUsed=0;
		public Deck(int nDeck){
			cards=new ArrayList<Card>();
			
			
			
			for(int x=0;x<nDeck;x++)
			{
				for(Card.Suit s : Card.Suit.values())
				{
					for(int j=1;j<=13;j++)
					{
						
						Card c=new Card(s,j);
						cards.add(c);					
					}
				}
			}
			
			
			
			//1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
			//Hint: Use new Card(x,y) and 3 for loops to add card into deck
			//Sample code start
			//Card card=new Card(1,1); ->means new card as clubs ace
			//cards.add(card);
			//Sample code end

		}	
		//TODO: Please implement the method to print all cards on screen
		public Card getOneCard(boolean isOpened)
		{
			
			usedCard=new ArrayList<Card>();
			openCard=new ArrayList<Card>();
			if(nUsed==0)
			{
				shuffle();
			}
			if(nUsed==52)
			{
				shuffle();
			}
			
			Card getz=cards.get(nUsed);
			nUsed++;
			usedCard.add(getz);
			if(isOpened)
			{
				openCard.add(getz);
			}
			
			return getz ;
		}
		public ArrayList<Card> getOpenedCard() 
		{
			return openCard;
		}
		public void shuffle()
		{
			usedCard.clear();
			openCard.clear();
			nUsed =0;
						
			Random rnd = new Random();
			int r;			
			for(int i=0;i<52;i++)
			{
				r= rnd.nextInt(52);
				Card temp=cards.get(i);
				cards.set(i, cards.get(r));
				cards.set(r,temp);
			}
			
			
			
			
		}
		public void printDeck(){
			
			for(Card x:cards)
			{
				x.printCard();
			}
					
			//Hint: print all items in ArrayList<Card> cards, 
			//please implement and reuse printCard method in Card class
			
		}
		public ArrayList<Card> getAllCards(){
			return cards;
		}
		
	}
