package RestAPI.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



import java.util.Date;
@Entity
@Data
@EqualsAndHashCode(callSuper = false) //Nesne içeriğini kontrol eder.
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Sehir")
public class Sehir {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;


    private Date createDate = new Date();

    private String name;

}
