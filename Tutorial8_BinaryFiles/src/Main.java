import java.io.*;

public class Main {
    public static void main(String[] args){

        //1. Output of this program is
//        0
//        1
//        2
//        3
//        4
        example1_write();

        //writing twice (overwriting output file)
//        for(int i =0; i<2; i++){
//            example1_write();
//        }

        //2. Read from binary file
        example1_read();

//        for(int i =0; i<2; i++){
//            example1_read();
//        }

    }

    public static void example1_write(){
        try
        {
            //This creates a blank file
            ObjectOutputStream outputStream =new ObjectOutputStream(new FileOutputStream("numbers.dat"));


            int i;
            for (i = 0; i < 5; i++) {
                outputStream.writeInt(i);   //writes integer
                //outputStream.writeUTF("Hello"); //writes String, method uses UTF coding method to write strings to binary file
            }
            System.out.println("Numbers written to the file successfully!");
            outputStream.close();

            //public void flush()throws IOException
            //Flushes the output stream. This forces an actual physical write to the file of any data that has been
            //buffered and not yet physically written to the file. Normally, you should not need to invoke flush
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }

    public static void example1_read(){
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("numbers.dat"));

            int x;
            System.out.println("\nReading the file:");
            try{
                while(true){
                    x=inputStream.readInt();
                    System.out.println(x);
                }
            }
            catch(EOFException e){
                System.out.println("File ended. There is no more numbers");
            }
            inputStream.close();

        }
        catch(FileNotFoundException e){
            System.out.println("Failed to locate the file");
        }
        catch(IOException e){
            System.out.println("Could not input");
        }

    }


}