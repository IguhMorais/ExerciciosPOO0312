package Exercicio04;
import Exercicio03.Empregado;
public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public double getAjudaDeCusto(){
        return this.ajudaDeCusto;
    }

    public void setAjudaDeCusto(double val){
        this.ajudaDeCusto = val;
    }

    @Override
    public double calcularSalario(){
        return getAjudaDeCusto()+(getSalBase()-(getSalBase()*(getImposto()/100)));
    }

    public double calcularSalario(double sal , double imposto, double ajuda){
        return ajuda+(sal-(sal*(imposto/100)));
    }

    public Administrador(){
        
    }
    

}