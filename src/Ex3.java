import java.util.*;


public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero op numero: ");
        double num1 = sc.nextDouble();
        char op = sc.next().charAt(0);        
        double num2 = sc.nextDouble();
        if (op == '+'){
            System.out.println(num1 + num2);
        }else if( op == '-'){
            System.out.println(num1 - num2);
        }else if( op == '*'){
            System.out.println(num1 * num2);
        }else if(op == '/'){
            System.out.println(num1 / num2);
        }else{
            System.out.println("Formtato invalido");
        }
    }
}
