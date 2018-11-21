import java.util.ArrayList;

public class DwarfsAndDwarves {

	public static void main(String[] args) {
	
  

		ArrayList<String> dwarfs = new ArrayList<String>();
		dwarfs.add("Sneezy");
		dwarfs.add("Bashful");
		dwarfs.add("Dopey");
		dwarfs.add("Sleepy");
		dwarfs.add("Happy");
		dwarfs.add("Grumpy");
		dwarfs.add("Doc");
		System.out.println("List of Dwarfs:");
		for(String dwarf:dwarfs) {
			System.out.println(dwarf);
		}
		
		
		ArrayList<String> dwarves = new ArrayList<String>();
		dwarves.add("Dwalin");
		dwarves.add("Balin");
		dwarves.add("Ori");
		dwarves.add("Dori");
		dwarves.add("Nori");
		dwarves.add("Bifur");
		dwarves.add("Bofur");
		dwarves.add("Kili");
		dwarves.add("Fili");
		dwarves.add("Oin");
		dwarves.add("Gloin");
		dwarves.add("Bombur");
		dwarves.add("Thorin");
		for(String dwarve:dwarves) {
			System.out.println(dwarve);
		}
	}
}
