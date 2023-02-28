public class Operaciones extends Numeros{
    
    // Atributo de la clase que almacenará el resultado de la operación
    private double resultado;

    Operaciones(double a, double b, double operacion)
    {
        super(a, b, operacion);
    }

    // Métodos para realizar las operaciones 
    public double Suma()
    {
        resultado = getNumber1() + getNumber2();
        return resultado;
    }

    public double Resta()
    {
        resultado = getNumber1() - getNumber2();
        return resultado;
    }

    public double Multiplicacion()
    {
        resultado = getNumber1() * getNumber2();
        return resultado;
    }

    public double Division()
    {
        resultado = getNumber1() / getNumber2();
        return resultado;
    }


    // Método donde se decide que operación se hará y que imprime lo que devuelve cada método
    public void Operador()
    {
        if(getOperacion() == 1)
        {
            System.out.println("\n" + "Respuesta: " + Suma());
        }
        else if(getOperacion() == 2)
        {
            System.out.println("\n" + "Respuesta: " + Resta());
        }
        else if(getOperacion() == 3)
        {
            
            System.out.println("\n" + "Respuesta: " + Multiplicacion());
        }
        else if(getOperacion() == 4)
        {
            System.out.println("\n" + "Respuesta: " + Division());
        }
    }

}
