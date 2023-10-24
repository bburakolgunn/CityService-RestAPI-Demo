package RestAPI.demo.repository;

import RestAPI.demo.entity.Sehir;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SehirRepository extends MongoRepository<Sehir,String> {


    List<Sehir> findByName(String name);
}
