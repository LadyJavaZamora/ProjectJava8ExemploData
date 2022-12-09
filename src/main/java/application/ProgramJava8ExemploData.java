package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramJava8ExemploData {

	public static void main(String[] args) {
	
		LocalDate     d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant       d03 = Instant.now();
		
		//Referência pegar data em qualquer formato e passar para um formato que o java 17LTS "entenda"
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		LocalDate     d04 = LocalDate.parse("2022-07-20");             //Convertendo data ISO 8601 em data local
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");//Convertendo data ISO 8601 em data local com timestamp 
		Instant       d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant       d07 = Instant.parse("2022-07-20T01:30:26-03:00");//Converte um horário de SP em horário de Londres
		LocalDate     d08 = LocalDate.parse("20/07/2022",fmt1);        //Pegar data em qualquer formato e passar para um formato que o java 17LTS "entenda"
		LocalDate     d09 = LocalDate.parse ("20/07/2022 04:30", fmt2);
		LocalDate     d10 = LocalDate.of(2022, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20,1,30);
				
		System.out.println("Localdate d01 = "+ d01);
		System.out.println("LocaldateTime d02 = "+ d02);
		System.out.println("Instant d03 = "+ d03);
		System.out.println("Localdate.parse d04 = "+ d04);
		System.out.println("LocaldateTime.parse com time stamp d05 = "+ d05);
		System.out.println("Instant d06 com time stamp horario Londres d06 = "+ d06);
		System.out.println("Instant d07 horario local em horario Londres d07 = "+ d07);
		System.out.println("LocalTimeFormatter.parse d08 = "+ d08);
		System.out.println("LocalTimeFormatter.parse d09 = "+ d09.toString());
		System.out.println("LocalTimeFormatter.parse d10 = "+ d10.toString());
		System.out.println("LocalTimeFormatter.parse d11 = "+ d11.toString());
		
	}

}

