package br.com.rafaelmurata.banheiro;

public class TarefaLimpeza implements Runnable {

	 private Banheiro banheiro;

	    public TarefaLimpeza(Banheiro banheiro) {
	        this.banheiro = banheiro;
	    }

	    public void run() {
	    	while(true) {
	            this.banheiro.limpa();
	            try {
	                Thread.sleep(15000);//limpando cada 15s
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }	    }

}
