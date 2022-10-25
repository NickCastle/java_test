public class TiposVariaveis {
    public static void main(String[] args) {
        int numero = 5;

        numero = -numero;
        
        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        //operadores ternarios:

        //<expressão condicional> ? <caso condição seja true> : <caso condição seja false>

        int a, b;
       
        a=5;
        b=5;

        String resultado1 = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado1);
    }
}
