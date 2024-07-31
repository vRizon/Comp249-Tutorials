//import java.io.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        //1.
//        try {
//            example1_File();    //IOEXaception: try block or throw from main
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        //2.
        example2_BufferedWriter();
        //example2_BufferedReader();


    }


    ///////////////////////////////////////////////////////////////////////////////////////
    //      Methods
    ///////////////////////////////////////////////////////////////////////////////////////


    //EXAMPLE 1

    public static void example1_File() throws IOException {
        String fileName = "myFile.txt";

        File myFile = new File(fileName);
        File myFile1 = new File("myFile1.txt");
        File directory = new File("directory");

        System.out.println("Create new file: "+myFile.createNewFile());


        //Check if file exists & get info
        if (myFile.exists()) {
            myFile.setWritable(true);

            System.out.println("File exists: "+ myFile);
            System.out.println(myFile.getName());
            System.out.println(myFile.getAbsolutePath());
            System.out.println(myFile.length());

            System.out.println("Readable: "+myFile.canRead());
            System.out.println("Writable: "+myFile.canWrite());


            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            System.out.println("Last Modified Date: " + sdf.format(myFile.lastModified()));

        } else {
            System.out.println("File does not exist.");
        }

        //Create directory
        if (directory.mkdir()) {
            System.out.println("Directory created: " + directory.getName());
        } else {
            System.out.println("Error when creating directory");
        }

        //List files
        if (directory.exists() && directory.isDirectory()) {
            String[] files = directory.list();
            if (files != null) {
                for (String file : files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("Failed to list files.");
            }
        } else {
            System.out.println("Directory does not exist.");
        }

        //File write access
        //myFile.setWritable(false);
        //myFile.setReadOnly();
        System.out.println("\nAfter changing permissions, is the file writable: "+myFile.canWrite());


        //Writing using FileWriter & Reading using Scanner
        example1_FileWriter(fileName);

        example1_Scanner(fileName,myFile);
    }

    public static void example1_FileWriter(String fileName){        //Write
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write("HelloWorld");
            myWriter.write("\nHello Java");
            System.out.println("Write is successful!");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Error when writing to file");
            e.printStackTrace();
        }
    }

    public static void example1_Scanner(String fileName, File myObj){   //Read
        try{
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error when reading from a file");
            e.printStackTrace();
        }
    }



    ///////////////////////////////////////////////////////////////////////////////////////
    //EXAMPLE 2
    public static void example2_BufferedReader()  {
        String fileName_temp = "input.txt";
        BufferedReader read = null;
        try {
            read = new BufferedReader(new FileReader(fileName_temp));
            //System.out.println(read.read());    //return ascii
            System.out.println(read.readLine());    //return a string
            read.close();

        } catch (IOException oi) {
            System.out.println("Could not locate the file: \"" + fileName_temp + "\"");
        }
    }
    public static void example2_BufferedWriter()  {
        String[] names = {"John", "Carl", "Jerry"};

        BufferedWriter writer = null;
        try {

            writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to file");
            writer.write("\t\t\tSeparated by tab");
            writer.write("\nWriting on the next line");

            for(String name : names){
                writer.write("\n" + name);
            }

            System.out.println("File created successfully!");
            writer.close(); //always close the file
        } catch (IOException io) {
            System.out.println("Oops");
            io.printStackTrace();
        }

    }




    ///////////////////////////////////////////////////////////////////////////////////////
    //EXAMPLE 3
    public static void example3_FileOutputStream(){
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            String outputString= "Hello World Java";
            //fos.write(outputString.getBytes()); //converting into array of bytes

            byte b[]=outputString.getBytes();   //writing part of string
            fos.write(b,6,outputString.length()-6);



            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }


}