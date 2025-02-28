import java.util.Scanner;
public class E05{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int cont2=0, cont=0, n=0, n2=0;
		while(n<=0 || n>10){
			System.out.println("Introduce un numero de Filas:");
			n=teclado.nextInt();
		}
		while(n2<=0 || n2>10){
			System.out.println("Introduce un numero de Columnas:");
			n2=teclado.nextInt();
		}
		for(cont=0;cont<n;cont++){
			for(cont2=0;cont2<n2;cont2++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}