import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Operadores operadores = new Operadores();
        Adicao adicao = new Adicao();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        

        System.out.print("Digite o primeiro valor: ");
        double x = s.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double y = s.nextDouble();

        System.out.println("1- Soma");
        System.out.println("2- Subtracao");
        System.out.println("3- Divisao");
        System.out.println("4- Multiplicacao");
        System.out.print("Escolha uma opcao: ");
        int op = s.nextInt();

        switch (op) {
            case 1:
                System.out.println("Resultado: " + adicao.formula(x, y));
                break;
            case 2:
                System.out.println("Resultado: " + subtracao.formula(x, y));
                break;
            case 3:
                System.out.println("Resultado: " + divisao.formula(x, y));
                break;
            case 4:
                System.out.println("Resultado: " + multiplicacao.formula(x, y));
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }

}
