import java.util.ArrayList;

/**Class: Restaurant.java
 * @author Miranda Darlington
 * @version 1.0
 * Written: Apr 8, 2022
 * 
 *This class- Creates Restaurant objects that will have multiple menus. MenuItem names cannot be repeated.
 **/

public class Restaurant
{
	private ArrayList<Menu> aMenu;

	/**
	 * @param aMenu
	 */
	public Restaurant(ArrayList<Menu> aMenu)
	{
		super();
		this.aMenu = aMenu;
	}

	

	/**
	 *Getter Method for aMenu
	 * 
	 *@return the aMenu
	 */
	public ArrayList<Menu> getaMenu()
	{
		return aMenu;
	}



	/**
	 * @param aMenu the aMenu to set
	 */
	public void setaMenu(ArrayList<Menu> aMenu)
	{
		this.aMenu = aMenu;
	}



	@Override
	public String toString()
	{
		return "Welcome to Restaurant Bespaunt. Please have a look at our menus:\n" + aMenu;
	}
	
	
	/**
	 * main method to test that this works
	 * 
	 * @param 
	 */
	public static void main(String[] args)
	{
		
		//create an instance of Restaurant
		Restaurant rest = new Restaurant(new ArrayList<Menu>());
		rest.getaMenu().add(new Menu(new ArrayList<MenuItem>()));
		rest.getaMenu().get(0).getNewMenu().add(new MenuItem("Grilled Cheese","Entree", 6.99, "Two peices of bread toasted with a slice of American cheese  in the middle."));		
		rest.getaMenu().add(new Menu(new ArrayList<MenuItem>()));
		rest.getaMenu().get(0).getNewMenu().add(new MenuItem("Vanilla Ice Cream","Dessert", 4.75, "Our creamest ice cream served with a cookie and chocolate syrup"));
		
//		rest.getaMenu().add(new Menu(new ArrayList<MenuItem>()));
//		rest.getaMenu().get(0).getNewMenu().add(new MenuItem("Strawberry Shortcake","Dessert", 6.00, "Angel food cake with a tastly blend of whipped cream and freshly slicced stawberries"));		
//		rest.getaMenu().get(1).getNewMenu().add(new MenuItem("Peach Tea","Drink", 2.50, "Freshly brewed black tea infused with peach nectar. Served over ice."));
		
		//rest.getaMenu().getNewMenu().add(new MenuItem("Vanilla Ice Cream","Dessert", 4.75, "Our creamest ice cream served with a cookie and chocolate syrup"));
		
		System.out.println(rest);
//		.add(new Menu(new MenuItem("Grilled Cheese","Entree", 6.99, "Two peices of bread toasted with a slice of American cheese  in the middle.")));
	}
	
	

}
