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
        String nome = JOptionPane.showInputDialog("Nome do funcionário");
        Float salario = Float.parseFloat(JOptionPane.showInputDialog("Salário"));
        JOptionPane.showMessageDialog(null,"O funcionário " + nome + " tem um salário de " + salario + " em junho.");
    }

    public static void ex4(){

        Integer num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        Integer num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor:"));
        JOptionPane.showMessageDialog(null,"A soma entre " + num1 + " e " + num2 + " é igual a " +(num1 + num2)+ ".");
    }

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

}