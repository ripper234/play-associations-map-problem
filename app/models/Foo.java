package models;

import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import java.util.Map;

@Entity
public class Foo extends Model {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foo")
    @MapKey(name = "k")
    public Map<String, Bar> bars;
}

