package com.company.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component
public class RandomFortune implements FortuneService {
    
    public RandomFortune() {

    }

    private static final Random random = new Random();

    @Override
    public String getFortune() {
        List<String> list = new ArrayList<>();
        list.add("Happy");
        list.add("Bad");
        list.add("Normal");
        writeListToFile("data.txt", list);
        List<String> stringList = readFortuneFromFile("data.txt");
        int index = random.nextInt(stringList.size());
        return stringList.get(index);
    }

    @PostConstruct
    public List<String> readFortuneFromFile(String filePath) {
        return readListFromFile(filePath);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy");
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
