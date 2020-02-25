package cse360assign2;
/**
 * @author Sam Gurtler
 * Assignment #1
 * Class ID: 417
 * This is a simple list that can hold 10 int's at a time and can only add to the front.
 */
public class SimpleList {
	private int[] list;
	private int count;

	
	/**
	 * a constructor for a Simple list, with no elements thus a count of 0 and a max of 10 elements.  
	 */
	public SimpleList() {
		list = new int[10];
		count = 0;
	}

	/**
	 * @param element adds this element to the front of the list and drops any element move past index 9.
	 */
	public void add(int element) {
		if (list.length> count)count++;
		for (int x = count-1; x > 0; x--) {
			list[x] = list[x - 1];
		}
		list[0] = element;
	}

	/**
	 * @param element removes the first occurrence of this element if it exist in the list and then decrements the count. 
	 */
	public void remove(int element) {
		for (int x = 0; x < count; x++) {
			if (element == list[x]) {
				for (int y = x; y < count; y++) {
					list[y] = list[y + 1];
				}
				count--;
				break;
			}

		}
	}
	
	/**
	 * @return the amount of elements in the list.
	 */
	public int count() {
		return count;
	}

	/**
	 * @return the list as a string of int's separated by one space each.
	 */
	public String toString() {
		String result = count > 0 ? "" + list[0] : "";
		for (int x = 1; x < count; x++)
			result += " " + list[x];
		return result;
	}

	/**
	 * @param element is the int that this method is goint to be looking for inside the SimpleList
	 * @return the index of the first occurrence of the element if it exist else -1.
	 */
	public int search(int element) {
		int index = -1;
		for (int x = 0; x < count && index == -1; x++) {
			if (list[x] == element)
				index = x;
		}
		return index;
	}
}
