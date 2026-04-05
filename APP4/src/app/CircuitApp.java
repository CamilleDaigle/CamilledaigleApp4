package app;

import java.util.Scanner;

public class CircuitApp {
    public CircuitApp() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un numero de circuit\n"+"Voici vos options:\n"+"1-Complexe Industriel\n"+"2-Éclairage Public du Quartier\n"+"3-Réseau de Secours de l'Hôpital\n");
        int numero = sc.nextInt();

        if(numero==1){
            System.out.println("Résistance équivalante calculée: "+CircuitBuilder(complexe_industriel_zone_nord.json));
        }
        if(numero==2){
            System.out.println("Résistance équivalante calculée: "+CircuitBuilder(eclairage_public_quartier.json));
        }
        if(numero==3){
            System.out.println("Résistance équivalante calculée: "+CircuitBuilder(reseau_secours_hopital.json));
        }
        else {
            System.out.println("Veuillez entrer un numero de circuit valide:");
            numero = sc.nextInt();
        }

        System.out.println();
        System.out.println("Que voulez vous faire?\n"+"R- Tester un autre fichier\n"+"Q- Quitter");
        String choix = sc.next();
        if(choix==R){

        }
    }
}