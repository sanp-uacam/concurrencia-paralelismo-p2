 
## Paradigmas de Comunicación: Cómo se Hablan los Sistemas Distribuidos  

**Equipo:** HulkHogan6  
**Fecha:** 8 Octubre 2025  

**Integrantes:**  
- Wilbert J. Novelo Ruiz
- Moises A. Sunza Vazquez
- Kevin J. Ruiz Tillit
- Ulises Zarate Concha
- Alfredo J. Cruz Miss

## Introducción

Las aplicaciones que usamos todos los días, como Uber, Netflix o las redes sociales, están formadas por varios programas que trabajan juntos en distintos servidores. A estos se les llama **sistemas distribuidos**, y su funcionamiento depende de que todos los componentes **puedan comunicarse correctamente**.  
Para lograrlo, existen diferentes **paradigmas de comunicación**, que son las maneras en las que los sistemas se “hablan” entre sí. Los principales son **RPC (Remote Procedure Call)**, **Message Passing**, **Middleware** y el **Patrón Publicador–Suscriptor (Pub/Sub)**.  

## Desarrollo

El **RPC** permite que un programa ejecute una función en otra computadora como si fuera local. Es muy práctico porque oculta los detalles de la red, aunque suele ser **síncrono**, lo que significa que el cliente debe esperar la respuesta del servidor. Un ejemplo moderno es **gRPC**, que hace este proceso más rápido y eficiente.  

El **Message Passing** consiste en que los sistemas **se envían mensajes** en lugar de hacer llamadas directas. Puede ser síncrono o asíncrono y es ideal para sistemas grandes, ya que permite **mayor independencia y tolerancia a fallos**. El estándar **MPI (Message Passing Interface)** es uno de los más usados en supercomputadoras.  

El **Middleware** funciona como una **capa intermedia** que conecta distintos programas, haciendo que puedan comunicarse sin importar el lenguaje o tecnología que usen. Se encarga de la seguridad, el formato de datos y la autenticación. Ejemplos comunes son **Apache Kafka** y **RabbitMQ**, que procesan millones de mensajes por segundo.  

El **Patrón Publicador–Suscriptor (Pub/Sub)** es una forma moderna de comunicación donde los publicadores envían mensajes y los suscriptores los reciben solo si están interesados. Es **asíncrono y desacoplado**, por lo que los sistemas pueden crecer sin afectar a los demás.  

Un caso real es **Uber**, que usa **Apache Kafka** para coordinar sus servicios. Gracias a este sistema, puede procesar millones de eventos por segundo, como solicitudes de viaje y actualizaciones de ubicación, garantizando rapidez y confiabilidad.  


## Conclusión

Los paradigmas de comunicación son la base de los sistemas distribuidos.  
- **RPC** simplifica la comunicación directa.  
- **Message Passing** da flexibilidad y resistencia.  
- **Middleware** conecta sistemas distintos.  
- **Pub/Sub** permite comunicación moderna en tiempo real.  

En la práctica, las empresas combinan estos modelos para crear sistemas más **rápidos, escalables y confiables**. Gracias a estos paradigmas, servicios como Uber, Netflix o Amazon pueden coordinar miles de procesos distribuidos en diferentes servidores sin perder **eficiencia ni consistencia**, demostrando que una buena arquitectura de comunicación es esencial para el rendimiento global de las aplicaciones modernas.


## Bibliografía

- Amazon Web Services. (s.f.). *¿Qué es Middleware?* Recuperado de [https://aws.amazon.com/es/what-is/middleware/](https://aws.amazon.com/es/what-is/middleware/)  
- TechTarget. (s.f.). *What is Remote Procedure Call (RPC)?* Recuperado de [https://www-techtarget-com.translate.goog/searchapparchitecture/definition/Remote-Procedure-Call-RPC](https://www-techtarget-com.translate.goog/searchapparchitecture/definition/Remote-Procedure-Call-RPC?_x_tr_sl=en&_x_tr_tl=es&_x_tr_hl=es&_x_tr_pto=tc)  
- TechTarget. (s.f.). *Message Passing Interface (MPI) Definition.* Recuperado de [https://www.techtarget.com/searchenterprisedesktop/definition/message-passing-interface-MPI](https://www.techtarget.com/searchenterprisedesktop/definition/message-passing-interface-MPI)  
- Loyola Marymount University (LMU). (s.f.). *Notes on Message Passing.* Recuperado de [https://cs.lmu.edu/~ray/notes/messagepassing/](https://cs.lmu.edu/~ray/notes/messagepassing/)  
- Embedded Artistry. (s.f.). *Message Passing – Field Manual.* Recuperado de [https://embeddedartistry.com/fieldmanual-terms/message-passing/](https://embeddedartistry.com/fieldmanual-terms/message-passing/)  
