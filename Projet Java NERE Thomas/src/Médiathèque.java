import java.util.Scanner;

public class M�diath�que {
	
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Nombre de m�dia ? ");
		 int nbrMedia = sc.nextInt();
		 int tabTypeMedia[] = new int [nbrMedia + 1];

		 for(int i = 0; i < nbrMedia ; i++) {
		  System.out.println("Veuillez choisir le m�dia a ajouter en position " + (i+1) + " ");
		  System.out.println("Type du media (1=Film, 2=Livre, 3=CD) ");
		  int typeMedia = sc.nextInt();
		  tabTypeMedia[i] = typeMedia;
		 }
		 
		 for(int c= 0; c < nbrMedia; c++) {
		       
        if (tabTypeMedia[c] == 1) {
        	sc.nextLine();
        	System.out.println("Titre du film : ");
        	String titreFilm = sc.nextLine();
        	System.out.println("R�alisateur : ");
        	String auteurFilm = sc.nextLine();
        	System.out.println("Date de sortie : ");
        	int sortieFilm = sc.nextInt();
        	System.out.println("Dur�e du film : ");
        	int dureeFilm = sc.nextInt();
        	System.out.println("Prix HT : ");
        	int prixhtFilm = sc.nextInt();
        }
        
        else if (tabTypeMedia[c] == 2){
        	sc.nextLine();
        	System.out.println("Titre du livre : ");
        	String titreLivre = sc.nextLine();
        	System.out.println("Auteur : ");
        	String auteurLivre = sc.nextLine();
        	System.out.println("Date de parution : ");
        	int sortieLivre = sc.nextInt();
        	System.out.println("Nombre de page : ");
        	int dureeLivre = sc.nextInt();
        	System.out.println("Prix HT : ");
        	int prixhtLivre = sc.nextInt();
        }
        
        else if (tabTypeMedia[c] == 3) {
        	sc.nextLine();
        	System.out.println("Titre du CD : ");
        	String titreCD = sc.nextLine();
        	System.out.println("Chanteur : ");
        	String auteurCD = sc.nextLine();
        	System.out.println("Date de sortie : ");
        	int sortieCD = sc.nextInt();
        	System.out.println("Dur�e du CD : ");
        	int dureeCD = sc.nextInt();
        	System.out.println("Prix HT : ");
        	int prixhtCD = sc.nextInt();
        }
	}
	}
}
