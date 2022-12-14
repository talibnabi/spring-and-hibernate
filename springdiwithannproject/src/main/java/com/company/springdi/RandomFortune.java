package com.company.springdi;


import org.springframework.stereotype.Component;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class RandomFortune implements FortuneService {
    @Override
    public List<String> getFortune() throws IOException {
        List<String> list = new ArrayList<>();
        list.add("Happy");
        list.add("Bad");
        list.add("Normal");
        writeListToFile("data.txt", list);
        return readListFromFile("data.txt");
    }

    private List<String> readListFromFile(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<String>) ois.readObject();
        } catch (Exception ignored) {
            return Collections.emptyList();
        }
    }

    public Boolean writeListToFile(String filePath, List<String> list) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(list);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

}
