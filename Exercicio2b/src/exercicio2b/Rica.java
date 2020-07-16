package exercicio2b;

public class Rica extends Pessoa{
    private double dinheiro;
    
    public void FazCompras(){
        System.out.println("A pessoa rica foi as compras");
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }        
}
