<h1 align = "center">Foro Hub</h1>

![forologo](https://github.com/user-attachments/assets/0ac5b628-ce34-4c45-86d1-aa514eb51814)<img width="275" height="183" alt="forologo2" src="https://github.com/user-attachments/assets/9f011077-c2ea-4bfd-a555-f3e623995958" />![logoforo3](https://github.com/user-attachments/assets/d49944f5-33a5-4541-bee8-e82bfd302fc2)
*[Descripción del proyecto](#Descripción-del-proyecto).
<p>Este es un foro en donde los usuarios pueden registrarse y crear diferentes tópicos para discutir un asunto en particular.</p>

*[Estado del proyecto](#Estado-del-proyecto)
<h4>Concluido</h4>

*[Características de la aplicación y demostración](#Características-de-la-aplicación-y-demostración)

<h3>Características para el usuario</h3>

El primer paso es registrarse para obtener acceso al foro. En la siguiente imagen se muestran algunos usuarios registrados.

![readme usuarios](https://github.com/user-attachments/assets/ae6bea43-83a5-45d8-94b4-96e7cb32d154)

A continuación se muestran algunos cursos registrados. El usuario puede agregar nuevos cursos si así lo desea.

![readme cursos](https://github.com/user-attachments/assets/ac39be38-7dd5-4f9f-8b76-42b9b088860f)

El usuario debe loguearse para obtener un token de autenticación. En este ejemplo se utiliza la aplicación insomnia para hacer las demostraciones.

![readme foto 1](https://github.com/user-attachments/assets/c6bc9ee9-5189-45da-a9e7-0eebfd152738)

Luego de haber ingresado el token, el usuario puede crear un nuevo tópico, como se muestran en las imagenes.

![readme foto 2](https://github.com/user-attachments/assets/5b258753-8d7f-4bb6-9deb-890daaf4ef56)

![readme foto 3](https://github.com/user-attachments/assets/55219f28-58cf-4daa-a27e-066c6f487ba2)

![readme foto 4](https://github.com/user-attachments/assets/07689c32-2f3a-4278-bde8-364d2b39d416)

![readme foto 5](https://github.com/user-attachments/assets/a3e74373-84c4-44f8-936a-9b4ca6825c06)

![readme foto 6](https://github.com/user-attachments/assets/3b578a3a-6290-4ef8-a6fa-0321e4f5dc26)


El usuario puede listar los tópicos creados, como se muestra en las siguientes imagenes.

![readme listar topico parte1](https://github.com/user-attachments/assets/0df1d8ac-0224-4501-bf9f-fab5f0000dac)

![readme listar topico parte2](https://github.com/user-attachments/assets/e8e9a764-3fbf-4bc8-b62c-a76b301741e0)

![readme listar topico parte3](https://github.com/user-attachments/assets/c18e82bf-7654-421a-98c0-1e9ce7335e1c)

El usuario puede eliminar los tópicos creados utilizando el id del tópico que desea borrar, como se muestra en las imagenes.

![readme eliminar topico](https://github.com/user-attachments/assets/a051189d-6431-4bdd-a3fe-9fdee25a3a0b)

![readme eliminar topico parte 2](https://github.com/user-attachments/assets/fa2e4a32-c0f2-44ba-bcd4-a9c76b14e55b)

En la siguiente imagen se listan los tópicos con los temas ya eliminados del ejemplo anterior.

![readme listando contenido ya eliminado despues de un delete](https://github.com/user-attachments/assets/3d0ec0ae-ec98-48a8-9677-30e5705389dd)

El usuario puede actualizar un tópico en particular utilizando su id, como se muestra en la imagen.

![readme utilizando actualizar topico con put](https://github.com/user-attachments/assets/fe0b6d0f-e217-4150-9c4a-db488a65cf4e)

En la imagen se muestran los cambios realizados.

![readme listando ya actualizado(put)](https://github.com/user-attachments/assets/06c094f0-aaf5-4d4f-a952-58fa3cafd4f8)

<h3>Características para el desarrollador</h3>

Este programa fue realizado con spring boot y consta de 4 clases escenciales: tópico, curso, usuario y respuesta. Estás clases representan las entidades JPA y se relacionan entre sí para interactuar con el usuario
y también tener acceso a la base de datos mysql. También posee las clases controller que actúan como intermediarias entre el usuario y la lógica de negocio. Además cuenta con las clases de configuración de seguridad
y validación de errores, records para los DTO e interfaces para los repositorios. También posee archivos para la migración de base de datos MySql. En el archivo application.properties se agregó la configuración para la conexión
con la base de datos. En las siguientes imágenes se puede apreciar el proyecto con todos sus componentes.

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/f0a0fdbe-a02c-40d2-95f0-305c546b0d5f" />

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/8a656ef9-db1f-4a09-bd1b-67b69f073061" />

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/d58186b7-1736-4801-8c16-4394fe873a2d" />

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/e0ed074d-8819-4d82-84cf-dfe91d7bd771" />

*[Acceso al proyecto](#acceso-proyecto)
<h6>Para acceder al proyecto puedes hacerlo en la siguiente URL:</h6>
<p></p>https://github.com/Juank2025/challenge-foro_hub.git</p>


*[Lenguajes y tecnologías utilizadas](#tecnologías-utilizadas)
- Lenguaje de programación: Java
- Entorno de desarrollo: Intellij IDEA
- Framework: Spring Boot
- Dependecias: spring-boot-starter, jackson-databind, spring-boot-starter-data-jpa, flyway-core, flyway-mysql,
  spring-boot-starter-security, spring-boot-starter-validation, spring-boot-starter-web, spring-boot-devtools, mysql-connector-j,
  lombok, spring-boot-starter-test, spring-restdocs-mockmvc, spring-security-test, java-jwt y springdoc-openapi-starter-webmvc-ui.
- Base de datos: MySQL
- Aplicaciones: Insomnia

*[Personas-Desarrolladores del Proyecto](#personas-desarrolladores)

<h3>Juan Carlos Palma</h3> 

*[Conclusión](#conclusión)
<P>Este foro ha sido diseñado para que los usuarios interactúen entre sí mediante una gran diversidad de tópicos que ellos mismos pueden crear para debatir ideas, compartir sus
  conocimientos o utilizarlo para resolver dudas sobre sus estudios con los demás usuarios.</P>
