package br.com.rafaelmurata.banheiro;

public class TarefaNumero2 implements Runnable  {

	private Banheiro banheiro;

    public TarefaNumero2(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    public void run() {
        this.banheiro.fazNumero2();
    }
}
