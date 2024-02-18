package com.projetoEmail.ProjetoEmail.service;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebScrappingPoema {
	@Autowired
	ParametrosService parametrosService;
	
	public String buscaPoema() {
		
		String url = parametrosService.retornaParametro(Long.valueOf(2));
		String poemText = null;
		try {
			Document doc = Jsoup.connect(url).get();

			Elements poems = doc.select(".frase");

			boolean foundPoem = false;

			for (Element poem : poems) {
				if (!foundPoem) {
					poemText = poem.text();
					System.out.println(poemText);
					foundPoem = true;
				}
			}
		} catch (IOException e) {
			System.err.println("Erro ao fazer requisição: " + e.getMessage());
		}
		return poemText;

	}
}
