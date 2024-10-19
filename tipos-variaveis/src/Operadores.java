public class Operadores {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        //Operadores aritméticos
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("b--   = " +  (a--) );
        // Check the difference in d++ and ++d
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );
        
        //Operadores relacionais
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );
        
        //Operadores lógicos
        boolean x = true;
        boolean y = false;
        System.out.println("x && y = " + (x&&y));
        System.out.println("x || y = " + (x||y) );
        System.out.println("!(x && y) = " + !(x && y));

        //Concatenação de Strings
        String nome = "João";
        String sobrenome = "Silva";
        System.out.println("Nome completo: " + nome + " " + sobrenome);

        //Concatenação de Strings com números inteiros
        int idade = 18;
        System.out.println("Nome: " + nome + " " + sobrenome + " Idade: " + idade);
        
    }
    
}
