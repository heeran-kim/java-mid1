package lang.object.equals;

import java.util.Objects;

/*
- Identity: == -> check if they are the same instance (physically)
- Equality: equals() -> check if their contents are logically equal
 */
public class UserV1 {

    private String id;

    public UserV1(String id) {
        this.id = id;
    }
}
