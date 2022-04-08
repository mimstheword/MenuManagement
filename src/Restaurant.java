/**Class: Restaurant.java
 * @author Miranda Darlington
 * @version 1.0
 * Written: Apr 8, 2022
 * 
 *This class- Creates Restaurant objects that will have multiple menus. MenuItem names cannot be repeated.
 **/

public class Restaurant
{
	private Menu aMenu;

	/**
	 * @param aMenu
	 */
	public Restaurant(Menu aMenu)
	{
		super();
		this.aMenu = aMenu;
	}

	/**
	 *Getter Method for aMenu
	 * 
	 *@return the aMenu
	 */
	public Menu getaMenu()
	{
		return aMenu;
	}

	/**
	 * @param aMenu the aMenu to set
	 */
	public void setaMenu(Menu aMenu)
	{
		this.aMenu = aMenu;
	}

	@Override
	public String toString()
	{
		return "Restaurant [aMenu=" + aMenu + "]";
	}
	
	

}
