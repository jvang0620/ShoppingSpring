package Shopping;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * @version Spring 2022
 * @author ITCS 2214
 */
public class ShoppingListArrayListTest {

    //private ShoppingListArrayList instance;

    /**
     * Initialize instance and entries
     */
    @Before
    public void setupTestCases() {
        //instance = new ShoppingListArrayList();
    }

    /**
     * TODO To Complete the test of add method, of class ShoppingArray.
     */
    @Test
    public void testAdd() {
        // Create a new shopping list instance 
        ShoppingListArrayList instance = new ShoppingListArrayList();
        
        // Create grocery objects and a shopping list instance
        Grocery item1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);
        Grocery item2 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 2);
        System.out.println(item1.toString());
        System.out.println(item2.toString());
        // Initial state
        assertEquals(0, instance.size());
        assertFalse(instance.contains(item1));
        
        instance.add(item1);

        // TODO test the add method for the case of adding a new item (item1) into list instance.
        // Be sure that 
        // 1) size is increased by 1 and 
        // 2) the first item in the list is the same as in the reference variable, item1.
        






        
        // TODO test the "combine" feature of the add method
        // for the case of adding an existing entry (item2).
        // item2 has the same entry name as item1.
        
        // Be sure that 
        // 1) size is not changed and 
        // 2) quantities are properly changed in the first item in the list.
        







        
        // Test adding a null entry reference to the shopping list
        instance.add(null);
        assertEquals(1, instance.size());
        
        // Test creating and adding a new grocery object to the list
        // Be sure that
        // 1) the shopping list has a proper number of items and
        // 2) the list item in the list is the same as in the newly created grocery object
        
        Grocery item3 = new Grocery("Laugh in the Rains", "book", 3, 35.5f, 1);
        instance.add(item3);
        assertEquals(instance.size(), 2);
        
        try {        
            assertEquals(instance.find(1), item3);
        } catch(Exception testAdd3){
            testAdd3.printStackTrace();
        }
        
    }

    /**
     * TODO To Complete the test of remove method, of class ShoppingArrayList.
     */
    @Test
    public void testRemove() {
        // Construct an empty shopping list
        ShoppingListArrayList instance = new ShoppingListArrayList();
        
        // Create grocery objects
        Grocery item1 = new Grocery("Harry Potter", "book", 3, 15.5f, 2);
        Grocery item2 = new Grocery("Hunger Game", "book", 3, 10.5f, 3);
        Grocery item3 = new Grocery("Lucky Charms", "Cereal", 7, 3.99f, 1);
        
        // Add items to list
        instance.add(item1);
        instance.add(item2);
        instance.add(item3);
        assertEquals(instance.size(), 3);
        assertTrue(instance.contains(item1));
        assertTrue(instance.contains(item2));
        assertTrue(instance.contains(item3));

        // TODO test the remove method for an existing entry (remove item2)
        // Be sure that 
        // 1) You are removing item2
        // 2) the returned value from the remove method is true
        // 3) the shopping list is decreased by 1
        // 4) the item being removed can not be found in the shopping list
        







        // TODO test the remove method for a non-existing entry 
        // Be sure that 
        // 1) the returned value from the remove method is false
        // 2) the shopping list is not changed
        





        
        // Construct a case that the shopping list becomes empty
        try {
            instance.remove(item1);
            instance.remove(item3);
        } catch(Exception testRemove3){
            testRemove3.printStackTrace();
        }  
        
        // Test the remove method when the shopping list is empty
        try {
            assertFalse(instance.remove(item1));
            assertFalse(instance.remove(item2));
            assertFalse(instance.remove(item3));
        } catch(Exception testRemove4){
            testRemove4.printStackTrace();
        }  
        
    }

    /**
     * TODO To Complete the test of find method, of class ShoppingArrayList.
     */
    @Test
    public void testFind() {
        // Construct an empty shopping list
        ShoppingListArrayList instance = new ShoppingListArrayList();
        
        // Create grocery objects
        Grocery item1 = new Grocery("Harry Potter", "book", 3, 15.5f, 2);
        Grocery item2 = new Grocery("Hunger Game", "book", 3, 10.5f, 3);
        
        // TODO Test the case of finding a grocery object when the shopping list is empty
        // Be sure that
        // An EmptyCollectionException instance is thrown




        // Add items to the shopping list
        instance.add(item1);
        instance.add(item2);
        assertEquals(instance.size(), 2);
        
        // TODO Test the case of finding a grocery object which index is larger than the last shopping list index
        // Be sure that
        // An IndexOutOfBoundsException instance is thrown







        
        // Test the case of finding a grocery object which index is negative
        try{
            Grocery item = instance.find(-5);
        } catch (IndexOutOfBoundsException ex){
            assertTrue(1 == 1);
        } catch (Exception ex){
            assertTrue(0 == 1);
        }
        
        // Test the case of finding a regular grocery object
        try{
            Grocery item = instance.find(0);
            assertTrue(item1.compareTo(item) == 0);
        } catch (IndexOutOfBoundsException ex){
            assertTrue(0 == 1);
        } catch (EmptyCollectionException ex){
            assertTrue(0 == 1);
        } catch (Exception ex){
            assertTrue(0 == 1);
        }
    }

    /**
     * Test of indexOf method, of class ShoppingArrayList.
     */
    @Test
    public void testIndexOf() {
        // Construct an empty shopping list
        ShoppingListArrayList instance = new ShoppingListArrayList();
        
        //Create grocery objects
        Grocery item1 = new Grocery("Harry Potter", "book", 3, 15.5f, 2);
        Grocery item2 = new Grocery("Hunger Game", "book", 3, 10.5f, 3);
        
        // Check the indexOf method when the shopping list is empty
        try{
            int index = instance.indexOf(item1);
        } catch (ElementNotFoundException ex){
            assertTrue(1 == 1);
        } catch (Exception ex){
            assertTrue(0 == 1);
        }
        
        // Add grocery items into the shopping list
        instance.add(item1);
        instance.add(item2);
        
        // Check the indexOf method when the grocery item appears in the list
        try{
            int index = instance.indexOf(item2);
            assertTrue(1 == 1);
            assertTrue(index == 1);
            index = instance.indexOf(item1);
            assertTrue(1 == 1);
            assertTrue(index == 0);
        } catch (ElementNotFoundException ex){
            assertTrue(0 == 1);
        } catch (Exception ex){
            assertTrue(0 == 1);
        }
        
        // Check the indexOf method when the grocery item does not appear in the list
        try{
            Grocery item3 = new Grocery("Aladin", "book", 3, 
                15.5f, 2);
            int index = instance.indexOf(item3);
        } catch (ElementNotFoundException ex){
            assertTrue(1 == 1);
        } catch (Exception ex){
            assertTrue(0 == 1);
        }
        
        // Check the indexOf method when the grocery item is null
        try{
            Grocery obj = null;
            int index = instance.indexOf(obj);
        } catch (ElementNotFoundException ex){
            assertTrue(1 == 1);
        } catch (Exception ex){
            ex.printStackTrace();
            assertTrue(0 == 1);
        }
    }

    /**
     * Test of contains method, of class ShoppingArrayList.
     */
    @Test
    public void testContains() {
        // Construct a shopping list
        ShoppingListArrayList instance = new ShoppingListArrayList();
        
        //Create grocery objects
        Grocery item1 = new Grocery("Harry Potter", "book", 3, 15.5f, 2);
        Grocery item2 = new Grocery("Hunger Game", "book", 3, 10.5f, 3);

        // Check the contains method when the shopping list is empty
        boolean isTrue = instance.contains(item1);
        assertFalse(isTrue);
        
        // Add grocery items into the shopping list
        instance.add(item1);
        instance.add(item2);
        
        // Check the contains method when the grocery item appears in the list
        isTrue = instance.contains(item2);
        assertTrue(isTrue);
        
        // Check the contains method when the grocery item does not appear in the list
        Grocery item3 = new Grocery("Aladin", "book", 3, 15.5f, 2);
        assertFalse(instance.contains(item3));
        
        // Check the contains method when the grocery item is null
        Grocery obj = null;
        isTrue = instance.contains(obj);
        assertFalse(isTrue);
    }

    /**
     * Test of size method, of class ShoppingArrayList.
     */
    @Test
    public void testSize() {
        // Construct a shopping list
        ShoppingListArrayList instance = new ShoppingListArrayList();
        
        //Create grocery object
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);

        assertEquals(0, instance.size());

        instance.add(entry1);

        // Test increment
        assertEquals(1, instance.size());

        assertTrue(instance.remove(entry1));

        // Test decrement
        assertEquals(0, instance.size());
    }

    /**
     * Test of isEmpty method, of class ShoppingArrayList.
     */
    @Test
    public void testIsEmpty() {
        // Construct a shopping list
        ShoppingListArrayList instance = new ShoppingListArrayList();
        
        //Create grocery object
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);

        // Test empty
        assertTrue(instance.isEmpty());

        instance.add(entry1);

        // Test not empty
        assertFalse(instance.isEmpty());
    }
}