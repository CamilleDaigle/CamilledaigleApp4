package app;

import electronique.Circuit;
import electronique.Resistance;
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
            /*Prendre en note que si le système demande de rentrer une une réponse valide, mais que la réponse déjà entrée dans le syst`me est bel et bien valide, il faut redonner
              au système la même réponse pour qu'il puisse continuer*/
            System.out.println("Veuillez entrer un numero de circuit\n"+"Voici vos options:\n"+"1- Complexe Industriel\n"+"2- Éclairage Public du Quartier\n"+"3- Réseau de Secours de l'Hôpital");
            numero = sc.nextInt();

            if(numero==1){
                CircuitBuilder reponse = new CircuitBuilder();
                System.out.println("Résistance équivalante calculée: " + reponse.construireCircuit("complexe_industriel_zone_nord.json").calculerResistance() + " Ω");
            }
            if(numero==2){
                CircuitBuilder reponse = new CircuitBuilder();
                System.out.println("Résistance équivalante calculée: " + reponse.construireCircuit("eclairage_public_quartier.json").calculerResistance() + " Ω");
            }
            if(numero==3){
                CircuitBuilder reponse = new CircuitBuilder();
                System.out.println("Résistance équivalante calculée: " + reponse.construireCircuit("reseau_secours_hopital.json").calculerResistance() + " Ω");
            }
            else {
                System.out.println("Veuillez entrer un numero de circuit valide:");
                numero = sc.nextInt();
            }
            System.out.println();
            System.out.println("Que voulez vous faire?\n"+"R- Tester un autre fichier\n"+"Q- Quitter");
            choix = sc.next();
            if (!choix.equals("R")||!choix.equals("Q")){
                System.out.println("Veuillez entrer une lettre valide: ");
                choix = sc.next();
            }
        }
        while (Objects.equals(choix, "R"));

        if (Objects.equals(choix, "Q")) {
            System.exit(0);
        }
    }
}