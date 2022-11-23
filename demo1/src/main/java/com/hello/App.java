package com.hello;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
        public static void main(String[] args) {
            get("/wrx", (req, res) -> "Hello World test");
            
        }
    }

