package org.saiku.service.util.security.authorisation;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class MustBeAuthenticatedAuthorisation implements AuthorisationPredicate
{
    public boolean isAuthorised(Authentication authentication)
    {
        return authentication != null && authentication.isAuthenticated();
    }
}
