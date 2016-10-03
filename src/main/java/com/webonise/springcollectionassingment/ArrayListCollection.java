package com.webonise.springcollectionassingment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ArrayListCollection implements ICollectionMenu {
    @Autowired
    UserInfoMongo userInfoMongo;

    @Override
    public void useCollectionToDisplayData() {
        List<UserInfo> arrayList = new ArrayList<>();
        Iterable<UserInfo> iterable = userInfoMongo.findAll();
        Iterator<UserInfo> iterator = iterable.iterator();

        while (iterator.hasNext()) {
            UserInfo userInfo = iterator.next();
            arrayList.add(userInfo);
        }

        if ((!arrayList.isEmpty())) {
            System.out.println("Size : " + arrayList.size());

        } else {
            System.out.println("No Elements found");
        }

        for (UserInfo userIt : arrayList) {
            System.out.print("UserName: " + userIt.getUserName());
            System.out.print(" Name: " + userIt.getName());
            System.out.print(" Email: " + userIt.getEmail());
            System.out.println("Age: " + userIt.getAge());
        }
    }
}
