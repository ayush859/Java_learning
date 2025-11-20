import java.util.Scanner;

public class FormatNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter number: ");
        String number = sc.nextLine().trim();

        // Take descriptive string input
        System.out.print("Enter description: ");
        String description = sc.nextLine().trim();

        // Create directory name
        String dirName = (number + " " + description)
                            .toUpperCase()
                            .replaceAll("\\s+", "_");

        // Create file name
        String[] words = description.split("\\s+");
        StringBuilder fileName = new StringBuilder("_XX_");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            fileName.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase());
            if (i < words.length - 1) fileName.append("_");
        }
        fileName.append(".java");

        // Print results
        System.out.println("DIR Name :- " + dirName);
        System.out.println("File Name :- " + fileName);

        sc.close();
    }
}
