package com.foro.alura.domain.topico;

public record DatosActualizarTopico(
        String titulo,
        String mensaje,
        StatusTopico status,
        String autor,
        String curso
) {
}
