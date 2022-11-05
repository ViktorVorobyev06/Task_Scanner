import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//-----------------------------------If all true----------------------------------------------

/*        Scanner input=new Scanner(System.in);
        String name;
        int height;
        System.out.println("Hello! Let's find out your best weigh!");
        System.out.println("What's your name?");
        name=input.nextLine();
        System.out.println("Nice to meet you, " + name + " What's your height?");

        height=input.nextInt();
        System.out.println("So," + name+ ". Your best weight is "+(height-100));*/
//-------------------------------------If Name false--------------------------------------------
/*        Scanner inputName=new Scanner(System.in);
        Scanner inputHeight=new Scanner(System.in);
        String name;
        int height;
        System.out.println("Hello! Let's find out your best weigh!");
        System.out.println("What's your name?");

        if(!inputName.hasNextInt()){
            name=inputName.nextLine();
            System.out.println("Nice to meet you, " + name + " What's your height?");
            height=inputHeight.nextInt();
            System.out.println("So," + name+ ". Your best weight is "+(height-100));
        }else {
            System.out.println("That's not a name, but ok, I'll call you dummy))");
            System.out.println("Nice to meet you, Dummy. What's your height?");
            height=inputHeight.nextInt();
            System.out.println("So, dummy . Your best weight is "+(height-100));
        }*/
//-------------------------------------If heieht false--------------------------------------------
        /*Scanner inputName=new Scanner(System.in);
        Scanner inputHeight=new Scanner(System.in);
        String name;
        int height;
        System.out.println("Hello! Let's find out your best weigh!");
        System.out.println("What's your name?");

        name=inputName.nextLine();
        System.out.println("Nice to meet you, " + name + " What's your height?");

        if(inputHeight.hasNextInt()){
            height=inputHeight.nextInt();
            System.out.println("So," + name+ ". Your best weight is "+(height-100));
        }else {
            System.out.println("That's not a height, restart the program and try again!");
        }*/
//-------------------------------------If all false--------------------------------------------

        Scanner input = new Scanner(System.in);
        String name= null;
        int height = 0;
        System.out.println("Hello! Let's find out your best weigh!");
        System.out.println("What's your name?");

        if (!input.hasNextInt()&&!input.hasNextByte()&&!input.hasNextShort()&&!input.hasNextDouble()&&
                !input.hasNextFloat()&&!input.hasNextLong()) {
            name = input.next();
            System.out.println("Nice to meet you, " + name + " What's your height?");
        } else {
            System.out.println("That's not a name, but ok, I'll call you dummy))");
            System.out.println("Nice to meet you, Dummy. What's your height?");
            input.next();
        }
        if (input.hasNextInt()&&!input.hasNextByte()&&!input.hasNextShort()&&!input.hasNextDouble()&&
                !input.hasNextFloat()&&!input.hasNextLong()) {
            height = input.nextInt();
            System.out.println("So," + name + ". Your best weight is " + (height - 100));
        } else {
            System.out.println("That's not a height, restart the program and try again!");
            input.next();
        }
        }
    }

