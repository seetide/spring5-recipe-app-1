package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes = new HashSet<>();

}
