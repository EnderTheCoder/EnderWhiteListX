package com.ender;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {

    public static void main(String[] args) throws IOException {

        String fileContent = readFileContent();

        System.out.println(fileContent);
    }

    //参数string为你的文件名
    private static String readFileContent() throws IOException {

        File file = new File("");

        BufferedReader bf = new BufferedReader(new FileReader(file));

        String content = "";
        StringBuilder sb = new StringBuilder();

        while(content != null){
            content = bf.readLine();

            if(content == null){
                break;
            }

            sb.append(content.trim());
        }

        bf.close();
        return sb.toString();
    }
}