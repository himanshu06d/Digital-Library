package com.DigitaLibrary.Library.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
public class SecurityConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }







    /**
     * Encode -> transform of data into one from another format. which can be reversible easily
     *
     * hashing -> transform of data into non-consumable format which is non reversible and it ensures that same hash
     *              will be generated for same values always until the under-laying logic changes.
     *              algorithm  -> SHA-256
     *
     * encryption -> transform of data into non-consumable format and can be converted to original via decryption process.

     *
     *
     *
     * Secure our APIs
     *
     * 1. Onboard the user with credentials. -> user object -> UserDetail.
     * 2. accept username and password from user. -> AuthenticationProvider -> Authentication object
     * 3. Fetch the user from the databases -> UserDetailService Implementation
     * 4. Compare the password hash of the user. -> AuthenticationProvider -> PasswordEncoder.
     * 5. Check if the user has authority on API. -> SecurityFilterChain
     * 6. Let the user use the API.-> AuthenticationProvider
     *
     *
     *
     * CoRs -> Cross-Origin Resource Sharing
     *
     * CSRF-> Cross - Site Request Forgery
     * -> XSS attacks
     *
     *
     *
     * */
}
