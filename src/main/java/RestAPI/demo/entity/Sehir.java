package RestAPI.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.lang.annotation.Documented;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sehir {

    @Id
    private String id;

    private Date createDate = new Date();

    private String name;

}
