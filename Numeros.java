import java.util.Scanner;

public class Numeros {
    
    // Atributos de la clase
    private double number1;
    private double number2;
    private double operacion;

    Numeros()
    {
    }

    Numeros(double number1, double number2, double operacion)
    {
        this.number1 = number1;
        this.number2 = number2;
        this.operacion = operacion;
        
    } 

    // Método donde se pide por consola la operación a realizar y los números para la operación
    public void Datos()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el número de la operación que desea hacer \n(1) Suma\n(2) Resta\n(3) Multiplicación\n(4) División\n(5) Fibonacci\n(6) Factorial\n(7) Potencia:");
        operacion = input.nextFloat();
        
        if(operacion >= 1 && operacion <= 4)
        {
            System.out.println("Ingrese el número 1: ");
            number1 = input.nextFloat();

            System.out.println("\nIngrese el número 2: ");
            number2 = input.nextFloat();
        }
        else if(operacion == 5)
        {
            System.out.println("Ingrese el número el cual quiere saber la secuencia de fibonacci: ");
            number1 = input.nextFloat();
            number2 = 0;
        }
        else if(operacion == 6)
        {
            System.out.println("Ingrese el número el cual quiere saber el factorial: ");
            number1 = input.nextFloat();
            number2 = 0;
        }
        else if(operacion == 7)
        {
            System.out.println("Ingrese la base de la potencia: ");
            number1 = input.nextFloat();
            
            System.out.println("\nIngrese el exponente de la potencia: ");
            number2 = input.nextFloat();
        }
        else
        {
            System.out.println("No es posible hacer la operación, intentelo más tarde");
            input.close();
        } 
    }


    // Modificador de acceso para que el operador sea manipulado en otras clases
    public double getOperacion()
    {
        return operacion;
    }
    
    // Getters y setter de los atributos para poder acceder a ellos
    public double getNumber1()
    {
        return number1;
    }

    public void setNumber1(int number1)
    {
        this.number1 = number1;
    }


    public double getNumber2()
    {
        return number2;
    }

    public void setNumber2(int number2)
    {
        this.number2 = number2;
    }
}