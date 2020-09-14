package com.kp.chukhnovm.class5;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileOperation.copy(
                new File("G:/work/IdeaProjects/progkiev/class5/test/test.txt"),
                new File("G:/work/IdeaProjects/progkiev/test/test5.txt")
            );
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
