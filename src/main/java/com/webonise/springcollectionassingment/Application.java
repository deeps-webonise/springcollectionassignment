package com.webonise.springcollectionassingment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Application {
    @Autowired
    ICollectionMenu arrayListCollection;

    @Autowired
    ICollectionMenu hashMapCollection;

    @Autowired
    ICollectionMenu hashSetCollection;


    void start() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to use ArrayList\nPress 2 for Hash Set\nPress 3 for Hash Map");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                arrayListCollection.useCollectionToDisplayData();
                break;

            case 2:
                hashSetCollection.useCollectionToDisplayData();
                break;

            case 3:
                hashMapCollection.useCollectionToDisplayData();
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }
    }
}
