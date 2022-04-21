import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Mere mere = new Mere();
        System.out.println("\n--------- SAISIE DE LA MERE ---------");
        mere.saisie();
        System.out.println("Indo ngeu :");
        mere.setIndo(sc.nextBoolean());
        System.out.println("\n--------- INFORMATION DE LA MERE ---------");
        mere.afficher();
        System.out.println("Indo leu ? :"+mere.isIndo());

        System.out.println("\n--------- SAISIE DU PERE ---------");
        Pere pere = new Pere();
        pere.saisie();
        System.out.println("Son Salaire : ");
        pere.setSalaire(sc.nextFloat());
        System.out.println("Il a combien d'enfant(s)");
        pere.setNbrEnfant(sc.nextInt());
        System.out.println("\n--------- INFORMATION DU MERE ---------");
        pere.afficher();
        System.out.println("Salaire : "+pere.getSalaire());
        System.out.println("Nombre d'enfant(s) : "+pere.getNbrEnfant());

        Enfant enfant = new Enfant();
        enfant.saisieEnfant();
        enfant.afficheEnfant();
        System.out.println("C'est l'enfant de : " +mere.prenom + " " +mere.nom + " et de " + pere.prenom + " "+ pere.nom);
    }
}