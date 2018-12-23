package com.br.create.html;

public class HtmlPage {
	
	//exemplo de pagina html

	public String head(String name, String testdescript, String status, String date) {
		
		String head = "<html lang=\"en\">\r\n" + "\r\n" + "<head>\r\n" + "    <title>" + name + "</title>\r\n"
				+ "    <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + "\r\n"
				+ "    <style type=\"text/css\" media=\"all\">\r\n"
				+ "html{margin:0;zoom:1;font-family:'Courier New',Courier,monospace;color:rgba(26,26,26,.856)}ul.nav{list-style-type:none;margin:0;padding:0;overflow:hidden;background-color:#333}li.nav{float:left}li.nav a{display:block;color:white;text-align:center;padding:14px 16px;text-decoration:none}li.nav a:hover{background-color:#111}#figure{position:relative;width:96%;height:auto}.fail{border:15px solid red;color:red}.pass{border:15px solid green;color:green}ul .report{list-style-type:none;position:relative;font-size:25px}"
				+ "    </style>\r\n" + "</head>\r\n" + "\r\n" + "<body>\r\n" + "    <ul class=\"nav\">\r\n"
				+ "        <li class=\"nav\"><a href=\"#\"><img src=\"file:///C:\\Users\\Inmetrics\\Dropbox\\Projects\\JavaScript\\phantonjs\\Logo-santander.png\"\r\n"
				+ "                    alt=\"Logo-santander\" height=\"25\" width=\"87\"></a>\r\n"
				+ "        </li> \r\n" + "    </ul>\r\n" + "    <h1 class=\"" + status + "\">" + name + " - " + testdescript + "</h1>\r\n"
				+ "    <p>caso de teste " + name + " - " + testdescript + " - Executado em: " + date + "</p>\r\n"
				+ "    <hr>";
		return head;
	}

	public String body(String img, String date, String status, String message, String testdescript) {
		String body = "<div>\r\n" + "        <img src=\"file:///" + img + "\" alt=\"CT001\" id=\"figure\" class=\"" + status + "\" >\r\n  "
				+ "    </div>\r\n" + "\r\n" + "    \r\n" + "    <div class=\"report\">\r\n" + "\r\n"
				+ "        <ul class=\"report\">\r\n" + "\r\n" + "            <li class=\"report\">" + date
				+ "</li>\r\n" + "            <li class=\"report\">" + testdescript + "</li>\r\n"
				+ "            <li class=\"report\">" + message + "</li>\r\n" + "\r\n" + "        </ul>\r\n"
				+ "    </div>" + "<hr>";
		return body;
	}

	public String footer() {
		String footer = "</body>\r\n" + "\r\n" + "</html>";
		return footer;

	}

}
