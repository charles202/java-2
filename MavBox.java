//Charles Bejarano

import java.util.ArrayList;

public class MavBox
{
		private ArrayList<Customer> customerList = new ArrayList<Customer>();
		private ArrayList<Movie> movieList = new ArrayList<Movie>();
		private ArrayList<Game> gameList = new ArrayList<Game>();

		public MavBox()

		{

		}


		public ArrayList<Customer> getCustomerList()
		{
			return customerList;
		}

		public ArrayList<Movie> getMovieList()
		{
			return movieList;
		}

		public ArrayList<Game> getGameList()
		{
			return gameList;
		}

		// same error with these methods
		public void addCustomer(Customer customer)
		{
			this.customerList = customerList;
		}

		public void addMovie(Movie movie)
		{
			this.movieList = movieList;
		}

		public void addGame(Game game)
		{
			this.gameList = gameList;
		}

		public String toString()
		{
			return("Customer" + customerList + "Movie" + movieList + "Game" + gameList);
		}

}
