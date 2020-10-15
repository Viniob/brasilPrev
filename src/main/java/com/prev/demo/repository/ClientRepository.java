package com.prev.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.prev.demo.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer>{

}
