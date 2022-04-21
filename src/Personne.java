import java.util.Scanner;

public class Personne implements IPersonne{
    protected String nom;
    protected String prenom;
    protected int age;

    public Personne() {
    }

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

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

    Scanner sc = new Scanner(System.in);
    @Override
    public void manger() {

    }

    @Override
    public void travailler() {

    }

    @Override
    public void saisie() {
        System.out.println("Saisissez le nom");
        this.nom = sc.nextLine();
        System.out.println("Le prenom ");
        this.prenom = sc.nextLine();
        System.out.println("Son age");
        this.age = sc.nextInt();

    }

    @Override
    public void afficher() {

        System.out.println(" Nom : "+nom);
        System.out.println(" Prenom :"+prenom);
        System.out.println("Son age : "+age+ " ans");

    }
}