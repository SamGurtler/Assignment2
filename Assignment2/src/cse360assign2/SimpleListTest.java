package cse360assign2;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * @version 2
 * @author Sam Gurtler
 * Assignment #2
 * Class ID: 417
 * This is a JUnit to test {@docRoot SimpleList} that can add to the front and back as well as shrink and expand as needed.
 */
class SimpleListTest {

	/*
	 * test to see if the constructor returns a null value.
	 */
	@Test
	void testSimpleList() {
		SimpleList teste = new SimpleList();
		assertNotNull(teste);
	}

	/*
	 * test to see if count starts at 0 in an empty list.
	 */
	@Test
	void testCount() {
		SimpleList teste = new SimpleList();
		assertEquals(0, teste.count());
	}

	/*
	 * test to see if SimpleList's add method increments count when adding
	 */
	@Test
	void testadd() {
		SimpleList teste = new SimpleList();
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
		teste.add(3);
		teste.add(3);
		teste.add(3);
		teste.add(3);
		assertEquals(16, teste.count());
	}

	/*
	 * test to see if list size is expanded by 50% when an element is added to the
	 * list when full.
	 */
	@Test
	void testaddSize() {
		SimpleList teste = new SimpleList();
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
		teste.add(3);
		teste.add(3);
		teste.add(3);
		teste.add(3);
		assertEquals(22, teste.size());
	}

	/*
	 * test to see if remove removes only the first occurrence of an element in a
	 * SimpleList and only then decrements the counter.
	 */
	@Test
	void testremove() {
		SimpleList teste = new SimpleList();
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
		teste.add(3);
		teste.add(3);
		teste.add(3);
		teste.add(3);
		teste.remove(2);
		teste.remove(2);
		teste.remove(2);
		teste.remove(3);
		teste.remove(3);
		teste.remove(3);
		assertEquals(10, teste.count());
	}

	/*
	 * test to see if remove reduces the size of its list when the list before
	 * removal is more than 25% empty and an element is removed.
	 */
	@Test
	void testremoveSize() {
		SimpleList teste = new SimpleList();
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
		teste.add(3);
		teste.add(3);
		teste.add(3);
		teste.add(3);
		teste.remove(2);
		teste.remove(2);
		teste.remove(2);
		teste.remove(3);
		assertEquals(16, teste.size());
	}

	/*
	 * test to see if size will always be greater than 0 by filling up the list to
	 * right before it expands and then removing all elements.
	 */
	@Test
	void testremoveSizeMin() {
		SimpleList teste = new SimpleList();
		teste.add(1);
		teste.add(2);
		teste.add(3);
		teste.add(4);
		teste.add(5);
		teste.add(6);
		teste.add(7);
		teste.add(8);
		teste.add(9);
		teste.add(10);
		teste.add(11);
		teste.remove(1);
		teste.remove(2);
		teste.remove(3);
		teste.remove(4);
		teste.remove(5);
		teste.remove(6);
		teste.remove(7);
		teste.remove(8);
		teste.remove(9);
		teste.remove(10);
		assertEquals(3, teste.size());
	}

	/*
	 * test to see if append 1. is used that the list does not fill up 2. increments
	 * the count correctly via toString 3. appends elements to the end of the list
	 * via toString
	 */
	@Test
	void testappend() {
		SimpleList teste = new SimpleList();
		teste.append(1);
		teste.append(2);
		teste.append(3);
		teste.append(4);
		teste.append(5);
		teste.append(6);
		teste.append(7);
		teste.append(8);
		teste.append(9);
		teste.append(10);
		teste.append(11);
		assertEquals("1 2 3 4 5 6 7 8 9 10 11", teste.toString());
	}

	/*
	 * test to see if append grows the list size by 50% when the list is full and an
	 * element is appended to it
	 */
	@Test
	void testappendSize() {
		SimpleList teste = new SimpleList();
		teste.append(1);
		teste.append(2);
		teste.append(3);
		teste.append(4);
		teste.append(5);
		teste.append(6);
		teste.append(7);
		teste.append(8);
		teste.append(9);
		teste.append(10);
		teste.append(11);
		assertEquals(15, teste.size());
	}

	/*
	 * test to see if toString returns a string of all elements each with spaces in
	 * between them and not at the end.
	 */
	@Test
	void testtoString() {
		SimpleList teste = new SimpleList();
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
		teste.add(3);
		teste.add(3);
		teste.add(3);
		teste.add(3);
		assertEquals("3 3 3 3 3 1 2 3 1 2 3 1 2 3 1 2", teste.toString());
	}

	/*
	 * test to see if search can return the index of the first occurrence of an
	 * element that exist in the SimpleList.
	 */
	@Test
	void testSearch() {
		SimpleList teste = new SimpleList();
		teste.add(2);
		teste.add(1);
		teste.add(3);
		teste.add(3);
		assertEquals(0, teste.search(3));
	}

	/*
	 * test to see if search returns -1 when an element does not exist in caller
	 * SimpleList.
	 */
	@Test
	void testSearchNotfound() {
		SimpleList teste = new SimpleList();
		teste.add(2);
		teste.add(1);
		teste.add(3);
		assertEquals(-1, teste.search(4));
	}

	/*
	 * test to see if first element of an empty list returns -1
	 */
	@Test
	void testfirstEmptyList() {
		SimpleList teste = new SimpleList();
		assertEquals(-1, teste.first());
	}
	/*
	 * test to see if first returns element at index 0 when this is not empty.
	 */
	@Test
	void testfirst() {
		SimpleList teste = new SimpleList();
		teste.add(1);
		teste.append(2);
		assertEquals(1, teste.first());
	}

	/*
	 * test to see if last element of an empty list returns -1
	 */
	@Test
	void testlastEmptyList() {
		SimpleList teste = new SimpleList();
		assertEquals(-1, teste.last());
	}
	
	/*
	 * test to see if last returns the farthest non-zero element from the start of the list. 
	 */
	@Test
	void testlast() {
		SimpleList teste = new SimpleList();
		teste.add(1);
		teste.append(2);
		assertEquals(2, teste.last());
	}
}
