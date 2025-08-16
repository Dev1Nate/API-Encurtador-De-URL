package com.Encurtador.API.Services;


import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


@Service
public class EncurtadorService {

    public String getNewURL(String Url){

        try {

            ProcessBuilder ps = new ProcessBuilder("python", "src/main/resources/python/shortener.py",Url);
            ps.redirectErrorStream(true);
            Process process = ps.start();
            try (BufferedReader ln = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line = ln.readLine();
                return line;
            }

        }catch (RuntimeException e ){
            return e.getMessage();
        }
        catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }

    }
}
