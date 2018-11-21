package uk.ac.belfastmet.dwarf.service;

import java.util.ArrayList;

import uk.ac.belfastmet.dwarf.domain.Dwarf; 

public class DwarfService {

	public DwarfService() {
		super();
	}
	
	public ArrayList<Dwarf> getDisneyDwarfs(){
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();

		
		Dwarf sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
		dwarfs.add(sleepy);
		Dwarf happy = new Dwarf("Happy", "Disney", "Happy.png");
		dwarfs.add(happy);
		Dwarf dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
		dwarfs.add(dopey);
		Dwarf bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
		dwarfs.add(bashful);
		Dwarf sneezy = new Dwarf("Sneezy", "Disney", "Sneezy.png");
		dwarfs.add(sneezy);
		Dwarf doc = new Dwarf("Doc", "Disney", "Doc.png");
		dwarfs.add(doc);
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
		dwarfs.add(grumpy);
		
			return dwarfs;
	}
	
	public ArrayList<Dwarf> getTolkienDwarfs(){
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();

		Dwarf thorin = new Dwarf("Thorin", "Tolkien", "Thorin.png");
		Dwarf balin = new Dwarf("Balin", "Tolkien", "Balin.png");
		Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "Dwalin.png");
		Dwarf fili = new Dwarf("Fili", "Tolkien", "Fili.png");
		Dwarf kili = new Dwarf("Kili", "Tolkien", "Kili.png");
		Dwarf dori = new Dwarf("Dori", "Tolkien", "Dori.png");
		Dwarf nori = new Dwarf("Nori", "Tolkien", "Nori.png");
		Dwarf ori = new Dwarf("Ori", "Tolkien", "Ori.png");
		Dwarf oin = new Dwarf("Oin", "Tolkien", "Oin.png");
		Dwarf gloin = new Dwarf("Gloin", "Tolkien", "Gloin.png");
		Dwarf bifur = new Dwarf("Bifur", "Tolkien", "Bifur.png");
		Dwarf bofur = new Dwarf("Bofur", "Tolkien", "Bofur.png");
		Dwarf Bombur = new Dwarf("Bombur", "Tolkien", "Bombur.png");

		dwarfs.add(thorin);
		dwarfs.add(balin);
		dwarfs.add(dwalin);
		dwarfs.add(fili);
		dwarfs.add(kili);
		dwarfs.add(dori);
		dwarfs.add(nori);
		dwarfs.add(ori);
		dwarfs.add(oin);
		dwarfs.add(gloin);
		dwarfs.add(bifur);
		dwarfs.add(bofur);
		dwarfs.add(Bombur);
		
		
		return dwarfs;
	}
	
}
