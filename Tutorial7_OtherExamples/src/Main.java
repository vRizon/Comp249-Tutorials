import java.io.*;

class Student
{
    public String departmentt;
    int rollnumber;
    String name;
    String department;

    public void print(){
        System.out.println(rollnumber + " " + name + " " + department);
    }
}

public class Main {


    public static void main(String[] args) throws IOException {

        //1 example1

        //2 example2
        //example2();

        //binary file
        FileOutputStream fos=new FileOutputStream("Student.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        Student student2 = new Student();

        student2.rollnumber = 10;
        student2.name = "Mary";
        student2.department = "ECE";

        dos.writeInt(student2.rollnumber);
        dos.writeUTF(student2.name);
        dos.writeUTF(student2.department);

        dos.close();
        fos.close();

    }

    public static void example1() throws IOException {
        //The FileReader class is a convenience class for reading character files.
        // It reads characters directly from the file and converts them into char values

        //The BufferedReader class wraps another Reader (like FileReader) and adds buffering capabilities to improve performance.
        // Instead of reading characters one by one from the file, it reads a larger block of characters at once and stores them
        // in a buffer. Subsequent read operations are satisfied from this buffer,
        // which reduces the number of I/O operations and can significantly improve performance.


        //Without Buffering: If you use FileReader directly, each read operation involves a potentially costly I/O operation because
        // it reads characters directly from the disk.
        //With Buffering: When you wrap FileReader in a BufferedReader, the BufferedReader reads larger blocks of characters at a
        // time into a buffer. When you read characters from the BufferedReader,
        // it serves them from this buffer, reducing the number of actual I/O operations.

        FileReader fis=new FileReader("Test.txt");
        BufferedReader bis=new BufferedReader(fis);

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());

    }

    public static void example2() throws IOException {
        //we are opening a file and attaching it to bufferedreader
        // This class is used to read bytes from a file, translates to characters.
        FileInputStream fis=new FileInputStream("Student1.txt");
        //This class adds buffering to the Reader it wraps. It reads larger blocks of characters at a time,
        // which can improve efficiency, especially for repeated read operations.
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));




        Student student=new Student();
        student.rollnumber = Integer.parseInt(reader.readLine());
        student.name = reader.readLine();
        student.department = reader.readLine();
        student.print();
    }
}