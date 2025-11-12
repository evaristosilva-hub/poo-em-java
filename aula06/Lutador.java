package aula06;

public class Lutador {
    //Atributos 
    private String nome,nacionalidade,categorias;
    public String getCategorias() {
        return categorias;
    }
   private void setCategorias() {
        if (this.peso < 52.2){
            this.categorias="Inválido";
        }else if(this.peso <= 70.3) {
            this.categorias = "Leve";
        }else if (this.peso <= 83.9){
            this.categorias = "Médio";
        }else if (this.peso <= 120.2){
            this.categorias = "Pesado";
        }else{
            this.categorias="Iválido";
        }
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    private int idade,vitorias,derrotas,empates;
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    private float altura,peso;
    
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategorias();
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    //Métodos Públicos
    public void apresentar() {
        System.out.println("--------------------------------------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com "+ this.getIdade () + " anos e " + this.altura );
        System.out.println("Pesando: " + getPeso () + "Kg ");
        System.out.println("Possui " + this.getVitorias() + " Vitorias " + this.getDerrotas() + " Derrotas " + "e " + getEmpates() + " Emapate ");
    }
    public void status(){
        System.out.println("---------------------------------------------");
        System.out.println(getNome() + " é um peso " + getCategorias());
        System.out.println(" Ganhou: " + this.getVitorias() + " vezes ");
        System.out.println(" Perdeu: " + this.getDerrotas() + " vezes ");
        System.out.println(" Empatou: " + this.getEmpates() + " vezes ");

    }
    public void ganharLuta(){
        setVitorias(getVitorias () +1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas () +1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates () +1);
    }
    
    //Métodos Especiais
    public Lutador(String no, String na, int id, float al,float pe, int vi, int de, int em){
        this.nome=no;
        this.nacionalidade=na;
        this.idade=id;
        this.altura=al;
        this.setPeso(pe);
        this.vitorias=vi;
        this.derrotas=de;
        this.empates=em;
    }
    
}
