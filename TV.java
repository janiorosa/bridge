public class TV extends DispositivoEntretenimento{
     public TV(int newEstado, int newMaximo){
            estado=newEstado;
            maximo=newMaximo;
     }

    public void botaoCinco(){
      System.out.println("Canal Down");
       estado--; 
    }
    public void botaoSeis(){
      System.out.println("Canal Up");
       estado++; 
    }
}
