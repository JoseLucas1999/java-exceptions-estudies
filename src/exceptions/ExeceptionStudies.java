package exceptions;

public class ExeceptionStudies {
	
//------------------------------------------------------------------------	
//	ArrayIndexOutOfBoundsException
	public static void arrayIndexOutOfBounds() {
        int [] numeros = {1,2,3};
        System.out.println(numeros[5]);
	}

//------------------------------------------------------------------------	
//	NullPointerException
    public static void nullPointer() {
    	Object ob = null;
    	System.out.println(ob.toString()); //there are not ob to convert
    }
    
//------------------------------------------------------------------------	
//    ArithmeticException
    public static void Arithmetic() {
    	int a = 10;
    	int b = 0;
    	int c = a/b;
    	System.out.println("Valor de c eh: "+c);    
    }
//------------------------------------------------------------------------
//    NumberFormatException
//    Quando tentamos converter uma String para um número e ela não é um número válido.
    public static void NumberFormat() {
    	String num = "abc";
    	int valor = Integer.parseInt(num);
    	System.out.println("Valor de parse eh: "+valor);    
    }
//---------------------------------------------------------------------
//    ClassCastException
//    Quando tentamos converter (cast) um objeto para um tipo que não é compatível.
    public static void ClassCast() {
    	Object obj = "sou uma string";
    	Integer num = (Integer) obj;
    }
//---------------------------------------------------------------------	
//---------------------------------------------------------------------	
//---------------------------------------------------------------------	
}
