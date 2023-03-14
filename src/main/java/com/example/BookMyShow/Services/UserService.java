package com.example.BookMyShow.Services;


import com.example.BookMyShow.Entities.UserEntity;
import com.example.BookMyShow.EntryDtos.UserEntryDto;
import com.example.BookMyShow.Repository.UserRepository;

import com.example.BookMyShow.convertors.UserConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto)throws Exception,NullPointerException{

        UserEntity userEntity = UserConvertor.convertDtoToEntity(userEntryDto);

        userRepository.save(userEntity);

        return "User Added successfully";

    }



}
