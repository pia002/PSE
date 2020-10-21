package com.hwrprojekt.jsf.jdbc;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Pizza {

	//Variablen für das Objekt Pizza initialisieren
	private int Pizza_ID;
	private String Pizzaname;
	private String Besch_en;
	private String Besch_de;
	private double Preis;
	
	final static int ungueltige_signatur = -1;

	
	//Objekt Pizza erstellen
	public Pizza() {
	}
	//Objekt Pizza erstellen
	public Pizza(int Pizza_ID, String Pizzaname, String Besch_en, String Besch_de, double Preis) {
		this.Pizza_ID = Pizza_ID;
		this.Pizzaname = Pizzaname;
		this.Besch_en = Besch_en;
		this.Besch_de = Besch_de;
		this.Preis = Preis;

	}
	// Getter-/ Settermethode für jede Variable, um Wert aufrufen zu können (da privat)
	public int getPizza_ID() {
		return Pizza_ID;
	}

	public void setPizza_ID(int Pizza_ID) {
		this.Pizza_ID = Pizza_ID;
	}

	public String getPizzaname() {
		return Pizzaname;
	}

	public void setPizzaname(String Pizzaname) {
		this.Pizzaname = Pizzaname;
	}
	
	public String getBesch_en() {
		return Besch_en;
	}

	public void setBesch_en(String Besch_en) {
		this.Besch_en = Besch_en;
	}

	public String getBesch_de() {
		return Besch_de;
	}

	public void setBesch_de(String Besch_de) {
		this.Besch_de = Besch_de;
	}

	@Override
	public String toString() {
		return "Pizza [Pizza_ID=" + Pizza_ID + "Pizzaname="+Pizzaname + " Besch_en=" + Besch_en + ", Besch_de=" + Besch_de
				+ "Preis=" + Preis + "]";
	}

	public double getPreis() {
		return Preis;
	}

	public void setPreis(double Preis) {
		this.Preis = Preis;
	}

}
