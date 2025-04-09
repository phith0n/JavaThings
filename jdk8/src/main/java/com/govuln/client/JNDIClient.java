package com.govuln.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.ldap.InitialLdapContext;
import java.util.Hashtable;

public class JNDIClient {
    public static void main(String[] args) throws Exception {
         Context initialContext = new InitialContext();
         initialContext.lookup("ldap://127.0.0.1:389/sample");
    }
}
