package com.example.BookMyShow.convertors;

import com.example.BookMyShow.Entities.TheaterEntity;
import com.example.BookMyShow.EntryDtos.TheaterEntryDto;

public class TheaterConvertors {


    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }

}
