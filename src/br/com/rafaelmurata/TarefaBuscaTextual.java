package br.com.rafaelmurata;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class TarefaBuscaTextual implements Runnable {

	private String nomeArquivo;
	private String nome;
	public TarefaBuscaTextual(String nomeArquivo, String nome){
		this.nomeArquivo = nomeArquivo;
		this.nome = nome;
		
	}
	@Override
	public void run() {
		try {
			Scanner scanner =new  Scanner(new File(nomeArquivo));
			
			int numeroLinha=1;
			
			while(scanner.hasNext()){
				String linha = scanner.nextLine();
				if(linha.contains(nome)){
					System.out.println(nomeArquivo+ " - "+numeroLinha +" - "+ linha);
				}
				numeroLinha++;
			}
			scanner.close();
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		
	}

}
