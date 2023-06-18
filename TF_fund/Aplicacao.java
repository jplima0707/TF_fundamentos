import java.util.*;

public class Aplicacao{
        public static void main(String[]args){
            CadastrarPacientes cadastro = new CadastrarPacientes(10);
        Scanner in = new Scanner(System.in);
        int opcao;
        do{
        System.out.println("----MENU----");
        System.out.println("1 - Cadastrar paciente");
        System.out.println("2 - Remover paciente");
        System.out.println("3 - Mostrar pacientes cadastrados");
        System.out.println("4 - Pacientes cadastrados em ordem alfabética");
        System.out.println("5 - Media de consultas entre os pacientes");
        System.out.println("6 - Porcentagem das doenças entre os pacientes ");
        System.out.println("0 - Sair");
        opcao = in.nextInt();
        switch(opcao){
            case 0:
            System.out.println("Programa encerrado.");
            break;

            case 1:
            Pacientes paciente = new Pacientes();
            paciente.setNome();
            paciente.setcpf();
            paciente.setTelefone();
            paciente.setConvenio();
            paciente.setDiagnostico();
            paciente.setConsultas();
    
            boolean adicionado = cadastro.adicionaNoVetor(paciente);
            if (adicionado) {
            System.out.println("Paciente adicionado com sucesso.");
            } else {
            System.out.println("Não foi possível adicionar o paciente. O vetor está cheio.");
            }
            break;

            case 2: 
            System.out.println("Digite o nome do paciente a ser removido:");
            Pacientes pacienteRemocao = new Pacientes();
            pacienteRemocao.setNome();

            boolean removido = cadastro.removePaciente(pacienteRemocao);
            if (removido) {
            System.out.println("Paciente removido com sucesso.");
                } else {
            System.out.println("Paciente não encontrado. Nenhum paciente foi removido.");
            }
            break;

            case 3:
            cadastro.imprimeVetor();
            break;

            case 4:
            cadastro.ordena();
            break;

            case 5:
            double mediaConsultas = cadastro.mediaConsultas();
            System.out.println("Media de consultas: "+mediaConsultas);
            break;

            case 6:
            double perc1 = cadastro.porcentagemCovid();
            double perc2 = cadastro.porcentagemDengue();
            double perc3 = cadastro.porcentagemInfluenza();
            double perc4 = cadastro.porcentagemMeningite();
            double perc5 = cadastro.porcentagemOutro();
            
            System.out.println("Covid: "+perc1+"%");
            System.out.println("Dengue: "+perc2+"%");
            System.out.println("Influenza: "+perc3+"%");
            System.out.println("Meningite: "+perc4+"%");
            System.out.println("Outro: "+perc5+"%");
            break;
        }
        
    }while(opcao!=0);
}
}