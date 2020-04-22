package Cheesecake.Maven_TestParametros;

import java.util.ArrayList;
import java.util.Iterator;

public class CalculosMatematicos {
	int primo;
	public static int potencia(int base, int exponente) {

		int resul = 1;
		if (exponente > 0)
			resul = base * potencia(base, exponente - 1);
		return resul;
	}
	public static ArrayList<Integer> listadePrimos(int num){

		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for(int i=1;i<=num;i++) {
			if(esPrimo(i)) {
				lista.add(i);
			}
		}
		return lista;
	}
	public static void recorrerArrayListPrimos(ArrayList<Integer> lista) {
		Iterator<Integer> it=lista.iterator();
		while(it.hasNext()) {
			System.out.print(", "+it.next());
		}
	}
	public static boolean esPrimo(int numero) {
		
		boolean primo = true;
		int divisor = 3;
		if(numero !=2 && numero%2==0)
			primo=false;
		while(primo && divisor< numero/2) {
			if(numero % divisor==0)
				primo = false;
			divisor+=2;
		}
		return primo;
	}
	
	//max int 2147483647
	public static long factorial (int num) {
		long fact =1;
		if(num!=0) {
			for(int i=num; i>=1; i--) {
				fact*=i;
			}
		}
		if(fact>2147483647) {
			fact=-1;
		}
		return fact;
	}
	
	public static long factorial2 (int num) {
		long fact =1;
		if(num!=0) {
			int i=num;
			while(i>=1) {
				fact*=i;
				i--;
			}
		}
		if(fact>2147483647) {
			fact=-1;
		}
		return fact;
	}
}
