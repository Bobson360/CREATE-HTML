package com.br.create.html;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.br.create.pdf.CreatePdf;;

public class HtmlBuild {
	
	static CreatePdf createPdf = new CreatePdf();
	static HtmlPage htmlPage = new HtmlPage();
	static long folderName = System.currentTimeMillis();
	static Date date = new Date();
	static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	private static File dirTest;
	private static String linha;
	private static String arquivo = "";
	
	File dirtest ;

	//cria a pagina html e a estrutura de pastas
	public static void createFile(String page, String pasta, String pastaData, String folderTest) throws IOException {
		
		File path 		= new File("resource\\");
		File img 	= new File("resource\\template\\CT001.png").getCanonicalFile();
		dirTest 	= new File(path + "\\" + pasta + "\\" + pastaData + "\\" + folderTest + "\\" + folderName);
		
		if(!dirTest.exists()) 
			dirTest.mkdirs();
		
		
		FileWriter file = new FileWriter(new File(dirTest +"\\index.html"));
		PrintWriter insertFile = new PrintWriter(file);
//		System.out.println(page);
		insertFile.print(page);
		file.close();
		
//		copyFile(img, dirTest);
	}
	
	
	/****************exemplo de chmada dos metodos
	 * @return *********************/
	
//	 public static void copyFile(File source, File destination) throws IOException {
//	        if (destination.exists())
//	            destination.delete();
//	        FileChannel sourceChannel = null;
//	        FileChannel destinationChannel = null;
//	        try {
//	            sourceChannel = new FileInputStream(source).getChannel();
//	            destinationChannel = new FileOutputStream(destination).getChannel();
//	            sourceChannel.transferTo(0, sourceChannel.size(),
//	                    destinationChannel);
//	        } finally {
//	            if (sourceChannel != null && sourceChannel.isOpen())
//	                sourceChannel.close();
//	            if (destinationChannel != null && destinationChannel.isOpen())
//	                destinationChannel.close();
//	       }
//	   }
	
	public static String html(String title, String navbutton1, String navbutton2, String navbutton3, String navbutton4, String text_title, String text_content){
		//monta um string contendo o html da pagina a ser gerada
		try{
	    	
			File file = new File("resource\\template\\index.html").getCanonicalFile();
			
			BufferedReader br = new BufferedReader(new FileReader(file));
	         while(br.ready()){
	        	 
	        	 	   linha = br.readLine();
	        	 	   
	        	 	   linha = linha.replace("{{title}}", 	 		title);
	        	 	   linha = linha.replace("{{navbutton1}}",		navbutton1);
	            	   linha = linha.replace("{{navbutton2}}",		navbutton2);
	            	   linha = linha.replace("{{navbutton3}}",		navbutton3);
	            	   linha = linha.replace("{{navbutton4}}",		navbutton4);
	            	   linha = linha.replace("{{text_title}}",		text_title);
	            	   linha = linha.replace("{{text_content}}",	text_content);
	            	   
	            		   arquivo +=linha + "\r\n";
	            
	         }
	         br.close();
	      }catch(IOException ioe){
	         ioe.printStackTrace();
	      }
		System.out.print(arquivo);
		return arquivo;
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		//parametros para a pagina html, passe "pass" para sucesso ou fail para caso o teste falhe
		String Html = html("Templete HTML", "home", "botão 1", "Botão 2", "Botão 3", "Titulo do Texto", "Texto");
		
		createFile(Html, "evidencias", dateFormat.format(date).toString(), "CT001");
		System.out.println("resource");
		CreatePdf.createPdf(dirTest.toString());
	}

}
