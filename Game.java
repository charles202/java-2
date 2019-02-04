//Charles Bejarano

public class Game extends Rental
{
	public enum GameType{XBOX,PLAYSTATION,NINTENDO};
	private GameType gType = GameType.XBOX;

	public Game()
	{
		super();
		setGameType(gType);
	}

	public Game(String title, String rentalCode, double price, GameType type)
	{
		super(title, rentalCode, price);
		setGameType(type);
	
	}

	public void setGameType(GameType type)
	{
		this.gType = type;
	}

	public GameType getGameType()
	{
		return gType;
	}

	public String toString()
	{
		return(super.toString() + "Game Type" + gType);
	}

}
