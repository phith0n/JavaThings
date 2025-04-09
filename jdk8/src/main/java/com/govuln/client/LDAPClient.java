package com.govuln.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;

public class LDAPClient {
    public static void main(String[] args) throws NamingException {
        Hashtable<String, Object> env = new Hashtable<>();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        env.put(Context.SECURITY_PRINCIPAL, "user");
        env.put(Context.SECURITY_CREDENTIALS, "password");
        env.put(Context.PROVIDER_URL, "ldap://127.0.0.1:389");
        InitialContext ctx = new InitialDirContext(env);
        ctx.lookup("sample");
        ctx.close();
    }
}
