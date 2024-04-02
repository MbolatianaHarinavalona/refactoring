package iut.bad;
public class Femme extends Humain {
    // Constructeur par défaut
    public Femme() {
        super();
    }

    // Constructeur avec tous les champs
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    // Méthode main
    public static void main(String[] args) {
        Femme femme = new Femme("Violetta", "Samiro", 21);
        Homme homme = new Homme("Den", "Smith", 23);

        femme.ami(homme);
    }
}

