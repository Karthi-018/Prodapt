package demo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Dem {


        public static void main(String[] args) {
            System.out.println();
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedInputStream(isr);

            try{
//                byte n =(byte) isr.read();
//                System.out.println((char)n);
                String arr = br.readLine();
                System.out.println(arr);
            }
            catch(IOException e1){
                e1.printStackTrace();
            }
            catch(Exception e){
                System.out.println(e);
            }

        }
    }


