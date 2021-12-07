# Applicación web de LebasiMonterrey

#### Descripción: 
- Aplicación web que brinda información sobre el producto y calculación de costos como de envió y producto.

#### Problema: 
- El cliente requiere una página web donde se mantenga toda la información de su producto para así no tener que mandar la información cada vez que se la pidan por mensaje en Facebook.
-	El cliente requiere de una base de datos donde se guarde la información de las personas que requieren unirse como distribuidores oficiales.

#### Solucion:
- Página web donde se mantenga toda la información de su producto y se calcule de monto total de pedido.
- Base de datos donde se guarde la información de las personas que requieren unirse como distribuidores oficiales.

#### Arquitectura:
<img src="https://user-images.githubusercontent.com/43546733/144799027-7467fb49-f192-4727-96e9-569b8ba106df.png" width="650">
 
&nbsp;
## Requerimientos

#### Servidores de app:
- Servidor web: Apache Tomcat
- Serividor de base de datos: PostgresSQL

#### Paquete adicionales:
- IDE con Spring Boot Framework
- MVN Apache

#### Versión Java:
- Version 1.8

&nbsp;
## Instalación:

#### Instalación y ejecucción de aplicación web:
1. Clonar repositorio de branch master
2. Abrir Powershell o CMD en directorio de proyecto
3. Correr comando: `mvn package`
4. Correr comando: `java -jar .\target\spring-boot-0.0.1-SNAPSHOT.jar`
5. Abrir localhost http://localhost:8080/

#### ¿Cómo instalar el ambiente de desarrollo?

1. Instalar Java version 8 o mayor
   - https://www.java.com/es/download/ie_manual.jsp
2. Instalar Eclipse IDE for Enterprise Java and Web Developers
   - https://www.eclipse.org/downloads/packages/
3. Instalar Apache maven
   - https://maven.apache.org/download.cgi
5. Clonar repositorio
6. Abrir proyecto en IDE

#### ¿Cómo ejecutar pruebas manualmente?

1. Abrir Powershell o CMD en directorio de proyecto
2. Correr comando: `mvn test`


#### ¿Cómo implementar la solución en producción en un ambiente local o en la nube como Heroku?
Pasos para implementar base datos en nube usando Heroku:
1. Crear app nuevo
2. En el aparto de Reosurces le das clic en <strong>Find more add-ons</strong>.
3. Clic en Heroku Postgres y en Install Heroku Postgres
4. Agrega app que creaste al principio --> Sumbit
5. En el apartado de Resources dar clic en Heroku Postgres -- > Settings 
6. Clic en View Credentials --> Copiar y pegar credenciales en el archivo application.properties del proyecto

&nbsp;
## Configuración:
#### Configuración del producto (archivos de configuración).
- Configurar application.properties archivo para base de datos:
![image](https://user-images.githubusercontent.com/43546733/144938485-38e73d10-e05b-4526-ae84-c68c9a2791d2.png)

 
 #### Configuración de los requerimientos: (para correr el programa dentro de linea de comando)
 - Agregar ruta la ruta maven a la variable de ambiente del sistema (PATH):
 <img src="https://user-images.githubusercontent.com/43546733/144938158-cd6bea25-d5f9-47a4-a76f-4b104880d9d5.png" width="600">
 
 &nbsp;
## Uso:

#### Sección de referencia para usuario final. Manual que se hará referencia para usuarios finales.
Uso de páginas:
- Página de inicio: información sobre el producto.
- Página de Beneficios: información sobre el los beneficios del producto.
- Subpáginas de Padecimientos:  información sobre lso padecimientos que ataca el producto.
- Página de tienda: información sobre el costo del producto y calculación de estimación de costos.
  - Agregar el número de latas (no se puede comprar más de 25 latas en una sola exhibición)
  - Agregar muncipio para envío
- Página de Pedido: visualizar el monto total de pedido y información de ficha de deposito.
  - Dar clic en tienda para cambiar pedido

#### Sección de referencia para usuario administrador.
- Administrar base de datos en Heroku:
  - Guardar copia de base datos.
  - Destruir base de datos.
  - Crear base de datos.  

 
 &nbsp;
## Contribución:
#### Guía de contribución para usuarios.
1.  Entrar a https://github.com/melylllanes/LebasiMty y dar clic en Fork
    ![image](https://user-images.githubusercontent.com/43546733/144940254-0fe4764c-349f-45c6-9904-2928c73f399c.png)
2. Clonar repositrio y crear branch con el nombre de la función a agregar.
3. Agregar funcionamiento y crear pull request.
![image](https://user-images.githubusercontent.com/43546733/144945443-880504c6-f798-462a-b41f-69ffa4abd00c.png)
4. Administrador de repositorio se tardará 48 - 72 hrs para verficar pull request y posterior hacer merge.
 
 &nbsp;
## Roadmap:
#### Requerimientos que se implementarán en un futuro:
- Agregar funcionalidad de pago en línea.
- Agregar funcionalidad de chat en línea con un nutriologo.




