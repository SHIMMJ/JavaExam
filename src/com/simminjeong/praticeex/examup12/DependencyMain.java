package com.simminjeong.praticeex.examup12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

interface Counter {
    int count();
}


public class DependencyMain {
    final Counter counter;

    public DependencyMain(Counter counter) {
        this.counter = counter;
    }

    public void sort(ArrayList<String> list) {

    }

    public void count() {
        counter.count();
    }

    public static void main(String[] args) {
        Button addButton = new Button(new OnClickEvent() {

            @Override
            public void onClick() {
                System.out.println("버튼 클릭");
            }
        });

        Button addButton2 = new Button(new OnClickEvent() {

            @Override
            public void onClick() {
                System.out.println("2");
            }
        });

        List<Button> buttons = new ArrayList<>();
        buttons.add(addButton);
        buttons.add(addButton2);

        buttons.stream().forEach(button -> button.click());
    }
}


interface OnClickEvent {
    void onClick();
}


class Button {
    private OnClickEvent listener;

    public Button(OnClickEvent listener) {
        this.listener = listener;
    }

    void click() {
        listener.onClick();
    }
}


