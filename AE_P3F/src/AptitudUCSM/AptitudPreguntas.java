package AptitudUCSM;
import java.util.Scanner;

public class AptitudPreguntas {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    int puntajeGenerales = 0;
	    int puntajeSociales = 0;
	    int puntajeJuridicasEmpresariales = 0;
	    int puntajeCienciasIngenierias = 0;
	    int puntajeSalud = 0;
	    String respuesta;
	    String respuestaF;
	    String continuar;
	    String respuestaF2;
	    
	    /*Preguntas generales*/
	    
	    /*Preguntas generales Sociales*/
	    
	    System.out.println("�Estar�as de acuerdo en trabajar en una revista de econom�a escribiendo art�culos?");
	    System.out.println("a)Preferir�a no tener que hacerlo\nb)Si, me gustar�a\nc)Seria un trabajo muy gratificante");
	    
	    
	    
	    respuesta=input.nextLine();
	    
	    if(respuesta.equals("c"))
	    {
	    	puntajeGenerales=puntajeGenerales+2;
	    		
	    }
	    if(respuesta.equals("b"))
	    {
	    	puntajeGenerales=puntajeGenerales+1;
	    		
	    }
	    if (puntajeGenerales>=1)
	    {
	    	puntajeSociales++;
	    }
	    puntajeGenerales=0;
	    
	    /*Preguntas generales Juridicas y Empresariales*/
	    
	    System.out.println("A parte de los libros que te mandan en la escuela �con qu� frecuencia lees?");
	    System.out.println("a)Nunca\nb)De vez en caunado\nc)Siempre que tengo ocaci�n");
	   
	    
	    respuesta=input.nextLine();
	    
	    if(respuesta.equals("c"))
	    {
	    	puntajeGenerales=puntajeGenerales+2;
	    		
	    }
	    if(respuesta.equals("b"))
	    {
	    	puntajeGenerales=puntajeGenerales+1;
	    		
	    }
	    if (puntajeGenerales>=1)
	    {
	    	puntajeJuridicasEmpresariales++;
	    }
	    puntajeGenerales=0;
	    
	    /*Preguntas generales Ciencias e Ingenier�as*/
	    
	    /*Pregunta 1*/
	    System.out.println("Tu nota media de matem�ticas en la preparatoria fue de:");
	    System.out.println("a)Entre 5 a 10\nb)Entre 11 a 15\nc)Entre 16 a 20");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeCienciasIngenierias++;}
	    puntajeGenerales=0;

	    /*Pregunta 2*/
	    System.out.println("Del 1 al 10 �con qu� soltura te desenvuelves con la computadora?");
	    System.out.println("a)Del 0 al 5\nb)Del 5 al 7\nc)Del 7 al 10");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeCienciasIngenierias++;}
	    puntajeGenerales=0;

	    /*Pregunta 3*/
	    System.out.println("�Eres h�bilidoso haciendo operaciones matem�ticas?");
	    System.out.println("a)No, otras cosas se me dan mejor\nb)Si, no me resulta complicado\nc)S�, se me da de maravilla");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+1;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeCienciasIngenierias++;}
	    puntajeGenerales=0;

	    /*Pregunta 4*/
	    System.out.println("�Te interesa saber c�mo funcionan aparatos que usas a diario como el celular, la televisi�n o la computadora?");
	    System.out.println("a)Nada\nb)Algo\nc)Mucho");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeCienciasIngenierias++;}
	    puntajeGenerales=0;

	    /*Pregunta 5*/
	    System.out.println("En general �te gusta resolver problemas matem�ticos?");
	    System.out.println("a)Nada\nb)Algo\nc)Mucho");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeCienciasIngenierias++;}
	    puntajeGenerales=0;
	    
	    
	    /*Preguntas generales Ciencias de la Salud*/
	    
	    /*Pregunta 1*/
	    System.out.println("Si te hacen una extracci�n de sangre:");
	    System.out.println("a)Me mareo tan solo ver la aguja\nb)Me siento tranquilo\nc)Converso con la enfermera");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+1;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeSalud++;}
	    puntajeGenerales=0;

	    /*Pregunta 2*/
	    System.out.println("Las t�cnicas de primeros auxilios�");
	    System.out.println("a)�No tengo pensado aprenderlas\nb)�.me parecen importantes\nc)�las conozco a la perfecci�n");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+1;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeSalud++;}
	    puntajeGenerales=0;

	    /*Pregunta 3*/
	    System.out.println("�Qu� haces si sientes alguna dolencia?");
	    System.out.println("a)Lo ignoro a menos q permanezca de forma prolongada\nb)Voy al doctor en un plazo razonable\nc)Busco informacion en internet, consulto alg�n conocido, voy al doctor");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+1;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+2;}
	    if (puntajeGenerales>=1){puntajeSalud++;}
	    puntajeGenerales=0;

	    /*Pregunta 4*/
	    System.out.println("�Qu� haces cuando est�s enfermo y te mandan tomar un medicamento?");
	    System.out.println("a)Sencillamente lo tomo\nb)Miro que contraindicaciones puede tener\nc)Leo el prospecto de arriba a abajo");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("a")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=2){puntajeSalud++;}
	    puntajeGenerales=0;

	    /*Pregunta 5*/
	    System.out.println("Los articulos de divulgaci�n cient�fica te parece?");
	    System.out.println("a)Aburridos\nb)Entretenidos\nc)Muy interesantes");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeSalud++;}
	    puntajeGenerales=0;
	    
	    /*Pregunta 6*/
	    System.out.println("En general , has obtenido buenas clasificaciones en actividades de laboratorio?");
	    System.out.println("a)Regulares\nb)Buenas\nc)Muy buenas");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("a")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=2){puntajeSalud++;}
	    puntajeGenerales=0;
	    
	    /*Pregunta 7*/
	    System.out.println("Tu nota media de biolog�a en la preparatoria fue de");
	    System.out.println("a)5 a 10\nb)11 a 15\nc)16 a 20");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeSalud++;}
	    puntajeGenerales=0;
	    
	    
	    
	    
	    System.out.println("----------------------------------------------------------------"); 
	    System.out.println("El resultado del test indica que:");
	    if(puntajeSociales>=1) {
	    	System.out.println("Tienes afinidad con Ciencias Sociales");}
	    if(puntajeJuridicasEmpresariales>=1) {
	    	System.out.println("Tienes afinidad con Ciencias Juridicas y Empresariales");}
	    if(puntajeCienciasIngenierias>=4) {
	    	System.out.println("Tienes afinidad con Ciencias e Ingenier�as");}
	    if(puntajeSalud>=5) {
	    	System.out.println("Tienes afinidad con Ciencias de la Salud");}
	    else{
	    	System.out.println("Al menos tienes salud :)");}
	    
	    puntajeSociales = 0;
	    puntajeJuridicasEmpresariales = 0;
	    puntajeCienciasIngenierias = 0;
	    puntajeSalud = 0;
	    
	    System.out.println("----------------------------------------------------------------");
	    System.out.println("Deseas continuar con el test? (s/n))");
	    continuar=input.nextLine();
	    
	    
	    if(continuar.equals("s")) {
	    	System.out.println("Elige la facultad:\na)Ciencias Sociales\nb)Ciencias Juridicas y empresariales\nc)Ciencias e Ingenierias\nd)Ciencias de la Salud");
		    respuestaF=input.nextLine();
		    
		    /*Preguntas Ciencias Sociales*/
		    if (respuestaF.equals("a")) {
		    	System.out.println("----------------------------------------------------------------");
		    	System.out.println("Preguntas de Ciencias Sociales");
		    	System.out.println("PREGUNTAS PARA EDUCACI�N Y COMUNICACI�N SOCIAL");
		    	
				    /*Pregunta 1*/
				    System.out.println("Cuando un amigo no entiende algo�");
				    System.out.println("a)Ignoro su problema\nb)Le explico las cosas por encima\nc)Le ayudo hasta que lo comprende por completo");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
			    
				    /*Pregunta 2*/
				    System.out.println("Cuando tienes que explicar algo a otra persona");
				    System.out.println("a)� me  desespero si no me entiende a la primera\nb)� trato de ser claro\nc)� se lo explico con calma las veces que hace falta");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
				    System.out.println("----------------------------------------------------------------");
				    System.out.println("Las carreras recomendadas son:\n-a)Educaci�n Inicial\n-b)Educaci�n Primaria\nc)Educaci�n Secundaria\n-d)Comunicaci�n Social");
				    
				    /*Pregunta 3*/
				    System.out.println("�Trabajarias en tus ratos libres como profesor particular?");
				    System.out.println("a)Bajo ning�n concepto\nb)Lo har�a en caso necesitara el dinero\nc)Sin ninguna duda");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSociales>=2) {System.out.println("Las carreras recomendadas son:\n-a)Educaci�n Inicial\n-b)Educaci�n Primaria\nc)Educaci�n Secundaria");}
				    
				
				    /*Preguntas Psicolog�a*/
		    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA PSICOLOGIA");
		    	puntajeSociales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Tratas de entender el comportamiento de tus amigos cuando surge un problema?");
				    System.out.println("a)Es algo que no me preocupa\nb)Muestro cierta empat�a\nc)Intento profundizar todo lo posible en el asunto");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
			    
				    /*Pregunta 2*/
				    System.out.println("Cuando te tratan de hablar de un tema personal pero se va por las ramas tu:");
				    System.out.println("a)Lo escucho atentamente\nb)Le digo que no me interesa\nc)Le digo que ordene sus ideas y me lo cuente de nuevo");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("a")) {puntajeSociales++;}
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSociales>=2) {System.out.println("La carrera recomendada es: Psicolog�a");}
			
				    /*Preguntas de Publicidad y multimedia*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PUBLICIDAD MULTIMEDIA");
		    	puntajeSociales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Cuando ves una publicidad en cualquier medio que observas?");
				    System.out.println("a)El producto que venden\nb)El como venden el producto\nc)Paso la publicidad");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("b")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("a")) {puntajeSociales++;}
			    
				    /*Pregunta 2*/
				    System.out.println("Cuando un producto es vendido es por que:");
				    System.out.println("a)No es de buena calidad\nb)No genera necesidad\nc)No sirve");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("a")) {puntajeSociales++;}
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSociales>=2) {System.out.println("La carrera recomendada es: Publicidad y Multimedia");}
				    System.out.println("Como alternativas existen las siguientes: "
				    		+ "Carreras cortas de 3 meses"
				    		+ "-Marketing Digital"
				    		+ "-Dise�o Digital"
				    		+ "Carreras cortas de 6 meses"
				    		+ "-Animaci�n 3D"
				    		+ "-Dise�o Gr�fico"
				    		+ "Carreras cortas de 3 meses"
				    		+ "-Gesti�n Estrat�gica de Medios Publicitarios"
				    		+ "-E-commerce"
				    		+ "-Traducci�n Audiovisual"
				    		+ "CARRERAS CORTAS DE 6 MESES"
				    		+ "-Dise�o y Gesti�n de Eventos"
				    		+ "CARRERAS CORTAS DE 1 A�O"
				    		+ "-Fotograf�a Integral"
				    		+ "-Dise�o gr�fico publicitario"
				    		+ "CARRERAS CORTAS DE 3 ANOS:"
				    		+ "Comunicaci�n Audiovisual ");
				    
				    /*Preguntas teolog�a*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA TEOLOGIA");
		    	puntajeSociales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Te gustar�a salir a ayudar a los mas necesitados mientras predicas la palabra de Dios?");
				    System.out.println("a)Si me gustar�a pero no soy creyente\nb)Me encantaria\nc)No me interesa");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("b")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("a")) {puntajeSociales++;}
				    if(puntajeSociales>=2) {System.out.println("La carrera recomendada es: Teolog�a");}
				    
				    /*Preguntas trabajo social*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS DE TRABAJO SOCIAL");
		    	puntajeSociales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Perteneces a alguna asociaci�n de ayuda social?");
				    System.out.println("a)No entra en mis planes\nb)Es algo que quiero hacer mas adelante\nc)Ya participo activamente en una");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
				    if(puntajeSociales>=2) {System.out.println("La carrera recomendada es: Trabajo Social");}
				    
				    
				    /*Preguntas de turismo y hoteler�a*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS DE TURISMO Y HOTELERIA");
		    	puntajeSociales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Te gustar�a estudiar en profundidad un idioma?");
				    System.out.println("a)-	Me resulta aburrido\nb)-	Es algo que tengo planeado en el futuro\nc)Ya estoy haciendolo");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
			    
				    /*Pregunta 2*/
				    System.out.println("2.	�Tienes facilidad para el aprendizaje de idiomas?");
				    System.out.println("a)Me resulta dif�cil\nb)Se me da bien\nc)Me encanta aprender un nuevo idioma");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("a")) {puntajeSociales++;}
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSociales>=2) {System.out.println("La carrera recomendada es: Turismo y hoteler�a");}
				    System.out.println("Como alternativas existen las siguientes: "
				    		+"Carreras cortas de 6 meses"
				    		+"-Counter Profesional"
				    		+"-Auxiliar en Despacho aduanero"
				    		+"Carreras cortas de 3 a�os:"
				    		+"-Hoteler�a"
				    		);
		    };
		    
		    /*Preguntas Juridicas empresariales*/
		    if (respuestaF.equals("b")) {
		    	System.out.println("----------------------------------------------------------------");
		    	System.out.println("Preguntas de Juridicas empresariales");
				    /*Preguntas administracion de empresas*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA ADMINISTRACI�N DE EMPRESAS");
				puntajeJuridicasEmpresariales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Cuando quieres comprarte algo:");
				    System.out.println("a)Pido todo el dinero a mis padres\nb)Pido una parte del dinero a mis padres\nc)-	Ahorro y los compro cuando haya reunido todo el dinero");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeJuridicasEmpresariales=puntajeJuridicasEmpresariales+2;}
				    if(respuestaF2.equals("b")) {puntajeJuridicasEmpresariales++;}
				    if(puntajeJuridicasEmpresariales>=2) {System.out.println("Las carreras recomendadas son: Administraci�n de empresas e Ingenieria comercial");}
				    
				    /*Preguntas ciencia politica y gobierno*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA PSICOLOGIA");
				puntajeJuridicasEmpresariales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Como te sientes cuando hablas en publico?");
				    System.out.println("a)Incomodo\nb)No tengo ningun inconveniente en hacerlo con frecuencia\nc)-	Me encanta ser el centro de atencion");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("b")) {puntajeJuridicasEmpresariales=puntajeJuridicasEmpresariales+2;}
				    if(respuestaF2.equals("c")) {puntajeJuridicasEmpresariales++;}
				    if(puntajeJuridicasEmpresariales>=2) {System.out.println("La carrera recomendada es: Ciencia Pol�tica y Gobierno");}
				    
				    
				    
				    /*Preguntas de contabilidad e ingenier�a comercial*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA CONTABILIDAD E INGENIERIA COMERCIAL");
				puntajeJuridicasEmpresariales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("�Te gustar�a trabajar en un banco, casa de cambio y/o consultor�a?");
				    System.out.println("a)Poco, prefiero encontrar otro trabajo\nb)Me resulta una opci�n interesante\nc)S�, me encantar�a trabajar en un lugar as�");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeJuridicasEmpresariales=puntajeJuridicasEmpresariales+2;}
				    if(respuestaF2.equals("b")) {puntajeJuridicasEmpresariales++;}
			    
				    /*Pregunta 2*/
				    System.out.println("�Eres responsable, tolerante y disfrutas de investigar y hablar de finanzas?");
				    System.out.println("a)Poco\nb)Algo\nc)Mucho");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeJuridicasEmpresariales=puntajeJuridicasEmpresariales+2;}
				    if(respuestaF2.equals("b")) {puntajeJuridicasEmpresariales++;}
				    
				    /*Pregunta 3*/
				    System.out.println("Cuando te piden ser el lider durante un trabajo en el colegio tu :");
				    System.out.println("a)Le dices a cada uno que hacer y esperas el resultado final\nb)-	Le dices a cada uno que hacer pero miras si cumple con la tarea\nc)Le dices a cada uno que hacer y analizas si el trabajo va quedando bien");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeJuridicasEmpresariales=puntajeJuridicasEmpresariales+2;}
				    if(respuestaF2.equals("b")) {puntajeJuridicasEmpresariales++;}
				    
				    /*Pregunta 4*/
				    System.out.println("Cuando haces una fiesta en tu casa primero:");
				    System.out.println("a)Haces la lista de invitados\nb)Invitas a cualquiera sin pensar\nc)Creas una lista de los costos que se generan");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeJuridicasEmpresariales=puntajeJuridicasEmpresariales+2;}
				    if(respuestaF2.equals("a")) {puntajeJuridicasEmpresariales++;}
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeJuridicasEmpresariales>=2) {System.out.println("LaS carreraS recomendadaS son: contabilidad e ingenier�a comercial\nComo otras opciones se puede considerar CARRERAS DE 3 MESES\r\n"
				    		+ "-Administraci�n de Empresas\r\n"
				    		+ "-E-commerce\r\n"
				    		+ "Carreras cortas de 6 meses\r\n"
				    		+ "-Gesti�n Estrat�gica de Venta\r\n"
				    		+ "-Administraci�n\r\n"
				    		+ "-Cajero Bancario\r\n"
				    		+ "Carreras cortas de 1 A�O\r\n"
				    		+ "-Contabilidad y Gesti�n Financiera\r\n"
				    		+ "-Administraci�n de Empresas\r\n"
				    		+ "Carreras cortas de 3 A�os:\r\n"
				    		+ "-Gesti�n de Recursos Humanos\r\n"
				    		+ "-Contabilidad, especializaci�n en Tributaci�n\r\n"
				    		+ "-Gesti�n Log�stica\r\n"
				    		+ "");}
			
				    /*Preguntas de derecho*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA DERECHO");
				puntajeJuridicasEmpresariales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Cuando alguien dice una opini�n diferente a la tuya decides:");
				    System.out.println("a)Exponer y debatir mis ideas\nb)No aceptar ni tolerar ninguna idea diferente a la mia\nc)Trato de evitar cualquier conversaci�n con esa persona");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("a")) {puntajeJuridicasEmpresariales=puntajeJuridicasEmpresariales+2;}
				    if(respuestaF2.equals("c")) {puntajeJuridicasEmpresariales++;}
			    
				    /*Pregunta 2*/
				    System.out.println("2.	Defiendes las causas que ves justas?");
				    System.out.println("a)-	Defiendo toda causa que veo que sea buena\nb)-	No hago nada y solo espero a ver el resultado final");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("a")) {puntajeJuridicasEmpresariales=puntajeJuridicasEmpresariales+2;}
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeJuridicasEmpresariales>=2) {System.out.println("La carrera recomendada es: Derecho");}
		    };
		    
		    /*Preguntas Ciencias e Ingenierias*/
		    if (respuestaF.equals("c")) {
		    	System.out.println("----------------------------------------------------------------");
		    	System.out.println("Preguntas de Ciencias e Ingenierias");
		    
				    /*Preguntas de arquitectura*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA Arquitectura");
				puntajeCienciasIngenierias=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("�Te resulta f�cil dibujar objetos de forma abstracta?");
				    System.out.println("a)No\nb)Normalmente si\nc)Si bastante");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
			    
				    /*Pregunta 2*/
				    System.out.println("�Eres habilidoso con programas inform�ticos de dise�o?");
				    System.out.println("a)No\\nb)Normalmente si\\nc)Si bastante");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("a")) {puntajeCienciasIngenierias++;}
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("La carrera recomendada es: Arquitectura");}
			
				    /*Preguntas de agron�mica y agricola*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA AGRONOMICA Y AGRICOLA");
				puntajeCienciasIngenierias=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Te gusta la vida rural?");
				    System.out.println("a)No, deseo vivir siempre en la ciudad\nb)No me importa pasar algunas temporadas en el campo\nc)Es un estilo de vida que me encanta");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
			    
				    /*Pregunta 2*/
				    System.out.println("Si tuvieras que cuidar de una planta tu:");
				    System.out.println("a)No me gustan las plantas\nb)Le daria agua y luz\nc)Buscaria informacion de la planta");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("a")) {puntajeCienciasIngenierias++;}
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("La carrera recomendada es: Ingenier�a Agron�mica y Agr�cola");}
			
				    /*Preguntas de agronomica agricola y ambiental*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA AGRONOMICA AGRICOLA, AMBIENTAL");
				puntajeCienciasIngenierias=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("�Valoras el medio ambiente y fomentas su cuidado?");
				    System.out.println("a)Poco\nb)Mucho\nc)Bastante");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("Las carreras recomendadas son: -Ingenier�a Agron�mica y Agr�cola\r\n"
				    		+ "-Ingenier�a Ambiental\r\n"
				    		+ "Como otras opciones existen:\nCarreras cortas de 6 meses\r\n"
				    		+ "-Agronegocios\r\n"
				    		+ "");}
			
				    /*Preguntas de civil*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTA PARA CIVIL");
				puntajeCienciasIngenierias=0;
		    	
				    
				    /*Pregunta 1*/
				    System.out.println("1.	�Disfrutar�as de construir presas y obras subterr�neas?");
				    System.out.println("a)-	No, preferir�a trabajar en otros campos\nb)S�, ser�a una buena opci�n\nc)S�, me gustar�a mucho");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("a")) {puntajeCienciasIngenierias++;}
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("La carrera recomendada es: Ingenieria civil");}
			
				    /*Preguntas de minas*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTA PARA MINAS");
				puntajeCienciasIngenierias=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("�Te llama la atenci�n conocer la industria minera y participar en obras civiles?");
				    System.out.println("a)Poco\nb)Mucho\nc)Bastante");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("La carrera recomendada es: Ingenier�a de minas");}
			
				    
		
				    /*Preguntas de sistemas*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA SISTEMAS");
				puntajeCienciasIngenierias=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("�Tienes la habilidad de adaptarte a distintos lenguajes de programaci�n?");
				    System.out.println("a)-	No se me da muy bien\nb)Si\nc)Si, con mucha facilidad");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias++;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
			    
				    /*Pregunta 2*/
				    System.out.println("�Te resulta interesante conocer como las computadoras se comunican entre ellas?");
				    System.out.println("a)No, es algo aburrido\nb)Si, me resultar�a interesante\nc)�Si , me resultar�a fascinante!");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias++;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("La carrera recomendada es: Ingenier�a de Sistemas\n Como otra opcion se puede considerar:\nCarreras cortas de 1 a�o:\r\n"
				    		+ "-Dise�o y Desarrollo Web\r\n"
				    		+ "");}
			
				    /*Preguntas de mas de una carrera*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS mas de 1 carrera");
				puntajeCienciasIngenierias=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("�Prefieres trabajar con m�quinas o con personas?");
				    System.out.println("a)Con personas, siempre\nb)Me es indiferente, aunque utilizo con soltura las m�quinas\nc)Con m�quinas, siempre");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("Recomendaciones:\n-Ingenier�a Electr�nica\r\n"
				    		+ "-Ingenier�a Mec�nica El�ctrica\r\n"
				    		+ "-Ingenier�a Mecatr�nica\r\n"
				    		+ "-Ingenier�a Mec�nica\r\n"
				    		+ "CARRERA DE 3 MESES\r\n"
				    		+ "-Electricidad Industrial\r\n"
				    		+ "");}
			
				    /*Preguntas de electronica*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA ELECTRONICA");
				puntajeCienciasIngenierias=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("�Sientes inter�s por la electr�nica y los componentes de las m�quinas?");
				    System.out.println("a)Por lo general no\nb)Si, me gusta\nc)Es algo que me encanta");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("Recomendaciones:\n-Ingenier�a Electr�nica\r\n"
				    		+ "CARRERA DE 3 A�OS:\r\n"
				    		+ "-Electr�nica, Automatizaci�n y Control Industrial\r\n"
				    		+ "");}
			
				    /*Preguntas de mecanica*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA MECANICA");
				puntajeCienciasIngenierias=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("�Te gustar�a dise�ar maquinaria industrial?");
				    System.out.println("a)No\nb)Tal vez\nc)Si");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("Recomendaciones:\n-Ingenier�a Mec�nica\r\n"
				    		+ "CARRERAS CORTAS DE 1 A�O:\r\n"
				    		+ "-Mec�nica Industrial\r\n"
				    		+ "CARRERA DE 3 A�OS:\r\n"
				    		+ "-Mecatr�nica Automotriz\r\n"
				    		+ "");}
		    };
		    
		    /*Preguntas Salud*/
		    if (respuestaF.equals("d")) {
		    	System.out.println("----------------------------------------------------------------");
		    	System.out.println("Preguntas de Salud");
				    
				    
				    /*Preguntas de farmacia*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA Farmacia");
		    	puntajeSalud=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("�Te gustar�a dise�ar y producir f�rmacos de alta calidad?");
				    System.out.println("a)No, prefiero realizar otras tareas\nb)S�, es muy atractivo es trabajo\nc)S�, me encanta");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSalud=puntajeSalud+2;}
				    if(respuestaF2.equals("b")) {puntajeSalud++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSalud>=2) {System.out.println("Las carreras recomendadas son: Farmacia y bioquimica");}
			
				    /*Preguntas de enfermer�a*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA Enfermeria");
				puntajeSalud=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("�Preferir�as trabajar como enfermero/a en vez de como m�dico?");
				    System.out.println("a)No, prefiero ser m�dico\nb)No me importar�a desempe�ar es trabajo\nc)S�, me gustar�a ser enfermero");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSalud=puntajeSalud+2;}
				    if(respuestaF2.equals("b")) {puntajeSalud++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSalud>=2) {System.out.println("Recomendaciones\n-Enfermer�a\r\n"
				    		+ "Carreras cortas de 3 meses\r\n"
				    		+ "-Visitador M�dico\r\n"
				    		+ "CARRERA CORTA DE 3  A�OS:\r\n"
				    		+ "-Enfermer�a T�cnica\r\n"
				    		+ "");}
			
				    /*Preguntas de odontolog�a*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA Odontologia");
				puntajeSalud=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("1.	�Te interesa todo lo relacionado con la salud dental?");
				    System.out.println("a)No, prefiero otros campos de la medicina\nb)S�, me es interesante\nc)S�, esa rama me encanta");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSalud=puntajeSalud+2;}
				    if(respuestaF2.equals("b")) {puntajeSalud++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSalud>=2) {System.out.println("La carrera recomendada es: Odontologia");}
			
				    /*Preguntas de ingenieria biotecnologica*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA BIOTECNOLOGIA");
				puntajeSalud=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("1.	El funcionamiento de la c�lula te parece:");
				    System.out.println("Indeferente\nb)Interesante\nc)Fascinante");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSalud=puntajeSalud+2;}
				    if(respuestaF2.equals("b")) {puntajeSalud++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSalud>=2) {System.out.println("La carrera recomendada es: Ingenier�a biotecnologica");}
			
				    /*Preguntas de medicina humana*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA Medicina humana");
				puntajeSalud=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("�Te gustar�a realizar operaciones en el quir�fano?");
				    System.out.println("a)No, prefiero otro tipo de trabajo\nb)S�, ser�a un buen trabajo\nc)S�, me encantar�a");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSalud=puntajeSalud+2;}
				    if(respuestaF2.equals("b")) {puntajeSalud++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSalud>=2) {System.out.println("La carrera recomendada es: Medicina humana");}
			
				    /*Preguntas de obstetricia*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA obstetricia");
				puntajeSalud=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("�Te gustar�a ayudar a trare ni�os al mundo?");
				    System.out.println("a)Poco\nb)Banstante\nc)Mucho");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSalud=puntajeSalud+2;}
				    if(respuestaF2.equals("b")) {puntajeSalud++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSalud>=2) {System.out.println("La carrera recomendada es: Obstetricia y Puericultura");}
			
				    /*Preguntas de veterinaria*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA Veterinaria");
				puntajeSalud=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("El trato con animales");
				    System.out.println("a)me es indiferente\nb)me resulta interesante\nc)me encanta");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSalud=puntajeSalud+2;}
				    if(respuestaF2.equals("b")) {puntajeSalud++;}
			    
				    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSalud>=2) {System.out.println("Recomendaciones:\n-Medicina Veterinaria y Zootecnia\r\n"
				    		+ "CARRERAS CORTAS DE 3 A�OS:\r\n"
				    		+ "-Zootecnia\r\n"
				    		+ "");}
			
				    /*Preguntas de carreras tecnicas*/
				    /*arte dise�o y musica*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS RELACIONADAS CON EL ARTE, DISE�O, MUSICA");
		    	puntajeSociales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("�Te consideras una persona creativa e imaginativa?");
				    System.out.println("a)Poco\nb)Algo\nc)Mucho");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
			    
				    /*Pregunta 2*/
				    System.out.println("En comparaci�n con gente de tu edad, destacas en m�sica, creatividad u otra forma de arte");
				    System.out.println("a)Nada\nb)Algo\nc)Mucho");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
				    
				    /*Pregunta 3*/
				    System.out.println("�Con qu� frecuencia visitas una exposici�n art�stica?");
				    System.out.println("a)Nunca\nb)Cuando me parece interesante\nc)Siempre que tengo ocasi�n");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
				    
				    /*Pregunta 4*/
				    System.out.println("�Te gustar�a dise�ar y fabricar productos?");
				    System.out.println("a)No, para nada\nb)Ser�a un buen trabajo\nc)!Me encantar�a�");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
				    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSociales>=2) {System.out.println("Recomendaciones:\nCarreras cortas de 3 meses\r\n"
				    		+ "-Fotograf�a de Moda\r\n"
				    		+ "-Cocina Peruana Cl�sica y Vanguardista\r\n"
				    		+ "\r\n"
				    		+ "Carreras cortas de 6 meses\r\n"
				    		+ "\r\n"
				    		+ "-Dise�o de muebles\r\n"
				    		+ "\r\n"
				    		+ "Carreras cortas de 1 a�o\r\n"
				    		+ "-Interiorismo \r\n"
				    		+ "");}
			
				    /*Preguntas de cocina peruana*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA COCINA PERUANA");
		    	puntajeSociales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("En el momento de cocinar tu");
				    System.out.println("a)No me gusta\nb)Sigo la receta al pie de la letra\nc)Sigo la receta improvisando un poco");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
				    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSociales>=2) {System.out.println("La carrera recomendada es: Cocina Peruana");}
			
				    /*Preguntas de seguridad*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA Seguridad");
		    	puntajeSociales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Sigo la receta improvisando un poco");
				    System.out.println("a)Sales sin asegurarte de nada\nb)Te aseguras de cosas que te encuentras de paso a la salida\nc)Te aseguras de que todo este cerrado");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSociales>=2) {System.out.println("La carrera recomendada es: Prevenci�n de la Seguridad y Salud en el trabajo");}
			
				    
		    }
		    
	    }
	    
	    };

}
