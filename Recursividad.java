import java.lang.Math;

public class Recursividad extends Numeros{

    double a = getNumber1();
    double b = getNumber2();
    double operacion = getOperacion();

    
    Recursividad(double a, double b, double operacion)
    {
        super(a, b, operacion);
    } 



    public double Fibonacci(double a)
    {
        // Caso base
        if(a == 1)
        {
            return 0;
        }
        else if(a == 2)
        {
            return 1;
        }
        else
        {
            return Fibonacci(a - 2) + Fibonacci(a - 1);
        }
    }

    public double Factorial(double a)
    {
        if(a == 1)
        {
            return 1;
        }
        else
        {
            return a * Factorial(a - 1);
        }
    }

    public double Potencia(double a, double b) // a = base, b = exponente
    {
        if(b == 1) // Si se tiene un exponente a la uno se retornará el mismo número
        {
            return a;
        }
        else if(b == 0) // Si se tiene un exponente 0 por regla da 1
        {
            return 1;
        }
        else if(a == 2) 
        {
            return Potencia(a, b - 1) + Potencia(a, b - 1);
        }
        else if(a > 2 && a % 2 == 0)
        {
            return Potencia(a * (getNumber1() / 2), b - 1) + Potencia(a * (getNumber1() / 2), b - 1);
            
        }
        else
        {
            return Potencia(a * Math.floor((getNumber1() / 2)), b - 1) + Potencia(a * Math.floor((getNumber1() / 2)), b - 1) + Potencia(a, b - 1);
        }
    }

    public void Problema()
    {
        if(operacion == 5)
        {
            System.out.println("Respuesta: " + Fibonacci(a));
        }
        else if(operacion == 6)
        {
            System.out.println("Respuesta: " + Factorial(a));
        }
        else if(operacion == 7)
        {
            System.out.println("Respuesta: " + Potencia(a, b));
        }
    }
}
