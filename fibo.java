public class fibo 
{

    public static void main(String[] args)
    {
        
        int valor1=0;
        int valor2=1;

        for (int x=1; x<=10;x++)
        {
            int valor3=valor1+valor2;
            System.out.println(valor3);
            valor1=valor2;
            valor2=valor3;
        
        }
    }
    }
    

