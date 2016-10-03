package com.webonise.springcollectionassingment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


@Service
public class HashMapCollection implements ICollectionMenu {
    @Autowired
    UserInfoMongo userInfoMongo;

    @Override
    public void useCollectionToDisplayData() {
        Map<Double, String> hashMap = new HashMap<>();
        Iterable<UserInfo> iterable = userInfoMongo.findAll();
        Iterator<UserInfo> iterator = iterable.iterator();

        while (iterator.hasNext()) {
            UserInfo userInfo = iterator.next();
            hashMap.put(userInfo.getAge(), userInfo.getName());
        }

        String val = (String) hashMap.get(22.0);
        System.out.println("Value :" + val);

        if (!(hashMap).isEmpty()) {
            System.out.println("Size : " + hashMap.size());
        } else {
            System.out.println("No Elements found");
        }


    }
}
