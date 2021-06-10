import java.util.*;

public class ejercicio6 {

	public static void main(String[] args) {

		int i, cont=0;
		int[] numeros = new int[100];

		for (i=0;i<numeros.length;i++){

			numeros[i]= (int)(Math.random()*100+1);
		}
			for (i=0;i<numeros.length;i++){

			System.out.println(numeros[i]);
		}
				for (i=0;i<numeros.length;i++){

			if(numeros[i]%5==0){
				cont = cont +1;

			}
		}

		System.out.println("hay "+cont+" divisores de 5");

	}
}