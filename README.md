# ForoHub 

### Descripción
ForoHub es una API REST desarrollada con Spring Boot para replicar el funcionamiento interno de un foro. Permite la gestión de tópicos de discusión, incluyendo la creación, consulta, actualización y eliminación de los mismos.

### 🛠️ Tecnologías
- **Java 21** / **Spring Boot 3**
- **Spring Data JPA** & **MySQL**
- **Spring Security** & **JWT** (JSON Web Token)
- **Flyway Migration**
- **Lombok** & **Validation**

### 🚀 Endpoints Principales
- `POST /topicos`: Registrar un nuevo tópico.
- `GET /topicos`: Listar todos los tópicos.
- `GET /topicos/{id}`: Detallar un tópico específico.
- `PUT /topicos/{id}`: Actualizar un tópico.
- `DELETE /topicos/{id}`: Eliminar un tópico.

### 🔐 Seguridad
La API utiliza autenticación Stateless mediante JWT para proteger los endpoints de escritura y borrado.

BASE DE DATOS

<img width="413" height="270" alt="image" src="https://github.com/user-attachments/assets/969785ef-ebf5-42f2-91cd-a6b03c802d1b" />

A continuación se muestran las pruebas realizadas para validar el correcto funcionamiento de la API:

### 1. Crear un Tópico (POST)
Se envía un JSON con el título, mensaje, autor y curso. La API retorna el objeto creado con su ID y fecha de creación.
![Crear Tópico]

<img width="843" height="633" alt="post" src="https://github.com/user-attachments/assets/41597c69-2307-4757-a30a-9648176b1c42" />

### 2. Listar Tópicos (GET)
Consulta de todos los tópicos registrados en la base de datos.
![Listar Tópicos]
<img width="859" height="691" alt="get" src="https://github.com/user-attachments/assets/7a2836f4-6548-494c-b4d2-83e80b955c4d" />


### 3. Consultar Tópico por ID (GET)
Búsqueda específica de un registro (ej. ID 2).
![Consultar ID 2]
<img width="858" height="624" alt="read" src="https://github.com/user-attachments/assets/292cd268-661b-4133-bf54-680c0d948938" />

### 4. Actualizar Tópico (PUT)
Modificación de un tópico existente (ej. marcar como RESUELTO y CERRADO).
![Actualizar Tópico]
<img width="849" height="560" alt="resuelto" src="https://github.com/user-attachments/assets/754af241-2293-483f-9f1a-9ce70d35a6c5" />


### 5. Eliminar Tópico (DELETE)
Eliminación física o lógica de un registro del sistema.
![Eliminar Tópico]
<img width="848" height="397" alt="delete" src="https://github.com/user-attachments/assets/2ba81525-f6c6-49a8-8118-5d96fd694ba3" />
