package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Bar  extends Model {
    @ManyToOne
    public ListOfBars list;

    @ManyToOne
    public MapOfBars map;

    public String k;
    public String v;
}
