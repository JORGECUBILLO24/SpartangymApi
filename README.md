# 🏋️‍♂️ Spartan Gym API

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)

API RESTful desarrollada con Spring Boot para la gestión administrativa de un centro deportivo (Spartan Gym). Este proyecto permite administrar los Planes de Entrenamiento ofrecidos por el gimnasio y llevar el control de los Miembros inscritos, implementando una relación de base de datos de Muchos a Uno (Many-To-One).

**Proyecto Académico - Universidad Americana (UAM)** **Desarrollado por:** Jorge Rafael Cubillo Navarro

---

## 🚀 Tecnologías Utilizadas

* **Lenguaje:** Java 17+
* **Framework Backend:** Spring Boot (Web, Data JPA)
* **Base de Datos:** PostgreSQL
* **Herramientas Adicionales:** Lombok (reducción de código repetitivo), Maven (gestión de dependencias).
* **Pruebas de API:** Postman

---

## 🏗️ Estructura del Proyecto

El proyecto sigue una arquitectura clásica de capas para separar responsabilidades y mantener el código limpio:

* `Modelos/`: Entidades JPA que representan las tablas en la base de datos (`PlanEntrenamiento`, `Miembro`).
* `repository/`: Interfaces de Spring Data JPA para el acceso a datos.
* `servicios/`: Lógica de negocio y validaciones.
* `controladores/`: Controladores REST que exponen los endpoints HTTP.

### Relación de Entidades
* Un **Plan de Entrenamiento** puede tener múltiples **Miembros** inscritos (Uno a Muchos).
* Un **Miembro** solo puede estar suscrito a un **Plan de Entrenamiento** a la vez (Muchos a Uno).

---

## 🔌 Endpoints de la API

La URL base de la aplicación local es: `http://localhost:8080/api/v1/spartan`

### 📋 Planes de Entrenamiento
| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| `GET` | `/planes` | Obtiene la lista de todos los planes disponibles. |
| `POST`| `/planes` | Crea un nuevo plan de entrenamiento. |

**Ejemplo de Payload (POST /planes):**
```json
{
    "nombre": "Spartan Básico",
    "descripcion": "Acceso área de pesas",
    "duracionSemanas": 4,
    "precio": 30.0
}
