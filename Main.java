public class Main {
	public static void main(String[] args) {              	                //  private static final double somatorio[1000000];
    int x=0;
    double[] soma = new double[20];
	Thread t1 = new Thread(new MinhaThread(soma));
   
    Thread t2 = new Thread(new MinhaThread2(soma));
    t1.start();
    //try{
     //  t1.join(200);
    //}
    
   t2.start();
    try{Thread.sleep(500);}catch(Exception erro){}
    //t2.join(200);
   
	  System.out.println(((soma[1]+soma[0]))*4);
    //System.out.println(soma[0]);
    //System.out.println(soma[0]);
    //System.out.println(0);
	}
}

