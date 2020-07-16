package exercicio1;

import javax.swing.JOptionPane;

public class Funcionario{
    private int matricula;
    private String nome;
    private double salario;
    
    public void exibeDados(){                
        JOptionPane.showMessageDialog(null, "Nº da matrícula: " + matricula + "\n"
                                          + "Nome: " + nome + "\n"
                                          + "Salario: " + salario);
    }
    
    public double calculaSalario(){
        
        return salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
