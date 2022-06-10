public class c03conversionexplicita {
    public static void main(String[] args) {
        // la conversion explícita o casting
        //utiliza la sintaxis (tipo-destino)
        //Excepto boolean y conversión de objeto a primitivo
        //Ojo, el casting puede dar resultados inesperados
        int variable1 = 12222222;
        byte variable2 = (byte) variable1;
        System.out.println(variable2);
        // no se puede hacer con boolean
        boolean esMayorEdad = false;
       // int variable3 = (int = esMayorEdad); error
       // no podemos castear un objeto a primitivo
       String variable4 = "Juan";
       //char variable5  = (char) variable4; Error
    }
}
