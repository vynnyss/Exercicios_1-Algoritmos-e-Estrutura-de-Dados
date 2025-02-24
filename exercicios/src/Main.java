//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;

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

        ex14();
        ex15();
        ex16();
    }

}