package RestAPI.demo.service;

import RestAPI.demo.entity.Sehir;
import RestAPI.demo.repository.SehirRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SehirService {

    private final SehirRepository sehirRepository;

    public List<Sehir> getSehirler(String name) {
        if(name == null){
            return sehirRepository.findAll();
        }
        return sehirRepository.findByName(name);

    }

    public Sehir createSehir(Sehir newSehir) {
        //newSehir.setCreateDate(new Date());
        return sehirRepository.save(newSehir);
    }

    public void deteleSehir(String id) {
    sehirRepository.deleteById(id);
    }

    public Sehir getSehirById(String id) {
      return  sehirRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sehir bulunamadıi"));
    }

    public void updateSehir(String id, Sehir newSehir) {
      Sehir eskiSehir =  getSehirById(id);
      eskiSehir.setName(newSehir.getName());
      sehirRepository.save(eskiSehir);
    }
}
