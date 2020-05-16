package exercícios01;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// BOOLEAN
		boolean validade = true;
		
		// INSTANCIAR OBJETO
		LocalDateTime toptop = LocalDateTime.now();
		
		// OBTENDO DIA-MÊS-ANO, HORA-MIN
		int dia = toptop.getDayOfMonth();
		int mes = toptop.getMonthValue();
		int ano = toptop.getYear();
		
		int hora = toptop.getHour();
		int min = toptop.getMinute();

		String menu1 = "";
		
		// OBTER POR EXTENSO
		if(dia == 1) {
			menu1+= "\nHoje é dia um";			
		}else if(dia == 2) {
			menu1+= "\nHoje é dia dois";
		}else if(dia == 3) {
			menu1+= "\nHoje é dia três";
		}else if(dia == 4) {
			menu1+= "\nHoje é dia quatro";
		}else if(dia == 5) {
			menu1+= "\nHoje é dia cinco";
		}else if(dia == 6) {
			menu1+= "\nHoje é dia seis";
		}else if(dia == 7) {
			menu1+= "\nHoje é dia sete";
		}else if(dia == 8) {
			menu1+= "\nHoje é dia oito";
		}else if(dia == 9) {
			menu1+= "\nHoje é dia nove";
		}else if(dia == 10) {
			menu1+= "\nHoje é dia dez";
		}else if(dia == 11) {
			menu1+= "\nHoje é dia onze";
		}else if(dia == 12) {
			menu1+= "\nHoje é dia doze";
		}else if(dia == 13) {
			menu1+= "\nHoje é dia treze";
		}else if(dia == 14) {
			menu1+= "\nHoje é dia quatorze";
		}else if(dia == 15) {
			menu1+= "\nHoje é dia quinze";
		}else if(dia == 16) {
			menu1+= "\nHoje é dia dezesseis";
		}else if(dia == 17) {
			menu1+= "\nHoje é dia dezessete";
		}else if(dia == 18) {
			menu1+= "\nHoje é dia dezoito";
		}else if(dia == 19) {
			menu1+= "\nHoje é dia dezenove";
		}else if(dia == 20) {
			menu1+= "\nHoje é dia vinte";
		}else if(dia == 21) {
			menu1+= "\nHoje é dia vinte";
		}else if(dia == 22) {
			menu1+= "\nHoje é dia vinte";
		}else if(dia == 23) {
			menu1+= "\nHoje é dia vinte";
		}else if(dia == 24) {
			menu1+= "\nHoje é dia vinte";
		}else if(dia == 25) {
			menu1+= "\nHoje é dia vinte";
		}else if(dia == 26) {
			menu1+= "\nHoje é dia vinte";
		}else if(dia == 27) {
			menu1+= "\nHoje é dia vinte";
		}else if(dia == 28) {
			menu1+= "\nHoje é dia vinte e oito";
		}else if(dia == 29) {
			menu1+= "\nHoje é dia vinte e nove";
		}else if(dia == 30) {
			menu1+= "\nHoje é dia trinta";
		}else if(dia == 31) {
			menu1+= "\nHoje é dia trinta e um";
		}
	
		String menu2 = "";	
		
		if(mes == 1) {
			menu2+= " de janeiro";
		}else if(mes == 2) {
			menu2+= " de favereiro";
		}else if(mes == 3) {
			menu2+= " de março";
		}else if(mes == 4) {
			menu2+= " de abril";
		}else if(mes == 5) {
			menu2+= " de maio";
		}else if(mes == 6) {
			menu2+= " de junho";
		}else if(mes == 7) {
			menu2+= " de julho";
		}else if(mes == 8) {
			menu2+= " de agosto";
		}else if(mes == 9) {
			menu2+= " de setembro";
		}else if(mes == 10) {
			menu2+= " de outubro";
		}else if(mes == 11) {
			menu2+= " de novembro";
		}else if(mes == 12) {
			menu2+= " de dezembro";
		}
		
		String menu3 = "";
		String ano1 = String.valueOf(ano);
		System.out.println(ano1.charAt(0));
		
		if(ano1.charAt(0) == '1') {
			menu3+= " de mil";
		}else if(ano1.charAt(0) == '2') {
			menu3+= " de dois mil";
		}else if(ano1.charAt(0) == '3') {
			menu3+= " de três mil";
		}else if(ano1.charAt(0) == '4') {
			menu3+= " de quatro mil";
		}else if(ano1.charAt(0) == '5') {
			menu3+= " de cinco mil";
		}else if(ano1.charAt(0) == '6') {
			menu3+= " de seis mil";
		}else if(ano1.charAt(0) == '7') {
			menu3+= " de sete mil";
		}else if(ano1.charAt(0) == '8') {
			menu3+= " de oito mil";
		}else if(ano1.charAt(0) == '9') {
			menu3+= " de nove mil";
		}
		
		String menu4 = "";
		
		if(ano1.charAt(1) == '0') {
			menu4+= "";
	    }else if(ano1.charAt(1) == '1') {
			menu4+= " cento";
		}else if(ano1.charAt(1) == '2') {
			menu4+= " duzentos";
		}else if(ano1.charAt(1) == '3') {
			menu4+= " trezentos";
		}else if(ano1.charAt(1) == '4') {
			menu4+= " quatrocentos";
		}else if(ano1.charAt(1) == '5') {
			menu4+= " quinhentos";
		}else if(ano1.charAt(1) == '6') {
			menu4+= " seiscentos";
		}else if(ano1.charAt(1) == '7') {
			menu4+= " setecentos";
		}else if(ano1.charAt(1) == '8') {
			menu4+= " oitocentos";
		}else if(ano1.charAt(1) == '9') {
			menu4+= " novecentos";
		}
		
		String menu5 = "";
		
		if(ano1.charAt(2) == '0' && ano1.charAt(3) == '1') {
			validade = false;
			menu5+= " e um";
		}else if(ano1.charAt(2) == '0' && ano1.charAt(3) == '2') {
			validade = false;
			menu5+= " e dois";
		}else if(ano1.charAt(2) == '0' && ano1.charAt(3) == '3') {
			validade = false;
			menu5+= " e trê";
		}else if(ano1.charAt(2) == '0' && ano1.charAt(3) == '4') {
			validade = false;
			menu5+= " e quatro";
		}else if(ano1.charAt(2) == '0' && ano1.charAt(3) == '5') {
			validade = false;
			menu5+= " e cinco";
		}else if(ano1.charAt(2) == '0' && ano1.charAt(3) == '6') {
			validade = false;
			menu5+= " e seis";
		}else if(ano1.charAt(2) == '0' && ano1.charAt(3) == '7') {
			validade = false;
			menu5+= " e sete";
		}else if(ano1.charAt(2) == '0' && ano1.charAt(3) == '8') {
			validade = false;
			menu5+= " e oito";
		}else if(ano1.charAt(2) == '0' && ano1.charAt(3) == '9') {
			validade = false;
			menu5+= " e nove";
		}else if(ano1.charAt(2) == '1' && ano1.charAt(3) == '0') {
			validade = false;
			menu5+= " e dez";
		}else if(ano1.charAt(2) == '1' && ano1.charAt(3) == '1') {
			validade = false;
			menu5+= " e onze";
		}else if(ano1.charAt(2) == '1' && ano1.charAt(3) == '2') {
			validade = false;
			menu5+= " e doze";
		}else if(ano1.charAt(2) == '1' && ano1.charAt(3) == '3') {
			validade = false;
			menu5+= " e treze";
		}else if(ano1.charAt(2) == '1' && ano1.charAt(3) == '4') {
			validade = false;
			menu5+= " e quatorze";
		}else if(ano1.charAt(2) == '1' && ano1.charAt(3) == '5') {
			validade = false;
			menu5+= " e quinze";
		}else if(ano1.charAt(2) == '1' && ano1.charAt(3) == '6') {
			validade = false;
			menu5+= " e dezesseis";
		}else if(ano1.charAt(2) == '1' && ano1.charAt(3) == '7') {
			validade = false;
			menu5+= " e dezessete";
		}else if(ano1.charAt(2) == '1' && ano1.charAt(3) == '8') {
			validade = false;
			menu5+= " e dezoito";
		}else if(ano1.charAt(2) == '1' && ano1.charAt(3) == '9') {
			validade = false;
			menu5+= " e dezenove";
		}
		
		String menu6 = "";
		while(validade != false) {
			
		if(ano1.charAt(2) == '2' && ano1.charAt(3) == '0') {
			menu5+= " e vinte";
		}else if(ano1.charAt(2) == '3') {
			menu5+= " e trinta";
		}else if(ano1.charAt(2) == '4') {
			menu5+= " e quarenta";
		}else if(ano1.charAt(2) == '5') {
			menu5+= " e cinquenta";
		}else if(ano1.charAt(2) == '6') {
			menu5+= " e sessenta";
		}else if(ano1.charAt(2) == '7') {
			menu5+= " e setenta";
		}else if(ano1.charAt(2) == '8') {
			menu5+= " e oitenta";
		}else if(ano1.charAt(2) == '9') {
			menu5+= " e noventa";
		}
		
		if(ano1.charAt(3) == 0) {
			menu6+= "";
		}else if(ano1.charAt(3) == '1') {
			menu6+= " e um";
		}else if(ano1.charAt(3) == '2') {
			menu6+= " e dois";
		}else if(ano1.charAt(3) == '3') {
			menu6+= " e três";
		}else if(ano1.charAt(3) == '4') {
			menu6+= " e quatro";
		}else if(ano1.charAt(3) == '5') {
			menu6+= " e cinco";
		}else if(ano1.charAt(3) == '6') {
			menu6+= " e seis";
		}else if(ano1.charAt(3) == '7') {
			menu6+= " e sete";
		}else if(ano1.charAt(3) == '8') {
			menu6+= " e oito";
		}else if(ano1.charAt(3) == '9') {
			menu6+= " e nove";
		}
	
		}
		
		String menu7 = "";
		String hora1 = String.valueOf(hora);
		
		if(hora1.charAt(0) == '0' && hora1.charAt(1) == '0') {
			menu7+= ", meia noite";
		}else if(hora1.charAt(0) == '0' && hora1.charAt(1) == '1') {
			menu7+= ", uma hora ";
		}else if(hora1.charAt(0) == '0' && hora1.charAt(1) == '2') {
			menu7+= ", duas horas ";
		}else if(hora1.charAt(0) == '0' && hora1.charAt(1) == '3') {
			menu7+= ", três horas ";
		}else if(hora1.charAt(0) == '0' && hora1.charAt(1) == '4') {
			menu7+= ", quatro horas ";
		}else if(hora1.charAt(0) == '0' && hora1.charAt(1) == '5') {
			menu7+= ", cinco horas ";
		}else if(hora1.charAt(0) == '0' && hora1.charAt(1) == '6') {
			menu7+= ", seis horas ";
		}else if(hora1.charAt(0) == '0' && hora1.charAt(1) == '7') {
			menu7+= ", sete horas ";
		}else if(hora1.charAt(0) == '0' && hora1.charAt(1) == '8') {
			menu7+= ", oito horas ";
		}else if(hora1.charAt(0) == '0' && hora1.charAt(1) == '9') {
			menu7+= ", nove horas ";
		}else if(hora1.charAt(0) == '1' && hora1.charAt(1) == '0') {
			menu7+= ", dez horas ";
		}else if(hora1.charAt(0) == '1' && hora1.charAt(1) == '1') {
			menu7+= ", onze horas ";
		}else if(hora1.charAt(0) == '1' && hora1.charAt(1) == '2') {
			menu7+= ", doze horas ";
		}else if(hora1.charAt(0) == '1' && hora1.charAt(1) == '3') {
			menu7+= ", treze horas ";
		}else if(hora1.charAt(0) == '1' && hora1.charAt(1) == '4') {
			menu7+= ", quatorze horas ";
		}else if(hora1.charAt(0) == '1' && hora1.charAt(1) == '5') {
			menu7+= ", quinze horas ";
		}else if(hora1.charAt(0) == '1' && hora1.charAt(1) == '6') {
			menu7+= ", dezesseis horas ";			
		}else if(hora1.charAt(0) == '1' && hora1.charAt(1) == '7') {
			menu7+= ", dezessete horas ";
		}else if(hora1.charAt(0) == '1' && hora1.charAt(1) == '8') {
			menu7+= ", dezoito horas ";
		}else if(hora1.charAt(0) == '1' && hora1.charAt(1) == '9') {
			menu7+= ", dezenove horas ";
		}else if(hora1.charAt(0) == '2' && hora1.charAt(1) == '0') {
			menu7+= ", vinte horas ";
		}else if(hora1.charAt(0) == '2' && hora1.charAt(1) == '1') {
			menu7+= ", vinte e uma horas ";
		}else if(hora1.charAt(0) == '2' && hora1.charAt(1) == '2') {
			menu7+= ", vinte e duas horas ";
		}else if(hora1.charAt(0) == '2' && hora1.charAt(1) == '3') {
			menu7+= ", vinte e três horas ";
		}else if(hora1.charAt(0) == '2' && hora1.charAt(1) == '4') {
			menu7+= ", vinte e quatro horas ";
		}
		
		String menu8 = "";
		String min1 = String.valueOf(min);
		
		if(min1.charAt(0) == '0' && min1.charAt(1) == '0') {
			menu8+= " em ponto.";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '1') {
			menu8+= " e um minuto.";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '2') {
			menu8+= " e dois minutos.";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '3') {
			menu8+= " e trê minutos.";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '4') {
			menu8+= " e quatro minutos.";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '5') {
			menu8+= " e cinco minutos.";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '6') {
			menu8+= " e seis minutos.";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '7') {
			menu8+= " e sete minutos.";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '8') {
			menu8+= " e oito minutos.";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '9') {
			menu8+= " e nove minutos.";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '0') {
			menu8+= " e dez minutos.";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '1') {
			menu8+= " e onze minutos.";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '2') {
			menu8+= " e doze minutos.";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '3') {
			menu8+= " e treze minutos.";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '4') {
			menu8+= " e quatorze minutos.";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '5') {
			menu8+= " e quinze minutos.";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '6') {
			menu8+= " e dezesseis minutos.";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '7') {
			menu8+= " e dezessete minutos.";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '8') {
			menu8+= " e dezoito minutos.";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '9') {
			menu8+= " e dezenove minutos.";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '0') {
			menu8+= " e vinte minutos.";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '1') {
			menu8+= " e vinte e um minutos.";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '2') {
			menu8+= " e vinte e dois minutos.";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '3') {
			menu8+= " e vinte e três minutos.";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '4') {
			menu8+= " e vinte e quatro minutos.";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '5') {
			menu8+= " e vinte e cinco minutos.";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '6') {
			menu8+= " e vinte e seis minutos.";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '7') {
			menu8+= " e vinte e sete minutos.";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '8') {
			menu8+= " e vinte e oito minutos.";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '9') {
			menu8+= " e vinte e nove minutos.";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '0') {
			menu8+= " e trinta minutos.";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '1') {
			menu8+= " e trinta e um minutos.";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '2') {
			menu8+= " e trinta e dois minutos.";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '3') {
			menu8+= " e trinta e três minutos.";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '4') {
			menu8+= " e trinta e quatro minutos.";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '5') {
			menu8+= " e trinta e cinco minutos.";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '6') {
			menu8+= " e trinta e seis minutos.";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '7') {
			menu8+= " e trinta e sete minutos.";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '8') {
			menu8+= " e trinta e oito minutos.";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '9') {
			menu8+= " e trinta e nove minutos.";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '0') {
			menu8+= " e quarenta minutos.";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '1') {
			menu8+= " e quarenta e um minutos.";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '2') {
			menu8+= " e quarenta e dois minutos.";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '3') {
			menu8+= " e quarenta e três minutos.";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '4') {
			menu8+= " e quarenta e quatro minutos.";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '5') {
			menu8+= " e quarenta e cinco minutos.";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '6') {
			menu8+= " e quarenta e seis minutos.";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '7') {
			menu8+= " e quarenta e sete minutos.";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '8') {
			menu8+= " e quarenta e oito minutos.";		
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '9') {
			menu8+= " e quarenta e nove minutos.";	
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '0') {
			menu8+= " e cinquenta minutos.";			
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '1') {
			menu8+= " e cinquenta e um minutos.";			
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '2') {
			menu8+= " e cinquenta e dois minutos.";			
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '3') {
			menu8+= " e cinquenta e três minutos.";			
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '4') {
			menu8+= " e cinquenta e quatro minutos.";			
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '5') {
			menu8+= " e cinquenta e cinco minutos.";			
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '6') {
			menu8+= " e cinquenta e seis minutos.";	
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '7') {
			menu8+= " e cinquenta e sete minutos.";	
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '8') {
			menu8+= " e cinquenta e oito minutos.";	
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '9') {
			menu8+= " e cinquenta e nove minutos.";
		}
			
		String totalzao = "Hora atual: "+dia+"/"+mes+"/"+ano+" - "+hora+":"+min;
		
		JOptionPane.showMessageDialog(null, totalzao +"\n"+menu1+""+menu2+""+menu3+""+menu4+""+menu5+""+menu6+""+menu7+""+menu8);
	
	}
}
