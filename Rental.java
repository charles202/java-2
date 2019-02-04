//Charles Bejarano

public class Rental 
{
		private String title;
		private String rentalCode; 
		private double price; 
		
		public Rental()
		{
			setTitle("");
			setRentalCode("");
			setPrice(0.0); 
		}
		
		public Rental(String title, String rentalCode, double price)
		{	
			setTitle(title);
			setRentalCode(rentalCode);
			setPrice(price); 
		}
		
		public String getTitle()
		{
			return title;
		}
		
		public void setTitle(String title)
		{
			this.title = title;
		}
		
		public String getRentalCode()
		{
			return rentalCode;
		}
		
		public void setRentalCode(String rentalCode)
		{
			this.rentalCode = rentalCode;
		}
		
		public double getPrice()
		{
			return price;
		}
		
		public void setPrice(double price)
		{
			this.price = price;
		}
		
		public String toString()
		{	return("Title" + title + "Rental Code" + rentalCode + "Price" + price);
		
		}
		
}
			
			
			
			
			
			
		
		
			