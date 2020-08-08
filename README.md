# Pasos.

    - Se debe crear la base de datos en el contenedor creado anteriormente con docker-compose.
    - Debe estar prindida y en escucha la base de datos para el correcto funcionamiento de la API REST
    - Se creo un proyecto Spring Boot en maven para manejar con más facilidad las versiones.
    - En el archivo application.yml se colocó la configuración necesaria para la correcta conexión a la base
    - Se manejo un interfaz para definir los servicios que va a prestar la API
    - Se realizó la implementación de esta interfaz.
    - Se creo un controlador que va a recibir las solicitudes REST y las va a responder.
    - Al final con el comando mvn springboot:run se ejecuta el proyecto.
    - Para configurar la integración conrinua con Circle, debemos agregar al proyecto el archivo de configuración maven que circle nos proporciona, permitir a nuestro github la conexión con circle y activar la integración por cada push que se ralice a  la rama master (por ejemplo)
    
    