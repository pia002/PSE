package com.hwrprojekt.jsf.jdbc;

import java.sql.ResultSet;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
@ManagedBean
public class Kunde {
// Initialisierung der Variablen für das Objekt Kunde
	private String Name           = "";
    private String Email   		  = "";
    private String Vorname        = "";
    private String Strasse        = "";
    private int Hausnummer        = 0;
    private String Stadt            = "";
    private long Telefonnummer     = 0L;

// Erstellen des Objektes Kunde
	public Kunde() {
	}
	// Erstellen des Objektes Kunde
	public Kunde(String Email, String Vorname, String Name, String Strasse, int Hausnummer, String Stadt, long Telefonnummer ) {
		this.Email = Email;
		this.Vorname = Vorname;
		this.Name = Name;
		this.Strasse = Strasse;
		this.Hausnummer = Hausnummer;
		this.Telefonnummer = Telefonnummer;
		this.Stadt = Stadt;

	}

// Getter-/ Settermethode für jede Variable, um Wert aufrufen zu können (da privat)
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	public String getStrasse() {
		return Strasse;
	}

	public void setStrasse(String strasse) {
		Strasse = strasse;
	}

	public int getHausnummer() {
		return Hausnummer;
	}

	public void setHausnummer(int hausnummer) {
		Hausnummer = hausnummer;
	}

	public String getStadt() {
		return Stadt;
	}

	public void setStadt(String stadt) {
		Stadt = stadt;
	}

	public long getTelefonnummer() {
		return Telefonnummer;
	}

	public void setTelefonnummer(long telefonnummer) {
		Telefonnummer = telefonnummer;
	}
	
}
