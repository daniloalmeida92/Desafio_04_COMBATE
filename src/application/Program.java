package application;

import entities.Champion;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Champion champion;


        System.out.println("******COMBATE DE CAMPEÕES******");
        System.out.println();

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Vida inicia: ");
        int life = sc.nextInt();
        System.out.print("Ataque: ");
        int attack = sc.nextInt();
        System.out.print("Armadura: ");
        int armor = sc.nextInt();
        champion = new Champion(name, life, attack, armor);


        System.out.println();
        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Vida inicia: ");
        life = sc.nextInt();
        System.out.print("Ataque: ");
        attack = sc.nextInt();
        System.out.print("Armadura: ");
        armor = sc.nextInt();
        Champion champion_2 = new Champion(name, life, attack, armor);

        System.out.println();
        System.out.print("Quantos turnos você deseja executar? ");
        int turnos = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= turnos; i++) {

            System.out.println("Resultado do turno " + i + ":");

            champion_2.takeDamage(champion);
            champion.takeDamage(champion_2);

            System.out.println(champion.status());
            System.out.println(champion_2.status());
            System.out.println();

            if (champion_2.getLife() <= 0 || champion.getLife() <= 0)
            break;
        }

        System.out.println("FIM DO COMBATE");

    }
}