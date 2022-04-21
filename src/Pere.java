import java.util.Scanner;

public class Pere extends Personne{
    private float salaire;
    private int nbrEnfant;

    public Pere() {
    }

    public Pere(float salaire, int nbrEnfant) {
        this.salaire = salaire;
        this.nbrEnfant = nbrEnfant;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public int getNbrEnfant() {
        return nbrEnfant;
    }

    public void setNbrEnfant(int nbrEnfant) {
        this.nbrEnfant = nbrEnfant;
    }
//    Scanner sc = new Scanner(System.in);
//    @Override
//    public void manger() {
//
//    }
//
//    @Override
//    public void travailler() {
//
//    }
//
//    @Override
//    public void saisie() {
//        System.out.println("\n--------- SAISIE DU PERE ---------");
//        System.out.println("Saisissez le nom du Pere");
//        this.nom = sc.nextLine();
//        System.out.println("Le prenom du pere");
//        this.prenom = sc.nextLine();
//        System.out.println("l'age du pere");
//        this.age = sc.nextInt();
//        System.out.println("Son salaire");
//        this.salaire = sc.nextFloat();
//        System.out.println("Nombre d'enfant(s)");
//        this.nbrEnfant = sc.nextInt();
//    }
//
//    @Override
//    public void afficher() {
//        System.out.println("--------- AFFICHAGE DU PERE ---------");
//        System.out.println(" Nom de la mere : "+nom);
//        System.out.println(" Prenom de la mere :"+prenom);
//        System.out.println("Son age : "+age+" ans");
//        System.out.println("Son Salaire : "+salaire);
//        System.out.println("Il a "+nbrEnfant+ " enfant(s)");
//    }
}
