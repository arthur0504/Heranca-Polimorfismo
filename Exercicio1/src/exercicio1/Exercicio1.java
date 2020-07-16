package exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {        
        AssisAdmin aa = new AssisAdmin();
        AssisTec at = new AssisTec();                
        
        aa.setNome("Otavio");
        aa.setMatricula(01);
        aa.setSalario(2000);
        aa.calculaSalario();
        aa.setTurno(2); //1 - DIA / 2 - NOITE
        
        at.setMatricula(02);
        at.setNome("Beatriz");
        at.setSalario(2500);
        
        JOptionPane.showMessageDialog(null, "Assistente Administrativo:\n"
                                  + "Matrícula: " + aa.getMatricula() + "\n"
                                  + "Nome: " + aa.getNome() + "\n"
                                  + "Salário: R$" + aa.getSalario() + "\n"                                  
                                  + "Salario com bônus noturno de 10%: R$" + aa.calculaSalario() + "\n"
                                  
                                  + "--------------------------------------\n"
                
                                  + "Assistente Técnico:\n"
                                  + "Matrícula: " + at.getMatricula() + "\n"
                                  + "Nome: " + at.getNome() + "\n"
                                  + "Salário: R$" + at.getSalario() + "\n"
                                  + "Salario com bônus de 10%: R$" + at.calculaSalario());
    }
    
}
