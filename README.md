# 🧠 Encapsulamiento en Java – Ejercicios prácticos

Este repositorio contiene ejemplos prácticos y explicaciones sobre el concepto de **encapsulamiento** en programación orientada a objetos con Java, usando como base tres videos educativos.

---

### 🔐  Video 1. Encapsulamiento con Ejemplo Bancario

En el video se explica el concepto de **encapsulamiento** mediante una **cuenta bancaria ficticia** que incluye los siguientes atributos:

- `CBU`: Clave Bancaria Uniforme 
- `saldo`: Monto disponible 
- `alias`: Nombre personalizado de la cuenta

Se demuestra cómo proteger estos atributos con modificadores de acceso (`private`, `public`) y cómo acceder a ellos de forma segura usando métodos `getters` y `setters`.

🔍 El video muestra como:

- Cómo proteger información sensible.
- Por qué no se debe acceder directamente a los atributos de una clase.
- Buenas prácticas en diseño orientado a objetos.

---

### 🛠️  Video 2. Getters y Setters en Java con NetBeans

Este video se enfoca en cómo implementar **getters y setters**, explicando:

- Qué son y para qué se usan.
- Cómo permiten acceder de forma controlada a atributos privados.
- Cómo generarlos automáticamente con **NetBeans IDE** para facilitar el desarrollo.

💡 El video muestra como:

- A manipular atributos privados sin romper el encapsulamiento.
- A aprovechar el entorno de desarrollo para agilizar el código.

---

### 🔓  Video 3. Modificadores de Acceso: Públicos vs Privados

El tercer video aborda los **modificadores de acceso** (`public`, `private`) y sus implicancias:

- Los **atributos privados** no pueden ser accedidos directamente desde fuera de la clase.
- Se necesitan **métodos públicos** para permitir el acceso indirecto (como los getters).
- Si un **método también es privado**, no podrá ser utilizado desde fuera, bloqueando el acceso a los datos.

🔐 El video muestra como:

- Diseñar clases seguras y controladas.
- Exponer solo lo necesario.
- Mantener la lógica interna protegida.

---

### 🛠️ Herramientas Necesarias

Java jdk 17 , Netbeans IDE y conocer de  POO
