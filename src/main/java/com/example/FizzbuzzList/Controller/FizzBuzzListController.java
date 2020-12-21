package com.example.FizzbuzzList.Controller;

import com.example.FizzbuzzList.Model.FizzbuzzResponse;
import com.example.FizzbuzzList.Model.NumberList;
import com.example.FizzbuzzList.Service.NumberListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/divisor")
public class FizzBuzzListController {


        private final NumberListService numberListService;

        @GetMapping("/insertNumber/{userInput}")
        public String insertNumberList(@PathVariable Integer userInput)
        {
            return numberListService.insertNumberList(userInput);
        }

    }

