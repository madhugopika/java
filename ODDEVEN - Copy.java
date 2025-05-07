import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ODDEVEN
{

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        FileInputStream source1 = new FileInputStream ("C:/Users/Student/Desktop/MCA/source1.txt");
        FileOutputStream destination_odd = new FileOutputStream ("odd.txt");
        FileOutputStream destination_even = new FileOutputStream ("even.txt");
        int i;
        while((i = source1.read()) != -1){
            if(i%2==0) {

                destination_even.write(i);
            }
            else {
                destination_odd.write(i);
            }
        }
        System.out.println("copied");
        source1.close();
        destination_even.close();
        destination_odd.close();



    }

}