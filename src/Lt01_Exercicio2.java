/*
********************************************
Objetivo: 2 Exercício Lote 01 
Programador: Taciana Cavalcanto
Data de Criação: 07/02/19
********************************************
*/
import javax.swing.JOptionPane;
public class Lt01_Exercicio2
{
public static void main(String args[])
        {
        double salarioAtual,novoSalario;
           
        salarioAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario do Funcionario"));
        novoSalario = ((salarioAtual * 0.15)+salarioAtual);
        JOptionPane.showMessageDialog(null,"O novo salario é " + novoSalario);
        }
}