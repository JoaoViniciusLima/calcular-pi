public class Main {
    
	public static void main(String[] args) {              	                //  private static final double somatorio[1000000];
     long tempoInicial=System.currentTimeMillis();
    int x=0;
    double[] soma = new double[20];
	Thread t1 = new Thread(new MinhaThread(soma));
   
    Thread t2 = new Thread(new MinhaThread2(soma));
    Thread t3 = new Thread(new MinhaThread3(soma));
    Thread t4 = new Thread(new MinhaThread4(soma));
    t1.start();
    //try{
     //  t1.join(200);
    //}
    
   t2.start();
     t3.start();
     t4.start();
    try{Thread.sleep(20);}catch(Exception erro){}
    //t2.join(200);
   
	 // System.out.println(((soma[1]+soma[0]))*4);
    System.out.println((soma[1]+soma[0]+soma[2]+soma[3])*4);
    //System.out.println(soma[0]);
    //System.out.println(soma[0]);
    //System.out.println(0);
   
    long tempoFinal =System.currentTimeMillis();
    System.out.println(tempoFinal-tempoInicial);
    
	}
    
}

