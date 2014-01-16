package com.neusoft.ikanalyzer;

import java.io.IOException;
import java.io.StringReader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.wltea.analyzer.lucene.IKAnalyzer;

public class IkanalyzerTest {
	public static void main(String[] args) {
		//Lucene Document的域名 
		String fieldName = "text"; 
		//检索内容 
		String text = "IK Analyzer是一个结合词典分词和文法分词的中文分词开源工具包。它使用了全新的正向迭代最细粒度切分算法。";
		Analyzer analyzer = new IKAnalyzer();
		TokenStream tokenStream =  analyzer.tokenStream(fieldName, new StringReader(text));
		tokenStream.addAttribute(CharTermAttribute.class);
		try {
			while (tokenStream.incrementToken()) {
				 CharTermAttribute charTermAttribute = tokenStream.getAttribute(CharTermAttribute.class);
//				 charTermAttribute.
				 System.out.println(new String(charTermAttribute.buffer()));
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
