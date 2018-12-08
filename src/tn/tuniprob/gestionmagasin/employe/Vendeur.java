/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.tuniprob.gestionmagasin.employe;

/**
 *
 * @author HP-PC
 */
public class Vendeur extends Employe{
    float tauxVente;
    
    public Vendeur () {}
    
    public Vendeur (float tauxVente, int id, String nom, String adresse, int nbr_heures, int NumCaisse )
    {
    super(id, nom, adresse, nbr_heures);
    this.tauxVente = tauxVente;
    }
    
      public String toString () {
         return super.toString()+""+this.tauxVente;
     }
      public  float calculSalaire()
     {return this.tauxVente*100; }
}
