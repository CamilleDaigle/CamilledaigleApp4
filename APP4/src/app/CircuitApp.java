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

            if(numero!=1||numero!=2||numero!=3){
                System.out.println("Veuillez entrer un numero de circuit valide:");
                numero = sc.nextInt();
            }
            if(numero==1){
                System.out.println("Résistance équivalante calculée: " + new CircuitBuilder("complexe_industiel_zone_nord.json"));
            }
            if(numero==2){
                System.out.println("Résistance équivalante calculée: " + new CircuitBuilder("eclairage_public_quartier.json"));
            }
            if(numero==3){
                System.out.println("Résistance équivalante calculée: " + new CircuitBuilder("reseau_secours_hopital.json"));
            }

            System.out.println();
            System.out.println("Que voulez vous faire?\n"+"R- Tester un autre fichier\n"+"Q- Quitter");
            choix = sc.next();
            if (choix!="R"||choix!="Q"){
                System.out.println("Veuillez entrer une lettre valide: ");
                choix = sc.next();
            }
        }
        while (choix=="R");

        if (choix=="Q") {
            System.exit(0);
        }
    }
}