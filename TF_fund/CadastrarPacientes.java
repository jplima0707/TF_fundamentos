public class CadastrarPacientes{
    private Pacientes [] vetor;
    private int lugar;

    public CadastrarPacientes(int tamanho){
        vetor = new Pacientes[tamanho];
        lugar = 0;

    }
     public boolean adicionaNoVetor(Pacientes a){
        if(lugar >= vetor.length){
            return false;
        } else {
            vetor[lugar] = a;
            lugar++;
            return true;
        }
     }
    public int localizaPaciente(Pacientes g) 
     {  int local=-1;
         for(int i=0; i<lugar; i++)
         {
            if(vetor[i]==g){local=i;}            

        }
        return local;
    }
    public boolean removePaciente(Pacientes g)
    {
        int posicao= localizaPaciente(g);
               {
                for(int i= posicao; i<lugar-1; i++){
                    vetor[i] = vetor[i+1];
                }
                vetor[lugar-1] = null;      
                lugar--;        
                return true; 
            }
    }  
    public void imprimeVetor(){
        for(int i=0; i<lugar; i++){
            System.out.println("Paciente numero:" + (i+1)+ "\n");            
            System.out.println(vetor[i].toString());
        }        
    }
    public void ordena(){
        Pacientes aux;
        for(int i=0; i<lugar-1; i++){
            for(int j=0; j<lugar-1-i; j++){
                 if (vetor[j].getNome().compareToIgnoreCase(vetor[j+1].getNome()) > 0);
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    public double mediaConsultas(){
        int soma = 0;
        double media = 0;
        for(int i=0; i<lugar; i++){
        soma = vetor[i].getConsultas() + soma;
        } 
        media = soma/lugar;   
        return media;
       }
    public double porcentagemCovid(){
        int soma = 0;
        for(int i=0; i<lugar;i++){
            vetor[i].getDiagnostico();
            if(vetor[i].getDiagnostico() == 1){
                soma = soma+1;
            }
        }
        double p1 = soma/lugar;
        p1 = p1*100;
        return p1;
        }
        public double porcentagemDengue(){
        int soma = 0;
        for(int i=0; i<lugar;i++){
            vetor[i].getDiagnostico();
            if(vetor[i].getDiagnostico() == 2){
                soma = soma+1;
            }
        }
        double p2 = soma/lugar;
        p2 = p2*100;
        return p2;
        }
        public double porcentagemInfluenza(){
        int soma = 0;
        for(int i=0; i<lugar;i++){
            vetor[i].getDiagnostico();
            if(vetor[i].getDiagnostico() == 3){
                soma = soma+1;
            }
        }
        double p3 = soma/lugar;
        p3 = p3*100;
        return p3;
        }
        public double porcentagemMeningite(){
        int soma = 0;
        for(int i=0; i<lugar;i++){
            vetor[i].getDiagnostico();
            if(vetor[i].getDiagnostico() == 4){
                soma = soma+1;
            }
        }
        double p4 = soma/lugar;
        p4 = p4*100;
        return p4;
        } 
        public double porcentagemOutro(){
        int soma = 0;
        for(int i=0; i<lugar;i++){
            vetor[i].getDiagnostico();
            if(vetor[i].getDiagnostico() == 5){
                soma = soma+1;
            }
        }
        double p5 = soma/lugar;
        p5 = p5*100;
        return p5;
        }
    }   


