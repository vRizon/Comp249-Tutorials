import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String SPACE = " ";

    public static void main(String[] args) throws IOException {


        //1.
        String inputFileStudents = "rawFileStudents.txt";


        //2.
        BufferedReader reader = null;
        List<Student> students = new ArrayList<>();
        try  {
            reader= new BufferedReader(new FileReader(inputFileStudents));
            String line;
            while ((line = reader.readLine()) != null) {
                //System.out.println("\nUnparsed line: " +line);

                String[] parsedData = parseString(line);

                String firstName = parsedData[0];
                String lastName = parsedData[1];
                String id = parsedData[2];
                String grade = parsedData[3];

                students.add(new Student(firstName,lastName,id,grade));

            }

            //Don't forget to close
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        //Printing students
        for(int i = 0; i< students.size();i++){
            students.get(i).printStudent();
        }

        //Printing to txt file
        BufferedWriter writer = new BufferedWriter(new FileWriter("parsedStudents.txt"));
        for(int i = 0; i< students.size();i++){
            writer.write(students.get(i).getFirstName()+ SPACE + students.get(i).getLastName() + SPACE+
                    students.get(i).getId() + SPACE + students.get(i).getGrade()+ "\n");
        }
        writer.close();

        BufferedReader r = new BufferedReader(new FileReader("parsedStudents.txt"));
        System.out.println("\n\n"+r.readLine());

        r.close();




    }



    public static String[] parseString(String input) {
        String firstName = "";
        String lastName = "";
        String id = "";
        String grade = "";

        // Find the transition from first name to last name
        int i = 1;
        while (i < input.length() && !Character.isUpperCase(input.charAt(i))) {
            i++;
        }

        // Split the string into first name and the rest
        firstName = input.substring(0, i);

        // Find the transition from last name to ID
        int j = i + 1;
        while (j < input.length() && !Character.isDigit(input.charAt(j))) {
            j++;
        }

        // Split the string into last name and the rest
        lastName = input.substring(i, j);

        // Find the transition from ID to grade
        int k = j;
        while (k < input.length() && Character.isDigit(input.charAt(k))) {
            k++;
        }

        // Split the string into ID and grade
        id = input.substring(j, k);
        grade = input.substring(k);

        return new String[] { firstName, lastName, id, grade };
    }


    ////////////////////////////////////////////////////////////////
    // Examples of read and write
    public static void readFromFile()  {
        String fileName_temp = "input.txt";
        BufferedReader read = null;
        try {
            read = new BufferedReader(new FileReader(fileName_temp));
            System.out.println(read.readLine());    //return a string
            read.close();

        } catch (IOException oi) {
            System.out.println("Could not locate the file: \"" + fileName_temp + "\"");
        }
    }
    public static void writeToFile() throws IOException {
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
        } catch (IOException io) {
            System.out.println("Oops");
            io.printStackTrace();
        } finally {
            writer.close(); //always close the file
        }

    }

    public static void test2(){
        String input = "CateDunlap45456A";
        String[] parsedData = parseString(input);

        String firstName = parsedData[0];
        String lastName = parsedData[1];
        String id = parsedData[2];
        String grade = parsedData[3];

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);

    }
}