package TF;

import java.util.*;

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

}


