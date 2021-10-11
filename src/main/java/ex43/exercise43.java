package ex43;

/*
 *  UCF COP3330 Fall 2021 Assignment 43 Solution
 *  Copyright 2021 Jenna Busch
 */


//pseudocode
//I first need to ask for all the information and store them
//I can then create a function that creates files based off of their input
//fill one of the files with the user information
//then print out that they have been created

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;


public class exercise43 {

    private static Object File;

    //this function will generate files based off input
    public static void fileGenerator(String siteName, String author, String js, String css) throws IOException {
        //first we create the website
        System.out.println("Created ./website/"+siteName);
        File website = new File("./website/"+siteName);

        //create the index.html file and fill it
        System.out.println("Created ./website/"+siteName+"/index.html");
        FileWriter indexFile= new FileWriter("src/main/java/ex43/"+siteName);
        indexFile.write("\"<\\t!DOCTYPE html>\\n<html lang=\\\"en\\\">\\n<head>\\n\"");
        indexFile.write("\t<meta name=\"" + author + "\">\n");
        indexFile.write("\t<title>" + siteName + "</title>\n");
        indexFile.write("<head>\n</html>");
        indexFile.close();

        //create files based on if they wanted them
        if(js.equals("y"))
        {
            File jsWeb = new File("./website/"+siteName+"/js/");
            System.out.println("Created ./website/"+siteName+"/js/");
        }

        if(css.equals("y"))
        {
            File cssWeb = new File("./website/"+siteName+"/css/");
            System.out.println("Created ./website/"+siteName+"/css/");

        }


    }

    public static void main(String[] args) throws IOException {

        //create a scanner
        Scanner input = new Scanner(System.in);

        //print out questions
        System.out.println("Site name:");
        String siteName = input.nextLine();

        System.out.println("Author:");
        String author = input.nextLine();

        System.out.println("Do you want a folder for JavaScript?");
        String js = input.next();

        System.out.println("Do you want a folder for CSS?");
        String css = input.next();

        fileGenerator(siteName, author, js, css);

    }


}
