public class DeclarandoVariavel {
    public static void main(String[] args) {
        var meunome = "Igor"; //Outra forma de delcarar a variavel (o próprio Java infere o seu tipo)
        int minhaidade = 18; //Não é possivel mudar o tipo de varivel depois de declarada

        //tipos de interios em Java
        byte numero1 = 5; //vai de -128 a 127 (8 bits)
        short numero2 = 324; //vai de -32.768 a 32.767 (16 bits)
        int numero3 = 55423; //2.15 trilhoes (32 bits)
        long numero4 = 448655L; //acima dos trilhoes (64 bits)

        //tipos decimais
        float numero5 = 123.45f; //baixa precisao (32 bits)
        double numero6 = 123.456; //acima de duas casas decimais (64 bits)

        //tipos de caracter
        char letra = 'a'; //declara somente UMA letra (utiliza aspas simples)
        String palavra = "Aqui vale tudo";

        //tipo logico
        boolean logic = true;

        System.out.println("Meu nome é " + meunome);
        System.out.println("Minha idade: " + minhaidade + " anos");
    }
}
