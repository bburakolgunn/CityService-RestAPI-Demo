package RestAPI.demo.repository;

import RestAPI.demo.entity.Sehir;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface SehirRepository extends JpaRepository<Sehir,String> {


    List<Sehir> findByName(String name);
}
