package br.com.rafaelmurata.experimento;

public class Lista {

	private int indice;
	private String[] elementos =new String[1000];

	public synchronized void adicionaElementos(String elemento) {
        this.elementos [indice] = elemento;
        this.indice++;

        try{
            Thread.sleep(10);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

	public int tamanho() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int pegaElemento(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
