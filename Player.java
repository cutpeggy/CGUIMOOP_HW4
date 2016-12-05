import java.util.ArrayList;

public class Player {
	private String name;
	private int chips;
	private int bet=0; 
	private ArrayList<Card> oneRoundCard;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	
	public Player(String name, int chips)
	{
		this.name=name;
		this.chips=chips;
	}
	public String get_name() 
	{
		return name;
	}
	public int make_bet()
	{
		bet=1;
		return bet;
	}
	public void setOneRoundCard(ArrayList<Card> cards) 
	{
		oneRoundCard=new ArrayList<Card>();
		oneRoundCard=cards;
	}
	
	public boolean hit_me() 
	{
		int value=getTotalValue();
		boolean x;
		if(value<=16)
		{
			x=true;
		}
		else
		{
			x=false;
		}
		
		return x;
		
		
	}
	public int getTotalValue() 
	{
		int totalnum= 0;
		for (Card c : oneRoundCard) 
		{
			if (c.getRank() == 11 || c.getRank() == 12 || c.getRank() == 13)
			{
				totalnum += 10;
			}		
			else
			{
				totalnum += c.getRank();
			}		
		}
		
		return totalnum;
	}
	
	public int get_current_chips()
	{
		return chips;
	}
	public void increase_chips (int diff)
	{
		chips+=diff;
	}
	
	public void say_hello()
	{
		System.out.println("Hello, I am " + name + "."); 
		System.out.println("I have " + chips + " chips.");
	}

}
