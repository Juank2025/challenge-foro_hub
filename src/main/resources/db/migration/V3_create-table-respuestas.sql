CREATE TABLE respuestas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    mensaje TEXT NOT NULL,
    fecha_creacion DATETIME NOT NULL,
    ultima_actualizacion DATETIME NOT NULL,
    solucion BOOLEAN NOT NULL DEFAULT FALSE,
    borrado BOOLEAN NOT NULL DEFAULT FALSE,
    usuario_id BIGINT NOT NULL,
    topico_id BIGINT NOT NULL,
    CONSTRAINT fk_respuesta_usuario FOREIGN KEY (usuario_id) REFERENCES usuario(id),
    CONSTRAINT fk_respuesta_topico FOREIGN KEY (topico_id) REFERENCES topico(id)
);