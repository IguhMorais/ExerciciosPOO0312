package Exercicio01;
public class Pessoa{
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(){

    }
    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome , String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = "rua dos bobo numero nove";
    }

    public String getNome() {
		return this.nome;
	}
	public void setNome(String nomePessoa) {
		this.nome = nomePessoa;
    }
    
    public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
    }
    
    public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}