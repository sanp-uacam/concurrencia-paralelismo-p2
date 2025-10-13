# ActAp01: Arquitectura Cliente-Servidor

##  Integrantes del Equipo 'papure'

* OZIEL CANUL XOOL
* FERNANDO ADRIANO SABIDO QUIJANO
* DAVID CERVANTES MALFAVON
* CRISTIAN G CARBALLO PADILLA
* KERIN DEL JESUS GONZALEZ MAAS


##  Arquitectura Cliente-Servidor

La arquitectura cliente-servidor ha estado presente en la computación desde los comienzos de las redes informáticas y todavía hoy sigue siendo la **base de la mayoría de los servicios** que usamos a diario, desde navegar por internet, usar aplicaciones como las redes sociales, hasta revisar el correo. Este modelo puede verse sencillo, pero es muy importante ya que permite **dividir el trabajo** entre quien pide (**el cliente**) y quien responde (**el servidor**), permitiéndonos tener una mejor organización entre la presentación, la lógica y los datos, y poder construir sistemas eficientes, seguros y fáciles de mantener.

Cuando el servidor se encarga de guardar la información y manejar las reglas del sistema, se logra mantener un mejor **control, más seguridad y coherencia** en todo lo que hace la aplicación. Por otro lado, el cliente se ocupa de mostrar la interfaz y de permitir que el usuario interactúe de forma rápida y fluida. Esta manera de dividir las tareas es muy práctica y hasta el ahora confiable, ya que permite que las aplicaciones crezcan, se actualicen y mejoren sin perder organización ni estabilidad.

Pero no es del todo perfecto esta arquitectura, uno de sus principales problemas es que el servidor puede convertirse en el **punto débil** del sistema, si falla, todo se detiene. Por eso, las implementaciones modernas han ayudado proporcionando herramientas como la **alta disponibilidad**, la **replicación**, los **balanceadores de carga** o las **colas asincrónicas**. Además, en contextos donde la concurrencia y el paralelismo son esenciales, este modelo pone orden y control, asegurando que los procesos no se saturen y mantengan su rendimiento.

Un ejemplo es el correo electrónico, estos funcionan con ayuda de esta arquitectura, en donde el cliente (ya sea la app o el navegador) pide acceso, y el servidor gestiona y responde. Con ayuda de los protocolos como SMTP o IMAP permiten que todo fluya sin que el usuario tenga que preocuparse.

De todo esto nos queda que la arquitectura cliente-servidor sigue vigente porque combina **simplicidad, eficiencia y claridad**. Puede adaptarse, escalar y evolucionar, pero su esencia sigue siendo la misma, una comunicación clara entre quien solicita y quien responde. Esto permite que los sistemas funcionen con estabilidad, precisión y confianza.

---

### 2. Definición de Roles: Cliente y Servidor
La arquitectura Cliente-Servidor establece una **relación jerárquica** basada en la demanda de servicios:
* **Cliente:** Es el solicitante. Proporciona la interfaz de usuario y envía peticiones de servicio a través de la red.
* **Servidor:** Es el proveedor. Escucha las peticiones, realiza el procesamiento de la lógica de negocio y gestiona los recursos (como bases de datos), enviando una respuesta al cliente.

### 3. Arquitecturas de 2, 3 y N-Capas
La clave del modelo es cómo se distribuyen las tres capas lógicas (Presentación, Lógica de Negocio y Datos) en los niveles o *tiers* físicos:

| Arquitectura | Capas Lógicas por Nivel | Característica Principal |
| :--- | :--- | :--- |
| **2-Capas** | Cliente: Presentación + Lógica de Negocio; Servidor: Datos | Cliente "gordo", difícil de mantener y escalar. |
| **3-Capas** | Cliente: Presentación; Servidor de Aplicaciones: Lógica de Negocio; Servidor de BBDD: Datos | Separación clara de responsabilidades, mejor escalabilidad. |
| **N-Capas** | Lógica de Negocio distribuida en múltiples servicios intermedios (middlewares) | Máxima modularidad, ideal para microservicios y alta concurrencia. |

### 4. Ventajas y Desventajas Críticas

| Ventajas Críticas (3) | Desventajas Críticas (3) |
| :--- | :--- |
| **Centralización:** Simplifica la administración, copias de seguridad y la aplicación de políticas de seguridad. | **Punto Único de Fallo (SPOF):** La inoperatividad del servidor detiene el servicio para todos los clientes. |
| **Eficiencia:** Los servidores se pueden optimizar con hardware dedicado para gestionar la lógica y los datos. | **Congestión/Cuello de Botella:** La carga de tráfico y procesamiento recae en el servidor central. |
| **Mantenimiento y Coherencia:** Las actualizaciones se realizan solo en el servidor, garantizando que todos los clientes accedan a la misma versión y datos coherentes. | **Coste:** Requiere una inversión significativa en infraestructura de servidores robustos y escalables. |

### 5. Ejemplo Práctico: El Servicio de Correo Electrónico (Gmail/Outlook)

El correo es un modelo clásico de 3-capas:
1.  **El Cliente:** La aplicación móvil, el cliente de escritorio (Outlook) o la interfaz web (Gmail). Se comunica con el servidor para enviar o recibir.
2.  **El Servidor de Correo (Lógica de Negocio):** Gestiona protocolos (SMTP para envío, IMAP/POP3 para recepción), filtrado de spam, y autenticación.
3.  **El Almacenamiento (Datos):** El servidor de base de datos que guarda todos los correos, carpetas y configuraciones del usuario.

El cliente solicita (ej. "dame los correos no leídos"), y el servidor procesa esa lógica y responde con los datos correctos, asegurando la consistencia del servicio global.

***

### Bibliografía
* Coulouris, G., Dollimore, J., Kindberg, T., & Blair, G. (2017). *Distributed Systems: Concepts and Design*. Pearson Education.
* Tanenbaum, A. S., & Van Steen, M. (2017). *Distributed Systems: Principles and Paradigms*. Pearson Education.

