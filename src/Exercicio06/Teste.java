package Exercicio06;
import java.util.Scanner;

public class Teste{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Vendedor vendedor = new Vendedor();

        System.out.println("Digite o nome de Vendedor: ");
        vendedor.setNome(in.nextLine());
        System.out.println("Digite o Codigo de Setor do Vendedor");
        vendedor.setCdSetor(in.nextInt());
        System.out.println("Digite o telefone do Vendedor: ");
        vendedor.setTelefone(in.next());
        System.out.println("Digite o Salario base do Vendedor: ");
        vendedor.setSalBase(in.nextDouble());
        System.out.println("Digite o imposto a ser pago pelo Vendedor: ");
        vendedor.setImposto(in.nextDouble());
        System.out.println("Digite o valor das vendas");
        vendedor.setValorVenda(in.nextInt());
        System.out.println("Digite a porcentagem de comisao");
        vendedor.setComisao(in.nextInt());
        System.out.println("Digite o endereço do Vendedor:");
        vendedor.setEndereco(in.next());
        
        System.out.println("Codigo:"+vendedor.getCdSetor()+"\tNome:"+vendedor.getNome()+"\tendereco:"+vendedor.getEndereco()+"\t\nTelefone:"+vendedor.getTelefone()+"\tSalario:"+vendedor.calcularSalario());

    }
}