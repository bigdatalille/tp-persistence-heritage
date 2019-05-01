package com.adming;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="t_employe")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

//@DiscriminatorColumn(name = "type_employe")
public abstract class Employe {
	// Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
    private String prenom;
    private int age;
    private String date;
 
    public Employe(String prenom, String nom, int age, String date) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date = date;
    }
 
    public abstract double calculerSalaire();
 

    public String getTitre()
        {
            return "L'employ� " ;
        }
 
    public String getNom() {
        return getTitre() + prenom + " " + nom;
    }

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", date=" + date + "]";
	}
    
    
}
