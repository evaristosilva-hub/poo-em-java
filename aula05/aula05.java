package aula05;
public class aula05 {

public static void main(String[] args) {
    System.out.println("--------------------------------------------");
    ContaBanco p1 = new ContaBanco (null, null, 0, 0, false);
    p1.setnumConta(1111);
    p1.setdono("Jubileu");
    p1.abrirConta("CC");
    p1.depositar(150);
    p1.sacar(200);
    p1.fecharConta();

    System.out.println("--------------------------------------------");

    ContaBanco p2 = new ContaBanco (null, null, 0, 0, false);
    p2.setnumConta(2222);
    p2.setdono("Creuza");
    p2.abrirConta("CP");
    p2.depositar(500);
    p2.sacar(100);
    p2.pagarMensal();

    System.out.println("--------------------------------------------");
    ContaBanco p3 = new ContaBanco (null, null, 0, 0, false);
    p3.setnumConta(3333);
    p3.setdono("Ana");
    p3.abrirConta("CC");
    p3.depositar(300);
    p3.sacar(300);
    p3.pagarMensal();
    p3.fecharConta();

    p1.estadoAtual();
    p2.estadoAtual();
    p3.estadoAtual();
   

    

    }
}
