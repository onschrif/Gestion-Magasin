/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.tuniprob.gestionmagasin.test;

import java.util.logging.Level;
import java.util.logging.Logger;
import tn.tuniprob.gestionmagasin.magasin.Magasin;
import tn.tuniprob.gestionmagasin.magasin.MagasinPleinException;
import tn.tuniprob.gestionmagasin.produit.Produit;
/**
 *
 * @author HP-PC
 */
public class TestException {
    
    public static void main(String[] args) {
         try {
          Magasin m1= new Magasin (1, "carrefour","ariana");
    Magasin m2= new Magasin (2, "Geant","menzah6");
     Produit P1= new Produit(123,"pc","hp");
    Produit P2= new Produit(120, "pc","aaa", 1.5f);
    
       
            m1.ajouterProduit(P1);
             m1.ajouterProduit(P1);
              m1.ajouterProduit(P1);
        } catch (MagasinPleinException ex) {
             System.out.println(ex.getMessage());
        }
    }
    
}
