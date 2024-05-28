package Dispositivo;

import Dispositivo.FuncionalidadesTelefone.NavegadorInternet;
import Dispositivo.FuncionalidadesTelefone.AparelhoTelefonico;
import Dispositivo.FuncionalidadesTelefone.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String estadoDispositivo = "Desligado";
    private int volume = 20;

        public void ligarDispositivo() {
            if (this.estadoDispositivo == "Desligado") {
                this.estadoDispositivo = "Ligado";
                System.out.println("Ligando iPhone... Aguarde.");
            }
        }
    
        public void desligarDispositivo() {
            if (this.estadoDispositivo == "Ligado") {
                this.estadoDispositivo = "Desligado";
                System.out.println("Desligando iPhone...");
            }
        }

        public void aumentarVolume() {
            if (volume < 25) {
                volume++;
            }
            System.out.println("Volume aumentado para: " + volume);
        }
    
        // Método para diminuir o volume
        public void diminuirVolume() {
            if (volume > 0) {
                volume--;
            }
            System.out.println("Volume diminuído para: " + volume);
        }

        public void selecionarMusica(String musica) {
            System.out.println("Selecionando música: " + musica + ". Começando a reprodução...");
            
        }

        public void tocarMusica() {
            System.out.println("Reproduzindo");
        }

        public void trocarMusica() {
            System.out.println("Próxima música >>");
        }

        public void pausarMusica() {
            System.out.println("Música pausada.");
        }

        public void ligarContato(String numero) {
            System.out.println("Ligando para contato: " +numero);
        }

        public void iniciarCorreioVoz() {
            System.out.println("Redirecionando para Correio de Voz...");
        }

        public void atenderChamada() {
            System.out.println("Recebendo chamada");
            
        }

        public void chamadaEmEspera() {
            System.out.println("Está ligação está no modo chamada em espera.");
            
        }

        public void encerrarChamada() {
            System.out.println("Chamada encerra.");
            
        }

        public void escutarCorreioVoz() {
            System.out.println("Reproduzindo Correio de Voz.");
        }


        public void mutarChamada() {
            System.out.println("A chamada está no modo mudo");
        }

        public void rejeitarChamada() {
            System.out.println("Chamada rejeita.");
            
        }

        public void abrirNavegador() {
            System.out.println("Abrindo navegador padrão...");
        }

        public void adicionarNovaAba() {
            System.out.println("Adicionando nova aba +");
        }

        public void atualizarPagina() {
            System.out.println("Página atualizada.");
        }

        public void exibirPagina(String url) {
            System.out.println("Exibindo página:" +url);
        }

        public void trocarPagina() {
            System.out.println("Mudando de página...");
        }

        public void fecharAba() {
            System.out.println("Fechando página atual...");
        }
        
    }
