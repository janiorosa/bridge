public class Principal {
    
    public static void main(String[] args){
        ControleRemoto tv1 = new TVQueFicaMuda(
        new TV(1,200));
        ControleRemoto tv2 = new TvQuePausa(
        new TV(1,200));
        //EXERCICIO: adicionar um Blue Ray, um X-Box e um PlayStation
        System.out.println("Testando a TV que fica muda:");
        tv1.botaoCinco();
        tv1.botaoSeis();
        tv1.botaoNove();
        System.out.println("Testando a TV que pausa:");
        tv2.botaoCinco();
        tv2.botaoSeis();
        tv2.botaoNove();
        
        
    }
}
