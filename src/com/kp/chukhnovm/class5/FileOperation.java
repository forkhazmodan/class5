package com.kp.chukhnovm.class5;

import java.io.*;

public class FileOperation {

    public static void copy(File in, File out) throws IOException {
        byte[] buffer = new byte[1000000];
        int byteRead = 0;

        try (InputStream is = new FileInputStream(in);
             OutputStream os = new FileOutputStream(out)
        ) {

            while((byteRead = is.read(buffer)) > 0) {
                os.write(buffer, 0, byteRead);
            }

        } catch (IOException e) {
            throw e;
        }
    }
}
