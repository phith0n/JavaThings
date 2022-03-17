package com.govuln.serialization;

import com.govuln.serialization.model.User;
import org.apache.commons.codec.binary.Base64;

import java.io.*;

public class UserSerialization {
    public static void main(String[] args) throws Exception
    {
        write();
    }

    public static void write() throws Exception
    {
        User user = new User("Bob");
        user.setParent(new User("Josua"));
        ByteArrayOutputStream byteSteam = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(byteSteam);
        oos.writeObject(user);

        System.out.println(Base64.encodeBase64String(byteSteam.toByteArray()));
    }
}
