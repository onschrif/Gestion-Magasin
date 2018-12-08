/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.tuniprob.gestionmagasin.employe;

import java.util.Date;

/**
 *
 * @author HP-PC
 */
public abstract class Employe {
    
      public int id;
      public String nom;
      public String adresse;
      public int nbr_heures;
   
     public Employe () {}
     
     public Employe (int id, String nom, String adresse, int nbr_heures)
     {
     this.id=id;
     this.nom=nom;
     this.adresse=adresse;
     this.nbr_heures=nbr_heures;
     }
     
     public String toString () {
         return this.id+""+this.nom+""+this.adresse+""+this.nbr_heures;
     }
     
     public abstract float calculSalaire();
     }
     

