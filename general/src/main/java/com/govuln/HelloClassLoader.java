package com.govuln;

import java.net.URL;
import java.net.URLClassLoader;

public class HelloClassLoader
{
    public static void main( String[] args ) throws Exception
    {
        URL[] urls = {new URL("http://localhost:8000/")};
        URLClassLoader loader = URLClassLoader.newInstance(urls);
        Class c = loader.loadClass("Hello");
        c.newInstance();
    }
}
