package fr.formation.inti.solution.ex1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CrFich {
	public static void main(String args[]) throws IOException {
		final int longMaxNom = 20;
		final int longMaxPrenom = 20;
		String chNom, chPrenom;
		char[] nom = new char[longMaxNom];
		char[] prenom = new char[longMaxPrenom];
		int annee;
		String nomFichier;
		System.out.println("Nom du fichier a creer : ");
		Scanner sc = new Scanner(System.in);
		nomFichier = sc.nextLine();
		DataOutputStream sortie = new DataOutputStream(new FileOutputStream(nomFichier));
		int i;
		int num = 0; // pour compter les differents enregistrements
		while (true) // on s'arretera sur nom vide
		{ /* lecture infos */
			num++;
			System.out.print("nom " + num + " : ");
			chNom = sc.nextLine();
			if (chNom.length() == 0)
				break;
			System.out.print("Prenom : ");
			chPrenom = sc.nextLine();;
			System.out.print("annee naissance : ");
			annee = sc.nextInt();
			sc.nextLine();
			/* transfert nom et prenom dans tab de char termines par des espaces */
			for (i = 0; i < longMaxNom; i++)
				nom[i] = ' ';
			for (i = 0; i < longMaxPrenom; i++)
				prenom[i] = ' ';
			for (i = 0; (i < chNom.length()) && (i < longMaxNom); i++)
				nom[i] = chNom.charAt(i);
			for (i = 0; (i < chPrenom.length()) && (i < longMaxPrenom); i++)
				prenom[i] = chPrenom.charAt(i);
			/* ecriture fichier */
			for (i = 0; i < longMaxNom; i++)
				sortie.writeChar(nom[i]);
			for (i = 0; i < longMaxPrenom; i++)
				sortie.writeChar(prenom[i]);
			sortie.writeInt(annee);
		}
		sortie.close();
		System.out.println("**** fin creation fichier ****");
	}
}