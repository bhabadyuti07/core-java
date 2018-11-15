package com.corejava.others;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionRreader {
    public static void main(String[] args) throws Exception {
        URL oracle = new URL("https://www.oracle.com/index.html");
        URLConnection yc = oracle.openConnection();
        
        yc.setDoOutput(true);
        yc.setDoInput(true);
        yc.setUseCaches(false);
        
        DataOutputStream outputStream = new DataOutputStream(yc.getOutputStream());
        outputStream.writeBytes("sssss");
        
        /*ObjectInputStream inputStream = new ObjectInputStream(new BufferedInputStream(yc.getInputStream()));
        String ob = (String)inputStream.readObject();
        System.out.println(ob);*/
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        //in.close();
    }
}
