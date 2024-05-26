import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner (System.in);
        System.out.println("Digite o primeiro parametro"); 
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo paramentro");
        int paramentroDois = terminal.nextInt();   
        
        try{
            contar(parametroUm, paramentroDois);
        }catch(ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }

        terminal.close();

    }

    static void contar(int parametroUm, int paramentroDois) throws ParametrosInvalidosException{
        if(parametroUm > paramentroDois){
            throw new ParametrosInvalidosException("O Segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = paramentroDois - parametroUm;

        for(int i = 1; i <- contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }



    
    
}