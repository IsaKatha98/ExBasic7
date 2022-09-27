package exbasic7;

import java.util.Scanner;

public class ExBasic7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			//Creo el escáner
			Scanner sc= new Scanner (System.in); 

			//Declaro las variables

			double num1;
			double num2;
			double sum;
			double resta;
			double mult;
			double div;

			//Le pido al usuario que introduzca los números y los guardo
			System.out.print("Introduzca el primer número y pulse Intro: ");
			num1 =sc.nextDouble();
			System.out.print("Introduzca el segundo número y pulse Intro: ");
			num2=sc.nextDouble();

			//Ejecutamos los cálculos
			sum=num1+num2;
			resta=num1-num2;
			mult=num1*num2;
			div=num1/num2;

			//Mostramos los resultados
			System.out.println("Suma= "+sum);
			System.out.println("Resta= "+resta);
			System.out.println("Multiplicación= "+mult);
			System.out.println("División= "+div);

			//Cerramos el escáner
			sc.close();
	}

}
