public class MinhaThread2 implements Runnable{
    double pi = 0,soma2=0;
  //int u=0,t=1;
    double[] soma = new double[20];
  public MinhaThread2(double[] soma ){
   this.soma=soma;
 }
    public void run(){
        
        for(int i =250000;i<500000;i++){
              pi = ((Math.pow(-1, i))/((2*i)+1));

          soma[1]=pi+soma[1];
          //soma=pi+soma2;
          //soma2=soma;
         // System.out.println(soma[1]);
        }
     // soma[0]=3;
       pi+=4;
    
    // System.out.println(soma);
  }
}
