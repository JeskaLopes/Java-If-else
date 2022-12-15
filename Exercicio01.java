package br.com.exercicios.lacocondicional.lista02;

import java.util.Scanner;

public class Exercicio01 {
	//1 - Fa�a um programa que receba tr�s inteiros e diga 	              qual deles � o maior.
	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	int x, y, maior;
		    
	System.out.println("Digite o numero 1: ");
	x = ler.nextInt();

 	System.out.println("Digite o numero 2: ");
	y = ler.nextInt();

	if(x > y) {
	  maior = x;
	}
	else {
	  maior = y;
	}
	System.out.println("O maior numero �: " + maior);
		}
	}
===============================================================
package br.com.exercicios.lacocondicional.lista02;

import java.util.Scanner;

public class Exercicio02 {

	//2 - Fa�a um programa que entre com tr�s n�meros e 		      coloque em ordem crescente.
	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	int n1, n2, n3;  /*dados de entrada*/
	  
	System.out.println("Digite tr�s numeros: ");
	n1 = ler.nextInt();
	n2 = ler.nextInt();
	n3 = ler.nextInt();
		
	/*Existem 6 possiveis ordens para imprimior os 			  numeros lidos */
    if (n1 <= n2 && n2 <= n3){
    System.out.println("A ordem crescente: \n" + n1 + n2 + n3);
    }
    else if (n1 <= n3 && n3 <= n2) {
    System.out.println("A ordem crescente: \n" + n1 + n3 + n2);
    }
    else if (n2 <= n1 && n1 <= n3) {
    System.out.println("A ordem crescente: \n" + n2 + n1 + n3);
    }
    else if (n2 <= n3 && n3 <= n1) {
    System.out.println("A ordem crescente: \n" + n2 + n3 + n1);
    }
    else if (n3 <= n1 && n1 <= n2) {
    System.out.println("A ordem crescente: \n" + n3 + n1 + n2);
    }
    else {/* n3 <= n2 && n2 < n1 */
    System.out.println("A ordem crescente: \n" + n3 + n2 + n1);
	    }
	}
    }
===============================================================
package br.com.exercicios.lacocondicional.lista02;

import java.util.Scanner;

public class Exercicio03 {
	/*
	3 - Fa�a um programa que receba a idade de uma pessoa e 	    mostre na sa�da em qual categoria ela se encontra:
		? 10-14 infantil
		? 15-17 juvenil
		? 18-25 adulto
	*/
	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);
	int idade;
		
	System.out.println("Digite a idade: ");
	idade = ler.nextInt();
		
	if(idade >= 10 && idade <= 14) {
	System.out.println("Infantil");
	}
	else if(idade >= 15 && idade <= 17) {
	System.out.println("Juvenil");
	}
	else if(idade >= 18 && idade <= 25) {
	System.out.println("Adulto");
	}
	else {
	System.out.println("Idade Inv�lida!");
	System.out.println("======Fim======");
		}
	}
}
===============================================================
***************///////////////////////////////*****************
Exerc�cio 03 - segunda op��o com JOptionPane
package br.com.generation.correcao;
import javax.swing.JOptionPane;

public class Exercicio03_02 {

    public static void main(String[] args) {

        int idade = 0;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Entre 			com uma idade (numero inteiro):"));

        if (idade >=10 && idade <=14) {

            JOptionPane.showMessageDialog(null, "Infantil.", 			"Resultado", JOptionPane.INFORMATION_MESSAGE);
            	System.exit(0);

        } else if (idade >= 15 && idade < 17) {
            JOptionPane.showMessageDialog(null, "Juvenil.", 			"Resultado", JOptionPane.INFORMATION_MESSAGE);
            	System.exit(0);
        } else if (idade >= 18 && idade <= 25) {
            JOptionPane.showMessageDialog(null, "Adulto.", 			"Resultado", JOptionPane.INFORMATION_MESSAGE);
           	System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Idade Inv�lida.", 		"Resultado", JOptionPane.INFORMATION_MESSAGE);
            	System.exit(0);
        }
    }
}
************//////////////////////////////////////*************
===============================================================
package br.com.generation.condicionais.correcao;

import java.util.Scanner;

public class Exercicio04 {
	/* 4 - Fa�a um programa em que permita a entrada de um 	               n�mero qualquer 
	 * e exiba se este n�mero � par ou �mpar. 
	 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
	 * se for �mpar exiba o n�mero elevado ao quadrado.*/
	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	int num;
	double raiz2, raiz3, elevado;
		
	System.out.println("Digite um n�mero inteiro: ");
	num = ler.nextInt();
		
	if(num % 2 == 0) {
	   System.out.println("Par............");
	   raiz2 = Math.sqrt(num);//---> Raiz quadrada
	   raiz3 = Math.cbrt(num);//---> Raiz c�bica
			
	   System.out.println("Raiz Quadrada: " + raiz2);
	   System.out.println("Raiz C�bica: "   + raiz3);
	}
	else if(num % 2 == 1) {
	   System.out.println("Impar............");
	   elevado = Math.pow(num, 2);
	   System.out.println("Potencia: " + elevado);
	   }
	   ler.close();
	}
}