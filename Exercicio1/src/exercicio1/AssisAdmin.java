package exercicio1;

public class AssisAdmin extends Assistente{
    private int turno;
    private double salario;  
    
    public double calculaSalario(){
        
        switch (turno){
            case 1:                
            break;
                
            case 2:                
                 double adicional = salario * 0.1;
                 salario = salario + adicional;
            break;
        }
        
    return salario;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }        
}
