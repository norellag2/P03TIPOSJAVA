public class c04promocion {
    public static void main(String[] args) {
        //Promocion
        //la promoción realiza una conversion implicita en los siguientes casos
        // 1.-Cuando en una expresion dos valores tienen diferentes tipos, Java promueve uno de los valores al mayor tipo
        int a = 1;
        long b = 15446648L;
        long c = a * b; // compila porque promociona el tipo int a long
        // 2.- Si uno de los valores es entero y el otro flotante promueve a flotante
        float d = 1.5f;
        float e = a * d;
        // 3.- Para los tipos de datos "pequeños" (byte, short, char) se promocionan siempre a int aunque ninguno lo sea
        short f = 2;
        byte g = 1;
        int h = f * g; 
        // 4.- En expresiones complejas en las que un operando recibiera una asignación si el nuevo valor desborda el destino no compilará
        byte i = 10;
        long j = 649498645L;
        long k = j * i;
        // long k = j * (i = 2000); error
    }
}
