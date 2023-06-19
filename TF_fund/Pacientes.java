import java.util.*;

public class Pacientes {
    Scanner in = new Scanner(System.in);
    private String nome;
    private String cpf;
    private String telefone;
    private String convenio;
    private int diagnostico;
    private int consultas;

    public void CadastrarPaciente(String nome, String cpf,String telefone, String convenio, int diagnostico, int consultas){
        this.nome = nome;
        this.cpf=cpf;
        this.telefone=telefone;
        this.convenio=convenio;
        this.diagnostico=diagnostico;
        this.consultas=consultas;

        return;
    }
    public String getNome(){
        return nome;
    }
    public String getcpf(){
        return cpf;
    }
    public String getTelefone(){
        return telefone;
    }
    public String getConvenio(){
        return convenio;
    }
    public int getDiagnostico(){
        return diagnostico;
    }    
    public int setDiagnostico(){
        System.out.println("Escolha uma das opcoes de diagnostico:");
        System.out.println("1-COVID");
        System.out.println("2-DENGUE");
        System.out.println("3-INFLUENZA");
        System.out.println("4-MENINGITE");
        System.out.println("5-OUTRO");
        diagnostico= in.nextInt();
        switch(diagnostico){
            case 1:
            System.out.println("COVID");
            break;
            case 2:
            System.out.println("DENGUE");
            break;
            case 3:
            System.out.println("INFLUENZA");
            break;
            case 4:
            System.out.println("MENINGITE");
            break;
            case 5:
            System.out.println("OUTRO");
            break;
        }
        return diagnostico;
    }
    public int getConsultas(){
        return consultas;
    }
    public void setNome(){
        System.out.println("Digite o nome do paciente:");
        nome=in.nextLine();
    }
    public void setcpf(){
        System.out.println("Digite o cpf do paciente:");
        cpf=in.nextLine();
    }
    public void setTelefone(){
        System.out.println("Digite o telefone do paciente:");
        telefone=in.nextLine(); 
    }
    public void setConvenio(){
        System.out.println("Digite o convenio do paciente:");
        convenio=in.nextLine();
    }
    public void setConsultas(){
        System.out.println("Digite o numero de consultas do paciente no mês:");
        consultas=in.nextInt();
    }
    public boolean PesquisaPaciente(){
        System.out.println("Digite o cpf de paciente: ");
        String CPF = in.nextLine();
        if(CPF == cpf){
          return true;  
        }
        else return false;
    }         
    public  double CalculaConsulta(double valor){
        System.out.println("Digite o valor da consulta: ");
        valor = in.nextDouble();
        double preco = valor * getConsultas();
        return preco;
    }
    public String toString(){
        return "Nome:"+nome+ "\n CPF: " + cpf + "\n Telefone: " + telefone+"\n Convenio: " + convenio + "\n Numero de Consultas: " + consultas+ "\n Diagnostico: " + diagnostico;
    }
}