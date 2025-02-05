package entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memberId;
    @Column
    private String memberEmail;

    @Column
    private String memberUserName;

    @Column
    private String password;


}
