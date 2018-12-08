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
public  class Responsable extends Employe {
    float prime;
    
     public Responsable () {}
    
    public Responsable (float prime, int id, String nom, String adresse, int nbr_heures, int NumCaisse )
    {
    super(id, nom, adresse, nbr_heures);
    this.prime = prime;
    }
    
    
    public void affecterPrime(){ //na3mloulha forcage fel main 5ater mawjouda ken houni
        System.out.println(""); }
      public String toString () {
         return super.toString()+""+this.prime;
     }
      
      public  float calculSalaire()
     {return this.prime*100; }
      
      
}
