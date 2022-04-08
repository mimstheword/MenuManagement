import java.util.ArrayList;

/**Class: Menu.java
 * @author Miranda Darlington
 * @version 1.0
 * Written: Apr 4, 2022
 * 
 *This class- !!!!!!
 **/

public class Menu
{
	private ArrayList<MenuItem> newMenu;

	/**
	 * @param newMenu
	 */
	public Menu(ArrayList<MenuItem> newMenu)
	{
		super();
		this.newMenu = newMenu;
	}

	/**
	 *Getter Method for newMenu
	 * 
	 *@return the newMenu
	 */
	public ArrayList<MenuItem> getNewMenu()
	{
		return newMenu;
	}

	/**
	 * @param newMenu the newMenu to set
	 */
	public void setNewMenu(ArrayList<MenuItem> newMenu)
	{
		this.newMenu = newMenu;
	}

	@Override
	public String toString()
	{
		return "This menu is as followed:\n" + newMenu;
	}
	
	


}
