package pl.fraktal.resources;

import javafx.scene.text.Text;

public class Clock extends Text {

    boolean isRunning;

    public Clock(boolean isRunning) {
        this.isRunning = isRunning;
        System.out.println("test1");
    }

    public void clock() {
        System.out.println("test2");
        new Thread(() -> {
            int second = 0;
            int minute = 0;
            System.out.println("test3");

            while (isRunning) {
                try {
                    second++;

                    if (second == 60) {
                        second = 0;
                        minute++;
                    }

                    String result = "";

                    if (minute < 10) {
                        result = "0" + minute;
                    } else {
                        result += minute;
                    }

                    if (second < 10) {
                        result += ":0" + second;
                    } else {
                        result += ":" + second;
                    }

                    setText(result);
                    System.out.println(result);
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).run();
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
