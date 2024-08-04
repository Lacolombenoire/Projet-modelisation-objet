package com.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Logger {
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public Logger(){
        int data = 0;
    }
    public void addLog(Log log) {
        List<Log> logs = readLogs();
        logs.add(log);
        writeLogs(logs);
    }

    private List<Log> readLogs() {
        String path = "Projet_Equipe_Tessier_Laureti\\code\\src\\main\\java\\com\\example\\log.json";
        try (JsonReader reader = new JsonReader(new FileReader(path))) {
            Type logListType = new TypeToken<ArrayList<Log>>() {}.getType();
            return gson.fromJson(reader, logListType);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private void writeLogs(List<Log> logs) {
        String path = "Projet_Equipe_Tessier_Laureti\\code\\src\\main\\java\\com\\example\\log.json";
        try (FileWriter writer = new FileWriter(path)) {
            gson.toJson(logs, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
