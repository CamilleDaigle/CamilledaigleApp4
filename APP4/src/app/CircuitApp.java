package app;

import java.util.Objects;
import java.util.Scanner;

public class CircuitApp {
    public CircuitApp() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        String choix = "";
        do {
            System.out.println("Veuillez entrer un numero de circuit\n"+"Voici vos options:\n"+"1-Complexe Industriel\n"+"2-Éclairage Public du Quartier\n"+"3-Réseau de Secours de l'Hôpital\n");
            numero = sc.nextInt();

            if(numero==1){
                System.out.println("Résistance équivalante calculée: " + CircuitBuilder("complexe_industriel_zone_nord.json"));
            }
            if(numero==2){
                System.out.println("Résistance équivalante calculée: " + CircuitBuilder("eclairage_public_quartier.json"));
            }
            if(numero==3){
                System.out.println("Résistance équivalante calculée: " + CircuitBuilder("reseau_secours_hopital.json"));
            }
            else {
                System.out.println("Veuillez entrer un numero de circuit valide:");
                numero = sc.nextInt();
                System.out.println();
                System.out.println("Que voulez vous faire?\n"+"R- Tester un autre fichier\n"+"Q- Quitter");
                choix = sc.next();
            }
        }
        while (choix == "R");

        System.exit(0);
    }
}