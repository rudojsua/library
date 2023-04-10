package com.olua.library.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.Year;

@Getter
@Setter
@Builder
public class Book {

    @Id
    private long id;
    private String author;
    private String title;
    private Year year;
    private int pages;
    private String language;
    private int size;
    private String extension;
}
