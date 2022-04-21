import java.util.Scanner;

public class Enfant {
    private Pere pere;
    private Mere mere;
    private String classe;
    private String ecole;

    public Enfant() {
    }

    public Enfant(Pere pere, Mere mere, String classe, String ecole) {
        this.pere = pere;
        this.mere = mere;
        this.classe = classe;
        this.ecole = ecole;
    }

    public Pere getPere() {
        return pere;
    }

    public void setPere(Pere pere) {
        this.pere = pere;
    }

    public Mere getMere() {
        return mere;
    }

    public void setMere(Mere mere) {
        this.mere = mere;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }
    Scanner sc = new Scanner(System.in);
    public void saisieEnfant(){
        System.out.println("\n--------- SAISIE DE L'ENFANT ---------");
        System.out.println("Votre classe ");
        this.classe = sc.nextLine();
        System.out.println("Le nom de votre ecole : ");
        this.ecole = sc.nextLine();
    }
    public void afficheEnfant()
    {
        System.out.println("\n--------- AFFICHAGE DE L'ENFANT ---------");
        System.out.println("CLASSE : "+classe);
        System.out.println("ECOLE : "+ecole);
    }


}
