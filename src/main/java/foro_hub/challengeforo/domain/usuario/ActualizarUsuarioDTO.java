package foro_hub.challengeforo.domain.usuario;

public record ActualizarUsuarioDTO(
        String password,
        Role role,
        String nombre,
        String email,
        Boolean enabled

) {
}
