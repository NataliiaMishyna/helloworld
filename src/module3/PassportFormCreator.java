package module3;
import java.util.*;

public class PassportFormCreator {
        public void createForms(){
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            String lastName = scanner.nextLine();
            int age = scanner.nextInt();
            System.out.println(name + " " + lastName + " " + age * 10);
            System.out.println(name.toUpperCase());
            System.out.println(lastName.toUpperCase());
            System.out.println(age * 10);
            scanner.close();
        }

        public static void main(String[] args){
            new PassportFormCreator().createForms();
        }
}

