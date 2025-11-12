package aula10;

public class EscolaInova {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudia");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p1.setIdade(50);

        p4.setIdade(35);
        p4.setSexo("F");

        p2.setIdade(18);
        p2.setSexo("F");
        

        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        p3.receberAum(550.20);
        p4.mudarTrabalho();
        p2.cancelarMatrc();

    }
}
