package ListLab;

import java.util.Objects;

/**
 *
 * @author dsmith110
 */
public class Dog {
    private String name;
    private String rabiesId;

    public Dog(String name, String rabiesId) {
        this.name = name;
        this.rabiesId = rabiesId;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.rabiesId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;
        if (!Objects.equals(this.rabiesId, other.rabiesId)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRabiesId() {
        return rabiesId;
    }

    public void setRabiesId(String rabiesId) {
        this.rabiesId = rabiesId;
    }
    
    
}
