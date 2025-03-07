//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void ex1(){
        JOptionPane.showMessageDialog(null,"Olá, Mundo!");
    };
    public static void ex2(){
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        JOptionPane.showMessageDialog(null,"Olá " + nome + ", é um prazer te conhecer!");
    }
    public static void ex3(){
        String nome = JOptionPane.showInputDialog("Nome do(a) funcionário(a)");
        Float salario = Float.parseFloat(JOptionPane.showInputDialog("Salário"));
        JOptionPane.showMessageDialog(null,"O(A) funcionário(a) " + nome + " tem um salário de " + salario + " em junho.");
    }

    public static void ex4(){

        Integer num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        Integer num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor:"));
        JOptionPane.showMessageDialog(null,"A soma entre " + num1 + " e " + num2 + " é igual a " +(num1 + num2)+ ".");
    }

    public static void ex5(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite NOTA 1");
        double nota1 = sc.nextDouble();
        System.out.println("Digite NOTA 2");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;        
        System.out.println(" A média entre " + nota1 + " e " + nota2 + " é igual a " + media);
        sc.close();
    }

    public static void ex6(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        int antessesor = num - 1;
        int sucessor = num + 1;
        System.out.println("O antessesor de " + num + " é " + antessesor);
        System.out.println("O sucessor de " + num + " é " + sucessor);
        sc.close();

    }

    public static void ex7(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = sc.nextDouble();
        double dobro = num + num;
        double terca = num / 3;
        System.out.println("O dobro é: " + dobro);
        System.out.printf("A terça parte de %.1f é %.5f%n", num, terca);
        sc.close();

    }

    public static void ex8(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE DISTÂNCIA EM KM");
        double num = sc.nextDouble();
        double cm = num * 100.000;
        System.out.printf("Distancia de %.0f%n", cm);
        sc.close();

    }

    public static void ex9(){

        import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Qual valor você possui em carteira? ");
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        valor = valor/ 3.45;

        System.out.printf(" Você pode comprar: %.2f dólares", valor);

        sc.close();

        }
    }

    public static void ex10(){
        import java.util.Scanner;
        public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a altura em metros: ");
        double altura = sc.nextFloat();
        System.out.print("Digite a largura em metros: ");
        double largura = sc.nextDouble();
        double area = altura * largura;

        double tintanecessaria = area / 2;

        System.out.printf("A área da parede é de: %.2f metros quadrados.%n", area);
        System.out.printf("A quantidade de tinta necessária é: %.2f litros.%n", tintanecessaria);

        public static void ex13() {
            import java.util.Scanner;
            public class Main {
                public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();
        double aumento = salario + (salario* 0.15);
        System.out.printf("O salário com 15%% de aumento é de: %.2f%n", aumento);
        sc.close();
    }
    }
    public static void ex14() {
        float km, total;
        int dias;
        String valor_formatado;

        km = Float.parseFloat(JOptionPane.showInputDialog("Digite quantos quilômetros você percorreu com o carro:"));
        dias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias que o carro foi alugado:"));

        total = dias * 90 + km * 0.20f;
        valor_formatado = String.format("%.2f", total);

        JOptionPane.showMessageDialog(null, "Você terá que pagar R$" + valor_formatado + ".");
    }

    public static void ex15() {
        int dias;
        float total;
        String valor_formatado;

        dias = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos dias você trabalhou neste mês:"));

        total = dias * 8 * 25;
        valor_formatado = String.format("%.2f", total);

        JOptionPane.showMessageDialog(null, "Você irá receber R$" + valor_formatado + " neste mês.");
    }

    public static void ex16() {
        int anos, cigarros, minutos_perdidos, dias_perdidos;

        cigarros = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos cigarros você fuma por dia:"));
        anos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos você fuma:"));

        minutos_perdidos = anos * 365 * cigarros * 10;
        dias_perdidos = minutos_perdidos / (60 * 24);

        JOptionPane.showMessageDialog(null, "Você irá perder " + dias_perdidos + " dias de vida!");
    }

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();

        
        ex14();
        ex15();
        ex16();
    }

}
