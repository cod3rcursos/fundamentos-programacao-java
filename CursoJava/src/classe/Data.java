package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		
	}
	Data(int d, int m, int a){
		dia = d;
		mes = m;
		ano = a;
	}
	
	String formatar() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
