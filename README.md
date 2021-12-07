# Applicación web de LebasiMonterrey

#### Descripción: 
- Aplicación web que brinda información sobre el producto y calculación de costos del producto y envió.

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
- Framework spring Boot

#### Verison Java:
- Version 1.8

&nbsp;
## Instalación:
¿Cómo instalar el ambiente de desarrollo?

1. Clonar repositorio de branch developer
2. Abrir Powershell o CMD en directorio de proyecto
3. Correr comando: `mvn package`
4. Correr comando: `java -jar .\target\spring-boot-0.0.1-SNAPSHOT.jar`
5. Abrir localhost http://localhost:8080/


¿Cómo ejecutar pruebas manualmente?

1. Abrir Powershell o CMD en directorio de proyecto
2. Correr comando: `mvn test`


¿Cómo implementar la solución en producción en un ambiente local o en la nube como Heroku?
Pasos para implementar base datos en nube usando Heroku:
1. Crear app nuevo
2. En el aparto de Reosurces le das clic en <strong>Find more add-ons</strong>.
3. Clic en Heroku Postgres y en Install Heroku Postgres
4. Agrega app que creaste al principio --> Sumbit
5. En el apartado de Resources dar clic en Heroku Postgres -- > Settings 
6. Clic en View Credentials --> Copiar y pegar credenciales en el archivo application.properties del proyecto

&nbsp;
## Configuración:
Configuración del producto (archivos de configuración).
- Configurar application.properties archivo para base de datos:
![image](https://user-images.githubusercontent.com/43546733/144938485-38e73d10-e05b-4526-ae84-c68c9a2791d2.png)

 
 Configuración de los requerimientos: (para correr el programa dentro de linea de comando)
 - Agregar ruta la ruta maven a la variable de ambiente del sistema (PATH):
 <img src="https://user-images.githubusercontent.com/43546733/144938158-cd6bea25-d5f9-47a4-a76f-4b104880d9d5.png" width="600">
 
 &nbsp;
## Uso:

a.	Sección de referencia para usuario final. Manual que se hará referencia para usuarios finales.
Uso de páginas:
- Página de inicio: información sobre el producto.
- Página de Beneficios: información sobre el los beneficios del producto.
- Subpáginas de Padecimientos:  información sobre lso padecimientos que ataca el producto.
- Página de tienda: información sobre el costo del producto y calculación de estimación de costos.
  - Agregar el número de latas (no se puede comprar más de 25 latas en una sola exhibición)
  - Agregar muncipio para envío
- Página de Pedido: visualizar el monto total de pedido y información de ficha de deposito.
  - Dar clic en tienda para cambiar pedido


b.	Sección de referencia para usuario administrador.
- Administrar base de datos en Heroku:
  - Guardar copia de base datos.
  - Destruir base de datos.
  - Crear base de datos.  

 
 &nbsp;
## Contribución:
Guía de contribución para usuarios.
1.  Entrar a https://github.com/melylllanes/LebasiMty y dar clic en Fork
    ![image](https://user-images.githubusercontent.com/43546733/144940254-0fe4764c-349f-45c6-9904-2928c73f399c.png)
2. Clonar repositrio y crear branch con el nombre de la función a agregar.
3. 
b.	Debe contar con pasos específicos para clonar repositorio, crear un nuevo branch, enviar el pull request, esperar a hacer el merge.


