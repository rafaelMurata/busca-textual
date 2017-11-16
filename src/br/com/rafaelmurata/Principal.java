package br.com.rafaelmurata;

public class Principal {

	public static void main(String[] args) {

		String nome = "Jon";
		
		Thread threadAssinatura = new Thread(new TarefaBuscaTextual("assinaturas1.txt",nome));
		Thread threadAssinatura2 = new Thread(new TarefaBuscaTextual("assinaturas2.txt",nome));
		Thread threadAutores = new Thread(new TarefaBuscaTextual("autores.txt",nome));
		
		threadAssinatura.start();
		threadAssinatura2.start();
		threadAutores.start();

	}

}
