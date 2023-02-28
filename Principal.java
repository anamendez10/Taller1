public class Principal {
    public static void main(String[] args)
    {
        Numeros numeros = new Numeros();
        numeros.Datos();
        double operacion = numeros.getOperacion();
        double number1 = numeros.getNumber1();
        double number2 = numeros.getNumber2();
        
        
        if(operacion >= 1 && operacion <= 4)
        {
            Operaciones operaciones = new Operaciones(number1, number2, operacion);
            operaciones.Operador();
        }
        else if(operacion >= 5 && operacion <= 7)
        {
            Recursividad recursividad = new Recursividad(number1, number2, operacion);
            recursividad.Problema();
        }
    }
}
