package com.learning.msbeer.web.controller;

import com.learning.msbeer.web.model.BeerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/beers")
public class BeerController {

    @GetMapping()
    public ResponseEntity<List<BeerDTO>> getBeers()
    {
        //to do impl
        List<BeerDTO> beerDTOS = new ArrayList<>();
        beerDTOS.add(BeerDTO.builder().name("Guiness").build());
        return new ResponseEntity<>(beerDTOS, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<BeerDTO> addBeer(@RequestBody BeerDTO beerDTO)
    {
        //to do impl
        return new ResponseEntity<>(beerDTO, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{beerId}")
    public ResponseEntity<BeerDTO> modifyBeer(@PathVariable(name="beerId")UUID uuid, @RequestBody BeerDTO beerDTO)
    {
        //to do impl
        return new ResponseEntity<>(beerDTO, HttpStatus.NO_CONTENT);
    }
}
