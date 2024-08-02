package lang.object.equals;

import java.util.Objects;

/*
- Identity: == -> check if they are the same instance (physically)
- Equality: equals() -> check if their contents are logically equal
 */
public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    /*
    reflexivity: x.equals(x) = true
    symmetry: x.equals(y) = true -> y.equals(x) = true
    transitivity: x.equals(y) = true and y.equals(z) = true -> x.equals(z) = true
    consistency: x.equals(y) = true -> x.equals(y) = true
    null: x.equals(null) = false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o; // downcasting
        // return id.equals(userV2.id);
        return Objects.equals(id, userV2.id);
    }
}
