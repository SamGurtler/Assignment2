package cse360assign2;

/**
 * @version 2
 * @author Sam Gurtler Assignment #2 Class ID: 417 
 * This is a simple list that can 
 * 1. increase its size by 50% if full
 * 2. reduce the list size if more than 25% empty
 * 3. add elements to the front and back.
 */
public class SimpleList {
	private int[] list;
	private int count;

	/**
	 * a constructor for a Simple list, with no elements thus a count of 0 and a max
	 * of 10 elements.
	 */
	public SimpleList() {
		list = new int[10];
		count = 0;
	}

	/**
	 * @param element adds this element to the front of the list and increases list
	 *                by 50% if full.
	 */
	public void add(int element) {
		count++;
		if (list.length > count) {
			for (int x = count - 1; x > 0; x--)
				list[x] = list[x - 1];
			list[0] = element;
		} else {
			int[] temp = new int[((int) (1.5 * list.length) /*+ (list.length % 2 == 0 ? 0 : 1)*/)];
			for (int x = count - 2; x >= 0; x--) {
				temp[x + 1] = list[x];
			}
			temp[0] = element;
			list = temp;

		}
	}

	/**
	 * if element is removed and list is more than 25% empty, the list size is
	 * reduced.
	 * 
	 * @param element removes the first occurrence of this element if it exist in
	 *                the list and then decrements the count.
	 */
	public void remove(int element) {
		int requirement = (3 * list.length);
		requirement = requirement / 4 /*+ (requirement % 4 == 0 ? 0 : 1)*/;
		if (count < requirement && count != 0) {
			for (int x = 0; x < count; x++) {
				if (element == list[x]) {
					int[] temp = new int[requirement];
					for (int y = x; y < count; y++) {
						temp[y] = list[y + 1];
					}
					for (int y = 0; y < x; y++) {
						temp[y] = list[y];
					}
					list = temp;
					count--;
					break;
				}
			}
		} else {
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
	 * @param element is the int that this method is goint to be looking for inside
	 *                the SimpleList
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

	/**
	 * @param element is appended to the end of the list, incrementing the counter
	 *                and if the list was already full expanding it
	 */
	public void append(int element) {
		count++;
		if (list.length > count) {
			list[count - 1] = element;
		} else {
			int[] temp = new int[((int) (1.5 * list.length) /*+ (list.length % 2 == 0 ? 0 : 1)*/)];
			for (int x = 0; x < count - 1; x++) {
				temp[x] = list[x];
			}
			temp[count - 1] = element;
			list = temp;
		}
	}

	/**
	 * @return the current number of possible locations in list.
	 */
	public int size() {
		return list.length;
	}

	/**
	 * @return the first element of the list if it exist otherwise -1.
	 */
	public int first() {
		return count > 0 ? list[0] : -1;
	}

	/**
	 * @return if the list is empty -1 otherwise the last element of the list.
	 */
	public int last() {
		return count > 0 ? list[count - 1] : -1;
	}
}