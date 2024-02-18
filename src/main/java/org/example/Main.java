package org.example;

import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        //obiekty
//        Actor angelinaJolie = new Actor("Angelina", "Jolie", 20, false);
//        Actor bradPitt = new Actor("Brad", "Pitt", 8, true);
//        Actor tomHanks = new Actor("Tom", "Hanks");
//        tomHanks.setRating(5);
//        tomHanks.setOscarPrized(true);
//
//        Actor tomCruze = new Actor();
//        tomCruze.setFirstName("Tom");
//        tomCruze.setLastName("Cruze");
//        tomCruze.setRating(15);
//        tomCruze.setOscarPrized(false);
//
//        Director martinScorsese = new Director("Martin", "Scorsese", 20000.6);
//        Director ridleyScott = new Director();
//        ridleyScott.setFirstName("Ridley");
//        ridleyScott.setLastName("Scott");
//        ridleyScott.setSalary(30555.87);
//        String nazwaRezysera = ridleyScott.getFirstName() + " " + ridleyScott.getLastName();
//
//        ActorLombok nataliePortman = new ActorLombok("Natalie", "Portman", 45, true);
//
//        ActorRecord salmaHaike = new ActorRecord("Salma", "Heik", 56, false);
//        int salmasSalary = salmaHaike.calculateSalary(6, 50000);
//        System.out.println(salmaHaike.lastName() + " salary is " + salmasSalary);
//
//        System.out.println("Imię najlepszego reżysera świata to " + nazwaRezysera);
//        Movie ziemia = new Movie("Ziemia", 10);
//        Movie planeta = new Movie("Planeta", 6);
//
//        if (ziemia.getRating() < planeta.getRating()) {
//            System.out.println(ziemia.getTitle() + " jest lepszym filmem");
//        } else {
//            System.out.println(planeta.getTitle() + " jest lepszym filmem");
//        }
        String browser = "Chrome";

//        switch (browser) {
//            case "Chrome" -> System.out.println("Wybieramy chromedriver.");
//            case "Edge" -> System.out.println("Wybieramy edgedriver.");
//            case "Firefox" -> System.out.println("Wybieramy firefoxdriver.");
//            default -> {
//                System.out.println("Wybieram chromium driver.");
//                System.out.println("Wybieram chromium driver.");
//            }
//
//        }
//  Scanner and switch
        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj mi szybko imię.");
//        String name = scan.nextLine();
//        System.out.println("Cześć " + name);
//        System.out.println("Podaj mi wiek.");
//        int age = scan.nextInt();
//
//        switch (name) {
//            case "Wojtek" -> System.out.println("to nie Donald, tylko Wojtek, masz " + age + " lat.");
//            case "Donald" -> System.out.println("Nareszcie Donaldzie, masz " + age + " lat");
//            default -> System.out.println("Znowu nie Donald ani nie Wojtek, tylko " + name + " i twój wiek to " + age + ".");
//        }

        // Loops
        //System.out.println("Podaj liczbę sekund.");
        //int sec = scan.nextInt();

//        for (int i = sec; i >= 0; i--){
//            System.out.println("Bomba wybuchnie za " + i + " sekund.");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Boom!");

//        while (sec >= 0) {
//            System.out.println("Bomba wybuchnie za " + sec + " sekund.");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            sec--;
//        }

        //Tables

//        System.out.println("Boom!");
        String movies[] = new String[3];
        int ratings[] = new int[3];
        movies[0] = "Pulp fiction";
        movies[1] = "Top gun";
        movies[2] = "Hope";

//        System.out.println("Ocen 3 następujące filmy.");
//
//        for (int i = 0; i <= movies.length - 1; i++) {
//            String movie = movies[i];
//            System.out.println("Oceń film " + movie);
//            ratings[i] = scan.nextInt();
//        }
//
//        for (int i = 0; i <= movies.length - 1; i++) {
//            System.out.println("Film " + movies[i] + " uzyskał ocenę " + ratings[i]);
//        }

        //Lists

        List<String> moviesList = new ArrayList<>();
        moviesList.add("Now");
        moviesList.add("Tomorrow");
        moviesList.add("Last dance");
        moviesList.add("Aftersun");
        moviesList.add("Zorr");
        moviesList.add("Look");

        List<Integer> ratingsList = new ArrayList<>();
        System.out.println("Ocen " + moviesList.size() + " następujące filmy.");
        for (int i = 0; i <= moviesList.size() - 1; i++) {
            String movie = moviesList.get(i);
            System.out.println("Oceń film " + movie);
            ratingsList.add(scan.nextInt());
        }
        for (int i = 0; i <= moviesList.size() - 1; i++) {
            System.out.println("Film " + moviesList.get(i) + " uzyskał ocenę " + ratingsList.get(i));
        }


    }

}