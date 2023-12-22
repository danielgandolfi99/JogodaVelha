package projects.jogodavelha;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    // Definido as propriedades da interface criado no Scene Builder
    @FXML
    private Button reiniciar;

    @FXML
    private Button sair;

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private Button B3;

    @FXML
    private Button B4;

    @FXML
    private Button B5;

    @FXML
    private Button B6;

    @FXML
    private Button B7;

    @FXML
    private Button B8;

    @FXML
    private Button B9;

    @FXML
    private Text empates;

    @FXML
    private Text vitoriasJogador1;

    @FXML
    private Text vitoriasJogador2;

    @FXML
    private TextField indicaJogador;

    // Define o jogador 1 como o jogador que irá iniciar o jogo
    private boolean jogador1 = true;

    // Jogador 2 definido como falso para nao iniciar jogando
    private boolean jogador2 = false;

    // Contador de vitórias do jogador 1
    private int numVitoriasJogador1 = 0;

    // Contador de vitórias do jogador 2
    private int numVitoriasJogador2 = 0;

    // Contador de empates
    private int numEmpates = 0;

    // Criado as funções dos botões do jogo. Tendo 9 botões (B1 ao B9), cada um pode ser acionado
    // quando precionado na interface, com isso se ele estiver com seu texto como
    // string vazia, ele recebe a string do jogador em questão que fez a jogada, sendo
    // o jogador 1 como 'X' e o jogador 2 como 'O'. Logo após verifica se após esse comando
    // o jogo obteu um vencedor
    @FXML
    void B1Action(ActionEvent event) {
        if(B1.getText().equals("")){
            String comando = verificaJogadorAtivo();
            B1.setText(comando);
            verificaVencedor("X");
            verificaVencedor("O");
        }
    }

    @FXML
    void B2Action(ActionEvent event) {
        if(B2.getText().equals("")){
            String comando = verificaJogadorAtivo();
            B2.setText(comando);
            verificaVencedor("X");
            verificaVencedor("O");
        }
    }

    @FXML
    void B3Action(ActionEvent event) {
        if(B3.getText().equals("")){
            String comando = verificaJogadorAtivo();
            B3.setText(comando);
            verificaVencedor("X");
            verificaVencedor("O");
        }
    }

    @FXML
    void B4Action(ActionEvent event) {
        if(B4.getText().equals("")){
            String comando = verificaJogadorAtivo();
            B4.setText(comando);
            verificaVencedor("X");
            verificaVencedor("O");
        }
    }

    @FXML
    void B5Action(ActionEvent event) {
        if(B5.getText().equals("")){
            String comando = verificaJogadorAtivo();
            B5.setText(comando);
            verificaVencedor("X");
            verificaVencedor("O");
        }
    }

    @FXML
    void B6Action(ActionEvent event) {
        if(B6.getText().equals("")){
            String comando = verificaJogadorAtivo();
            B6.setText(comando);
            verificaVencedor("X");
            verificaVencedor("O");
        }
    }

    @FXML
    void B7Action(ActionEvent event) {
        if(B7.getText().equals("")){
            String comando = verificaJogadorAtivo();
            B7.setText(comando);
            verificaVencedor("X");
            verificaVencedor("O");
        }
    }

    @FXML
    void B8Action(ActionEvent event) {
        if(B8.getText().equals("")){
            String comando = verificaJogadorAtivo();
            B8.setText(comando);
            verificaVencedor("X");
            verificaVencedor("O");
        }
    }

    @FXML
    void B9Action(ActionEvent event) {
        if(B9.getText().equals("")){
            String comando = verificaJogadorAtivo();
            B9.setText(comando);
            verificaVencedor("X");
            verificaVencedor("O");
        }
    }

    // Botão que chama a função para reiniciar o jogo
    @FXML
    void reiniciarAction(ActionEvent event) {
        reiniciarJogo();
    }

    // Botão que fecha a aplicação do jogo
    @FXML
    void sairAction(ActionEvent event) {
        Platform.exit();
    }

    // Esta função zera todos os estados dos botões, setando uma string vazia em cada um
    // deles dentro de um loop
    public void reiniciarJogo() {
        for (Button button : new Button[] {B1, B2, B3, B4, B5, B6, B7, B8, B9}) {
            button.setText("");
        }
    }

    // Verifica o jogador ativo, se o jogador 1 estiver ativo, muda o estado do mesmo
    // e coloca o jogador 2 como ativo, caso contrario se o jogador 2 estiver ativo,
    // muda o seu estado e coloca o jogador 1 como ativo, retornando a string que representa
    // cada um, para posteriormente ser setada no botão que foi acionado
    public String verificaJogadorAtivo() {
        if(jogador1 == true){
            jogador1 = false;
            jogador2 = true;
            indicaJogador.setText("Vez do jogador 2");
            return "X";
        } else {
            jogador1 = true;
            jogador2 = false;
            indicaJogador.setText("Vez do jogador 1");
            return "O";
        }
    }

    // Faz a verificação do vencedor , fazendo uma lógica para conferir as sequencias de botões
    // que ja foram acionados. A função recebe a string do jogador que fez a ação, sendo ela 'X'
    // ou 'O', caso se encaixe em alguma das verificações, chama a função para anunciar o vencedor.
    // Caso não se encaixe em nenhuma delas, verifica se todos os botões foram preenchidos com
    // as devidas strings dos jogadores, chamamando assim a função de anunciar empate
    public void verificaVencedor(String jogador) {
        // Linhas
        for (int i = 0; i < 3; i++) {
            if (B1.getText().equals(jogador) && B2.getText().equals(jogador) && B3.getText().equals(jogador)) {
                anunciarVencedor(jogador);
                return;
            } else if (B4.getText().equals(jogador) && B5.getText().equals(jogador) && B6.getText().equals(jogador)) {
                anunciarVencedor(jogador);
                return;
            } else if (B7.getText().equals(jogador) && B8.getText().equals(jogador) && B9.getText().equals(jogador)) {
                anunciarVencedor(jogador);
                return;
            }
        }

        // Colunas
        for (int i = 0; i < 3; i++) {
            if (B1.getText().equals(jogador) && B4.getText().equals(jogador) && B7.getText().equals(jogador)) {
                anunciarVencedor(jogador);
                return;
            } else if (B2.getText().equals(jogador) && B5.getText().equals(jogador) && B8.getText().equals(jogador)) {
                anunciarVencedor(jogador);
                return;
            } else if (B3.getText().equals(jogador) && B6.getText().equals(jogador) && B9.getText().equals(jogador)) {
                anunciarVencedor(jogador);
                return;
            }
        }

        // Diagonais
        if (B1.getText().equals(jogador) && B5.getText().equals(jogador) && B9.getText().equals(jogador)) {
            anunciarVencedor(jogador);
            return;
        } else if (B3.getText().equals(jogador) && B5.getText().equals(jogador) && B7.getText().equals(jogador)) {
            anunciarVencedor(jogador);
            return;
        }

        // Verifica Empate
        if (!B1.getText().isEmpty() && !B2.getText().isEmpty() && !B3.getText().isEmpty() &&
                !B4.getText().isEmpty() && !B5.getText().isEmpty() && !B6.getText().isEmpty() &&
                !B7.getText().isEmpty() && !B8.getText().isEmpty() && !B9.getText().isEmpty()) {
            anunciarEmpate();
        }
    }

    // Esta função recebe a string do jogador em questão e verifica se ele é o jogador 1
    // ou jogador 2. Aumenta o contador de vitorias do jogador em questão, muda a descrição
    // de número de vitórias e solta um alerta na tela avisando que o jogo foi encerrado
    // pois houve um vencedor na partida. Após isso reinicia o jogo depois da ação do usuário.
    public void anunciarVencedor(String jogador) {
        String jogadorVencedor = "";
        if (jogador.equals("X")){
            jogadorVencedor = "Jogador 1";
            numVitoriasJogador1 ++;
            vitoriasJogador1.setText("Número de Vitórias: " + numVitoriasJogador1);
        } else {
            jogadorVencedor = "Jogador 2";
            numVitoriasJogador2 ++;
            vitoriasJogador2.setText("Número de Vitórias: " + numVitoriasJogador2);
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Fim de jogo!");
        alert.setHeaderText("O " + jogadorVencedor + " venceu o jogo!");
        alert.setContentText("Parabéns ao vencedor!");

        alert.showAndWait();
        reiniciarJogo();
    }

    // Esta função aumenta o contador de empates e avisa na tela que o jogo terminou empatado.
    // Após isso reinicia o jogo depois da ação do usuário.
    public void anunciarEmpate() {
        numEmpates ++;
        empates.setText("Número de Empates: " + numEmpates);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Fim de jogo!");
        alert.setHeaderText("O jogo terminou em Empate!");

        alert.showAndWait();
        reiniciarJogo();
    }

}

