import java.util.InputMismatchException;

/**Class: MenuItem.java
 * @author Miranda Darlington
 * @version 1.0
 * Written: Apr 4, 2022
 * 
 *This class- Creates the menuitem objects
 **/

public class MenuItem
{
	private String foodName;
	private String category;
	private double price;
	private String desc;
	
	
	
	/**
	 * @param foodName
	 * @param category
	 * @param price
	 * @param desc
	 */
	public MenuItem(String foodName, String category, double price, String desc)
	{
		super();
		this.foodName = foodName;
		this.category = category;
		this.price = price;
		this.desc = desc;
	}

	public MenuItem()
	{}

	/**
	 *Getter Method for foodName
	 * 
	 *@return the foodName
	 */
	public String getFoodName()
	{
		return foodName;
	}

	/**
	 * @param foodName the foodName to set
	 */
	public void setFoodName(String foodName)
	{
		this.foodName = foodName;
	}

	/**
	 *Getter Method for category
	 * 
	 *@return the category
	 */
	public String getCategory()
	{
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category)
	{
		this.category = category;
	}

	/**
	 *Getter Method for price
	 * 
	 *@return the price
	 */
	public double getPrice()
	{
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price)
	{
			this.price = price;
	}

	/**
	 *Getter Method for desc
	 * 
	 *@return the desc
	 */
	public String getDesc()
	{
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc)
	{
		this.desc = desc;
	}

	@Override
	public String toString()
	{
		return category + ": " + foodName + "; " + price + "\n" + desc + "\n"; 
	}
	
	

}
