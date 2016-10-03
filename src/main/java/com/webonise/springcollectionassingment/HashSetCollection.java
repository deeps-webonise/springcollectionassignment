package com.webonise.springcollectionassingment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Service
public class HashSetCollection implements ICollectionMenu {
    @Autowired
    UserInfoMongo userInfoMongo;

    @Override
    public void useCollectionToDisplayData() {
        Set<String> hashSet = new HashSet<>();
        Iterable<UserInfo> iterable = userInfoMongo.findAll();
        Iterator<UserInfo> iterator = iterable.iterator();

        while (iterator.hasNext()) {
            UserInfo userInfo = iterator.next();
            hashSet.add(userInfo.getName());
        }

        Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());


    }
}
