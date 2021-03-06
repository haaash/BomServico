package BD.Entidades;

public class Servico {
    private int cod;
    private String nome;
    
    public Servico(int cod, String nome){
        this.cod = cod;
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return String.format("%s,%s", cod+"", nome);
    }
    
    public Servico(String nome){
        this(0, nome);
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
