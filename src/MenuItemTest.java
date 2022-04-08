import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**Class: MenuItemTest.java
 * @author Miranda Darlington
 * @version 1.0
 * Written: Apr 4, 2022
 * 
 *This class- !!!!!!
 **/

class MenuItemTest
{
	
	@Test
	void createEmptyArrayList()
	{
		//fail("Not yet implemented");
		Menu unem = new Menu(new ArrayList<MenuItem>());
		assert(unem != null && unem.getNewMenu().size() == 0);
		
//		assertEquals(list("Hamburger","Entree", 8.99, "A half pound burger on a bun.") );
	}
	
	@Test
	void putEntryInArrayList()
	{
		Menu unem = new Menu(new ArrayList<MenuItem>());
		unem.getNewMenu().add(new MenuItem("Hamburger","Entree", 8.99, "A half pound burger on a bun."));
		
		assert(unem != null && unem.getNewMenu().size() > 0);
	}


}
