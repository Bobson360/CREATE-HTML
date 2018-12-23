package com.br.create.pdf;

import java.io.IOException;

public class CreatePdf {
	
	public static void createPdf(String path) throws InterruptedException, IOException {
		try {
			//executa o javascript para criar o pdf
			Runtime.getRuntime().exec("config\\phantomjs config\\configFile.js " + path + "\\index.html "+ path +"\\output.pdf");
			System.out.println("Pdf criado com sucesso");
			
		}catch (Exception e) {
			
			System.out.println("Falha ao criar o pdf");
			
		}
	}

}
