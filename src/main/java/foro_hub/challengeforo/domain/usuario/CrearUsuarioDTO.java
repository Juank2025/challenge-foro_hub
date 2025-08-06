package foro_hub.challengeforo.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CrearUsuarioDTO(
        @NotBlank String username,
        @NotBlank String password,
        @NotBlank String nombre,
        @NotBlank @Email String email

) {
}

