package tn.tuniprob.gestionmagasin.produit;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azuz
 */
 public class Produit {
    private  static int id;
     private String marque;
    private static String libelle;
   private static float prix;
   private Date date_exp;
 
    
public Produit()
 {
     
 }
public Produit(String marque, float prix){
if(prix<=0){
 System.out.println("erreur");
}
else
    this.prix=prix;


this.marque=marque;


}
 

 public Produit(int id, String libelle, String marque){

this.id=id;
this.libelle=libelle;
this.marque=marque;


}
 
public Produit(int id, String libelle, String marque, float prix){

this.id=id;
this.libelle=libelle;
this.marque=marque;
this.prix=prix;

}

 public int getid()
        {
                return id;
        }
public String getmarque(){

    return marque;
}
public String getlibelle(){

    return libelle;
}
public float getprix()
{
return prix;
}
public Date getDate()
{
return date_exp;
}

public void Setid ( int id){     // écriture
     this.id=id;
}



public void SetLibelle ( String libelle){     // écriture
   this.libelle=libelle;
}

public void Setmarque ( String marque){     // écriture
     this.marque=marque;
}

public void SetPrix ( float prix){     // écriture
    
    if(prix <=0)
    {
    System.out.println("erreur, Veuillez saisir un prix positif SVP ");
    }
    else
    this.prix=prix;
}


public void SetDate (Date d){     // écriture
    date_exp=d;
}











/*public Produit(int id, String libelle, String marque, float prix, Date date){

this.id=id;
this.libelle=libelle;
this.marque=marque;
this.prix=prix;
this.date=date;

}*/

//@override: c'est à dire qu'il s'agit d'une méthode existante
public String toString() { // on doit redéfinir la méthode toString
        return "Produit est id" +id + "\n"+ "marque est "+ marque +  "\n"+"libellé est :" 
                + libelle + "\n"+ "le prix est"+prix + "\n"+ "la date d'expiration est "+ date_exp;
              

}


public static void comparerProduit(Produit p1, Produit p2)
{
if (p1.id==p2.id && p1.libelle.equals(p2.libelle) && p1.prix==p2.prix)
        {System.out.println("les 2 produits sont identiques");
        }
else
    System.out.println("Produits différents");
}

public boolean equals (Object o){ // equals lezmha type object
    
    if(o instanceof Produit)
        
    {Produit p= (Produit)o; // forcage lel objet o nrodouh produit
    if(this.id==p.id && this.libelle.equals(p.libelle) && this.prix==p.prix) // pour eviter de faire p1.equals(m1) donc naamlo instanceof
     return true;
    }
    return false ;
}


//public void comparerProduit(Produit p)
//{
//if ( this.id==p.id && p.libelle==this.libelle && p.prix==this.prix)
//        {System.out.println("les 2 produits sont identiques");
//        }
//else
//    System.out.println("Produits différents");
//}

}






