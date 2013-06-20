public class PreguntasRepuestas {
	
	
 String []preguntas (){
	
	String pregunta[]= new String [57];
	//al preguntar solo se pude reponder con falso o verdadero
	 pregunta [0]="cada declaracion que  comienza con la palabra \"public\" debe almacenarse en un archivo que tenga el mismo nombre que la clase y que termine con la extension de arhcivo .java?";// cierto
	 pregunta [1]="la palabra public  es un modificador de acceso";//ciertoo
	 pregunta [2]="toda declaracion de clase contiene la palabra clave \"class\", seguida de inmediato por el nombre de la clase";//cierto
	 pregunta [3]=" main es un método especial, que siempre es llamado, automáticamente , por la Máquina virtual de java (JvM) a la hora de ejecutar un programa";//cierto
	 pregunta [4]="todos los métodos se llaman de forma automática";//false
	 pregunta [5]="el tipo de valor \" void\" indica que este método realizara una tarea pero no devolverá , es decir , no regresa la información al método que lo llamo";//cieeto
	 pregunta [6]="obligatoriamente los nombres de los métodos comienzan con una letra minúscula y el resto de las letras en el nombre con mayúsculas";//falso
	 pregunta [7]="un conjunto vacío de paréntesis después del nombre del método , indica que este método no requiere información adicional para realizar su tarea";//cier
	 pregunta [8]="el método main empieza la ejecución de todas las aplicaciones";//cierto
	 pregunta [9]="si una clase no contiene main es una aplicación";//falso
	 pregunta [10]="un método static es especial , ya que puede llamarse sin tener que crear primero un objeto de la clase en la cual se declara ese método";//cierto
	 pregunta [11]="cada nueva  clase que creamos se convierte en un nuevo \"tipo \", que puede usarse para declarar variables y crear objetos";//ceirtoo
	 pregunta [12]="el programador puede declarar nuevos tipos de clases según lo necesite; ésta es una razón por la cual Java se conoce como un lenguaje extensible";//cier
	 pregunta [13]="el asterisco(*) en *.java indica que debe compilarse todos los archivos del directorio actual que termine con la extensión de nombre del archivo .java";//ciertoo
	 pregunta [14]="el signo más(+) que va antes del nombre de la operación indica que esta es publica, es decir un método public en java";//ciertoo
	 pregunta [15]="a la información adicional de un método se le conoce como parámetro";
	 pregunta [16]="cada parámetro debe de especificar un tipo y un nombre de variable";
	 pregunta [17]="la llamada a un método proporciona valores (llamados argumentos) para cada uno de los parámetros de ese método";//
	 pregunta [18]="el número de argumentos en la llamada a un método debe coincidir con el de los parámetro en la lista de parámetros de la declaración del método";//
	 pregunta [19]="las clases en el mismo paquete se importan implícitamente en los archivos de condigo fuente de las otras clases en el mismo paquete";//
	 pregunta [20]="las variables que se declaran en el cuerpo de un método especifico se conocen como variables locales";//
	 pregunta [21]="las variables locales se pueden usar en cualquier otro método";//false
	 pregunta [22]="cuando se termina un método , se pierden los valores de sus variables locales";//
	 pregunta [23]="los atributos como variables en la declaración de la clase se llaman campos y se declaran dentro de la declaración de una clase y fuera de los cuerpos de la declaración de los métodos";//
	 pregunta [24]="cuando cada objeto de una clase mantiene su propia copia de un atributo, el campo que representa a ese atributo se le conoce como -variable instancia";//
	 pregunta [25]="las variables o los métodos declarados con el modificador de acceso private son accesibles solo para los métodos de la clases en la que se declaran";//
	 pregunta [26]="el proceso de declarar variables de instancia con el modificador de acceso private se conoce como ocultamiento de datos, u ocultamiento de información";//
	 pregunta [27]="un método de una clase puede llamar a otro método de la misma clase con solo usar su nombre-";//
	 pregunta [28]="cada campo tiene una valor inicial predeterminado; un valor que java proporciona cuando el programador no especifica el valor inicla del campo";//
	 pregunta [29]="el valor predeterminado para un campo de tipo string es null";//
	 pregunta [30]="los campos private de una clase pueden manipularse solo mediante los métodos de esa clase";//
	 pregunta [31]="un \"cliente de un objeto \"  es cualquier clase que llame a los métodos del objeto";//
	 pregunta [32]="los tipos de datos en java se dividen en dos categorías: Tipos primitivos y tipos por referencia";//
	 pregunta [33]="los tipos primitivos son boolean, byte, char, short, int ,long, float y double";//
	 pregunta [34]="Todos los tipos no primitivos son tipos por referencia";////
	 pregunta [35]="las clases que especifican los tipos de objetos, son tipos por referencia";//
	 pregunta [36]="las variables locales no se inicializan de manera predeterminada";//
	 pregunta [37]="Las variables de instancia de tipos por referencia se inicializan de manera predeterminada con el valor null";//
	 pregunta [38]="null es una palabra reservada que representa una \"referencia a nada\"";//
	 pregunta [39]="una diferencia entre los constructores y los métodos es que los constructores no pueden devolver valores";//
	 pregunta [40]="si un programador declara uno o más constructores para una clase, el compilador java no creara un constructor predeterminado para esa clase";//
	 pregunta [41]="Java cuenta con dos tipos de datos primitivos para almacenar números de punto flotante en la memoria: float y double";//
	 pregunta [42]="las variables tipo float pueden almacenar números con mayor longitud y detalle que los tipo double";//false
	 pregunta [43]="las variables tipos float representan números de precisión simple";//
	 pregunta [44]="las variables tipo double representan números de punto flotante de precisión doble";//
	 pregunta [45]="las variables tipo float pueden representar hasta siete dígitos significativos";//falsoverdad
	 pregunta [46]="el método showMessageDialog de la clase JOptionPane es lo que llamamos método static";//
	 pregunta [47]="el dialogo de entrada permite al usuario introducir datos en un programa";//
	 pregunta [48]="puede usarse UML pra crear diagramas de clases que modelen los constructores, métodos y atributos de clases";//
	 pregunta [49]="el cuerpo de todos los métodos está delimitado por las llaves izquierda y derecha ({})";//
	 pregunta [50]="un método especifica varios parámetros en una lista separada por comas";//
	 pregunta [51]="cuando cada objeto de una clase mantiene su propia copia de un atributo , al campo correspondiente se le conoce como variable instancia";//
	 pregunta [52]="en UMl los atributos privados van precedidos por un signo mas(+)";//false
	 pregunta [53]="null es una variable de tipo primitivo";//false
	 pregunta [54]="las variables locales pueden usarse directamente entre diferentes clases conservado su valor";//false
	 pregunta [55]="en java los \\ sirven para hacer comentarios acerca del programa";//false
	 pregunta [56]="Para utilizar dos clases , no es necesario que estas esten en la misma carpeta fuente , ni tampoco importarlas";//false
	
	return pregunta;
	
}
        boolean	[]repuesta (){
	
	boolean repuesta[]= new boolean [57];
	repuesta [0]=true;
	repuesta [1]=true;
	repuesta [2]=true;
	repuesta [3]=true;
	repuesta [4]=false;
	repuesta [5]=true;
	repuesta [6]=false;
	repuesta [7]=true;
	repuesta [8]=true;
	repuesta [9]=false;
	repuesta [10]=true;
	repuesta [11]=true;
	repuesta [12]=true;
	repuesta [13]=true;
	repuesta [14]=true;
	repuesta [15]=true;
	repuesta [16]=true;
	repuesta [17]=true;
	repuesta [18]=true;
	repuesta [19]=true;
	repuesta [20]=true;
	repuesta [21]=false;
	repuesta [22]=true;
	repuesta [23]=true;
	repuesta [24]=true;
	repuesta [25]=true;
	repuesta [26]=true;
	repuesta [27]=true;
	repuesta [28]=true;
	repuesta [29]=true;
	repuesta [30]=true;
	repuesta [31]=true;
	repuesta [32]=true;
	repuesta [33]=true;
	repuesta [34]=true;
	repuesta [35]=true;
	repuesta [36]=true;
	repuesta [37]=true;
	repuesta [38]=true;
	repuesta [39]=true;
	repuesta [40]=true;
	repuesta [41]=true;
	repuesta [42]=false;
	repuesta [43]=true;
	repuesta [44]=true;
	repuesta [45]=true;
	repuesta [46]=true;
	repuesta [47]=true;
	repuesta [48]=true;
	repuesta [49]=true;
	repuesta [50]=true;
	repuesta [51]=true;
	repuesta [52]=false;
	repuesta [53]=false;
	repuesta [55]=false;
	repuesta [55]=false;
	repuesta [56]=false;
return repuesta;		
}


}


