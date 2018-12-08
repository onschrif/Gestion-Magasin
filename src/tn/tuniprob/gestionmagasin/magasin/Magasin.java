package tn.tuniprob.gestionmagasin.magasin;


import tn.tuniprob.gestionmagasin.produit.Produit;
import tn.tuniprob.gestionmagasin.employe.Employe;

public class Magasin {
    int id;
    String nom;
    String adresse;
    public static int  capacite;  // cet atribut est lié à la classe et non pas à l'instance 
   public static final int capacite_max=2; // pour dire que c'est une cst : final
 static private Produit[]produits;
 
 public  static final int nbmax=2;
  public static int  nb;
 public Employe [] employes= new Employe[nbmax];
  
 
 
 public Magasin()
    {
        this.produits = new Produit[this.capacite_max];
    }
    public Magasin(int id, String nom, String adresse)
    {
    this.id=id;
    this.nom=nom;
    this.adresse=adresse;
    this.employes= new Employe[this.nbmax];
   
   //produits = new Produit[capacite_max];
   this.produits = new Produit[this.capacite_max];
    }
    
    public static void ajouterProduit(Produit p) throws MagasinPleinException {   
{   
        if (capacite < capacite_max)
{
  
        produits[capacite]=p;
        capacite++;
}
else
            throw new MagasinPleinException();
        
//System.out.println("tableau saturé");
    
}
    }
    
    
     public void ajouterEmploye(Employe e) {   
{   
        if (nb < nbmax)
{
  
        employes[nb]=e;
        nb++;
}
else
System.out.println("tableau saturé");
    
}
    }
    
     
   public String toString() { // on doit redéfinir la méthode toString
       
        String machaine="";
        String ps="";  
        String emp="";
        int i;
        for(i=0;i<capacite;i++)
        {
        ps=ps+produits[i];
        }
     
        
   
   for (int j=0; j<nb; j++)
   {
       emp= emp+"\n"+employes[i];
   }
   return machaine= "Le ID du magasin est" +id + "\n"+"le nom du magasin est"+nom+"\n"+ "adresse du magasin est "+adresse +"\n" +ps+"les employes sont"+employes;
   }  

/*public void afficher ()       
{
 int i;
 System.out.println("l'identifiant du magasin est "+id+ "l'adresse du magasin est "+adresse);
 for(i=0; i<= capacite_max;i++)
 {
 System.out.println("aficher les differents produits"+produits[i]);
 }


} */


}
