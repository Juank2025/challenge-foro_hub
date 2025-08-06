package foro_hub.challengeforo.domain.respuesta.validaciones.actualizar;

import foro_hub.challengeforo.domain.respuesta.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    public void validate(ActualizarRespuestaDTO data, Long respuestaId);

}

