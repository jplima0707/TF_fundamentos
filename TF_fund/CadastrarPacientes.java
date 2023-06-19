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
    public boolean removePaciente(int indice){  
        indice--;
        if(indice<0 || indice>=lugar) return false;
        for(int i=indice; i<lugar-1; i++){
            vetor[i] = vetor[i+1];
        }
        lugar--;
        vetor[lugar]=null;
        return true;
    }
    public void imprimeVetor(){
        for(int i=0; i<lugar; i++){
            System.out.println("Paciente numero:" + (i+1)+ "\n");            
            System.out.println(vetor[i].toString()+"\n");
        }        
    }
        public void ordena(){
        Pacientes aux;
        int r;
        for(int i=0; i<lugar-1; i++){
            for(int j=0; j<lugar-1-i; j++){
                r = vetor[j].getNome().compareToIgnoreCase(vetor[j+1].getNome());
                if(r>0){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }
    public double mediaConsultas(){
        int soma = 0;
        double media;
        for(int i=0; i<lugar; i++){
        soma = vetor[i].getConsultas() + soma;
        } 
        media = soma/lugar;   
        return media;
       }
    public double porcentagemCovid(){
        int soma1 = 0;
        for(int i=0; i<lugar;i++){
            if(Integer.valueOf(vetor[i].getDiagnostico()) == 1){
                soma1 = soma1 + 1;
            }
        }
        double p1 = (double)soma1/lugar;
        p1 = p1*100;
        return p1;
        }
        public double porcentagemDengue(){
        int soma2 = 0;
        for(int i=0; i<lugar;i++){
            if(Integer.valueOf(vetor[i].getDiagnostico()) == 2){
                soma2 = soma2 +1;
            }
        }
        double p2 = (double)soma2/lugar;
        p2 = p2*100;
        return p2;
        }
        public double porcentagemInfluenza(){
        int soma3 = 0;
        for(int i=0; i<lugar;i++){
            if(Integer.valueOf(vetor[i].getDiagnostico()) == 3){
                soma3 = soma3 +1;
            }
        }
        double p3 = (double)soma3/lugar;
        p3 = p3*100;
        return p3;
        }
        public double porcentagemMeningite(){
        int soma4 = 0;
        for(int i=0; i<lugar;i++){
            if(Integer.valueOf(vetor[i].getDiagnostico()) == 4){
                soma4 = soma4 +1;
            }
        }
        double p4 = (double)soma4/lugar;
        p4 = p4*100;
        return p4;
        } 
        public double porcentagemOutro(){
        int soma5 = 0;
        for(int i=0; i<lugar;i++){
            if(Integer.valueOf(vetor[i].getDiagnostico()) == 5){
                soma5 = soma5 +1;
            }
        }
        double p5 = (double)soma5/lugar;
        p5 = p5*100;
        return p5;
        }
    }   


