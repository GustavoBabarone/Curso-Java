package exercícios04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Object[] notas = {" Excelente", "Ótimo", "Bom", "Regular", "Ruim"};
		int continuar=0, nota1=0, nota2=0, nota3=0, nota4=0, nota5=0, continua=0;
		int votos = (nota1 + nota2 + nota3 + nota4 + nota5);
		int crianca=0, adolescente=0, adulto=0;
		
		do {
			
		int nota = JOptionPane.showOptionDialog(null, "Qual sua nota para o filme?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, notas, 0);
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade?"));
		
		switch(nota) {
		case 0:
			nota1++;
		break;
		
		case 1:
			nota2++;
		break;
		
		case 2:
			nota3++;
		break;
		
		case 3:
			nota4++;
		break;
			
		case 4:
			nota5++;
		break;
		}
			if(idade >= 0 && idade < 9) {
				crianca++;
			}else if(idade >= 10 && idade <= 17) {
				adolescente++;
			}else if(idade >= 18) {
				adulto++;
			}
		
			do {
				
				if(idade < 0 || idade > 100) {
					JOptionPane.showMessageDialog(null, "A SUA MÃE VOCÊ ENGANA FION, EU NÃO!");
				}	
				continua = JOptionPane.showConfirmDialog(null, "FIM DA VOTAÇÃO!");
			}while(continua != 0); 
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar votando?");
		}while(continuar == 0);
	
		String total = "Excelente: "+(100 / (nota1 + nota2 + nota3 + nota4 + nota5)*nota1) +" %";
			   total+= "\nÓtimo:  "+(100 / (nota1 + nota2 + nota3 + nota4 + nota5)*nota2) +" %";
			   total+= "\nBom: "+(100 / (nota1 + nota2 + nota3 + nota4 + nota5)*nota3) +" %";
			   total+= "\nRegular: "+(100 / (nota1 + nota2 + nota3 + nota4 + nota5)*nota4) +" %";
			   total+= "\nRuim: "+(100 / (nota1 + nota2 + nota3 + nota4 + nota5)*nota5) +" %";
			   total+= "\n";
			   total+= "\nQuantidade de crianças: "+crianca;
			   total+= "\nQuantidade de adolescentes: "+adolescente;
			   total+= "\nQuantidade de adultos:"+adulto;
			   
			   JOptionPane.showMessageDialog(null,  total);
	
	}
}
