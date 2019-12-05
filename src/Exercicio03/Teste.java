package Exercicio03;
import java.util.Scanner;
public class Teste{
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        Empregado white = new Empregado();
        
        System.out.println("Digite o nome de Empregado: ");
        white.setNome(in.nextLine());
        System.out.println("Digite o Codigo de Setor do Empregado");
        white.setCdSetor(in.nextInt());
        System.out.println("Digite o telefone do Empregado: ");
        white.setTelefone(in.next());
        System.out.println("Digite o Salario base do Empregado: ");
        white.setSalBase(in.nextDouble());
        System.out.println("Digite o imposto a ser pago pelo empregado: ");
        white.setImposto(in.nextDouble());
        System.out.println("Digite o endereço do Empregado:");
        white.setEndereco(in.next());
        
        System.out.println("Codigo:"+white.getCdSetor()+"\tNome:"+white.getNome()+"\tendereco:"+white.getEndereco()+"\t\nTelefone:"+white.getTelefone()+"\tSalario:"+white.calcularSalario());
        
    }
    
}