package exercicio2b;

public class Exercicio2b {

    public static void main(String[] args) {
        Rica p1 = new Rica();
        Pobre p2 = new Pobre();
        Miseravel p3 = new Miseravel();
        
        p1.setNome("Bill Gates");
        p1.setIdade(64);
        p1.setDinheiro(1000000000.00);
        System.out.println(p1.toString() + " Dinheiro: " + p1.getDinheiro());        
        p1.FazCompras();
        
        System.out.println("\n");
        
        p2.setNome("Miguel");
        p2.setIdade(42);
        System.out.println(p2.toString());
        p2.Trabalha();
        
        System.out.println("\n");
        
        p3.setNome("Valdisney");
        p3.setIdade(56);
        System.out.println(p3.toString());
        p3.mendiga();
    }   
}
