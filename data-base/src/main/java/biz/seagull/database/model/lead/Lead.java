package biz.seagull.database.model.lead;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "leads")
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String telephone;

    @Column(name = "url_site")
    private String urlSite;

    private String city;

    @Column(name = "data_registration")
    private LocalDateTime dataRegistration;

    @Lob
    private String commentClient;

    @Lob
    private String noteManager;

    @Enumerated(value = EnumType.STRING)
    private Status status;

}
