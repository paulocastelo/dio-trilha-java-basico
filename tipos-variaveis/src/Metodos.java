public class Metodos {
    public static void Main (String[] args){
        //Critérios de nomeação de variáveis
        //1. Não pode começar com número
        //2. Não pode ter espaços
        //3. Não pode ter caracteres especiais
        //4. Não pode ser uma palavra reservada
        //5. Deve ser significativo
        //6. Não pode ter acentos
        //7. Deve começar com letra minúscula
        //8. Se for nome composto, a primeira letra da segunda palavra deve ser maiúscula
        //9. Não pode ter caracteres especiais
        //10. Não pode ter espaços

        //Critérios de nomeação de metodos
        //1. Deve ser um verbo
        //2. Deve ser significativo
        //3. Deve começar com letra minúscula
        //4. Se for nome composto, a primeira letra da segunda palavra deve ser maiúscula
        //5. Não pode ter caracteres especiais
        //6. Não pode ter espaços
        //7. Não pode ter acentos

        //Qual a proposta do método?
        //1. Receber um valor
        //2. Fazer um cálculo
        //3. Retornar um valor

        //Qual o tipo de retorno de um método?
        // 1. void - não retorna nada
        // 2. int - retorna um número inteiro
        // 3. double - retorna um número decimal
        // 4. String - retorna um texto
        // 5. boolean - retorna verdadeiro ou falso
        
        //Qual a estrutura de um método?
        // 1. Modificador de acesso - public, private, protected
        // 2. Tipo de retorno - void, int, double, String, boolean
        // 3. Nome do método - significativo
        // 4. Parâmetros - tipo e nome
        // 5. Corpo do método - lógica
        // 6. Retorno - return

        //O que fazer caso o método tenha risco de erro?
        // 1. Tratamento de exceção
        // 2. Try/Catch

        //Quais as visibilidades de um método?
        // 1. Public - visível para todos
        // 2. Private - visível apenas dentro da classe
        // 3. Protected - visível apenas dentro do pacote e nas classes filhas
        // 4. Default - visível apenas dentro do pacote
    }
    //Exemplo de método void
    public void ExibirMensagem(){
        System.out.println("Olá, mundo!");
    }

    //Exemplo de método int
    public int Somar(int a, int b){
        return a + b;
    }

    //Exemplo de método double
    public double Dividir(double a, double b){
        return a / b;
    }

    //Exemplo de método String
    public String Concatenar(String a, String b){
        return a + b;
    }

    //Exemplo de método boolean
    public boolean VerificarPar(int a){
        if(a % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    //Exemplo de método com tratamento de exceção
    public void DividirComExcecao(double a, double b){
        try{
            System.out.println(a / b);
        } catch (Exception e){
            System.out.println("Erro: " + e);
        }
    }

    //Visicil   ibidade public
    public void MetodoPublico(){
        System.out.println("Método público");
    }

    //Visibilidade private
    private void MetodoPrivado(){
        System.out.println("Método privado");
    }

    //Visibilidade protected
    protected void MetodoProtegido(){
        System.out.println("Método protegido");
    }

    //Visibilidade default
    //Quando é utilizado a visibilidade default, o método pode ser acessado apenas dentro do pacote
    void MetodoDefault(){
        System.out.println("Método default");
    }


}
