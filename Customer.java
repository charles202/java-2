//Charles Bejarano

import java.util.ArrayList;

public class Customer
{
		private String name;
		private String creditCardNumber;
		private ArrayList<Rental> rentalList = new ArrayList<Rental>();

		public Customer()
		{
			setName("");
			setCreditCardNumber("");
		}

		public Customer(String name, String creditCardNumber)
		{
			setName(name);
			setCreditCardNumber(creditCardNumber);
		}

		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public String getCreditCardNumber()
		{
			return creditCardNumber;
		}

		public void setCreditCardNumber(String creditCardNumber)
		{
			this.creditCardNumber = creditCardNumber;
		}

		public ArrayList<Rental> getRentalList()
		{
			return rentalList;
		}

		public void addRental(Rental rental)
		{
			this.rentalList = rentalList;  //youre not adding to the ArrayList
			//  use .add();
		}

		public String toString()
		{
			return("Name" + name + "Credit Card Number" + creditCardNumber + "Rental" + rentalList);
		}

}
