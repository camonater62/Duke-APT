package APT2;

public class SandwichBar {
	
	public boolean contains(String[] arr, String key) {
		for(int i = 0; i < arr.length; i++)
			if(arr[i].equals(key))
				return true;
		return false;
	}
	
	public int whichOrder(String[] available, String[] orders) {
		int index = -1;
		
		for(int i = 0; index == -1 && i < orders.length; i++) {
			String o = orders[i];
			
			String[] ingredients = o.split(" ");
			int count = 0;
			
			for(String ing : ingredients) {
				if(contains(available, ing)) {
					count++;
				}
			}
			
			if(count == ingredients.length) {
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		String[] available = { "foo", "bar", "baz", "gazonk", "quux", "bat", "xyzzy",
				  "shme", "hukarz", "grault", "waldo", "bleh" };
		String[] orders = { "kalatehas", "spam eggs", "needle haystack", "bleh blarg", "plugh", 
		  "the best sandwich in the universe" };
		
		System.out.println(new SandwichBar().whichOrder(available, orders));
	}

}
