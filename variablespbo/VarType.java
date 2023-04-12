import java.sql.SQLOutput;

public class VarType {
    public static void main(String [] args){
        int size = 9;
        double ipk = 3.0;
        float mm = 0.001f;
        byte value = 10;
        short age = 10;
        long l1 = 150000L;

        char gender = 'D';
        String name = "Budi";

        boolean ques = true;

        System.out.println("Value: "+value+" Age: "+age+" Size: "+size);

        System.out.println(name.compareTo("ani"));
        System.out.println(name.equals("budi"));
        System.out.println(name.equalsIgnoreCase("budi"));




    }

}
