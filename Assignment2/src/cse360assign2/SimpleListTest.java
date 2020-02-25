package cse360assign2;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
/*
 * @author Sam Gurtler
 * Assignment #1
 * Class ID: 417
 * This is a JUnit to test {@docRoot SimpleList} that can hold 10 int's at a time and can only add to the front.
 */
class SimpleListTest {
	
	/*
	 * test to see if the constructor returns a null value. 
	 */
	@Test
	void testSimpleList() {
		SimpleList teste=new SimpleList();
		assertNotNull(teste);
	}
	/*
	 * test to see if count starts at 0 in an empty list. 
	 */
	@Test
	void testCount() {
		SimpleList teste=new SimpleList();
		assertEquals(0,teste.count());
	}
	/*
	 * test to see if SimpleList's add method increments count when adding
	 */
	@Test
	void testadd(){
		SimpleList teste=new SimpleList();
		teste.add(2);
		teste.add(1);
		teste.add(3);
		teste.add(2);
		teste.add(1);
		teste.add(3);
		teste.add(2);
		teste.add(1);
		teste.add(3);
		teste.add(2);
		teste.add(1);
		teste.add(3);
		assertEquals(10,teste.count());
	}
	/*
	 * test to see if remove removes only the first occurrence of an element in a SimpleList and only then decrements the counter.
	 */
	@Test
	void testremove(){
		SimpleList teste=new SimpleList();
		teste.add(2);
		teste.add(1);
		teste.add(3);
		teste.add(3);
		teste.remove(2);
		teste.remove(0);
		teste.remove(0);
		teste.remove(3);
		teste.remove(4);
		assertEquals(2,teste.count());
	}
	/*
	 * test to see if toString returns a string of all elements each with spaces in between them and not at the end. 
	 */
	@Test
	void testtoString(){
		SimpleList teste=new SimpleList();
		teste.add(2);
		teste.add(1);
		teste.add(3);
		assertEquals("3 1 2",teste.toString());
	}
	/*
	 * test to see if search can return the index of the first occurence of an element that exist in the SimpleList.
	 */
	@Test
	void testSearch() {
		SimpleList teste=new SimpleList();
		teste.add(2);
		teste.add(1);
		teste.add(3);
		teste.add(3);
		assertEquals(0,teste.search(3));
	}
	/*
	 * test to see if search returns -1 when an element does not exist in caller SimpleList. 
	 */
	@Test
	void testSearchNotfound() {
		SimpleList teste=new SimpleList();
		teste.add(2);
		teste.add(1);
		teste.add(3);
		assertEquals(-1,teste.search(4));
	}
}
