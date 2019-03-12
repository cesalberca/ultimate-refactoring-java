package signatureChange;

public class AnotherAuthenticatorClient {
    public void unusedClientCode() {
        try {
            new AuthenticationService().isAuthenticated(Id.valueOf(3545));
        } catch (Exception e) {
            // ignored
        }
    }
}
