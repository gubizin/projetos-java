package ProjetoQuiz.Modelo;
import javax.swing.*;

public class Questoes{
    String nomeJogador;
    String escolha;
    int pontuacao = 0;
    int vidas = 1;
    String comprar;
    int ajudas = 3;
    
public void pegarNome(){
    nomeJogador = JOptionPane.showInputDialog("Para começar, digite seu nome: ");
}
    
public void buscarQuestao(int aleatorio){
    switch(aleatorio){
        case 0:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(200 PONTOS) A Programação Orientada a Objetos (POO) se baseia em quatro pilares que é a\nbase de sustentação desta linguagem. Digite a alternativa que não representa\num desses pilares."
            + "\n\n[a] Absorção\n[b] Encapsulamento\n[c] Herança\n[d] Polimorfismo\n[e] Abstração\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 1:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(350 PONTOS) De qual linguagem de programação pertence o comando 'scanf'?"
            + "\n\n[a] Swift\n[b] Python\n[c] Java\n[d] C\n[e] JavaScript\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 2:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(200 PONTOS) Qual é a linguagem de programação padrão para trabalhar com 'bancos de dados relacionais'?"
            + "\n\n[a] SQL\n[b] Ruby\n[c] Rust\n[d] XML\n[e] Python\n\nPrecisa de AJUDA? Digite [f]"); 
        break;
        case 3:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(250 PONTOS) Qual foi a primeira linguagem de programação comercializada?"
            + "\n\n[a] FORTRAN\n[b] Basic\n[c] Assembly\n[d] Java\n[e] Plankalkül\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 4:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(200 PONTOS) Para que se usa '//' em programação?"
            + "\n\n[a] Para fazer um script\n[b] Para fazer um print de texto\n[c] Para fazer um comentário no código\n[d] Para fazer uma quebra de linha\n[e] Para fazer uma leitura de dados\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 5:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(250 PONTOS) Qual é a linguagem de 'Marcação de Hipertexto'?"
            + "\n\n[a] Elixir\n[b] Json\n[c] HTML\n[d] Jquery\n[e] SQL\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 6:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(300 PONTOS) Qual das opções abaixo é uma palavra-chave reservada em Java?"
            + "\n\n[a] Array\n[b] System\n[c] print\n[d] int\n[e] main\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 7:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(500 PONTOS) Na programação orientada a objetos (POO), uma ação executada por um objeto quando passada\numa mensagem ou em resposta a uma mudança de estado representa o conceito de:"
            + "\n\n[a] mutante\n[b] assessor\n[c] construtor\n[d] domínio\n[e] comportamento\n\nPrecisa de AJUDA? Digite [f]?");
        break;
        case 8:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(350 PONTOS) Qual é o valor padrão da variável 'char'?"
            + "\n\n[a] u0000\n[b] 0\n[c] null\n[d] Não definido\n[e] Nenhuma das alternativas\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 9:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(400 PONTOS) O que é 'Polimorfismo'?"
            + "\n\n[a] Polimorfismo é uma técnica para definir diferentes objetos do mesmo tipo\n[b] Polimorfismo é uma técnica para definir métodos diferentes de um mesmo tipo\n[c] Polimorfismo é a capacidade de um objeto assumir muitas formas\n[d] Polimorfismo é a propriedade da orientação a objetos que impede que as classes derivadas\n      de uma mesma superclasse possuam métodos iguais e comportamentos diferentes\n[e] Nenhuma das anteriores\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 10:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(300 PONTOS) O que acontecerá se o modificador estático for removido da assinatura do método principal?"
            + "\n\n[a] Erro de compilação\n[b] Erro de tempo de execução: NoSuchMethodError\n[c] O programa irá compilar e executar sem nenhuma saída\n[d] O programa irá compilar e executar para mostrar a saída necessária\n[e] Nenhuma das alternativas\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 11:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(350 PONTOS) Em programação orientada a objetos, métodos de acesso do tipo 'setter' têm a finalidade\nprimária de:"
            + "\n\n[a] obter o valor de um atributo\n[b] modificar o valor de um atributo\n[c] inicializar os valores de atributos de um objeto assim que ele é instanciado\n[d] contar quantas vezes o valor de um atributo foi obtido\n[e] salvar o valor de um atributo de um objeto em um banco de dados\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 12:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(500 PONTOS) Entre os conceitos de programação orientada a objetos, digite a alternativa\nque contempla os pilares apresentados pelo código que segue:\n\nclass candidato{\nint nota;\n}\nclass bomCandidato: public candidato{\nint experiencia;\nbomCandidato(int experiencia){\nthis.experiencia = experiencia;\n}}\n\nA alternativa correta é:"
            + "\n\n[a] Polimorfismo\n[b] Herança\n[c] Herança e Polimorfismo\n[d] Encapsulamento\n[e] Encapsulamento e Herança\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 13:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(450 PONTOS) Orientação a objetos é um paradigma de análise, projeto e programação de sistemas de software\nbaseado na composição e interação entre diversas unidades de software chamadas objetos.\nDigite a alternativa INCORRETA com relação a POO."
            + "\n\n[a] Os pacotes são pastas as quais podemos guardar arquivos (classes)\n[b] Declarar um objeto é o mesmo que instanciar um objeto\n[c] Cada objeto possui um endereço de memória\n[d] O comportamento de um objeto é definido pelos métodos de sua classe\n[e] Atributos estáticos são conhecidos como atributos de classes\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 14:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(350 PONTOS) A respeito das linguagens de programação orientadas a objeto, é correto afirmar que: "
            + "\n\n[a] o método conhecido como construtor é caracterizado como uma função que sempre retorna um valor diferente\n[b] o construtor default é aquele que recebe, no mínimo, um argumento como parâmetro\n[c] o polimorfismo é o conceito utilizado para definir funções de nomes diferentes, porém com códigos iguais\n[d] o uso de herança aumenta a eficiência do programa, mas acaba gerando códigos repetitivos\n[e] o método conhecido como construtor é executado sempre que um objeto é criado\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 15:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(250 PONTOS) '__________ é um método chamado no momento da criação do objeto, ou seja, no momento em que\né utilizado no comando new. Este método promove a inicialização do objeto, de forma que,\no objetivo após essa inicialização, já se encontra logicamente consistente'.\n\nDigite a alternativa que complete corretamente a frase anterior."
            + "\n\n[a] Destrutor\n[b] Construtor\n[c] Atributos\n[d] Público\n[e] Qualificador\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 16:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(300 PONTOS) O que é uma 'Instância de Classe'?"
            + "\n\n[a] Uma abstração de um objeto do mundo real\n[b] Um modelo que representa um objeto\n[c] Uma variável de tipo primitivo da classe\n[d] Um endereço de memória relacionado às definições da classe\n[e] Uma ocorrência específica de uma classe\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 17:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(350 PONTOS) O conceito de programação orientada a objetos que permite construir objetos especializados\nutilizando características de objetos mais generalistas, possibilitando reuso de código\nà medida que os atributos e métodos de classes já existentes podem gerar novas classes mais\nespecíficas, é o de: "
            + "\n\n[a] associação de classes\n[b] herança\n[c] encapsulamento\n[d] classe abstrata\n[e] polimorfismo\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 18:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(250 PONTOS) Quem foi o primeiro programador da história?"
            + "\n\n[a] Alan Turing\n[b] Leonardo Da Vinci\n[c] Steve Jobs\n[d] Ada Lovelace\n[e] Bill Gates\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 19:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(400 PONTOS) Qual o conceito de programação orientada a objetos que permite a criação de métodos com\na mesma assinatura, porém com implementações diferentes?"
            + "\n\n[a] Encapsulamento\n[b] Herança\n[c] Herança múltipla\n[d] Polimorfismo\n[e] Interface\n\nPrecisa de AJUDA? Digite [f]");
        break;
        case 20:
            escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(500 PONTOS) Na programação orientada a objetos, o programador pode definir classes sem qualquer pretensão\n de instanciar objetos. Nestas situações, essas classes são conhecidas como: "
            + "\n\n[a] hierárquicas\n[b] protegidas\n[c] privadas\n[d] concretas\n[e] abstratas\n\nPrecisa de AJUDA? Digite [f]");
        break;
    }
}

public void buscarResposta(int aleatorio, String escolha){
    switch(aleatorio){
        case 0:
            if("a".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 200;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 100;
                vidas -= 7;
            }
        break;
        case 1:
            if("d".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 350;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 175;
                vidas -= 7;
            }       
        break;
        case 2:
            if("a".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 200;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 100;
                vidas -= 7;
            }           
        break;
        case 3:
            if("a".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 250;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 125;
                vidas -= 7;
            }          
        break;
        case 4:
            if("c".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 200;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 100;
                vidas -= 7;
            }           
        break;
        case 5:
            if("c".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 250;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 125;
                vidas -= 7;
            }          
        break;
        case 6:
            if("d".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 300;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 150;
                vidas -= 7;
            }           
        break;
        case 7:
            if("e".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 500;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 250;
                vidas -= 7;
            }           
        break;
        case 8:
            if("a".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 350;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 175;
                vidas -= 7;
            }          
        break;
        case 9:
            if("c".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 400;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 200;
                vidas -= 7;
            }           
        break;
        case 10:
            if("a".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 300;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 150;
                vidas -= 7;
            }           
        break;
        case 11:
            if("b".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 350;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 175;
                vidas -= 7;
            }           
        break;
        case 12:
            if("e".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 500;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 250;
                vidas -= 7;
            }           
        break;
        case 13:
            if("b".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 450;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 225;
                vidas -= 7;
            }           
        break;
        case 14:
            if("e".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 350;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 175;
                vidas -= 7;
            }           
        break;
        case 15:
            if("b".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 250;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 125;
                vidas -= 7;
            }           
        break;
        case 16:
            if("e".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 300;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 150;
                vidas -= 7;
            }           
        break;
        case 17:
            if("b".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 350;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 175;
                vidas -= 7;
            }           
        break;
        case 18:
            if("d".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 250;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 125;
                vidas -= 7;
            }           
        break;
        case 19:
            if("d".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 400;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 200;
                vidas -= 7;
            }           
        break;
        case 20:
            if("e".equals(escolha)) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 500;
                vidas += 5;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 250;
                vidas -= 7;
            }           
        break;
    }
}

public void powerUpsJogador(){
    JOptionPane.showMessageDialog(null, "ATUALIZANDO STATUS...\n\nPONTOS: "+pontuacao+"\nVIDAS: "+vidas+"\nAJUDAS: "+ajudas);
}

public void comprar(){
    comprar = JOptionPane.showInputDialog("~ LOJA ~   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas+"\n\nDeseja comprar VIDAS ou AJUDAS? Caso queira, digite:\n\n[1] Comprar 1 vida (150 PONTOS)\n[2] Comprar 1 ajuda (300 PONTOS)\n[3] Para sair da loja");
    int i = 0;
    if("1".equals(comprar)){
        i = 1;
    }
    if("2".equals(comprar)){
        i = 2;
    }
    if("3".equals(comprar)){
        i = 3;
    }
    switch(i){
        case 1:
            if("1".equals(comprar) && pontuacao >= 150){
                JOptionPane.showMessageDialog(null, "Você adiquiriu uma VIDA");
                vidas++;
                pontuacao -= 150;
                powerUpsJogador();
                comprar();
            }else{
                JOptionPane.showMessageDialog(null, "Você não possui PONTOS suficientes");
                comprar();
            }
            break;
            
        case 2:
            if("2".equals(comprar) && pontuacao >= 300){
                JOptionPane.showMessageDialog(null, "Você adiquiriu uma AJUDA");
                ajudas++;
                pontuacao -= 300;
                powerUpsJogador();
                comprar();
            }else{
                JOptionPane.showMessageDialog(null, "Você não possui PONTOS suficientes");
                comprar();
            }
            break;
            
        case 3:
            if("3".equals(comprar)){
                JOptionPane.showMessageDialog(null, "Saindo da loja...");
            }
            break;
        
        default:
            JOptionPane.showMessageDialog(null, "Opção inválida");
            comprar();
    }}
}