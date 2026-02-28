# COMO EJECUTAR EL BACKEND

Para el desarrollo del Backend se utilizo el Framework SpringBoot, donde se utilizo una estructura de capas
que consiste en: application, domain y infraestrucure, con el fin de garantizar una estructura limpia y entendible.

## 1. Tecnologias instaladas

- Node js
- Postgresql
- java 21

## 2. Dependencias del proyecto SpringBoot

- SpringBoot Web
- Lombok
- Postgres Driver
- Spring Data JPA

## 3. Configuracion del las variables de entorno para la BD

Es necesario crear un archivo .env para la conexion del backend a la base de datos.
estos son las variables necesarias.

- DATABASE_URL: jdbc:postgresql://localhost:5432/{nombres de la base de datos}
- DATABASE_USER: postgres
- DATABASE_PASS: (contraseña necesaria)

## 5. Tener en cuenta

Para que pueda correr de manera correcta el backend , es necesario asegurarse que el modulo/carpeta sea un proyecto maven.