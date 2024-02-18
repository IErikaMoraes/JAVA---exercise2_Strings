
package atvstrings;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class AtvStrings {
   
    public static void main(String[] args) throws UnsupportedEncodingException {
        
       // Define UTF-8 na janela do Netbeans == SETLOCALE em cpp
       System.setOut(new PrintStream(System.out, true,"UTF8"));  
        
        
       // 1.   Permita obter o caracter no índice fornecido pelo utilizador dentro da String; 
                     
       //---------------------------------- INÍCIO - pensamento inicial ------------------------------------------------//
       
       /*String[] arrrayStringHW = {"Hello world!"};       
       int tamanhoString= arrrayStringHW.length;
       
        for(int i=0; i<tamanhoString; i++){
           if(inputInd == arrrayStringHW[i]){  //= ao valor da posição de [i] no Array
               System.out.printf("O valor encontrado é: ", arrrayStringHW[i]);
               break;
           }else{
               System.out.print("Índice inválido.");
           }           
        } 
        */
              
       //---------------------------------- FIM - pensamento inicial ------------------------------------------------//
                        
       //DIFERENÇA ENTRE UMA STRING E UM ARRAY DE STRINGS:
       //String texto = "Hello world!";  //a diferença é que nesse caso é uma variavel do tipo String, essa que é um Array(coleção) de char, na sua concepção primária.
       //String[] arrrayStringHW = {"Hello world!"};  //a diferença é que nesse caso a String tem apenas uma posicao, já que foi atribuida como Array de Strings.
    
       //Em Java, uma String é uma classe que representa uma sequência de caracteres.        
       //Um Array de strings (String[]) é uma estrutura que armazena uma coleção de strings.
       
       //------------------------------------------------------------------//
         
       //String texto = "Hello world!": variável chamada texto do tipo String e atribui a ela a string "Hello world!", instância única da classe String.
       //Acessar os caracteres de/em uma String: char primeiroCaractere = texto.charAt(0);
                                               //System.out.println("Primeiro caractere: " + primeiroCaractere);

       //String[] arrayStringHW = {"Hello world!"}: Array de strings chamado arrayStringHW que contém uma única string, que é "Hello world!".
       //Acessar strings em um array de strings: String primeiraString = arrayStringHW[0];
                                               //System.out.println("Primeira string: " + primeiraString);
                                               
       
        //------------------------------------------------------------------------------------------------------------------------------------------------//
          
        
       Scanner in= new Scanner(System.in); //uma Classe que precisa de biblioteca  
       boolean novaBusca= true;  //Se deseja que o programa execute pelo menos uma vez, independentemente da escolha inicial do usuário (=true).
                                 //ou seja, ENQUANTO a variável estiver verdadeira se repetirá, a condição dentro do WHILE por padrão é verdadeira.
       
       //Se novaBusca inicializada como false, o bloco dentro do do-while não seria executado pelo menos uma vez. 
       //Pois a condição do do-while é verificada após a execução do bloco de código dentro dele. 
       //Se a condição fosse falsa desde o início, o bloco de código dentro do do-while não seria executado.   BOOOOMMMM!!!   
       //Essa opção se deseja que o programa execute apenas se o usuário indicar explicitamente que deseja realizar a busca,
       
       do {    
            String texto = "Hello world!";
            System.out.printf("1) Insira o indice de 0-%d que deseja buscar o valor dentro da String (Hello world!): ", texto.length()-1);
            int inputInd= in.nextInt(); 
                        
            // Verifica se o índice fornecido está dentro dos limites da string
            if (inputInd >= 0 && inputInd < texto.length()) {
                char charEncontrado = texto.charAt(inputInd);  //é um método que obtém o valor através do index/índice, convertendo pra char.
                System.out.printf("O caractere encontrado é: %c%n", charEncontrado);
            } else {
                System.out.println("Índice inválido.");
            }
            
            //----------------------------- INÍCIO - BLOCO PARA User OPTAR PELA CONTINUAÇÃO DO PROGRAMA OU NÃO ----------------------------//
            System.out.print("Deseja outra busca? (Y/N): ");
            char inputNovaBusca = in.next().charAt(0);  //.charAt neste caso, é usada porque a função next() do Scanner lê a entrada/input
                                                             //do usuário como uma string completa. Como estamos interessados apenas no primeiro 
                                                             //caractere dessa string, usamos charAt(0) para extrair esse primeiro caractere.

            if(inputNovaBusca != 'Y' && inputNovaBusca != 'y' && inputNovaBusca != 'N' && inputNovaBusca != 'n'){
                break;      
            }else{
                // Se o usuário digitar 'N' ou 'n', novaBusca para false
                if(inputNovaBusca == 'Y' || inputNovaBusca == 'y'){
                   novaBusca=true;
                }else {
                    novaBusca= false; 
                }
            }  
            //----------------------------- FIM - BLOCO PARA User OPTAR PELA CONTINUAÇÃO DO PROGRAMA OU NÃO ----------------------------//
            
        }while(novaBusca);         
       System.out.println("_________________________________________________");
       
       
       //-----------------------Uma versão simplificada do novaBusca------------------------//
       
        /* 
        if (inputNovaBusca == 'N' || inputNovaBusca == 'n') {
            novaBusca = false;
        } else if (inputNovaBusca == 'Y' || inputNovaBusca == 'y') {
            novaBusca = true;
        } else {
            break;
        }
        */
    
       //-----------------------------------------------------------------------------------------------------------------//
       
       // 2. Compare duas strings recebidas do utilizador e se as mesmas forem iguais, concatene essas strings, 
       //se forem diferentes, apresente a mensagem a informar esse facto; 
       
       /*EQUALS() é o método usado para verificar se duas objetos (strings) são iguais em conteúdo.
        Retorna true se as strings tiverem exatamente os mesmos caracteres na mesma ordem; caso contrário, retorna false.
        O método equals é sensível a maiúsculas e minúsculas, ou seja, "Hello" != "hello".
            EX:
            String str1 = new String("Hello"); String str2 = new String("Hello");
            if (str1.equals(str2)) {
            System.out.println("As strings são iguais.");
            } else {
                System.out.println("As strings são diferentes.");
            }

        *COMPARETO() é o método usado para definir uma ordem entre objetos, geralmente para fins de classificação. 
            O método retorna um valor inteiro que indica a ordem lexicográfica das strings. Se o resultado for igual a 0, 
            significa que as strings são iguais.       
            EX:
            Comparator<String> comparator = Comparator.naturalOrder();
            int result = comparator.compare("apple", "banana"); 
       
            if (result < 0) {
            System.out.println("A primeira string vem antes da segunda.");
            } else if (result > 0) {
                System.out.println("A primeira string vem depois da segunda.");
            } else {
                System.out.println("As strings são iguais.");
            }
       */
       
        //-----------------------------------------------------------------------------------------------//
       
        //String inputNomeBuscar= in.next();  
                        //**next(): função que lê uma string, uma palavra (nao lê espaços). Erika
                        //**nextLine(): função que lê a linha toda e os espaços. Erika de Moraes
       
        //----------------------------------------------------------------------------------------------//
        
        //COMPAREtO        
        System.out.println("COMPAREtO");
        System.out.print("2) Insira a primeira palavra a comaparar: ");
        String string1= in.nextLine().trim();  // Use trim() para remover espaços extras        
        // Consumir o caractere de nova linha pendente
        in.nextLine();        
        System.out.print("Insira a segunda palavra a comaparar: ");
        String string2= in.nextLine().trim();  // Use trim() para remover espaços extras
        
        System.out.println("_________________________________________________");
        
        //.compareTo()
        int compara= string1.compareTo(string2);

        if (compara == 0){  //SE verdadeira, ou seja= 0, são = iguais.
             String concatCompare= string1.concat(string2);
             System.out.println("RESPOSTA= .compareTo() - Palavras IGUAIS: "+concatCompare);                       
        }else{
            System.out.println("RESPOSTA= .compareTo() - Palavras diferentes");
        }        
        System.out.println("_________________________________________________");

        
        //----------------------------------------------------------------------------//        
        //EQUALS
        System.out.println("EQUALS");
        System.out.print("Insira a primeira palavra a equals: ");
        String stringEquals1= in.nextLine().trim();  // Use trim() para remover espaços extras   
        //in.nextLine();
        System.out.print("Insira a segunda palavra a equals: ");
        String stringEquals2= in.nextLine().trim();  // Use trim() para remover espaços extras
        
        System.out.println("_________________________________________________");
        
        //.equals()
        boolean saoIguais = stringEquals1.equals(stringEquals2);

        if (saoIguais) {
             String concatEquals= stringEquals1.concat(stringEquals2);
             System.out.println("RESPOSTA= .equals() - Palavras IGUAIS: "+concatEquals);                       
        }else{
            System.out.println("RESPOSTA= .equals() - Palavras diferentes");
        }        
        System.out.println("_________________________________________________");


        // .equalsIgnoreCase() 
        //ignorando "diferença de caixa" em relação a strings, estou me referindo à distinção entre letras maiúsculas e minúsculas.
        if (stringEquals1.equalsIgnoreCase(stringEquals2)) {
            String concatEqualsIgnoreCase = stringEquals1.concat(stringEquals2);
            System.out.println("RESPOSTA= .equalsIgnoreCase() - Palavras IGUAIS: " + concatEqualsIgnoreCase);
        } else {
            System.out.println("RESPOSTA= .equalsIgnoreCase() - Palavras diferentes.");
        }        
        System.out.println("_________________________________________________");
        
       //-------------------------------------------------------------------------------//
       
       //3.   Teste se uma determinada string contém a sequência especificada de caracteres; 
       
       /*.contains(): é um método da classe String em Java e é usado para verificar se uma: "determinada sequência de 
         caracteres" (substring) está presente dentro de outra string. Ele retorna um valor booleano, indicando se a
         substring foi encontrada ou não na string original. É sensível a maiúsculas e minúsculas-
         EX:
            // Cria a String
            String frase = "Java é uma linguagem de programação poderosa.";
            // Verifica se a substring "linguagem" está presente na string
            boolean contemSubstring = frase.contains("linguagem");
            // Imprime o resultado
            if (contemSubstring) {
                ....
            }
       */
       
        //-------------------------------------------------------------------------------//
       
        String nome = "Erika de moraes";
 
        System.out.print("3) Informe a sequencia de caracteres para pesquisar na palavra: ");
        String sequencia = in.next();
 
        if (nome.contains(sequencia)) {
            System.out.print("--- A palavra inserida CONTÉM a sequencia especificada. ---\n");
        } else {
            System.out.print("--- A palavra inserida NÃO contém a sequencia especificada. ---\n");
        }
        System.out.println("_________________________________________________");

       //-----------------------------------------------------------------------------------------------------------------------//
        
       
        //4.   Verifique se uma determinada string termina com o conteúdo de outra string (utilize o método “endsWith()”; 
        System.out.println("4) .endsWith():");

        String s1 = "Dia de sol, dia de alegria";
        String s2 = "alegria";
 
        if (s1.endsWith(s2)) {  //método sensível a maiusculas e minisuculas
            System.out.println("**SIM terminam iguais**"); 
        } else {
            System.out.println("*NÃO terminam iguais.*"); 
        }           
        System.out.println("_________________________________________________");

        
       //-----------------------------------------------------------------------------------------------------------------------//

        //5.   Troque o conteúdo de duas strings;. 
        
        /*    
        Passagem por Valor:
        Em Java, os parâmetros de tipos primitivos (como int, float, char, etc.) e referências de objetos são passados por valor.
        Quando você passa um argumento para um método, uma cópia do valor do argumento é feita e passada para o parâmetro do método.
        Qualquer modificação feita no parâmetro dentro do método não afeta o valor original fora do método.


        Passagem por Referência:
        Passar a referência da variável para um método. Nesse caso, qualquer alteração no parâmetro dentro do método afetará diretamente
        a variável original fora do método. No entanto, Java não suporta passagem de parâmetros por referência para objetos. 
        Em Java, você está sempre passando uma cópia da referência para o objeto.
        */
        
        //em Java, os parâmetros são passados por valor, não por referência.
        
        //-----------------------------------------------------------------------------------------------------------------------//
        
        System.out.println("5)");

        //criando Array de charS/caracteres
        char[] stringE= "EEEEEEEE EEEEEEE".toCharArray();
        char[] stringC= "CCCCCCCCCCCCCCCC".toCharArray();
        
        System.out.println("Original:");
        System.out.println("E: " + new String (stringE));
        System.out.println("C: " + new String(stringC));
        System.out.println("-----------------------------");
        
        // Chamando o método para trocar os arrays
        trocaString(stringE,stringC);           
        
        // Imprimindo o resultado após a troca
        System.out.println("Invertido (dentro do Main):");
        System.out.println("E: " + new String(stringE));
        System.out.println("C: " + new String(stringC));
        System.out.println("-----------------------------");
        
        //---------------- VERSÃO COM REPLACE: método para Strings ------------------------------------//
        
        /* 
        Para substituir valores num Array de caracteres é preciso o método:  
        System.arraycopy(a, 0, temp, 0, a.length);
        */

        String sCasa= "CASA";
        String sCarro ="CARRO";
        
        //A função replace é um método de stringS
        sCasa = sCasa.replace(sCasa, sCarro);
        System.out.println("String Casa: valor= "+ sCasa);
        System.out.println("_________________________________________________");

        //-----------------------------------------------------------------------------------------------------------------------//
        
        //6.    Permita substituir um caractere especificado por outro caractere; 
        
        String originalString="Hello, world!";
        char oldChar= 'l';
        char newChar= 'x';
        
        //substitui l por x em originalString
        String newString= originalString.replace(oldChar, newChar);        
        
        System.out.print("String e Char: com função .replace():\n");    
        System.out.println(newString);        
        System.out.println("_________________________________________________");

        
        //------------------- VERSÃO COM ArrayS de CharS --------------------------------//
        
        // Criando um array de caracteres
        char[] caracteres = "Hello, World!".toCharArray();

        System.out.println("--- Original: ---");
        System.out.println(new String(caracteres));

        // Chamando o método para substituir o caractere
        substituirCaractere(caracteres, 'o', 'x');

        // Imprimindo o resultado após a substituição
        System.out.println("--- Com Array de CharS: ---");
        System.out.println(new String(caracteres));
        System.out.println("_________________________________________________");       
        
        
        //------------------- 3a VERSÃO --------------------------------//
        
        /*
        -.replaceAll(caracter, caracter_substituto): Substitui todas as ocorrências 
        do caractere especificado (caracter) na string pela string especificada como 
        substituto (caracter_substituto).
        
        -ao usar String.valueOf(caracter), estamos garantindo que a variável caracter
        seja tratada como uma String no método replaceAll. 
        
        -converter um char em uma String, podemos usar o método String.valueOf(caracter). 
        Este método retorna a representação de string do argumento caracter/char.
        
        -replaceAll opera em strings e não em caracteres individuais.
        
        EX:
            String palavra_original = "Abacaxi";
            char caracter = 'a';
            char caracter_substituto = 'X';

            String palavra_modificada = palavra_original.toLowerCase().replaceAll(String.valueOf(caracter), String.valueOf(caracter_substituto));

            System.out.println(palavra_modificada);
        
        */
        
        String palavra_original = "Casa";

        System.out.print("Informe o caracter na palavra 'Casa' que deseja substituir: ");
        String caracter = in.next().toLowerCase();

        if (palavra_original.toLowerCase().contains(caracter)) {  //.toLowerCase(): Converte todos os caracteres da string de minúsculas.  //útil garantir que a substituição seja feita sem diferenciar maiúsculas de minúsculas.
            System.out.print("Informe o caracter substituto: ");
            String caracter_substituto = in.next().toLowerCase();
            
            String palavra_modificada = palavra_original.toLowerCase().replaceAll(caracter, caracter_substituto);
            System.out.printf("A palavra Casa foi modificada, a nova palavra é: %s.\n", palavra_modificada);
        } else {
            System.out.printf("A palavra Casa nao contem o caracter %s\n", caracter);
        }
        System.out.println("_________________________________________________");

        
        
        //7. Permita obter uma “substring” de uma determinada string entre duas posições especificadas pelo utilizador; 
        
        String frase = "Gosto de verão e bolo de chocolate";
        int tamanhoS= frase.length();
        
        System.out.printf("7) Informe o intervalo de 0-%d que deseja 'recortar' da String: \n", tamanhoS -1);
        
        System.out.println("Informe a posicao inicial desejada: ");
        int pos1 = in.nextInt();        
        System.out.println("Informe a posicao final desejada: ");
        int pos2 = in.nextInt();
        
        // Validação do intervalo de inputs
        if (pos1 >= 0 && pos2 <= tamanhoS && pos1 <= pos2) {
            String novaFrase = frase.substring(pos1, pos2);
            System.out.println(novaFrase);
        } else {
            System.out.println("Intervalo inválido. Certifique-se de que 0 <= pos1 <= pos2 <= " + (tamanhoS - 1));
        }
        System.out.println("_________________________________________________");
        
        
        
        //8.    Crie um array de caracteres contendo o conteúdo de uma string; 
        
        /*        
        Estrutura do For-Each Loop: enhanced for loop (também chamado de for-each loop) em Java para iterar sobre cada elemento de um array de caracteres.
            EX:
            for (char caractere : arrayDeCaracteres) {
                System.out.print(caractere + " ");
            }

            - char caractere: Declaração da variável que será usada para armazenar cada elemento do array durante cada iteração. 
            - arrayDeCaracteres: A coleção sobre a qual o loop será iterado. É o array de caracteres que contém os elementos a serem percorridos.
        O uso do for-each loop simplifica a iteração sobre os elementos de uma coleção, neste caso, um array de caracteres, eliminando a necessidade de manter um índice explícito. 
        */
        
        String minhaString = "Java";

        char[] arrayDeCaracteres = minhaString.toCharArray();

        System.out.print("Array de caracteres: ");
        for (char caractere : arrayDeCaracteres) {
            System.out.print(caractere + " ");
        }  
        System.out.println("_________________________________________________");
       
        
        //9.    Permita converter todos os caracteres em uma string para letras minúsculas; 
        
        String stringMinuscula = minhaString.toLowerCase();
        System.out.println("String em minúsculas: " + stringMinuscula);
        System.out.println("_________________________________________________");
        
        
        //10.  Inverta uma determinada string, sem utilizar funções de reversão; 

        //Definição da String Original
        String frase_para_inverter = "Inverter";

        //Conversão da String para um Array de Caracteres (Isso é feito para permitir a manipulação direta dos caracteres)
        char[] caracteres1 = frase_para_inverter.toCharArray();
        
        //Configuração dos Ponteiros de Início e Fim para Inversão:
        int inicio = 0;
        int fim = caracteres1.length - 1;

        //Inversão Usando Troca de Caracteres:
        while (inicio < fim) {  //Um loop while é utilizado para iterar sobre a metade inicial do array.
            // Troca dos caracteres nos índices inicio e fim
            char temp = caracteres1[inicio];  //Durante cada iteração, os caracteres nos índices inicio e fim são trocados usando uma variável temporária (temp).
            caracteres1[inicio] = caracteres1[fim];
            caracteres1[fim] = temp;
        
            // Atualização dos ponteiros para a próxima iteração
            inicio++;
            fim--;
            
            /*
            -O loop while é executado enquanto o valor de inicio for menor que o valor de fim. Isso garante que a inversão ocorra apenas até a metade do array.
            
            -Dentro do loop, os caracteres nos índices inicio e fim são trocados. A variável temporária temp é usada para armazenar temporariamente o valor de caracteres1[inicio] antes da troca.
            
            -Após a troca, os ponteiros inicio e fim são atualizados (inicio++ incrementa o valor de inicio e fim-- decrementa o valor de fim).
            
            -Essa atualização é fundamental para garantir que o loop continue a avançar em direção ao meio do array.
            
            -Conclusão do Loop: O loop continua executando enquanto inicio for menor que fim. Quando inicio não for mais menor que fim, o loop é encerrado.
            Portanto, a relação entre inicio++ e fim-- no contexto do loop while é garantir que os ponteiros inicio e fim se movam em direção ao centro do array a cada iteração
            */            
        }

        //Criação de uma Nova String (um novo objt) a Partir do Array Invertido:
        String stringInvertida = new String(caracteres1);
        
        //Impressão do Resultado Invertido
        System.out.println("String invertida: " + stringInvertida);
        System.out.println("_________________________________________________");        
        
        
        
        //11.  Leia uma determinada string e, se o primeiro e o último caractere forem o mesmo, mostre 
        //a string sem esses caracteres, caso contrário, mostre a string inalterada. 

        
        System.out.println("Digite uma string: ");
        String input = in.nextLine();
        
        //PRIMEIRO: Verifica se a string tem pelo menos dois caracteres (input.length() >= 2).
        // E = &&
        //DEPOIS: Verifica se o primeiro caractere (input.charAt(0)) é igual ao último caractere (input.charAt(input.length() - 1)).
        if (input.length() >= 2 && input.charAt(0) == input.charAt(input.length() - 1)) {
            input = input.substring(1, input.length() - 1);
        }

        System.out.println("Resultado: " + input);
        System.out.println("_________________________________________________");        

        
  
        //12.  Permita contar quantos caracteres numéricos aparecem numa string. Nota: use o método Character.isDigit(...). 

        //Character.isDigit(...): conta quantos caracteres numéricos aparecem em uma string, 
        
        System.out.println("12) Digite uma string: ");
        String frase_input = in.nextLine();

        int contagem = 0;
        for (char caractere : frase_input.toCharArray()) {
            if (Character.isDigit(caractere)) {
                contagem++;
            }
        }
        System.out.println("Número de caracteres numéricos: " + contagem);      
        System.out.println("_________________________________________________");
       
        
        in.close();
        
     }
    //------------------------------- FIM DO MAIN ---------------------------------------//
    
    
    
    
    //FUNÇÕES

    //5)
    //public static void trocaString(String a, String b){
        /*------------- PENSAMENTO INICIAL------------------------------
        String temp= a;
        a=b;
        b=temp;
        System.out.print(a + b);

        System.out.println("Dentro do método:");
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);      

        não afeta as variáveis originais stringE e stringC fora do método. 
        Isso ocorre porque, mesmo que você esteja manipulando os objetos 
        referenciados por a e b (que são strings), as referências em si (ou seja,
        os endereços de memória) são copiadas para os parâmetros do método.       
        */    

    public static void trocaString(char[] a, char[] b) {
        /*
        char[] temp = a;
        a = b;
        b = temp;
        */

        // Troca efetiva dos arrays usando System.arraycopy
        char[] temp = new char[a.length];
        System.arraycopy(a, 0, temp, 0, a.length);
        System.arraycopy(b, 0, a, 0, b.length);
        System.arraycopy(temp, 0, b, 0, temp.length);

        System.out.println("Invertido (dentro do método trocaString):");
        System.out.println("E: " + new String(a));
        System.out.println("C: " + new String(b));
    }



    //6)
    public static void substituirCaractere(char[] array, char antigoChar, char novoChar) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == antigoChar) {  
                array[i] = novoChar;
            }
        }  
    }
    //if (array[i] == antigoChar) = avaliação de "intersecção" de valores dentro dos Arrays de char a comparar.
    

 }
//-------------------------------FIM DOS ARGS[] ---------------------------------------//