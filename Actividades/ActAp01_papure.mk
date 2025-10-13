# EQUIPO PAPURE

## Integrantes
- Fernando Adriano Sabido Quijano
- Kerin de Jesus Gonzales Mass
- David Cervantes Malfavon
- Oziel David Canul Xool
- Cristian Giovany Carballo Padilla

##PREGUNTAS

1. Roles de cliente y servidor
La verdad es que es una relación bastante clara: el cliente es quien pide y el servidor es quien responde. El cliente puede ser cualquier dispositivo o programa que el usuario usa directamente, como una computadora, un celular o incluso una báscula digital conectada. Su trabajo es mostrar la información y permitir que el usuario interactúe. En cambio, el servidor es el que guarda los datos, procesa las solicitudes y mantiene todo funcionando con seguridad y orden. Yo pienso que el servidor es como el “cerebro” del sistema y el cliente sería como sus “manos y ojos”.

2. Diferencias entre arquitecturas de 2, 3 y n-capas
En la arquitectura de 2 capas, el cliente y el servidor se comunican directamente. Es el modelo más simple, como cuando una app se conecta a una base de datos sin intermediarios.
La de 3 capas agrega una parte intermedia llamada “lógica de negocio”, que maneja las reglas y operaciones antes de llegar a los datos. Por ejemplo, un sistema bancario que valida la información antes de guardarla.
Y la de n-capas lleva eso más lejos, separando más funciones, como autenticación, servicios web o almacenamiento distribuido. Yo pienso que lo bueno de esto es que hace los sistemas más ordenados y escalables, aunque también un poco más complejos de mantener.

3. Ventajas y desventajas críticas
Ventajas:

Centraliza los datos y mejora la seguridad.

Facilita el mantenimiento, ya que se actualiza desde el servidor.

Permite una mejor administración del rendimiento y las políticas del sistema.

Desventajas:

El servidor puede ser un punto único de falla.

Si hay muchos clientes conectados, puede haber lentitud o saturación.

Requiere buena infraestructura para mantener la estabilidad y disponibilidad.

## RESUMEN

La arquitectura cliente-servidor ha estado presente en la computación desde los comienzos de las redes informáticas y todavía hoy sigue siendo la base de la mayoría de los servicios que usamos a diario, desde navegar por internet, usar aplicaciones como las redes sociales, hasta revisar el correo. Este modelo puede verse sencillo, pero es muy importante ya que permite dividir el trabajo entre quien pide (el cliente) y quien responde (el servidor), permitiéndonos tener una mejor organización entre la presentación, la lógica y los datos, y poder construir sistemas eficientes, seguros y fáciles de mantener.

Cuando el servidor se encarga de guardar la información y manejar las reglas del sistema, se logra mantener un mejor control, más seguridad y coherencia en todo lo que hace la aplicación. Por otro lado, el cliente se ocupa de mostrar la interfaz y de permitir que el usuario interactúe de forma rápida y fluida. Esta manera de dividir las tareas es muy práctica y hasta el ahora confiable, ya que permite que las aplicaciones crezcan, se actualicen y mejoren sin perder organización ni estabilidad.

Pero no es del todo perfecto esta arquitectura, uno de sus principales problemas es que el servidor puede convertirse en el punto débil del sistema, si falla, todo se detiene. Por eso, las implementaciones modernas han ayudado proporcionando herramientas como la alta disponibilidad, la replicación, los balanceadores de carga o las colas asincrónicas. Además, en contextos donde la concurrencia y el paralelismo son esenciales, este modelo pone orden y control, asegurando que los procesos no se saturen y mantengan su rendimiento.

Un ejemplo es el correo electrónico, estos funcionan con ayuda de esta arquitectura, en donde el cliente (ya sea la app o el navegador) pide acceso, y el servidor gestiona y responde. Con ayuda de los protocolos como SMTP o IMAP permiten que todo fluya sin que el usuario tenga que preocuparse.

De todo esto nos queda que la arquitectura cliente-servidor sigue vigente porque combina simplicidad, eficiencia y claridad. Puede adaptarse, escalar y evolucionar, pero su esencia sigue siendo la misma, una comunicación clara entre quien solicita y quien responde. Esto permite que los sistemas funcionen con estabilidad, precisión y confianza.

---

## BIBLIOGRAFÍA

Tanenbaum, A. S., & Van Steen, M. (2017). Distributed Systems: Principles and Paradigms (2nd ed.). Pearson Education.

Stallings, W. (2018). Computer Networking with Internet Protocols and Technology (7th ed.). Pearson.

Kurose, J. F., & Ross, K. W. (2021). Computer Networking: A Top-Down Approach (8th ed.). Pearson.
