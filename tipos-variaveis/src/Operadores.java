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
        

        //Operador ternário
        // Explicação: Se a idade for maior ou igual a 18, então a pessoa é adulta,
        //caso contrário, é menor de idade
        int idade2 = 20;
        String status = (idade2 >= 18) ? "Adulto" : "Menor de idade";
        System.out.println("Status: " + status);
        
        //Mesmo exemplo, porém com if e else
        if(idade2 >= 18){
            status = "Adulto";
        }else{
            status = "Menor de idade";
        }

        //Operador de atribuição
        int numero = 10;
        numero += 5;
        System.out.println("Número: " + numero);
        numero -= 5;
        System.out.println("Número: " + numero);
        numero *= 5;
        System.out.println("Número: " + numero);
        numero /= 5;
        System.out.println("Número: " + numero);
        numero %= 5;
        System.out.println("Número: " + numero);

        //Operadores relacionais
        int num3 = 10;
        int num4 = 20;
        System.out.println("num3 == num4: " + (num3 == num4));
        System.out.println("num3 != num4: " + (num3 != num4));
        System.out.println("num3 > num4: " + (num3 > num4));
        System.out.println("num3 < num4: " + (num3 < num4));
        System.out.println("num3 >= num4: " + (num3 >= num4));
        System.out.println("num3 <= num4: " + (num3 <= num4));

        boolean condicao1 = true;
        boolean condicao2 = false;
        System.out.println("condicao1 && condicao2: " + (condicao1 && condicao2));
        System.out.println("condicao1 || condicao2: " + (condicao1 || condicao2));
        System.out.println("!condicao1: " + (!condicao1));

        
        



    }
    
}
