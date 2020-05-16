package exerc�cios01;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// QUEST�O 01
		Questoes q1 = new Questoes();
		q1.setNomeQuest("1) Qual a cor do c�u?");
		q1.setResposta("A) Azul");
		q1.setAlternativaB("B) Roxo");
		q1.setAlternativaC("C) Verde");
		q1.setAlternativaD("D) Amarelo");
		
		// QUEST�O 02
		Questoes q2 = new Questoes();
		q2.setNomeQuest("2) 7 + 38 = ?");
		q2.setResposta("A) 45");
		q2.setAlternativaB("B) 2");
		q2.setAlternativaC("C) 100");
		q2.setAlternativaD("D) 24");
				
		// QUEST�O 03
		Questoes q3 = new Questoes();
		q3.setNomeQuest("3) Qual a capital do Brasil?");
		q3.setResposta("A) Brasilia");
		q3.setAlternativaB("B) Blumenau");
		q3.setAlternativaC("C) Gaspar");
		q3.setAlternativaD("D) Salvador");
		
		// QUEST�O 04
		Questoes q4 = new Questoes();
		q4.setNomeQuest("4) Qual o MELHOR VINGADOR");
		q4.setResposta("A) Homem de ferro");
		q4.setAlternativaB("B) Batman");
		q4.setAlternativaC("C) Robin");
		q4.setAlternativaD("D) Aquaman");

		// QUEST�O 05
		Questoes q5 = new Questoes();
		q5.setNomeQuest("5) Michael jackson foi...");
		q5.setResposta("A) Um cantor");
		q5.setAlternativaB("B) Um professor");
		q5.setAlternativaC("C) Um m�dico");
		q5.setAlternativaD("D) Um gar�om");
		
		// QUEST�O 06
		Questoes q6 = new Questoes();
		q6.setNomeQuest("6) Exemplo de comida:");
		q6.setResposta("A) Feij�o");
		q6.setAlternativaB("B) Caneca");
		q6.setAlternativaC("C) Quadro");
		q6.setAlternativaD("D) Computador");
				
		// QUEST�O 07
		Questoes q7 = new Questoes();
		q7.setNomeQuest("7) Exemplo de bebida:");
		q7.setResposta("A) Cerveja");
		q7.setAlternativaB("B) Gato");
		q7.setAlternativaC("C) Mesa");
		q7.setAlternativaD("D) R�ssia");
		
		// QUEST�O 08
		Questoes q8 = new Questoes();
		q8.setNomeQuest("8) Exemplo de animal:");
		q8.setResposta("A) Le�o");
		q8.setAlternativaB("B) Batata");
		q8.setAlternativaC("C) Felipe");
		q8.setAlternativaD("D) Cabelo");
		
		// QUEST�O 09
		Questoes q9 = new Questoes();
		q9.setNomeQuest("9) Help me significa:");
		q9.setResposta("A) Me ajude");
		q9.setAlternativaB("B) Me ferrei");
		q9.setAlternativaC("C) Macaco");
		q9.setAlternativaD("D) Parab�ns");
		
		// QUEST�O 10
		Questoes q10 = new Questoes();
		q10.setNomeQuest("10) 2-4-6-8-?");
		q10.setResposta("A) 10");
		q10.setAlternativaB("B) Peixe");
		q10.setAlternativaC("C) Zebra");
		q10.setAlternativaD("D) 24");
		
		// QUEST�O 11
		Questoes q11 = new Questoes();
		q11.setNomeQuest("11) � um pa�s da Europa, colonizou o Brasil, conhecido como o pa�s dos muinhos de ventos:");
		q11.setResposta("A) Holanda");
		q11.setAlternativaB("B) Cuba");
		q11.setAlternativaC("C) R�ssia");
		q11.setAlternativaD("D) Haiti");
		
		// QUEST�O 12
		Questoes q12 = new Questoes();
		q12.setNomeQuest("12) Quem � o melhor professor?");
		q12.setResposta("A) Ralf");
		q12.setAlternativaB("B) Felipe");
		q12.setAlternativaC("C) Albanella");
		q12.setAlternativaD("D) Irineu");
		
		// QUEST�O 13
		Questoes q13 = new Questoes();
		q13.setNomeQuest("13) A Guerra dos 7 anos durou:");
		q13.setResposta("A) 7 anos");
		q13.setAlternativaB("B) 24 anos");
		q13.setAlternativaC("C) 100 anos");
		q13.setAlternativaD("D) Batata");
		
		// QUEST�O 14
		Questoes q14 = new Questoes();
		q14.setNomeQuest("14) Qual filme o Tony Stark morre");
		q14.setResposta("A) Ultimato");
		q14.setAlternativaB("B) Avatar");
		q14.setAlternativaC("C) Titanic");
		q14.setAlternativaD("D) Batman");
		
		// QUEST�O 15
		Questoes q15 = new Questoes();
		q15.setNomeQuest("15) Quem foi Napole�o Bonaparte?");
		q15.setResposta("A) Um general e imperador");
		q15.setAlternativaB("B) Um m�sico");
		q15.setAlternativaC("C) Um ator");
		q15.setAlternativaD("D) Um pro player de LOL");
		
		ArrayList<Questoes> quest = new ArrayList<Questoes>();
		
		quest.add(q1);
		quest.add(q2);
		quest.add(q3);
		quest.add(q4);
		quest.add(q5);
		quest.add(q6);
		quest.add(q7);
		quest.add(q8);
		quest.add(q9);
		quest.add(q10);
		quest.add(q11);
		quest.add(q12);
		quest.add(q13);
		quest.add(q14);
		quest.add(q15);
		
		// RANDOM
		int numeros [] = new int [10];
		boolean existe = false;
		int numero;
		int indice = 0;
		
		// Random
		Random gerar = new Random ();
		
		// LA�O
		
		while(indice < 10){
			
			// GERAR N�MERO
			numero = gerar.nextInt(15);
			
			// VERIFICAR SE O N�MERO EXISTE
			existe=false;
			
			for(int i=0; i<10; i++){
				if(numero == numeros[i]) {
					existe = true;
				}
			}
			
			// CONDICIONAL
			if(existe == false) {
				numeros[indice] = numero;
				indice++;
			}
		}
		
		for(int n:numeros) {
			System.out.println(n);
		}		
	}
}
