public class c01clasesenvoltorio {
    public static void main(String[] args) {
        //Clases de envoltorio
        // Proporcionan métodos a los tipos primitivos con funcionalidad
        // Clase identificador = new Clase (valor)
        Float valor1 = new Float(9.8f);
        // Permite recibir el tipo de su clase o un string (nos permite parsear)
        Float valor2 = new Float("8.5f");
        //¿qué beneficios obtenemos con estas clases?
        //Múltiples funcionalidades, por ejemplo parsear
        String valor3 = valor2.toString();
        System.out.println(valor3);
        Integer valor4 = new Integer(3);
        Integer valor5 = new Integer(3);
        System.out.println(valor4 == valor5); //devuelve false
        //porque son objetos
        // por el mismo motivo, son objetos, para hacer asignaciones debemos extraer el valor, todas las clases envoltorio
        //tienen un método para extraer con el sufijo Value()
        float valor6 = valor2.floatValue(); //retorna el valor
        // desde Java 5 disponemos del concepto de autoboxing: asignar un valor primitivo a una clase de envoltorio(evita usar el constructor de la clase)
        Integer valor7 = 12; // sin usar el constructor
        // y también lo contrario, el concepto de unboxing recuperar el valor primitivo sin los metodos Value()
        int valor8 = valor7;
    }
}
