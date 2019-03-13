package untestableLegacy;

import org.junit.Test;

import static org.junit.Assert.*;

public class EntityTest {

    @Test
    public void shouldRemoveIllegalCharacters() {
        assertEquals("invalidstring", buildEntity("invalid*string?").getName());
        assertEquals("valid string", buildEntity("valid string").getName());
        assertEquals("", buildEntity("???***").getName());
    }

    private Entity buildEntity(String name) {
        final Entity entity = new Entity();
        entity.setName(name);
        return entity;
    }
}