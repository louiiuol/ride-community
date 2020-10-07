package dev.louiiuol.ryding.api.dtos.users;

import java.text.MessageFormat;
import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import dev.louiiuol.ryding.api.validators.user.adult.Adult;
import dev.louiiuol.ryding.api.validators.user.email.UniqueEmail;
import dev.louiiuol.ryding.api.validators.user.password.MatchCurrentPassword;
import dev.louiiuol.ryding.api.validators.user.username.UniqueUsername;

/**
 * DTO representing the {@code UserUpdateDto}
 * to update existing {@code User}
 */
public class UserUpdateDto {

    protected UserUpdateDto() {
        // Overrides default no-args constructor as protected
    }

    @NotNull
    @MatchCurrentPassword
    private String actualPassword;

    @UniqueUsername
    @Size(min = 4, max = 12)
    private String username;

    @Size(max = 40)
    @UniqueEmail
    @Email
    private String email;

    @Size(min = 2, max = 7)
    private String avatar;

    @Adult
    private LocalDate birthDate;

    @SuppressWarnings("unused")
    private String password;

    public String getActualPassword() {
        return actualPassword;
    }

    @Override
    public String toString() {
        return MessageFormat.format("UserCreateDTO: [username: {0}, email: {1}, password: [PROTECTED], avatar: {2} ]",
            username, email, avatar );
    }

}