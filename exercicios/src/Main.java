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

        String nome = JOptionPane.showInputDialog("Nome do(a) funcionário(a):");
        Float salario = Float.parseFloat(JOptionPane.showInputDialog("Salário:"));
        JOptionPane.showMessageDialog(null,"O(A) funcionário(a) " + nome + " tem um salário de R$" + salario + " em junho.");
    }

    public static void ex4(){

        Integer num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor (inteiro):"));
        Integer num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor (inteiro):"));
        JOptionPane.showMessageDialog(null,"A soma entre " + num1 + " e " + num2 + " é igual a " +(num1 + num2)+ ".");
    }

    public static void ex5(){

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota (double):"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota (double): "));
        double media = (nota1 + nota2) / 2;
        String valor_formatado = String.format("%.2f", media);
        JOptionPane.showMessageDialog(null, "A média entre " + nota1 + " e " + nota2 + " é igual a " + valor_formatado + ".");

    }

    public static void ex6(){

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (inteiro): "));
        int antecessor = num - 1;
        int sucessor = num + 1;
        JOptionPane.showMessageDialog(null, "O antecessor de " + num + " é " + antecessor + ".");
        JOptionPane.showMessageDialog(null, "O sucessor de " + num + " é " + sucessor + ".");
    }

    public static void ex7(){

        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número (double): "));
        double dobro = num + num;
        double terca = num / 3;
        String valor_formatado = String.format("%.2f", terca);
        JOptionPane.showMessageDialog(null, "O dobro de " + num + " é " + dobro + ".");
        JOptionPane.showMessageDialog(null, "A terça parte de " + num + " é " + valor_formatado + ".");
    }

    public static void ex8(){

        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância em metros: "));
        double mm = num * 1000;
        double cm = num * 100;
        double dm = num * 10;
        double dam = num / 10;
        double hm = num / 100;
        double km = num / 1000;
        String texto_medidas = "Distãncia em quilômetros: " + km + "\nDistãncia em hectômetros: " + hm + "\nDistãncia em decâmetros: " + dam +
                "\nDistãncia em metros: " + num + "\nDistãncia em decímetros: " + dm + "\nDistãncia em centímetros: " + cm +
                "\nDistãncia em milímetros: " + mm;
        JOptionPane.showMessageDialog(null, texto_medidas);
    }

    public static void ex9(){

        double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor você possui na carteira?"));
        double dolares = valor / 3.45f;
        String valor_formatado = String.format("%.2f", dolares);
        JOptionPane.showMessageDialog(null, "Você pode comprar " + valor_formatado + " dólares.");
    }


    public static void ex10() {

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura em metros: "));
        double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura em metros: "));
        double area = altura * largura;
        String area_formatada = String.format("%.2f", area);
        double tintanecessaria = area / 2;
        String tinta_formatada = String.format("%.2f", tintanecessaria);
        JOptionPane.showMessageDialog(null, "Área da parede: " + area_formatada + " metros quadrados.");
        JOptionPane.showMessageDialog(null, "Quantidade de tinta necessária: " + tinta_formatada + " litros.");
    }
    public static void ex11 (){

        JOptionPane.showMessageDialog(null, "Δ = B² - 4 x A x C");
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));
        double delta = Math.pow(b, 2) - 4 * a * c;
        String delta_formatado = String.format("%.2f", delta);
        JOptionPane.showMessageDialog(null, "Δ = " + b + "² - 4 x " + a + " x " + c + " = " + delta_formatado);
    }

    public static void ex12 (){

        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: "));
        double preco_promocional = preco * 0.95f;
        String valor_formatado = String.format("%.2f", preco_promocional);
        JOptionPane.showMessageDialog(null, "O preço promocional é: R$" + valor_formatado);
    }

    public static void ex13() {

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário: "));
        double aumento = salario + (salario * 0.15);
        JOptionPane.showMessageDialog(null, "O seu novo salário com 15% de aumento: R$" + aumento);
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
        ex9();
        ex10();
        ex11();
        ex12();
        ex13();
        ex14();
        ex15();
        ex16();
    }

}
