package dev.jeffersondantonio.dsvendas.service;

import dev.jeffersondantonio.dsvendas.dto.SellerDTO;
import dev.jeffersondantonio.dsvendas.entities.Seller;
import dev.jeffersondantonio.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll(){

      List<Seller> result =  repository.findAll();
      return result.stream().map(r -> new SellerDTO(r)).collect(Collectors.toList());

    }

}
