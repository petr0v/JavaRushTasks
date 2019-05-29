package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit".
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки.


Требования:
1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "exit".
2. Для каждого файла создай нить ReadThread и запусти ее.
3. После запуска каждая нить ReadThread должна создать свой поток для чтения из файла.
4. Затем нити должны найти максимально встречающийся байт в своем файле и добавить его в словарь resultMap.
5. Поток для чтения из файла в каждой нити должен быть закрыт.
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader1.readLine();
        while (true) {
            if ((fileName.equals("exit")))
                break;

            ReadThread thread = new ReadThread(fileName);
            thread.start();
            fileName = reader1.readLine();

        }
        reader1.close();
    }

    public static class ReadThread extends Thread {
        String filename;

        public ReadThread(String fileName) throws IOException {
            this.filename = fileName;

        }

        public void run() {
            try {
                FileInputStream fileReader = new FileInputStream(filename);
                Map<Integer, Integer> map = new HashMap<>();
                while (fileReader.available() > 0) {
                    int data = fileReader.read();
                    if (map.containsKey(data)) {
                        int count = map.get(data);
                        count++;
                        map.put(data, count);
                    } else {
                        map.put(data, 1);
                    }
                }
                fileReader.close();

                List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

                Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o2.getValue().compareTo(o1.getValue());
                    }
                });

                System.out.println(list.get(0));

                resultMap.put(filename, list.get(0).getKey());


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

