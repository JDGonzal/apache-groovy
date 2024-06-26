# The Complete Apache Groovy Developer Course
https://perficient.udemy.com/course/apache-groovy
## Prerrequisitos
1. Tener "[Visual Studio Code](https://code.visualstudio.com/download)", como editor
2. Tener Instalado "[JAVA Version 11.0.2](https://jdk.java.net/archive/)", "[GRADLE](https://gradle.org/install/)", "[GROOVY](https://groovy.apache.org/download.html)" y "[MAVEN](https://maven.apache.org/download.cgi)".
3. Instalar Estas Extensiones en el "Visual Studio Code":
* code-groovy  de Marlon Franca.
* 

# Section 1: Introduction

## Paso 1. Introduction and Goals for this course
>[!NOTE]  
>Que se va a ver en el curso y con q posibles herramientas se va a trabajar.

## Paso 2. What is Groovy?
>[!NOTE]  
>**Apach Groovy** es un poderoso tipado y dinámico lenguaje 
>opcional para plataformas Java, dirigido a mejorar la 
>productividad del desarrollo.  
>Está inspirado en leguajes como ´Python´, ´Ruby´ y ´Smalltalk´.
>
> ### Características de Apache Groovy
>* **Curva de aprendizaje plana**
>Sintaxis concisa, legible y expresiva, fácil de 
>aprender para desarrolladores de Java.
>* **Integración fluida de Java**
>Se integra e interopera de forma perfecta y transparente 
>con Java y cualquier biblioteca de terceros.
>* **Ecosistema vibrante y rico**
>Desarrollo web, aplicaciones reactivas, biblioteca de 
>concurrencia/asincrónica/paralelismo, marcos de prueba, 
>herramientas de compilación, análisis de código, creación de GUI
>* **Funciones potentes**
>Cierres, constructores, metaprogramación en tiempo de 
>ejecución y compilación, programación funcional, 
>inferencia de tipos y compilación estática
>* **Idiomas específicos del dominio**
>Sintaxis flexible y maleable, mecanismos avanzados de integración 
>y personalización para integrar reglas comerciales legibles en sus 
>aplicaciones.
>* **Pegamento para secuencias de comandos y pruebas**
>Excelente para escribir pruebas concisas y fáciles de mantener, 
>y para todas sus tareas de compilación y automatización.
>
>![Groovy Used](images/section02-step_02-Groovy-used.PNG)

## Paso 3. Source Code
>[!NOTE]  
>Repositiorio con los ejercicios de groovy
>[cfaddict/apache-groovy-course](https://github.com/cfaddict/apache-groovy-course)

## Paso 4. The Groovy Website & Documentation
>[!NOTE]
>Estos son los sitios de recursos aportados en el curso:
> * [Apache Groovy](https://groovy-lang.org/).
> * [Groovhy Website Source Code ](https://github.com/apache/groovy-website/).https://groovy-lang.org/gdk.html
> * [Groovy Developemnt Kit](https://groovy-lang.org/gdk.html).
> * [GroovyDoc of Groovy APIs](https://groovy-lang.org/api.html).

## Paso 5. Groovy Books & Additional Resources
>[!NOTE]  
> Otros libros y documentos:
> * [Groovy in Action](https://www.amazon.com/Groovy-Action-Dierk-246-nig/dp/1935182447/).
> * [Programming Groovy 2](https://www.amazon.com/Programming-Groovy-Productivity-Developer-Programmers/dp/1937785300/).
> * [Making Java Groovy](https://www.amazon.com/Making-Java-Groovy-Ken-Kousen/dp/1935182943).

## Paso 6. How to get the most out of this course
>[!NOTE]  
>Bienvenido de nuevo.  
>Hoy quiero hablar sobre las mejores maneras de sacar todo el provecho posible de este curso para saber cómo  
>emocionante puede ser tomar un nuevo curso y querer aprender un nuevo tema.  
>Es más o menos todo lo que hago fuera de la enseñanza.  
>Me encanta conseguir tantos libros como pueda, muchos cursos y simplemente consumir tanta información como sea posible.  
>poder.  
>Entonces este es un curso bastante largo.  
>Llevamos más de 14 horas aquí, por lo que hay mucha información aquí para aprender.  
>Así que solo voy a hablar sobre un par de cosas que creo que te ayudarán a tener éxito.  
>en este curso.  
>Entonces, comencemos con las pruebas y los ejercicios.  
>En cada sección.
>Tenemos algunos cuestionarios, algunos ejercicios y luego tenemos algunas revisiones a las que iremos tú y yo.
>a través del ejercicio real juntos.  
>Así que estos no son sólo rellenos para poder decirle a la gente que tengo X cantidad de contenido en este curso.
>Realmente están destinados a ayudarle a retener información.  
>Por eso quiero que realices estos cuestionarios.
>Quiero que hagas los ejercicios.
>Y si no entiendes algo, por favor pregunta.  
>Y lo mejor que puedes hacer es preguntar en el foro, porque es probable que alguien más tenga la misma pregunta que haces tu.  
>Así que por favor hable y me aseguraré de recibir respuestas lo más rápido posible.
>Esos son los cuestionarios y ejercicios.
>Dos Los recursos adicionales continúan y saltan hasta el final del curso.  
>Ahora mismo, si quieres, hay una sección de recursos adicionales y vamos a tener un PDF grande.
>aquí lleno de toda la información que necesita.  
>Y esto será como una lista de libros, una lista de artículos, una lista de podcasts, boletines informativos,
>todo lo que puedas intentar consumir de la maravillosa comunidad.  
>Entonces haz eso:  
>Además, si eres blogger o te gusta crear screencasts para YouTube, creo que otra forma de
>Realmente aprendes un tema es a medida que avanzas y encuentras un tema que realmente quieres probar.
>para comprenderlo mejor.  
>Digamos que está realmente interesado en los cierres y desea aprender más sobre ellos.  
>Ya sabes, cuando aprendas algo, sal y escribe una publicación de blog sobre ello o crea un screencast.  
>al respecto Puedo decirte por experiencia que una cosa que siempre he encontrado es cuando quieres contarle a alguien más.
>sobre algo, probablemente seas un poco más duro contigo mismo y quieras asegurarte de que realmente
>Entiende ese tema antes de contarle a alguien más sobre él.  
>Ese tipo de recursos siempre me han ayudado personalmente.
>Quizás ellos también te ayuden.  
>Entonces creo que eso es todo.  
>Sólo un par de consejos.
> * Realmente quiero que tengas éxito en este curso, no sólo que lo tomes.
>Así que espero que ayuden.
>Y entremos en el verdadero meollo del curso.
>Comenzaremos y comenzaremos a repasar algunos conceptos básicos y a configurarlo.
>Entonces vamos.

# Section 2: Getting Started

## Paso 7. Intro
>[!NOTE]  
>Corta explicación del capítulo.

## Paso 8. Installing the Java JDK on Windows
>[!NOTE]  
>Sitio sugerido es este: [Oracle JAVA Downloads](https://www.oracle.com/java/technologies/downloads/?er=221886).  
> Pero yo lo bajo de este autorizado por mi empresa:
> [JAVA Version 11.0.2](https://jdk.java.net/archive/)
>Ya sea en Windows o en MAC opto por la instlación manual, 
>Es decir descargo el comprimido (**.zip** o **tar.gz**).  
>En este sitio hay unas instrucciones para "instalar" el comprimido:
>[OpenJDK en windows 10]([JAVA Version 11.0.2](https://jdk.java.net/archive/))

## Paso 9. Installing the Java JDK on Mac OSX
>[!NOTE]  
>Similar el sitio de descarga [JAVA Version 11.0.2](https://jdk.java.net/archive/)

>[!TIP]  
> Siempre lo importante es ejecutar en una terminal el comando
>```bash
>java --version
>```
>y obtener la versión del java instalado.

## Paso 10. Installing Groovy on Windows
>[!NOTE]  
>La mejor manera es descargar el comprimido (*.zip) y ponerlo de forma
> manual, a lfinal ejecutar el comando ```groovy --version ```

## Paso 11. SDKMAN
>[!NOTE]
> Muy útil  para instalar muchos tipos de software
>La página con el instructivo es [Sdkman Installation](https://sdkman.io/install)

1. el comando para instalar en una términal de `git Bash` o UNIX o
LINUX o emuladores similares sería:
```bash
curl -s "https://get.sdkman.io" | bash
```
2. Si en Windows usando el `git Bash` genera el error q le falta el 
**zip**, en esta página está la solución [How to add man and zip to "git bash" installation on Windows](https://stackoverflow.com/questions/38782928/how-to-add-man-and-zip-to-git-bash-installation-on-windows]
3. Descargar el **zip** de esta página [zip-3.0-bin.zip](https://sourceforge.net/projects/gnuwin32/files/zip/3.0/zip-3.0-bin.zip/download), y copiar el `zip.exe` en esta ruta `C:\Program Files\Git\mingw64\bin\`.
4. Ejecute en el `git Bash` el comando:
```bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
```
5. Por último el comando para estar seguros q quedó bien instalado:
```bash
sdk version
```

## Paso 12. groovysh
1. Ejecuto el comando `groovysh -help` y la respuesta sería
```bash
Usage: groovysh [options] [...]
The Groovy Shell, aka groovysh, is a command-line application which allows easy
access to evaluate Groovy expressions, define classes and run simple
experiments.
  -C, --color[=<FLAG>]    Enable or disable use of ANSI colors
      -cp, -classpath, --classpath
                          Specify where to find the class files - must be first
                            argument
  -d, --debug             Enable debug output
  -D, --define=<name=value>
                          Define a system property
  -e, --evaluate=<CODE>   Evaluate the code first when starting interactive
                            session
  -h, --help              Display this help message
      -pa, --parameters   Generate metadata for reflection on method parameter
                            names (jdk8+ only)
      -pr, --enable-preview
                          Enable preview Java features (jdk12+ only) - must be
                            after classpath but before other arguments
  -q, --quiet             Suppress superfluous output
  -T, --terminal=<TYPE>   Specify the terminal TYPE to use
  -v, --verbose           Enable verbose output
  -V, --version           Display the version
```
2. El comando correcto es `groovysh -V` o `groovysh --version`, pero nunca
`groovysh -version` o `groovysh -v`, para obtener algo parecido a esto:
```bash
@|green Groovy Shell|@ 4.0.16
```
3. El solo commando `groovysh`, te lleva a un ambiente donde groovy evalua y
ejecuta. Por ejemplo:  
![groovysh-1](images/section02-step_12-groovysh1.png)ko

4. Se puede salir de este ambiente en cualquier momento con `:q`.

## Paso 13. groovyc
> [!NOTE]  
> `groovyc` es la herramienta de compilación en linea.  
>  Algunos commandos y funciones de la línea de comando
> en este sitio [groovyc - the Groovy compiler](https://groovy-lang.org/groovyc.html).
1. Creo la carpeta "groovy".
2. Creo el archivo **Person.groovy** con lo siguiente:
```groovy
class Person {
	String first
	String last
	
	public Person( String first, String last){
		this.first = first
		this.last = last
	}
	
	public String toString(){
		"Person: $first $last"
	}
}
```
3. Ejecuto el comando `groovyc Person.groovy`.
4. Y observamos el contenido de la carpeta con el comando `ls`,
nos va a aparecer un archivo nuevo llamado **Person.class**.
5. Si repeite el comando `groovyc *.groovy`, hace el proceso por 
cada archivo de extensión **.groovy** en la carpeta.
6. Borremos todos los archivos de extensión **.class**.
7. Crear el directorio "classes" y luego ejecutar el comando:
```bash
groovyc -d classes *.groovy
```
Revisemos el contenido de la carpeta "classes" y allí estarán 
los archivos de extensión **.class**.

8. Borremos la carpeta "classes"(`rm -r classes`).
9. Creamos el archivo **Application.groovy**:
```groovy
Person p = new Person("Dan","Vega")
println p
```
10. Compilamos todas loar archivos **.groovy**, con el comando
`groovyc *.groovy`.
11. Corremos el nuevo **Application**, con el comando : 
`groovy Application` y la repuesta será:
```bash
Person: Dan Vega
```
12. Hay una manera larga de ejecutar lo mismo, usando `java` y este
sería el comando:
```bash
java -cp "$HOME\.sdkman\candidates\groovy\current\embeddable\groovy-all-2.4.5.jar": Application
```
Pero se debe ther dicho archivo **groovy-all-2.4.5.jar** instalado.

## Paso 14. Groovy Console
> [!NOTE]  
> Acá el sitio con la explicación y la ruta donde quedó instalado 
>[groovyConsole - the Groovy Swing console](https://groovy-lang.org/groovyconsole.html)
1. Ejecuta el comando `groovyConsole` y te aparece una nueva
ventana.
2. Puedo añadir varios comando y luego seklecciono en el menú
"Script" -> "Run":  
![goovyConsole](images/section02-step_14-groovyConsole.PNG)


## Paso 15. Hello, IntelliJ
>[!NOTE]  
> Del sitio [IntelliJ IDEA](https://www.jetbrains.com/idea/download/?section=windows)
>Instlar la versión **Community Edition**
>![Community Edition](images/section02-step_15-CommunityVersion.PNG)

1. Selecciona "New Project"
2. Seleccionamos "Groovy" de la lista de la derecha
3. Seleccione la version de java que tengo instalada por el 
`sdkman` (Que fue con este comando: `sdk install java 8.0.412-tem`).
La ruta la puede buscar con:  
`$SDKMAN_CANDIDATES_DIR/java/current/bin`.
3. Seleccionamos la version de groovy tmabién instalada con 
`sdkman` (Que fue con este comando: `sdk install groovy 4.0.16`).
La ruta a mbuscar es:  
`$SDKMAN_CANDIDATES_DIR/groovy/current/bin`.
4. La ruta es donde tengo de forma local este reporosiorio
(`.../groovy/apache-groovy`).
5. El nombre del proyecto sera **HelloWorld**
6. Y se abre el contenido en el programa `IntelliJ`, con una estructura similiar a esta:  
![Project Intellij](images/section02-step_15-Project-Intellij.PNG).
7. En la carpeta "src" damos click derecho y seleccionamos 
"New"->"Package" y de nombre **com.section02**
8. Damos click derecho en la carpeta "com.section02" y seleccionamos
"New"->"Groovy Script" y de nombre "hello".

>[!TIP]  
>Si pregunta por hacer algo relacionado con el **Git**, le decimos q
>que NO, que no pregunte de nuevo, pues nos encargaremos de forma
>manual.

9. Añadimos este texto `println "Hello, world"`

Así va el proyecto hasta el momento:  
![Hello World](images/section02-step_15-Project-Intellij2.PNG).

10. Podemos ejecutar de varias formas, la mas simple en el menú 
superior, selccionamos "Run"->"Run hello.groovy".

![Running Hello World](images/section02-step_15-Project-Intellij3.PNG).

11. Si abrimos el archivo **hello.class** en la ruta
"HelloWorld/out/production/HelloWorld/com/section02", el editor
lo "decompila" y podemos ver su contenido.

## Paso 16. [Exercise] 3 ways to Hello Groovy

>[!NOTE]  
> ## [Exercise] 3 ways to Hello Groovy
>In this exercise, you going to take what you learned in this section and write your own Hello World script. Instead of just writing a single script I want you to use what you have learned and write it 3 different ways.
>
> * Using a text editor, compile and run
> * Using Groovy Console
> * IntelliJ
>
>Good Luck!

## Paso 17. [Exercise Review] 3 ways to Hello, Groovy
### Usando un Editor, compliando y corriendo 
1. Crea un arhico llamado **HelloWorld_.groovy**,
2. Poner esto en el codigo `println "Hello, world"`
3. Grabar y salir del editor.
4. En una `TERMINAL` cualquiera el comando es 
`groovyc HelloWorld_.groovy`, esto va a generar el archivo
**HelloWorld_.class**.
5. Solo basta correr el comando `groovy HelloWorld_` y listo.
>[!TIP]  
>Lo del guión bajo (`_`), es para q no lo confunda con el 
>directorio.

### Usando la consola de Groovy
1. en una `TERMINAL` cualquiera escribe el comando:
```bash
groovyConsole HelloWorld_.groovy
```
![groovyConsole](images/section02-step_17-groovyConsole.png)
2. Click en el botón de "Execute Groovy Script" y ver el resultado.

### "Intellij"
>[!NOTE]  
>Eso ya lo vimos en el paso 15.
1. Crear un Proyecto nuevo "New Project".
2. Seleccionamos "Groovy" a la izquierda 
3. Verificamos la versión de Java a 1.8 y la de Groovy a 4.x
![New Project](images/section02-step_17-intellij1.PNG)
3. El nombre sería `HelloIntellij`.
4. En la carpeta "src" creamos un "Groovy Script" con el nombre 
**HelloWorld**
5. Poner esto en el codigo `println "Hello, world"`.
6. Ejecutar simplemente este código y ver el resultado.

### Uno mas: usando "Visual Studio Code"
1. Se instala la extensión en "Visual Studio Code" llamada
"Code Runner" de *Jun Han*.
2. Para la prueba borremos el archivo **HelloWorld_.class**.
3. Abrimos el archivo **HelloWorld_.groovy** y en la parte superior
derecha del archivo presionamos al trángulo a aparece a modo de 
"play" ⏯️ .
4. El resultado aprece abajo en `OUTPUT`.
