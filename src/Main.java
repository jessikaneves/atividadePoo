import java.util.Scanner;

public class Main { //
    public static void main(String[]args){
    Scanner leitura =  new Scanner (System.in);
    int valor_contador;
    System.out.println("Digite o valor para o contador");
    valor_contador = leitura.nextInt();
    Contador c =new Contador(valor_contador);
    System.out.println("O valor do contador "+ c.getContador ());
    c.incremento();
    c.incremento();
    System.out.println("O valor do contador"+ c.getContador());

   }
}