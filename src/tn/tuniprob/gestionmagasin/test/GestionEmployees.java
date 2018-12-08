package tn.tuniprob.gestionmagasin.test;
import tn.tuniprob.gestionmagasin.employe.Employe;
import tn.tuniprob.gestionmagasin.employe.Responsable;
import tn.tuniprob.gestionmagasin.employe.Vendeur;
import tn.tuniprob.gestionmagasin.employe.Caissier;
import tn.tuniprob.gestionmagasin.magasin.Magasin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP-PC
 */
public class GestionEmployees {
    
    public static void main (String[]args)
    {
    Magasin m1= new Magasin (1, "carrefour","ariana");
    Magasin m2= new Magasin (2, "Geant","menzah6");
    
   
    
    //Employe E1 = new Employe (1,"mohamed","ariana",30);
    //Employe E2 = new Employe (2,"ali","menza",40);
    
    Caissier C1 = new Caissier (3,"mohamed","ariana",30,115);
    Caissier C2 = new Caissier (6,"youssef","ariana",30,115);
    
    Vendeur V1 = new Vendeur (1.2f,4,"saleh","tunis",50,112);
    
    Responsable R1 = new Responsable (5.2f,5,"hamdi","gabes",50,112);
    
    
     Employe e;
    e=C1;
//System.out.println (C1);
//System.out.println (C2);

//System.out.println (V1);
//System.out.println (R1);


m1.ajouterEmploye(C1);
m1.ajouterEmploye(C2);
m1.ajouterEmploye(V1);

m2.ajouterEmploye(C1);
m2.ajouterEmploye(V1);
m2.ajouterEmploye(V1);
m2.ajouterEmploye(V1);
m2.ajouterEmploye(R1);

System.out.println ("m1"+ m1);
System.out.println ("m2"+ m2);

float salaireTotl=0;



for (int i = 0; i< m1.capacite ; i++)
{
    salaireTotl+=m1.employes[i].calculSalaire();
    
}
        System.err.println(salaireTotl);
        
        m2.ajouterEmploye(C1);
        
        for (int i = 0; i< m2.capacite ; i++)
{
    if(m2.employes[i] instanceof Responsable ) //hedhi na3mlouha ki yebda andna fonction f fille barka
    {
    Responsable responsable = (Responsable)m2.employes[i];
    responsable.affecterPrime();
    }
}

    }
}
