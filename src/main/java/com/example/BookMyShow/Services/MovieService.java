package com.example.BookMyShow.Services;



import com.example.BookMyShow.Entities.MovieEntity;

import com.example.BookMyShow.EntryDtos.MovieEntryDto;
import com.example.BookMyShow.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieEntryDto movieEntryDto)throws Exception{



    }

}
