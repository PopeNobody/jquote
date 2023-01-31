package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        Document document = Jsoup.connect("http://invisiblehand.church").get();
        System.out.println(document);
    }
}