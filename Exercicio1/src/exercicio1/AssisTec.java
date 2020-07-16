package exercicio1;

public class AssisTec extends Assistente{
    private double salario;
    
    public double calculaSalario(){
            double adicional = salario * 0.1;
            salario = salario + adicional;
        return salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
