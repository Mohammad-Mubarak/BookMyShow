package com.example.BookMyShow.convertors;

import com.example.BookMyShow.Entities.MovieEntity;
import com.example.BookMyShow.EntryDtos.MovieEntryDto;

public class MovieConvertors {


    public static MovieEntity convertEntryDtoToEntity(MovieEntryDto movieEntryDto){

        MovieEntity movieEntity = MovieEntity.builder()
                .movieName(movieEntryDto.getMovieName()).duration(movieEntryDto.getDuration())
                .genre(movieEntryDto.getGenre()).language(movieEntryDto.getLanguage()).ratings(movieEntryDto.getRatings()).build();

        return movieEntity;
    }
}
