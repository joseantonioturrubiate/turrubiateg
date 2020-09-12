package tarea3;

public class fibo 
{

    public static void main(String[] args)
    {
        
        int valor1=0;
        int valor2=1;
        int x = 0;

        
        do{
            int valor3=valor1+valor2;

            System.out.println(valor3);

            x = x + 1;
            valor1=valor2;
            valor2=valor3;
        
        }
        while(x!=10);
    }
    }
    

