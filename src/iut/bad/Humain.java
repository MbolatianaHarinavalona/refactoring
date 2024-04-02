package iut.bad;
import java.util.ArrayList;
import java.util.List;


public class Humain implements Consommation  {
    // Champs
    private String nom;
    private String prenom;
    private int age;
    private List<Humain> amis;
    // Constructeur par défaut
    public Humain() {
    	 amis = new ArrayList<>();
    }

    // Constructeur avec tous les champs
    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        amis = new ArrayList<>();
    }

    
 // Méthode pour afficher les détails
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }
    // Implémentation des méthodes de l'interface Consommation
    @Override
    public void manger() {
        System.out.println("L'humain mange.");
    }

    @Override
    public void boire() {
        System.out.println("L'humain boit.");
    }
    
    // Méthode pour indiquer une amitié entre deux humains
    public void ami(Humain ami) {
        ami(ami, 100); // Appelle la méthode ami avec la durée par défaut de 100 jours
    }

    // Méthode pour indiquer une amitié entre deux humains avec une durée spécifiée en jours
    public void ami(Humain ami, int dureeAmitie) {
        amis.add(ami);
        ami.amis.add(this);
        System.out.println(this.nom + " et " + ami.getNom() + " sont maintenant amis pour " + dureeAmitie + " jours.");
    }
    
    
    
    
    
    
    
    
    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
