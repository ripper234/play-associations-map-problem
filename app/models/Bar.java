package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Bar  extends Model {
    @NotNull
    @ManyToOne
    public Foo foo;

    public String k;
    public String v;
}
