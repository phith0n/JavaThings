package com.govuln.xxe;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class XMLReaderExample {
    public static void main(String[] args) throws Exception {
        String data = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "<!DOCTYPE foo [\n" +
                "   <!ENTITY xxe SYSTEM \"file:///etc/passwd\" > ]>\n" +
                "<foo>&xxe;</foo>";
        XMLReader reader = XMLReaderFactory.createXMLReader();
        reader.setContentHandler(new DefaultHandler() {
            public void characters(char[] ch, int start, int length) {
                System.out.print(new String(ch, start, length));
            }
        });
        reader.parse(new InputSource(data));
    }
}
