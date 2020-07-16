package exercicio3;

import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args) {
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual Tipo de ingresso deseja comprar?\n"
                + "1 - Normal\n"
                + "2 - VIP"));
        
        switch(opcao){
            case 1: 
                Normal n = new Normal();
                n.imprimeValor();
                break;
                
            case 2: 
                int opaco2 = Integer.parseInt(JOptionPane.showInputDialog("Qual Tipo de camarote?\n"
                + "1 - Superior\n"
                + "2 - Inferior"));
                
                switch(opaco2){
                    case 1: 
                        CamaroteSuperior sup = new CamaroteSuperior();                        
                        sup.imprimeValor();
                        break;
                        
                    case 2:
                        CamaroteInferior inf = new CamaroteInferior();
                        inf.imprimeValor();
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Invalida");
                        break;
                }
            break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opção Invalida");
                break;
        }
        
    }
    
}
