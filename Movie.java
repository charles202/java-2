//Charles Bejarano

//Charles Bejarano 

public class Movie extends Rental 
{
	public enum MovieType{BLUYRAY,DVD};
	private MovieType mType = MovieType.DVD; 



	public Movie()
	{ 
		super();
	}
	
	public Movie(String title, String rentalCode, double price, MovieType type) 
	{
		super(title, rentalCode, price); 
	}
	
	public void setMovieType(MovieType type)
	{
		this.mType = mType;
	}
	
	public MovieType getMovieType()
	{
		return mType; 
	}
	
	public String toString()
	{
		return(super.toString() + "Movie Type" + mType); 
	}
	
}
	
	