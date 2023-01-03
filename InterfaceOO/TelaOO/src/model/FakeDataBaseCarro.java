package model;

import java.util.ArrayList;


public class FakeDataBaseCarro {
	
	private ArrayList<Carro> db = new ArrayList<>();
	
	public FakeDataBaseCarro() {
		db.add(new Carro(1, "Audi", 0, null, null, null, 0));
		db.add(new Carro(2, "BMW", 0, null, null, null, 0));
		db.add(new Carro(2, "CHEVROLET", 0, null, null, null, 0));
		
	}
	
	public ArrayList<Carro> all(){
		return db;
	}
	
}
