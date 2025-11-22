/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ContaBanco;

import java.util.Scanner;

/**
 *
 * @author mateus
 */
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o numero de conta:");
        int numeroConta = scan.nextInt();
        System.out.println("digite o numero de agencia:");
        int numeroagencia = scan.nextInt();
        System.out.println("digite o nome:");
        String nome = scan.next();
        System.out.println("digite o saldo:");
        int saldo = scan.nextInt();

        System.out.print("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroagencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
