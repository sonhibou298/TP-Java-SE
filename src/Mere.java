import java.util.Scanner;

public class Mere extends Personne{
    private boolean indo;

    public Mere() {
    }

    public Mere(String nom, String prenom, int age, boolean indo) {
        super(nom, prenom, age);
        this.indo = indo;
    }

    public boolean isIndo() {
        return indo;
    }

    public void setIndo(boolean indo) {
        this.indo = indo;
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
//        System.out.println("\n--------- SAISIE DE LA MERE ---------");
//        System.out.println("Saisissez le nom de la mere");
//        this.nom = sc.nextLine();
//        System.out.println("Le prenom de la mere");
//        this.prenom = sc.nextLine();
//        System.out.println("l'age de la mere");
//        this.age = sc.nextInt();
//        System.out.println("Est-t-elle une indo");
//        this.indo = sc.hasNextBoolean();
//    }
//
//    @Override
//    public void afficher() {
//        System.out.println("--------- AFFICHAGE DE LA MERE ---------");
//        System.out.println(" Nom de la mere : "+nom);
//        System.out.println(" Prenom de la mere :"+prenom);
//        System.out.println("Son age : "+age+ " ans");
//        System.out.println("Seu Ndeye Indo leu ?: "+indo);
//    }
}
