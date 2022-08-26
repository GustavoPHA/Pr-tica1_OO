//package br.com.aula2.exercicio;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args){

        long numero;
        int agencia;
        double valor;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
            numero = ler.nextLong();

        System.out.println("Digite a agencia: ");
            agencia = ler.nextInt();

            ContaCorrente c1 = new ContaCorrente (numero, agencia);

            System.out.println("Digite o valor de deposito");
                valor = ler.nextDouble();
                c1.Depositar(valor);
                System.out.println("Saldo: "+c1.ConsultaSaldo());



        /*ContaCorrente c1;// cria a variavel c1 do tipo ContaCorrente
        c1 = new ContaCorrente(12345,456); // Intsancia a variável c1
        c1.Depositar(1000);
        System.out.println(c1.ConsultaSaldo());
        c1.Sacar(500);
        System.out.println(c1.ConsultaSaldo()); */
        


    }
}
