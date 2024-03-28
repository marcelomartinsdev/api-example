package com.example.apiexample.feign;


import com.example.apiexample.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "book-api", url = "https://myawlbucket.s3.sa-east-1.amazonaws.com")
public interface BookClient {
    @GetMapping("/books.json")
    List<Book> getBooks();
}
