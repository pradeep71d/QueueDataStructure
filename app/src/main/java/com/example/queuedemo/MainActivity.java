package com.example.queuedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Queue<String> queue = new LinkedList<>();//quue implements linkedlist interface
        queue.add("one");//adding elements in queue
        queue.add("two");
        queue.add("three");//methods=add,remove,size,peak,poll,clear()
        queue.add("four");
        System.out.println("out is=" + queue);
        queue.remove("three");//to remove particular element
        System.out.println("out is=" + queue);
        System.out.println("queue size is=" + queue.size());// to find size of queue
        System.out.println("Queue Contains element 'two' or not? : " + queue.contains("two"));
        //queue.clear();
        System.out.println("out is=" + queue);
        System.out.println("peak can be as=" + queue.peek());//used to see head of queue
        System.out.println("out is=" + queue.poll());//used to remove peak
        System.out.println("final out is="+queue);
    }
}
