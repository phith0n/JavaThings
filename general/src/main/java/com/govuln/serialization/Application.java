package com.govuln.serialization;

import com.govuln.serialization.model.User;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.io.IOUtils;
import static java.io.ObjectStreamConstants.*;

import java.io.*;

public class Application {
    public static void main(String[] args) throws Exception
    {
        write();
        read();
    }

    public static void write() throws Exception
    {
        ByteArrayOutputStream byteSteam = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(byteSteam);
        oos.writeObject(new User());

        String data = Hex.encodeHexString(byteSteam.toByteArray());
        System.out.println(data);
        ProcessBuilder builder = new ProcessBuilder(
                "java",
                "-jar",
                "D:\\program\\SerializationDumper\\SerializationDumper-v1.13.jar",
                data);
        InputStream is = builder.start().getInputStream();
        IOUtils.copy(is, System.out);
    }

    public static void read() throws Exception
    {
        Object[] data = {
                STREAM_MAGIC, STREAM_VERSION,
                TC_STRING,
                "123123",
        };
        byte[] bs = Converter.toBytes(data);
        System.out.println(Hex.encodeHexString(bs));
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bs));
        Object obj = ois.readObject();
        System.out.println(obj);
    }
}
