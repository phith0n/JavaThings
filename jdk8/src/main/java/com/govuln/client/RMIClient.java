package com.govuln.client;

import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] args) throws Exception {
        Naming.lookup("rmi://localhost:1099/test");
    }
}
