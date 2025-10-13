**Topologías de Red – La Base Física**

**¿Qué es una topología de red y por qué es importante en sistemas distribuidos?**

Una topología de red es la forma en que se interconectan los dispositivos (como computadoras, servidores, impresoras, routers o switches) dentro de una red. Describe la estructura física o lógica mediante la cual fluye la información.En sistemas distribuidos, la topología es fundamental porque influye directamente en:

El rendimiento de la red (velocidad y latencia).
La tolerancia a fallos, es decir, la capacidad del sistema para seguir funcionando si una conexión falla.
La facilidad de mantenimiento y expansión.
La eficiencia en la comunicación entre los nodos del sistema.

Una buena elección de topología garantiza que los recursos distribuidos puedan comunicarse de forma rápida y segura, optimizando el trabajo colaborativo y el procesamiento de datos compartidos.

**Las topologías físicas principales**

1. Topología en Bus:
En esta topología, todos los dispositivos están conectados a un solo cable principal, conocido como bus o troncal. Este actúa como medio compartido por el que se transmiten los datos. Cada computadora o dispositivo tiene una conexión al bus, y los datos viajan por él hasta alcanzar el destino.

Ventajas:
Económica, ya que utiliza menos cableado que otras topologías.
Fácil de instalar en redes pequeñas
Requiere pocos recursos para funcionar.

Desventajas:
Si el cable principal se daña, toda la red queda fuera de servicio.
Es difícil detectar errores y mantener el sistema.
El rendimiento disminuye cuando hay muchos dispositivos transmitiendo datos.

Usos comunes: redes locales antiguas (Ethernet 10Base2 o 10Base5), laboratorios pequeños o redes temporales.


2. Topología en Estrella:
En la topología en estrella, cada dispositivo está conectado directamente a un nodo central, que puede ser un switch, router o hub. Este nodo se encarga de gestionar y dirigir todo el tráfico de datos.
Cuando una computadora envía información, los datos pasan primero por el dispositivo central, que luego los redirige al destino correspondiente.

Ventajas:
Fácil de instalar, configurar y mantener.
Si un cable falla, solo se desconecta ese equipo y no afecta al resto.
Facilita el diagnóstico de problemas y la ampliación de la red.
Compatible con la mayoría de las tecnologías modernas (Ethernet, Wi-Fi, etc.).

Desventajas:
Si el nodo central falla, toda la red se detiene.
Requiere más cableado que la topología en bus.
Puede ser costosa dependiendo del equipo central.

Usos comunes: redes de oficinas, laboratorios escolares, redes domésticas modernas.


3. Topología en Anillo:
En esta topología, cada dispositivo está conectado al siguiente formando un circuito cerrado o anillo. Los datos viajan en una sola dirección (o en ambas, si es doble anillo). Cada nodo recibe la información, la analiza y la pasa al siguiente hasta llegar al destino.
Esta topología evita colisiones de datos, ya que solo un dispositivo transmite a la vez, controlado por un token (una señal que indica quién puede enviar información).

Ventajas:
Los datos se transmiten de manera ordenada y predecible.
No existen colisiones como en el bus.
Todos los nodos tienen la misma prioridad en el uso de la red.

Desventajas:
Si un dispositivo o cable falla, puede interrumpir toda la red (salvo si hay doble anillo).
Es más difícil de configurar y mantener.
No es tan escalable como otras topologías.

Usos comunes: redes industriales o corporativas que requieren flujo de datos constante, y antiguas redes Token Ring de IBM.


4. Topología en Malla:
En esta topología, cada dispositivo está conectado directamente con todos los demás. De esta manera, existen múltiples rutas para que los datos lleguen de un punto a otro. Si una conexión falla, los datos pueden tomar otra ruta alternativa.

Existen dos tipos:
Malla completa: todos los dispositivos están interconectados entre sí.

Malla parcial: algunos dispositivos se conectan directamente, mientras que otros lo hacen a través de intermediarios.

Ventajas:
Altísima tolerancia a fallos: la red sigue funcionando incluso si varios enlaces fallan.
Comunicación directa y segura entre los nodos.
Ideal para redes donde la disponibilidad es crítica.

Desventajas:
Muy costosa por la cantidad de cableado y puertos necesarios.
Compleja de instalar y mantener.
No es práctica para redes grandes.

Usos comunes: redes militares, sistemas de comunicación de emergencia, centros de datos y redes de sensores.


5. Topología en Árbol (Jerárquica):
La topología en árbol es una combinación de la topología en estrella y en bus. Está organizada de forma jerárquica, con un nodo principal (servidor o switch raíz) del que se derivan ramas secundarias. Cada rama puede tener varios nodos conectados en estrella.


Ventajas:
Permite expandir la red fácilmente agregando más ramas o niveles.
Facilita la administración y el control del tráfico.
Es adecuada para redes grandes y organizadas.

Desventajas:
Si falla el nodo raíz o un switch de nivel alto, puede afectar a varios segmentos.
Requiere más cableado que otras topologías.
La configuración puede ser compleja en redes extensas.


Usos comunes: redes empresariales o institucionales con diferentes departamentos o áreas conectadas a un servidor principal.

**Diferencia entre topología física y lógica**

La topología física se refiere a la forma real en que los dispositivos y cables están conectados dentro de una red. Es decir, cómo están distribuidos los equipos, routers, switches y conexiones en el espacio físico.
Por otro lado, la topología lógica describe la manera en que los datos circulan a través de la red, sin importar cómo estén conectados físicamente los dispositivos. Representa el flujo de información o la ruta que siguen los paquetes de datos entre los equipos

*Ejemplo práctico: ¿Qué topología se usa en el laboratorio de computación de nuestra universidad? ¿Y en una red Wi-Fi doméstica?*
En el laboratorio de computación de la universidad:

Generalmente se utiliza una topología en estrella, donde cada computadora se conecta a un switch central, y este al servidor o router principal. Esto permite administrar mejor la red, mantener estabilidad y aislar fallos.


*En una red Wi-Fi doméstica:*

La topología física también es en estrella, con el router inalámbrico como punto central y los dispositivos conectados a él (laptops, celulares, televisores).
Sin embargo, lógicamente funciona como un bus, ya que todos comparten el mismo medio de transmisión: el aire(frecuencia de radio).



**Conclusión**
Las topologías de red constituyen la base física de cualquier sistema distribuido. Su correcta elección influye directamente en la eficiencia, escalabilidad y confiabilidad de la red. En entornos educativos o domésticos, la topología en estrella es la más usada por su equilibrio entre costo, facilidad de mantenimiento y rendimiento.

**Referencias**

*Cuadrado, G. C. (2024, 26 agosto). Topología de redes informáticas: Tipos, características y aplicaciones. OpenWebinars.net. https://openwebinars.net/blog/topologia-de-redes-informaticas/*
*Itgdev. (2024, 3 septiembre). What is Network Topology? Types & How to Map It. IT Glue. https://www.itglue.com/blog/network-topology/*
*Jackson, G. (2024, 24 octubre). ¿Qué es la topología de red? IBM. https://www.ibm.com/mx-es/think/topics/network-topology*
