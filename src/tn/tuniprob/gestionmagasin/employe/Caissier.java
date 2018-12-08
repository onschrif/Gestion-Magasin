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
public  class Caissier extends Employe{
    
    int numCaisse;
    
    public Caissier (){
    }
    
    public Caissier (int id, String nom, String adresse, int nbr_heures, int NumCaisse){
    
    super(id, nom, adresse, nbr_heures);
    this.numCaisse=numCaisse;
    
    }
    public String toString () {
         return super.toString()+""+this.numCaisse;
     }
     public  float calculSalaire()
     {return this.numCaisse*100; }
    
    }
    
    

