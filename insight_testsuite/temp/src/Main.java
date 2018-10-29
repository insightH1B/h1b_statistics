import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("start counting");

        // the default input path
        String fileName = ".//input//h1b_input.csv";

        // if there script gives a new input path through args
        // the new input path will override the default one
        if (args.length == 1) {
            fileName = args[0];
        }

        H1B_counting h1B_counting = new H1B_counting();
        h1B_counting.count(fileName);

        System.out.println("finish counting, you can check the answer at output folder");

    }
}


