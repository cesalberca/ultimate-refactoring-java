package unit;

import signatureChange.AuthenticationService;
import org.junit.Assert;
import org.junit.Test;
import signatureChange.Id;

public class AuthenticationServiceShould {

    @Test
    public void distinguish_administrator_role() throws Exception {
        AuthenticationService service = new AuthenticationService();
        Id adminId = Id.valueOf(12345);
        Assert.assertTrue(adminId.isAdmin());
    }

    @Test
    public void distinguish_non_admin_role() throws Exception {
        AuthenticationService service = new AuthenticationService();
        int normalUserId = 11111;
        Assert.assertFalse(service.isAuthenticated(Id.valueOf(normalUserId)));
    }
}
