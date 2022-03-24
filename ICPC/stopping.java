
import java.io.*;
public class stopping{
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        String linea = in.readLine();
        String elems[]=linea.split(" ");
        int millasTotales= Integer.parseInt(elems[0]);
        int pDescanso= Integer.parseInt(elems[1]);
        int pComida= Integer.parseInt(elems[2]);
        int[] arreglo= new int[millasTotales+1];
        
        int resultado=0;
        int descansoAux=pDescanso;
        int comidaAux=pComida;
        for (int i= 1; i<=millasTotales;i++){
            arreglo[i]=0;
            if(i==pDescanso){
                arreglo[i]=1;
                pDescanso+=descansoAux;
            }
            if(i==pComida){
                 arreglo[i]=1;
                 pComida+=comidaAux;
            }
        }
        for(int j= 0; j<=millasTotales-1;j++){
            if(arreglo[j]==1){
                resultado++;
            }
        }
        System.out.println(resultado);
    }
}
