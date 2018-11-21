import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Toy woody = new Toy("woody", "Tom", "Hanks");
		Toy buzz = new Toy("buzz", "Tim", "Allen");
		Toy slinky = new Toy("slinky", "Jim", "Varney");
		Toy ham = new Toy("ham", "John", "Ratzenberger");
		Toy rex = new Toy("rex", "Wallace", "Shawn");
		Toy mrPotatoHead = new Toy("mrPotatoHead", "Don", "Rickles");
		
		ArrayList<Toy> toys = new ArrayList<Toy>();

		toys.add(woody);
		toys.add(buzz);
		toys.add(slinky);
		toys.add(ham);
		toys.add(rex);
		toys.add(mrPotatoHead);

		for (Toy toy : toys) {
			System.out.printf("Toy name: %s, Actor: %s %s\n",toy.gettoyName(), toy.getfirstName(), toy.getlastName());
		}

	}

}
