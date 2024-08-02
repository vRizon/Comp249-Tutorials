import java.io.*;

public class Main {

    static class Student implements Serializable
    {
        public String name;
        private int grade;


        public Student(String n,int g)
        {
            name=n;
            grade=g;
        }

        public String toString()
        {
            return "\nStudent: \n"+
                    "\nName: "+name+ "\nGrade: "+grade;
        }

    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Writing to file
        try {

            //1)One way to instantiate ObjectInputStream
//          FileInputStream fis=new FileInputStream("Student.txt");
//          ObjectInputStream outputStream=new ObjectInputStream(fis);

//            FileOutputStream fos = new FileOutputStream("Student.txt");
//            DataOutputStream dos = new DataOutputStream(fos);

            //2)Second way to instantiate ObjectInputStream
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Student.txt"));

            //Writing object of student into file
            Student student = new Student("Luna", 90);
            outputStream.writeObject(student);

            outputStream.close();
        }
        catch(IOException e){
            System.out.println("Error with file output");
        }




        //Reading from file
        System.out.println("Reading from file");

        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Student.txt"));
            Student readStudent = (Student) inputStream.readObject( );


            System.out.println(readStudent.toString());
        }
        catch(FileNotFoundException e){
            System.out.println("Error");
        }


    }


}