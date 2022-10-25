public class MInhaCalsse {
    public static void main(String[] args) {
        
        String primeiroNome = "Nick";
        String segundoNome = "Castle";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);


    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
