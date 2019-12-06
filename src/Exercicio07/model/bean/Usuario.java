package Exercicio07.model.bean;

public class Usuario{

    private byte idUsuario;
    private String nome;
    private String email;

    public byte getIdUsuario(){
        return this.idUsuario;
    }

    public void setIdUsuario(byte id){
        this.idUsuario = id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String name){
        this.nome = name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String mail){
        this.email = mail;
    }
    
}