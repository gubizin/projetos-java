package ProjetoQuiz.Modelo;
import javax.swing.*;
import java.util.Random;

public class LogicaJogo extends Questoes{
String RespostaContinuar;

Random ran = new Random();
int[] array = new int[21];

public void gerarVetor(){
    int i = 0;
    int igual;
    do{
    igual = 0;
        array[i] = ran.nextInt(21);
            for(int j=0;j<i;j++){
                if(array[j] == array[i]){
                    igual = 1;
                }
            }
            if(igual == 0){
                i++;
            }
    }while(i<21);
}

public void ajuda(int aleatorio){
    switch(aleatorio){
        case 0:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(100 PONTOS) A Programação Orientada a Objetos (POO) se baseia em quatro pilares que é a\nbase de sustentação desta linguagem. Digite a alternativa que não representa\num desses pilares."
                + "\n\n[a] Absorção\n[b] Abstração");
            if("a".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 100;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 50;
                vidas -= 7;
            }}
            break;
        case 1:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(175 PONTOS) De qual linguagem de programação pertence o comando 'scanf'?"
                + "\n\n[a] Python\n[b] C");
                if("b".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 175;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 87;
                vidas -= 7;
            }
        }break;
        case 2:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
            + "\n\n(100 PONTOS) Qual é a linguagem de programação padrão para trabalhar com 'bancos de dados relacionais'?"
            + "\n\n[a] SQL\n[b] Ruby");
                if("a".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 100;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 50;
                vidas -= 7;
            }
              
        }break;
        case 3:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(125 PONTOS) Qual foi a primeira linguagem de programação comercializada?"
                + "\n\n[a] FORTRAN\n[b] Plankalkül");
                if("a".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 125;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 62;
                vidas -= 7;
            }
        }break;
        case 4:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(100 PONTOS) Para que se usa '//' em programação?"
                + "\n\n[a] Para fazer um comentário no código\n[b] Para fazer uma quebra de linha");
                if("a".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 100;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 50;
                vidas -= 7;
            }
        }break;
        case 5:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(125 PONTOS) Qual é a linguagem de 'Marcação de Hipertexto'?"
                + "\n\n[a] Json\n[b] HTML");
                if("b".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 125;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 62;
                vidas -= 7;
            }
        }break;
        case 6:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(150 PONTOS) Qual das opcões abaixo é uma palavra-chave reservada em Java?"
                + "\n\n[a] main\n[b] int");
                if("b".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 150;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 75;
                vidas -= 7;
            }
        }break;
        case 7:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(250 PONTOS) Na programação orientada a objetos (POO), uma ação executada por um objeto quando passada\numa mensagem ou em resposta a uma mudança de estado representa o conceito de:"
                + "\n\n[a] construtor\n[b] comportamento");
                if("b".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 250;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 125;
                vidas -= 7;
            }
        }break;
        case 8:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(175 PONTOS) Qual é o valor padrão da variável char?"
                + "\n\n[a] u0000\n[b] null");
                if("a".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 175;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 87;
                vidas -= 7;
            }
        }break;
        case 9:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(200 PONTOS) O que é 'Polimorfismo'?"
                + "\n\n[a] Polimorfismo é uma técnica para definir métodos diferentes de um mesmo tipo\n[b] Polimorfismo é a capacidade de um objeto assumir muitas formas");
                if("b".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 200;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 100;
                vidas -= 7;
            }
        }break;
        case 10:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(150 PONTOS) O que acontecerá se o modificador estático for removido da assinatura do método principal?"
                + "\n\n[a] Erro de compilação\n[b] Erro de tempo de execução: NoSuchMethodError");
                if("a".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 150;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 75;
                vidas -= 7;
            }
        }break;
        case 11:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(175 PONTOS) Em programação orientada a objetos, métodos de acesso do tipo setter têm a finalidade\nprimária de:"
                + "\n\n[a] obter o valor de um atributo\n[b] modificar o valor de um atributo");
                if("b".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 175;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 87;
                vidas -= 7;
            }
        }break;
        case 12:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(250 PONTOS) Entre os conceitos de Programação Orientada a Objetos, digite a alternativa\nque contempla os pilares apresentados pelo código que segue:\n\nclass candidato{\nint nota;\n}\nclass bomCandidato: public candidato{\nint experiencia;\nbomCandidato(int experiencia){\nthis.experiencia = experiencia;\n}}\n\nA alternativa correta é:"
                + "\n\n[a] Herança e Polimorfismo\n[b] Encapsulamento e Herança");
                if("b".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 250;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 125;
                vidas -= 7;
            }
        }break;
        case 13:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(225 PONTOS) Orientação a objetos é um paradigma de análise, projeto e programação de sistemas de software\nbaseado na composição e interação entre diversas unidades de software chamadas objetos.\nDigite a alternativa INCORRETA com relação a POO."
                + "\n\n[a] Os pacotes são pastas as quais podemos guardar arquivos (classes)\n[b] Declarar um objeto é o mesmo que instanciar um objeto");
                if("b".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 225;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 112;
                vidas -= 7;
            }
        }break;
        case 14:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(175 PONTOS) A respeito das linguagens de programação orientadas a objeto, é correto afirmar que: "
                + "\n\n[a] o método conhecido como construtor é caracterizado como uma função que sempre retorna um valor diferente\n[b] o método conhecido como construtor é executado sempre que um objeto é criado");
                if("b".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 175;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 87;
                vidas -= 7;
            }
        }break;
        case 15:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(125 PONTOS) '__________ é um método chamado no momento da criação do objeto, ou seja, no momento em que\né utilizado no comando new. Este método promove a inicialização do objeto, de forma que,\no objetivo após essa inicialização, já se encontra logicamente consistente'.\n\nDigite a alternativa que complete corretamente a frase anterior."
                + "\n\n[a] Construtor\n[b] Destrutor");
                if("a".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 125;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 62;
                vidas -= 7;
            }
        }break;
        case 16:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(150 PONTOS) O que é uma 'Instância de Classe'?"
                + "\n\n[a] Um endereço de memória relacionado às definições da classe\n[b] Uma ocorrência específica de uma classe");
                if("b".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 150;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 75;
                vidas -= 7;
            }
        }break;
        case 17:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(175 PONTOS) O conceito de programação orientada a objetos que permite construir objetos especializados\nutilizando características de objetos mais generalistas, possibilitando reuso de código\nà medida que os atributos e métodos de classes já existentes podem gerar novas classes mais\nespecíficas, é o de: "
                + "\n\n[a] associação de classes\n[b] herança");
                if("b".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 175;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 87;
                vidas -= 7;
            }
        }break;
        case 18:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(125 PONTOS) Quem foi o primeiro programador da história?"
                + "\n\n[a] Ada Lovelace\n[b] Alan Turing");
                if("a".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 125;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 62;
                vidas -= 7;
            }
        }break;
        case 19:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(200 PONTOS) Qual o conceito de programação orientada a objetos que permite a criação de métodos com\na mesma assinatura, porém com implementações diferentes?"
                + "\n\n[a] Polimorfismo\n[b] Encapsulamento");
                if("a".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 200;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 100;
                vidas -= 7;
            }
        }break;
        case 20:
            ajudas--;
            if("f".equals(escolha)){
                escolha = JOptionPane.showInputDialog("JOGADOR(A): "+nomeJogador+"   |   PONTOS: "+pontuacao+"   |   VIDAS: "+vidas+"   |   AJUDAS: "+ajudas
                + "\n\n(250 PONTOS) Na programação orientada a objetos, o programador pode definir classes sem qualquer pretensão\n de instanciar objetos. Nestas situações, essas classes são conhecidas como: "
                + "\n\n[a] concretas\n[b] abstratas");
                if("b".equals(escolha)){
                JOptionPane.showMessageDialog(null, "Você acertou!");
                pontuacao += 250;
                vidas += 5;
            }else{
                JOptionPane.showMessageDialog(null, "Você errou!");
                pontuacao -= 125;
                vidas -= 7;
            }
        }break;
    }
}

public void mostraQuestao(){
    gerarVetor();
    for(int i=0;i<=9;i++){
        if(vidas > 0){
        buscarQuestao(array[i]);
        if("f".equals(escolha) && ajudas > 0){
        ajuda(array[i]);   
        powerUpsJogador();
        if(i < 9 && vidas > 0){
        comprar();
        }
        }else{
        if("f".equals(escolha) && ajudas <= 0){
        do{
        JOptionPane.showMessageDialog(null, "Você não possui mais AJUDAS");
        buscarQuestao(array[i]);
        }while("f".equals(escolha));
        }
        buscarResposta(array[i], escolha);      
        powerUpsJogador();
        if(i < 9 && vidas > 0){
        comprar();
        }
        }
        if(i == 9 && vidas > 0){
            venceuJogo();
        }
        }else{
            perdeuJogo(); 
        }
    }
}

public void venceuJogo(){
    JOptionPane.showMessageDialog(null, "Parabéns, você venceu o jogo!  o(^▽^)o\n\nRESULTADOS: "+pontuacao+" PONTOS");
    RespostaContinuar = JOptionPane.showInputDialog("Se quiser jogar novamente digite [1], senão digite [0]");
    if("1".equals(RespostaContinuar)){
    pontuacao = 0;
    vidas = 1;
    ajudas = 3;
    gameplay();
    }else{
        JOptionPane.showMessageDialog(null, "Obrigado por jogar "+nomeJogador+"!");
        System.exit(0);
    }
}

public void perdeuJogo(){
    JOptionPane.showMessageDialog(null, "Você perdeu!  (┬﹏┬)\n\nRESULTADOS: "+pontuacao+" PONTOS");
    RespostaContinuar = JOptionPane.showInputDialog("Se quiser jogar novamente digite [1], senão digite [0]");
    if("1".equals(RespostaContinuar)){
        pontuacao = 0;
        vidas = 1;
        ajudas = 3;
        gameplay();
    }else{
        JOptionPane.showMessageDialog(null, "Obrigado por jogar "+nomeJogador+"!");
        System.exit(0);
    }
}

public void gameplay(){
    JOptionPane.showMessageDialog(null, "Preparado(a) para jogar o melhor QUIZ sobre Programação?  (✿◡‿◡)");
    JOptionPane.showMessageDialog(null, "MODO DE JOGAR:\n\nVocê começa o jogo com um total de 1 VIDA e 3 AJUDAS.\nAcerte as questões para ganhar PONTOS.");
    JOptionPane.showMessageDialog(null, "MODO DE JOGAR:\n\nCada questão valerá uma determinada quantidade de PONTOS, dependendo de sua dificuldade.\nSe você acertar, os PONTOS da questão e 5 VIDAS serão somados.\nSe errar, você perderá 7 VIDAS e metade dos PONTOS da questão.");
    JOptionPane.showMessageDialog(null, "MODO DE JOGAR:\n\nAs AJUDAS servirão para quando você estiver com dúvidas sobre uma questão, dessa forma use uma AJUDA e 3 alternativas\nincorretas serão removidas automaticamente, aumentando suas chances de acertar!\nEntretanto, ao usar uma AJUDA, você ganhará apenas metade dos PONTOS que a questão valia originalmente (se você acertar, claro).\nVocê vence o jogo assim que responder 10 perguntas sem zerar suas VIDAS, se suas VIDAS acabarem você perde.");
    JOptionPane.showMessageDialog(null, "MODO DE JOGAR:\n\nVocê também poderá comprar VIDAS e AJUDAS na LOJA, trocando os PONTOS que\nfor ganhando, ao acertar questões, nos itens citados. Você poderá comprar quantas vezes quiser.");
    JOptionPane.showMessageDialog(null, "Mas agora vamos ao que interessa. Preparado(a)?!");
    pegarNome();
    mostraQuestao();
}}
