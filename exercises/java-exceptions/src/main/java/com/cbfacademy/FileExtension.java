package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {

    public boolean check(String filename) throws FilenameException {
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("Filename cannot be null or empty");
        }
        return filename.endsWith(".java");
    }

    public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String filename : filenames) {
            try {
                if (check(filename)) {
                    resultMap.put(filename, 1); // Valid .java file
                } else {
                    resultMap.put(filename, 0); // Invalid file extension
                }
            } catch (FilenameException e) {
                resultMap.put(filename, -1); // Exception occurred
            }
        }
        return resultMap;
    }

    public static void main(String[] args) {
        FileExtension fileExtension = new FileExtension();
        List<String> filenames = List.of("App.java", "App.txt", null, "App.md");

        Map<String, Integer> result = fileExtension.map(filenames);
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
