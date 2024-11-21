package kuliah.studycasepbo;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Akun {
    String username;
    String nama;
    String Alamat;
    String noTelepon;

    String[] login(String username, String password) {
        try {
            File file = new File("C:\\Users\\ASUS\\Documents\\Dev\\Akun.txt");
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String temp[] = line.split(" ");
                if (temp.length >= 0) {
                    if (username.equals(temp[0]) && password.equals(temp[1])) {
                        return temp;
                    }
                }
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    boolean registration(String username, String password){
        try {
            File file=new File("C:\\Users\\ASUS\\Documents\\Dev\\Akun.txt");
            Scanner in=new Scanner(file);
            while (in.hasNextLine()) {
                String line =in.nextLine();
                String[] temp=line.split(" ");
                if (temp.length>=0) {
                    if (temp[0].equals(username)) {
                        return false;
                    }
                }
            }
            FileWriter write = new FileWriter("C:\\Users\\ASUS\\Documents\\Dev\\Akun.txt", true);
            StringBuilder sb = new StringBuilder();
            sb.append(username).append(" ").append(password).append("\n");
            write.write(sb.toString());
            write.close();
            return true;


        } catch (Exception e) {
            return false;
        }
    }
}
