package models;

import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class ListOfBars extends Model {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "list")
    public List<Bar> bars;
}

