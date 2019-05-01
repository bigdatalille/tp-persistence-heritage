package com.adming;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author inti
 *
 */
@Entity
abstract class Commercial extends Employe {

    private double chiffreAffaire;
 
    public Commercial(String prenom, String nom, int age, String date, double chiffreAffaire) {
        super(prenom, nom, age, date);
        this.chiffreAffaire = chiffreAffaire;
    }
 
    public double getChiffreAffaire()
        {
            return chiffreAffaire;
        }
 
}
