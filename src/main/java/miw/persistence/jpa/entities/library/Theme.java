package miw.persistence.jpa.entities.library;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Theme {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    public Theme() {
    }

    public Theme(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || obj != null && getClass() == obj.getClass() && (id.equals(((Theme) obj).id));
    }

    @Override
    public String toString() {
        return "Theme{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
