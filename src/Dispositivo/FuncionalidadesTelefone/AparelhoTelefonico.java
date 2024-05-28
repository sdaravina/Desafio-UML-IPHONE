package Dispositivo.FuncionalidadesTelefone;
public interface AparelhoTelefonico {

    void ligarContato(String numero); 
    void atenderChamada(); 
    void mutarChamada();
    void chamadaEmEspera();
    void encerrarChamada();
    void rejeitarChamada();
    void iniciarCorreioVoz(); 
    void escutarCorreioVoz();
    
} 