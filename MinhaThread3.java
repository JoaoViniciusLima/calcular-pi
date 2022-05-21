public class MinhaThread3 implements Runnable{
  
    double pi = 0,soma2=0;
  //int u=0,t=1;
    //double soma=0;
  int x;
  double[] soma = new double[20];
 public MinhaThread3(double[] soma ){
   this.soma=soma;
 }
    public void run(){
        
        for(int i =500000;i<750000;i++){
              pi = ((Math.pow(-1, i))/((2*i)+1));
        
          soma[2]=pi+soma[2];
          
        // System.out.println(soma[0]);
        }
       pi+=4;
  //  System.out.println(soma[0]);
     //System.out.println(soma);
  }

}
