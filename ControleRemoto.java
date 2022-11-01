public abstract class ControleRemoto{
    private DispositivoEntretenimento disp;
    public ControleRemoto(DispositivoEntretenimento novo){
        disp=novo;
    }
    public void botaoCinco(){
        disp.botaoCinco();
    }
    public void botaoSeis(){
        disp.botaoSeis();
    }
    public void feedbackDispositivo(){
        disp.feedbackDispositivo();
    }
    public abstract void botaoNove();
    
}
