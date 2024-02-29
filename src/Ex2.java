import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        if( n % 2== 0){
            if(n >= 2 && n <= 5){
                System.out.println(n+ " é um numero par entre 2 é 5 = A " );
            }else if(n >= 6 && n <= 20){
                System.out.println(n+ " é um numero par entre 6 e 20 = B" );

            }else if(n > 20){
                System.out.println(n+ " é um numero par e esta a cima de 20 = C " );

            }
        }else{
            System.out.println(n+ " é igual ao um numero impar");
        };

        
    }
}