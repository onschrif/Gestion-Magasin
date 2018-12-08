package tn.tuniprob.gestionmagasin.test;


import tn.tuniprob.gestionmagasin.magasin.Magasin;
import tn.tuniprob.gestionmagasin.produit.Produit;
import tn.tuniprob.gestionmagasin.employe.Employe;

import java.util.Date;

public class Test {
    public static void main(String [] args)
    {
    //Produit P0= new Produit();  
    
    //Produit P1= new Produit(123,"pc","hp");
    
    //Produit P2= new Produit(120, "pc","aaa", 1.5f);
    //Produit P3= new Produit(320,"pc","bbb",5.2f,"29/11/2017");
    
    
        
        
    Produit P3= new Produit("pc",-120f);
    Produit P4= new Produit("sham",50f);
    Produit P5= new Produit("jeux",30f);
    Produit P6= new Produit("pc",120f);
    Produit P7= new Produit("pc",120f);
    P3.Setid(22); // au lieu de P3.id 
    //System.out.println(P2);
    
    /*Date D1=new Date(); // On pourra ajouter un attribut sans avoir construire un nouveau consctructeur
    P1.date_exp=D1;
    
    System.out.println(P1);   //La méthode toSring() est automatiquement invoquée lorsque l’on souhaite tracer un objet.
    */
    Produit [] produits;
     Magasin M1= new Magasin();
    
     
     
//     Magasin.ajouterProduit(P3);
//     Magasin.ajouterProduit(P4);
//     Magasin.ajouterProduit(P5);
//     Magasin.ajouterProduit(P6);
//     Magasin.ajouterProduit(P7);
   
    System.out.println(M1);
    
    System.out.println("le nb total des produits est "+Magasin.capacite);
    
     Magasin M2=new Magasin();
    
     
//     Magasin.ajouterProduit(P3);
//     Magasin.ajouterProduit(P3);
     System.out.println(M2);
    
    System.out.println("le nb total des produits est "+Magasin.capacite);   // incrémentation dynamique avec static, il ne dépond plus de l'instance ,il peut etre appelé à partir de nom de la calsse donc on met Magasin.capacite et non pas M1.capacite
    
    System.out.println(M1.capacite_max); //lorsqu'on ajoute static on peut faire appel de capacite_max avec Magasin.capacite_max, elle est liée lil objet magasin et non pas lil magasin M1 ou M2
    System.out.println(M2.capacite_max);
    
    P3.equals(P4);
    Produit.comparerProduit(P3, P4);
    
    
   
    
    }
    }
    
