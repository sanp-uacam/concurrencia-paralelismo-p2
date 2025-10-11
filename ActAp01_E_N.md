# Arquitectura P2P: La Revolución Descentralizada <br>
La arquitectura Peer-to-Peer (P2P) representa un modelo de red donde todos los nodos, conocidos como "pares", tienen roles equivalentes en el intercambio de recursos. A diferencia del modelo cliente-servidor, donde un servidor central gestiona las solicitudes, en P2P cada nodo puede actuar tanto como cliente como servidor, compartiendo y recibiendo recursos directamente con otros nodos.
<br>
## ¿Por qué se considera P2P una arquitectura "entre iguales"? <br>
En una red P2P, no existe una jerarquía centralizada. Todos los nodos tienen las mismas capacidades y responsabilidades, lo que fomenta una distribución equitativa de recursos y tareas. Esta estructura descentralizada permite una mayor resiliencia y eficiencia, ya que la caída o desconexión de un nodo no afecta significativamente al funcionamiento de la red en su conjunto. 
<br>
## Comparativa: P2P estructurado vs P2P no estructurado <br>
Las redes P2P se pueden clasificar en dos tipos principales: <br>
- P2P no estructurado: En este modelo, los nodos se conectan aleatoriamente entre sí sin un esquema predefinido. La búsqueda de recursos se realiza mediante difusión (flooding), lo que puede ser ineficiente en redes grandes. Sin embargo, este enfoque es más flexible y resistente a fallos. <br>
- P2P estructurado: Utiliza una estructura organizada, como una Tabla Hash Distribuida (DHT), para asignar responsabilidades de almacenamiento y búsqueda de datos. Esto permite búsquedas más eficientes, pero requiere una mayor complejidad en la gestión de la red. <br>
## Tablas Hash Distribuidas (DHT) <br>
Una DHT es una estructura de datos distribuida que mapea claves a valores, permitiendo la búsqueda eficiente de información en redes P2P. Cada nodo en la red es responsable de una porción del espacio de claves, y las operaciones de inserción y búsqueda se realizan en tiempo logarítmico. Protocolos como Chord y Kademlia son ejemplos de implementaciones de DHT.
<br>
## Ejemplo práctico: ¿Cómo funciona BitTorrent para compartir archivos? <br>
BitTorrent es un protocolo P2P que permite la distribución eficiente de archivos grandes. Funciona dividiendo los archivos en pequeños fragmentos que se distribuyen entre los usuarios. Cada usuario, al descargar un fragmento, lo comparte simultáneamente con otros, lo que acelera el proceso de descarga y reduce la carga en servidores centrales.
<br>

El proceso básico de BitTorrent incluye: <br>

- Creación del archivo torrent: El archivo torrent contiene metadatos sobre los archivos a compartir y la información necesaria para conectarse a la red P2P.<br>
- Distribución de fragmentos: Los archivos se dividen en fragmentos que se distribuyen entre los usuarios.<br>
- Intercambio de fragmentos: Los usuarios descargan y suben fragmentos simultáneamente, mejorando la eficiencia.<br>
- Finalización de la descarga: Una vez que todos los fragmentos han sido descargados y ensamblados, el archivo completo está disponible para el usuario.<br>

## Referencias bibliográficas

- IONOS. (2023, 12 de mayo). *¿Qué es P2P (peer to peer)?* Recuperado de https://www.ionos.com/es-us/digitalguide/servidores/know-how/que-es-p2p-peer-to-peer/  
- Reactive Programming. (s. f.). *Arquitectura Peer To Peer (P2P)*. Recuperado de https://reactiveprogramming.io/blog/es/estilos-arquitectonicos/p2p  
- Wikipedia. (s. f.). *Tabla Hash Distribuida (DHT)*. En *Wikipedia, la enciclopedia libre*. Recuperado de https://es.wikipedia.org/wiki/Distributed_hash_table  
- Xataka. (s. f.). *BitTorrent: qué es y cómo funcionan los torrents*. Recuperado de https://www.xataka.com/basics/bittorrent-que-como-funcionan-torrents  
- ElHacker.NET. (2021, 27 de noviembre). *Funcionamiento Protocolo p2p (BitTorrent)*. Recuperado de https://blog.elhacker.net/2021/11/funcionamiento-protocolo-p2p-bittorrent.html  

