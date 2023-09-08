package br.com.xti.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		String padrao = "Java";
		String texto = "Java";
		boolean b = texto.matches(padrao);		
		//System.out.println(b);
		
		/*MODIFICADORES
		 (?i), Ignora maiúscula e minúsculas
		 (?x), Comentários
		 (?m), Multilinhas
		 (?s), Dottal
		 * */
		
		boolean c = "Java".matches("(?i)java");		
		//System.out.println(c);
		
		/*METACARACTERES
		. qualquer caracter
		\s dígitos 			[0-9]
		\D não é dígito 	[^0-9]
		\s espaço 			[ \t\n\x0B\f\r]
		\S não é espaço		[^\s]
		\w letra			[a-zA-Z_0-9]
		\W não é letra
		 */
		
		c = "@".matches(".");		
		c = "2".matches("\\d");		
		c = "A".matches("\\w");		
		c = " ".matches("\\s");		
		
		//
		c = "aeiou".matches(".....");		
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		c = "23894-470".matches(cep);		
		
		/*QUANTIFICADORES
		 X{n}		X, exatamente n vezes
		 X{n,}		X, pelo menos n vezes
		 X{n, m}	X, pelo menos n mas não mais do que m vezes
		 X?			X, 0 ou 1 vez
		 X*			X, 0 ou + vezes
		 X+			X, 1 ou + vezes
		 
		 Procura a quanitdade de correncia do caracter N vezes
		 * */
				
		c = "21".matches("{2}");
		c = "123".matches("\\d{2,}");
		c = "123456".matches("\\d{2,5}");
		
		c = "".matches(".?");//0 ou 1
		c = "ab".matches(".*");//0 ou +
		c = "1".matches(".+");//1 ou +
		
		c = "23894-470".matches("\\d{5}-\\d{3}");
		c = "29/09/1988".matches("\\d{2}/\\d{2}/\\d{4}");		
		
		/*METACARACTER DE FRONTEIRA
		 ^	inicia
		 $	finaliza
		 |	ou */
		
		c = "Pier21".matches("^Pier.*");
		c = "Pier21".matches(".*21$");
		c = "tem java aqui".matches(".*java.*");
		c = "tem java aqui".matches("^tem.*aqui$");
		c = "sim".matches("sim|não");
		
		/*AGRUPADORES
		 [...]			Agrupamento
		 [a-z]			Alcance
		 [a-e][i-u]		União
		 [a-z&&[aeiou]]	Interseção
		 [^abc]			Exceção
		 [A-z&&[^m-p]]	Subtração
		 \x				Fuga literal
		 */				
		
		c = "x".matches("[a-z]");
		c = "3".matches("[0-9]");
		c = "True".matches("[tT]rue");//true True
		c = "True".matches("[tT]rue|[yY]es");//true True yes Yes
		c = "yes".matches("[tT]rue|[yY]es");//true True yes Yes
		c = "Yes".matches("[tT]rue|[yY]es");//true True yes Yes
		
		c = "Beatriz".matches("[A-Z][a-zA-Z]*");//Primeiro nome
		c = "olho".matches("[^abc]lho");
		c = "rh@xti.com".matches("\\w+@\\w+\\.\\w{2,3}");//validação de e-mail
		//System.out.println(c);
		
		String doce = "Qual é o Doce mais doCe que o doce?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while(matcher.find()) {
			//System.out.println(matcher.group());
		}
		
		/*SUBISTITUIÇÕES*/
		String r = doce.replaceAll("(?i)doce", "DOCINHO");
		
		String rato = "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeiou]", "XX");
		
		r = "Tabular este texto".replaceAll("\\s", "\t");
		
		String url = "www.xti.com.br/clientes-2023.html";
					//http://www.xti.com.br/2023/clientes.jsp //novo padrão
		
		//criando a expressão
		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		b = url.matches(re);	
		
		//montando variáveis 
		re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		
		r = url.replaceAll(re, "http://$1/$3/$2.jsp");
		System.out.println(url);
		System.out.println(r);
		
	}

}
