package aula10;

public class Aluno extends Pessoa {
    private int matric;
    private String curso;

    public void cancelarMatrc(){
        System.out.println();
        System.out.println("Matrícula será concelada ");

    }

    public int getMatric() {
        return matric;
    }

    public void setMatric(int matric) {
        this.matric = matric;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}
