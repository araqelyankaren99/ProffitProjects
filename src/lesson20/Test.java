package lesson20;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println(printBooleanByKeyword(
                "C:\\Users\\Admin-PC\\IdeaProjects\\ProffitProjects\\src\\lesson20\\a.txt", "Emma"));
        printLineByKeywordOnDir(
                "C:\\Users\\Admin-PC\\IdeaProjects\\ProffitProjects\\src\\AllFiles", "Emma");

    }

    public static boolean printBooleanByKeyword(String filePath, String keyword) throws IOException {
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string;
        String[] words;
        while ((string = bufferedReader.readLine()) != null) {
            words = string.split(" ");
            for (String word : words) {
                if (word.equals(keyword)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printLineByKeywordOnDir(String dirPath, String keyword) throws IOException {
        File rootFile = new File(dirPath);
        if (rootFile.isDirectory()) {
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        printLineByKeywordOnDir(file.getPath(), keyword);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".txt")) {
                            FileReader fileReader = new FileReader(file);
                            BufferedReader bufferedReader = new BufferedReader(fileReader);
                            String string;
                            String[] words;
                            while ((string = bufferedReader.readLine()) != null) {
                                words = string.split(" ");
                                for (String word : words) {
                                    if (word.equals(keyword)) {
                                        System.out.println("name = " + file.getName() + ", path = " + file.getPath());
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}