public class TipoVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Write here the primitive types in Java
        //byte, short, int, long, float, double, char, boolean

        //Setting the values of the variables
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.4028235E38f;
        double d = 1.7976931348623157E308;
        char c = 'a';
        boolean bool = true;

        //Printing the values of the variables
        System.out.println("Printing the values of the variables:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        //Some examples of variables and values (print)
        double salarioMinino = 1412.00; //Valor atualizado em 2024
        System.out.println("Salario minimo: " + salarioMinino);

        //Some examples of constants and values (print)
        //Double constant
        final double PI = 3.14159265359;
        System.out.println("Valor de PI: " + PI);

        //Integer constant
        final int ANO = 2024;
        System.out.println("Ano atual: " + ANO);

        //String constant
        final String NOME = "João";
        System.out.println("Nome: " + NOME);

        //Boolean constant
        final boolean ATIVO = true;
        System.out.println("Ativo: " + ATIVO);

        //Char constant
        final char SEXO = 'M';
        System.out.println("Sexo: " + SEXO);

        //Byte constant
        final byte IDADE = 18;
        System.out.println("Idade: " + IDADE);

        //Short constant
        final short PESO = 70;
        System.out.println("Peso: " + PESO);

        //Long constant
        final long CPF = 12345678910L;
        System.out.println("CPF: " + CPF);

        //Float constant
        final float ALTURA = 1.80f;
        System.out.println("Altura: " + ALTURA);

    }
}
