import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        Scanner entry = new Scanner(System.in);

        
        String auxName;
        int auxAge;
        String auxbreed;
        double auxlength;
        boolean auxgender = false;


        System.out.println("Please Enter your pet name:");
        auxName = entry.nextLine();
        System.out.println("Enter your dog's age:");
        auxAge = entry.nextInt();

        System.out.println("Enter dog's breed:");
        auxbreed = entry.next();

        System.out.println("Enter dog's Length");
        auxlength = entry.nextDouble();

        System.out.println("Enter dog's gender:");

        switch (String.valueOf(entry.next()).toLowerCase()){
            case "female": auxgender = true;
            break;
            case "male": auxgender = false;
            break;
            default:
                System.out.println("genero no encontrado");
                System.exit(0);
        }

        Dog dog = new Dog(auxName,auxAge,auxbreed,auxlength, auxgender);

        System.out.println(dog.toString());
    }
}
