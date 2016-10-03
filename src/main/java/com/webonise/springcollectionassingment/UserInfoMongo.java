package com.webonise.springcollectionassingment;


import org.springframework.data.repository.CrudRepository;

public interface UserInfoMongo extends CrudRepository<UserInfo, String> {
}
