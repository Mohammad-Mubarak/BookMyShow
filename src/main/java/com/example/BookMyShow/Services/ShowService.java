package com.example.BookMyShow.Services;


import com.example.BookMyShow.Entities.MovieEntity;
import com.example.BookMyShow.Entities.ShowEntity;
import com.example.BookMyShow.EntryDtos.ShowEntryDto;
import com.example.BookMyShow.Repository.MovieRepository;
import com.example.BookMyShow.Repository.ShowRepository;
import com.example.BookMyShow.Repository.TheaterRepository;
import com.example.Book_my_Show_Application_February.Entities.*;
import com.example.Book_my_Show_Application_February.EntryDtos.ShowEntryDto;
import com.example.Book_my_Show_Application_February.Enums.SeatType;
import com.example.Book_my_Show_Application_February.Repository.MovieRepository;
import com.example.Book_my_Show_Application_February.Repository.ShowRepository;
import com.example.Book_my_Show_Application_February.Repository.TheaterRepository;
import com.example.Book_my_Show_Application_February.convertors.Showconvertors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowService {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    TheaterRepository theaterRepository;

    @Autowired
    ShowRepository showRepository;

    public String addShow(ShowEntryDto showEntryDto)
    {

        return "The show has been added successfully";

    }

    private List<ShowSeatEntity> createShowSeatEntity(ShowEntryDto showEntryDto,ShowEntity showEntity){



    }
}
