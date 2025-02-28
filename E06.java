import java.util.Scanner;
public class E06{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int cont2=0, cont=0, n=0;
		while(n<2 || n>10){
			System.out.println("Introduce un numero:");
			n=teclado.nextInt();
		}
		for(cont=1;cont<n+1;cont++){
			if(cont==1){
				System.out.print(cont);
			}
			else{
				for(cont2=1;cont2<cont+1;cont2++){
					System.out.print(cont2+" ");
				}
			}
			System.out.println("");
		}
	}
}