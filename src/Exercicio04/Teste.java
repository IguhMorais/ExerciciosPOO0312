package Exercicio04;
import java.util.Scanner;

public class Teste{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        Administrador admin = new Administrador();

        System.out.println("Digite o nome de Administrador: ");
        admin.setNome(in.nextLine());
        System.out.println("Digite o Codigo de Setor do Administrador");
        admin.setCdSetor(in.nextInt());
        System.out.println("Digite o telefone do Administrador: ");
        admin.setTelefone(in.next());
        System.out.println("Digite o Salario base do Administrador: ");
        admin.setSalBase(in.nextDouble());
        System.out.println("Digite o imposto a ser pago pelo Administrador: ");
        admin.setImposto(in.nextDouble());
        System.out.println("Digite o valor da ajuda de Custo");
        admin.setAjudaDeCusto(in.nextInt());
        System.out.println("Digite o endereço do Administrador:");
        admin.setEndereco(in.next());
        
        System.out.println("Codigo:"+admin.getCdSetor()+"\tNome:"+admin.getNome()+"\tendereco:"+admin.getEndereco()+"\t\nTelefone:"+admin.getTelefone()+"\tSalario:"+admin.calcularSalario());
    }
    
}