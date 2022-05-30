package controller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Controller1 {

    public void lecturaFichero(File file) {

        FileReader fileReader =null;

        try {
            fileReader = new FileReader(file);
            int lectura = 0;
            while ((lectura=fileReader.read())!=-1){
                System.out.print((char) (lectura/2));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
