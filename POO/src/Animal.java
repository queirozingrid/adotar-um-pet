public class Animal {
    protected String nome;
    private String raca;
    private int idade;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void alimentar(){
        System.out.println(this.nome + "está sendo alimentado");
    }

    public void ninar(){
        System.out.println("colocando " + this.nome + " para dormir");
    }
    public void brincar(){

    }
}
