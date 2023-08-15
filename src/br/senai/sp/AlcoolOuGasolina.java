package br.senai.sp;

import java.util.Scanner;

public class AlcoolOuGasolina  {
    private static boolean True;

    public static void main(String[] args) {
        double Gasolina = 0;
        double Alcool = 0;
        double DescontoGasolina= 0  ;
        double DescontoAlcool=0;
        int numeroDaFila=0;
        System.out.println("----------------Posto Só No Cheiro-----------------------");

        for (int i = 0; i < 2; i++) {
            double Melhor= (Alcool/Gasolina);
            numeroDaFila++;
            Scanner teclado =new  Scanner(System.in);
            System.out.println("Vc é o cliente número "+ i);
            System.out.print("\nDigite o Valor da Gasolina: ");
            Gasolina = teclado.nextDouble();
            System.out.print("\nDigite o Valor do Alcool: ");
            Alcool = teclado.nextDouble();
            DescontoGasolina= Gasolina - (Gasolina * 0.25);
            System.out.println("\nPreço da Gasolina com Desconto R$: "+ DescontoGasolina);
            DescontoAlcool = Alcool - (Alcool*0.25);
            System.out.println("\nPreço do Alcool com Desconto R$: "+DescontoAlcool);
            if (Melhor >= 0.7)
                System.out.println("\nSugerimos abastecer com Gasolina") ;

            else {
                System.out.println (" \nSugiro abastecer com Alcool");
        }

        }

        System.out.println("Já se passarem "+ numeroDaFila +" Carros Agora é Preço sem desconto");
        Scanner leitura = new Scanner(System.in);

        while ( True) {
            System.out.print("Digite o valor da Gasolina:");
            Gasolina = leitura.nextDouble();
            System.out.println("Valor Gasolina: " + Gasolina);
            System.out.println("Deseja continuar? ");

        }
    }
}
