package org.example;

import org.example.controller.MainController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MainController controller = new MainController();
        controller.process();
        System.out.println( "РОботу успішно завершено. Гарного дня!!" );
    }
}
