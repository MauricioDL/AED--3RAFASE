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
	    
	    System.out.println("¿Estarías de acuerdo en trabajar en una revista de economía escribiendo artículos?");
	    System.out.println("a)Preferiría no tener que hacerlo\nb)Si, me gustaría\nc)Seria un trabajo muy gratificante");
	    
	    
	    
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
	    
	    System.out.println("A parte de los libros que te mandan en la escuela ¿con qué frecuencia lees?");
	    System.out.println("a)Nunca\nb)De vez en caunado\nc)Siempre que tengo ocación");
	   
	    
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
	    
	    /*Preguntas generales Ciencias e Ingenierías*/
	    
	    /*Pregunta 1*/
	    System.out.println("Tu nota media de matemáticas en la preparatoria fue de:");
	    System.out.println("a)Entre 5 a 10\nb)Entre 11 a 15\nc)Entre 16 a 20");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeCienciasIngenierias++;}
	    puntajeGenerales=0;

	    /*Pregunta 2*/
	    System.out.println("Del 1 al 10 ¿con qué soltura te desenvuelves con la computadora?");
	    System.out.println("a)Del 0 al 5\nb)Del 5 al 7\nc)Del 7 al 10");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeCienciasIngenierias++;}
	    puntajeGenerales=0;

	    /*Pregunta 3*/
	    System.out.println("¿Eres hábilidoso haciendo operaciones matemáticas?");
	    System.out.println("a)No, otras cosas se me dan mejor\nb)Si, no me resulta complicado\nc)Sí, se me da de maravilla");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+1;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeCienciasIngenierias++;}
	    puntajeGenerales=0;

	    /*Pregunta 4*/
	    System.out.println("¿Te interesa saber cómo funcionan aparatos que usas a diario como el celular, la televisión o la computadora?");
	    System.out.println("a)Nada\nb)Algo\nc)Mucho");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeCienciasIngenierias++;}
	    puntajeGenerales=0;

	    /*Pregunta 5*/
	    System.out.println("En general ¿te gusta resolver problemas matemáticos?");
	    System.out.println("a)Nada\nb)Algo\nc)Mucho");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeCienciasIngenierias++;}
	    puntajeGenerales=0;
	    
	    
	    /*Preguntas generales Ciencias de la Salud*/
	    
	    /*Pregunta 1*/
	    System.out.println("Si te hacen una extracción de sangre:");
	    System.out.println("a)Me mareo tan solo ver la aguja\nb)Me siento tranquilo\nc)Converso con la enfermera");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+1;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeSalud++;}
	    puntajeGenerales=0;

	    /*Pregunta 2*/
	    System.out.println("Las técnicas de primeros auxilios…");
	    System.out.println("a)…No tengo pensado aprenderlas\nb)….me parecen importantes\nc)…las conozco a la perfección");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+1;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=1){puntajeSalud++;}
	    puntajeGenerales=0;

	    /*Pregunta 3*/
	    System.out.println("¿Qué haces si sientes alguna dolencia?");
	    System.out.println("a)Lo ignoro a menos q permanezca de forma prolongada\nb)Voy al doctor en un plazo razonable\nc)Busco informacion en internet, consulto algún conocido, voy al doctor");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+1;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+2;}
	    if (puntajeGenerales>=1){puntajeSalud++;}
	    puntajeGenerales=0;

	    /*Pregunta 4*/
	    System.out.println("¿Qué haces cuando estás enfermo y te mandan tomar un medicamento?");
	    System.out.println("a)Sencillamente lo tomo\nb)Miro que contraindicaciones puede tener\nc)Leo el prospecto de arriba a abajo");
	    respuesta=input.nextLine();
	    if(respuesta.equals("c"))
	    {puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("b")){puntajeGenerales=puntajeGenerales+2;}
	    if(respuesta.equals("a")){puntajeGenerales=puntajeGenerales+1;}
	    if (puntajeGenerales>=2){puntajeSalud++;}
	    puntajeGenerales=0;

	    /*Pregunta 5*/
	    System.out.println("Los articulos de divulgación científica te parece?");
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
	    System.out.println("Tu nota media de biología en la preparatoria fue de");
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
	    	System.out.println("Tienes afinidad con Ciencias e Ingenierías");}
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
		    	System.out.println("PREGUNTAS PARA EDUCACIÓN Y COMUNICACIÓN SOCIAL");
		    	
				    /*Pregunta 1*/
				    System.out.println("Cuando un amigo no entiende algo…");
				    System.out.println("a)Ignoro su problema\nb)Le explico las cosas por encima\nc)Le ayudo hasta que lo comprende por completo");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
			    
				    /*Pregunta 2*/
				    System.out.println("Cuando tienes que explicar algo a otra persona");
				    System.out.println("a)… me  desespero si no me entiende a la primera\nb)… trato de ser claro\nc)… se lo explico con calma las veces que hace falta");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
				    System.out.println("----------------------------------------------------------------");
				    System.out.println("Las carreras recomendadas son:\n-a)Educación Inicial\n-b)Educación Primaria\nc)Educación Secundaria\n-d)Comunicación Social");
				    
				    /*Pregunta 3*/
				    System.out.println("¿Trabajarias en tus ratos libres como profesor particular?");
				    System.out.println("a)Bajo ningún concepto\nb)Lo haría en caso necesitara el dinero\nc)Sin ninguna duda");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSociales>=2) {System.out.println("Las carreras recomendadas son:\n-a)Educación Inicial\n-b)Educación Primaria\nc)Educación Secundaria");}
				    
				
				    /*Preguntas Psicología*/
		    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA PSICOLOGIA");
		    	puntajeSociales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Tratas de entender el comportamiento de tus amigos cuando surge un problema?");
				    System.out.println("a)Es algo que no me preocupa\nb)Muestro cierta empatía\nc)Intento profundizar todo lo posible en el asunto");
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
				    if(puntajeSociales>=2) {System.out.println("La carrera recomendada es: Psicología");}
			
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
				    		+ "-Diseño Digital"
				    		+ "Carreras cortas de 6 meses"
				    		+ "-Animación 3D"
				    		+ "-Diseño Gráfico"
				    		+ "Carreras cortas de 3 meses"
				    		+ "-Gestión Estratégica de Medios Publicitarios"
				    		+ "-E-commerce"
				    		+ "-Traducción Audiovisual"
				    		+ "CARRERAS CORTAS DE 6 MESES"
				    		+ "-Diseño y Gestión de Eventos"
				    		+ "CARRERAS CORTAS DE 1 AÑO"
				    		+ "-Fotografía Integral"
				    		+ "-Diseño gráfico publicitario"
				    		+ "CARRERAS CORTAS DE 3 ANOS:"
				    		+ "Comunicación Audiovisual ");
				    
				    /*Preguntas teología*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA TEOLOGIA");
		    	puntajeSociales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Te gustaría salir a ayudar a los mas necesitados mientras predicas la palabra de Dios?");
				    System.out.println("a)Si me gustaría pero no soy creyente\nb)Me encantaria\nc)No me interesa");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("b")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("a")) {puntajeSociales++;}
				    if(puntajeSociales>=2) {System.out.println("La carrera recomendada es: Teología");}
				    
				    /*Preguntas trabajo social*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS DE TRABAJO SOCIAL");
		    	puntajeSociales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Perteneces a alguna asociación de ayuda social?");
				    System.out.println("a)No entra en mis planes\nb)Es algo que quiero hacer mas adelante\nc)Ya participo activamente en una");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
				    if(puntajeSociales>=2) {System.out.println("La carrera recomendada es: Trabajo Social");}
				    
				    
				    /*Preguntas de turismo y hotelería*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS DE TURISMO Y HOTELERIA");
		    	puntajeSociales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Te gustaría estudiar en profundidad un idioma?");
				    System.out.println("a)-	Me resulta aburrido\nb)-	Es algo que tengo planeado en el futuro\nc)Ya estoy haciendolo");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
			    
				    /*Pregunta 2*/
				    System.out.println("2.	¿Tienes facilidad para el aprendizaje de idiomas?");
				    System.out.println("a)Me resulta difícil\nb)Se me da bien\nc)Me encanta aprender un nuevo idioma");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("a")) {puntajeSociales++;}
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSociales>=2) {System.out.println("La carrera recomendada es: Turismo y hotelería");}
				    System.out.println("Como alternativas existen las siguientes: "
				    		+"Carreras cortas de 6 meses"
				    		+"-Counter Profesional"
				    		+"-Auxiliar en Despacho aduanero"
				    		+"Carreras cortas de 3 años:"
				    		+"-Hotelería"
				    		);
		    };
		    
		    /*Preguntas Juridicas empresariales*/
		    if (respuestaF.equals("b")) {
		    	System.out.println("----------------------------------------------------------------");
		    	System.out.println("Preguntas de Juridicas empresariales");
				    /*Preguntas administracion de empresas*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA ADMINISTRACIÓN DE EMPRESAS");
				puntajeJuridicasEmpresariales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Cuando quieres comprarte algo:");
				    System.out.println("a)Pido todo el dinero a mis padres\nb)Pido una parte del dinero a mis padres\nc)-	Ahorro y los compro cuando haya reunido todo el dinero");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeJuridicasEmpresariales=puntajeJuridicasEmpresariales+2;}
				    if(respuestaF2.equals("b")) {puntajeJuridicasEmpresariales++;}
				    if(puntajeJuridicasEmpresariales>=2) {System.out.println("Las carreras recomendadas son: Administración de empresas e Ingenieria comercial");}
				    
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
				    if(puntajeJuridicasEmpresariales>=2) {System.out.println("La carrera recomendada es: Ciencia Política y Gobierno");}
				    
				    
				    
				    /*Preguntas de contabilidad e ingeniería comercial*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA CONTABILIDAD E INGENIERIA COMERCIAL");
				puntajeJuridicasEmpresariales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("¿Te gustaría trabajar en un banco, casa de cambio y/o consultoría?");
				    System.out.println("a)Poco, prefiero encontrar otro trabajo\nb)Me resulta una opción interesante\nc)Sí, me encantaría trabajar en un lugar así");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeJuridicasEmpresariales=puntajeJuridicasEmpresariales+2;}
				    if(respuestaF2.equals("b")) {puntajeJuridicasEmpresariales++;}
			    
				    /*Pregunta 2*/
				    System.out.println("¿Eres responsable, tolerante y disfrutas de investigar y hablar de finanzas?");
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
				    if(puntajeJuridicasEmpresariales>=2) {System.out.println("LaS carreraS recomendadaS son: contabilidad e ingeniería comercial\nComo otras opciones se puede considerar CARRERAS DE 3 MESES\r\n"
				    		+ "-Administración de Empresas\r\n"
				    		+ "-E-commerce\r\n"
				    		+ "Carreras cortas de 6 meses\r\n"
				    		+ "-Gestión Estratégica de Venta\r\n"
				    		+ "-Administración\r\n"
				    		+ "-Cajero Bancario\r\n"
				    		+ "Carreras cortas de 1 AÑO\r\n"
				    		+ "-Contabilidad y Gestión Financiera\r\n"
				    		+ "-Administración de Empresas\r\n"
				    		+ "Carreras cortas de 3 Años:\r\n"
				    		+ "-Gestión de Recursos Humanos\r\n"
				    		+ "-Contabilidad, especialización en Tributación\r\n"
				    		+ "-Gestión Logística\r\n"
				    		+ "");}
			
				    /*Preguntas de derecho*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA DERECHO");
				puntajeJuridicasEmpresariales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("Cuando alguien dice una opinión diferente a la tuya decides:");
				    System.out.println("a)Exponer y debatir mis ideas\nb)No aceptar ni tolerar ninguna idea diferente a la mia\nc)Trato de evitar cualquier conversación con esa persona");
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
				    System.out.println("¿Te resulta fácil dibujar objetos de forma abstracta?");
				    System.out.println("a)No\nb)Normalmente si\nc)Si bastante");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
			    
				    /*Pregunta 2*/
				    System.out.println("¿Eres habilidoso con programas informáticos de diseño?");
				    System.out.println("a)No\\nb)Normalmente si\\nc)Si bastante");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("a")) {puntajeCienciasIngenierias++;}
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("La carrera recomendada es: Arquitectura");}
			
				    /*Preguntas de agronómica y agricola*/
				    
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
				    if(puntajeCienciasIngenierias>=2) {System.out.println("La carrera recomendada es: Ingeniería Agronómica y Agrícola");}
			
				    /*Preguntas de agronomica agricola y ambiental*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA AGRONOMICA AGRICOLA, AMBIENTAL");
				puntajeCienciasIngenierias=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("¿Valoras el medio ambiente y fomentas su cuidado?");
				    System.out.println("a)Poco\nb)Mucho\nc)Bastante");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("Las carreras recomendadas son: -Ingeniería Agronómica y Agrícola\r\n"
				    		+ "-Ingeniería Ambiental\r\n"
				    		+ "Como otras opciones existen:\nCarreras cortas de 6 meses\r\n"
				    		+ "-Agronegocios\r\n"
				    		+ "");}
			
				    /*Preguntas de civil*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTA PARA CIVIL");
				puntajeCienciasIngenierias=0;
		    	
				    
				    /*Pregunta 1*/
				    System.out.println("1.	¿Disfrutarías de construir presas y obras subterráneas?");
				    System.out.println("a)-	No, preferiría trabajar en otros campos\nb)Sí, sería una buena opción\nc)Sí, me gustaría mucho");
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
				    System.out.println("¿Te llama la atención conocer la industria minera y participar en obras civiles?");
				    System.out.println("a)Poco\nb)Mucho\nc)Bastante");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("La carrera recomendada es: Ingeniería de minas");}
			
				    
		
				    /*Preguntas de sistemas*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA SISTEMAS");
				puntajeCienciasIngenierias=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("¿Tienes la habilidad de adaptarte a distintos lenguajes de programación?");
				    System.out.println("a)-	No se me da muy bien\nb)Si\nc)Si, con mucha facilidad");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias++;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
			    
				    /*Pregunta 2*/
				    System.out.println("¿Te resulta interesante conocer como las computadoras se comunican entre ellas?");
				    System.out.println("a)No, es algo aburrido\nb)Si, me resultaría interesante\nc)¡Si , me resultaría fascinante!");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias++;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("La carrera recomendada es: Ingeniería de Sistemas\n Como otra opcion se puede considerar:\nCarreras cortas de 1 año:\r\n"
				    		+ "-Diseño y Desarrollo Web\r\n"
				    		+ "");}
			
				    /*Preguntas de mas de una carrera*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS mas de 1 carrera");
				puntajeCienciasIngenierias=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("¿Prefieres trabajar con máquinas o con personas?");
				    System.out.println("a)Con personas, siempre\nb)Me es indiferente, aunque utilizo con soltura las máquinas\nc)Con máquinas, siempre");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("Recomendaciones:\n-Ingeniería Electrónica\r\n"
				    		+ "-Ingeniería Mecánica Eléctrica\r\n"
				    		+ "-Ingeniería Mecatrónica\r\n"
				    		+ "-Ingeniería Mecánica\r\n"
				    		+ "CARRERA DE 3 MESES\r\n"
				    		+ "-Electricidad Industrial\r\n"
				    		+ "");}
			
				    /*Preguntas de electronica*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA ELECTRONICA");
				puntajeCienciasIngenierias=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("¿Sientes interés por la electrónica y los componentes de las máquinas?");
				    System.out.println("a)Por lo general no\nb)Si, me gusta\nc)Es algo que me encanta");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("Recomendaciones:\n-Ingeniería Electrónica\r\n"
				    		+ "CARRERA DE 3 AÑOS:\r\n"
				    		+ "-Electrónica, Automatización y Control Industrial\r\n"
				    		+ "");}
			
				    /*Preguntas de mecanica*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA MECANICA");
				puntajeCienciasIngenierias=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("¿Te gustaría diseñar maquinaria industrial?");
				    System.out.println("a)No\nb)Tal vez\nc)Si");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeCienciasIngenierias=puntajeCienciasIngenierias+2;}
				    if(respuestaF2.equals("b")) {puntajeCienciasIngenierias++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeCienciasIngenierias>=2) {System.out.println("Recomendaciones:\n-Ingeniería Mecánica\r\n"
				    		+ "CARRERAS CORTAS DE 1 AÑO:\r\n"
				    		+ "-Mecánica Industrial\r\n"
				    		+ "CARRERA DE 3 AÑOS:\r\n"
				    		+ "-Mecatrónica Automotriz\r\n"
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
				    System.out.println("¿Te gustaría diseñar y producir fármacos de alta calidad?");
				    System.out.println("a)No, prefiero realizar otras tareas\nb)Sí, es muy atractivo es trabajo\nc)Sí, me encanta");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSalud=puntajeSalud+2;}
				    if(respuestaF2.equals("b")) {puntajeSalud++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSalud>=2) {System.out.println("Las carreras recomendadas son: Farmacia y bioquimica");}
			
				    /*Preguntas de enfermería*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA Enfermeria");
				puntajeSalud=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("¿Preferirías trabajar como enfermero/a en vez de como médico?");
				    System.out.println("a)No, prefiero ser médico\nb)No me importaría desempeñar es trabajo\nc)Sí, me gustaría ser enfermero");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSalud=puntajeSalud+2;}
				    if(respuestaF2.equals("b")) {puntajeSalud++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSalud>=2) {System.out.println("Recomendaciones\n-Enfermería\r\n"
				    		+ "Carreras cortas de 3 meses\r\n"
				    		+ "-Visitador Médico\r\n"
				    		+ "CARRERA CORTA DE 3  AÑOS:\r\n"
				    		+ "-Enfermería Técnica\r\n"
				    		+ "");}
			
				    /*Preguntas de odontología*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA Odontologia");
				puntajeSalud=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("1.	¿Te interesa todo lo relacionado con la salud dental?");
				    System.out.println("a)No, prefiero otros campos de la medicina\nb)Sí, me es interesante\nc)Sí, esa rama me encanta");
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
				    System.out.println("1.	El funcionamiento de la célula te parece:");
				    System.out.println("Indeferente\nb)Interesante\nc)Fascinante");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSalud=puntajeSalud+2;}
				    if(respuestaF2.equals("b")) {puntajeSalud++;}
			    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSalud>=2) {System.out.println("La carrera recomendada es: Ingeniería biotecnologica");}
			
				    /*Preguntas de medicina humana*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS PARA Medicina humana");
				puntajeSalud=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("¿Te gustaría realizar operaciones en el quirófano?");
				    System.out.println("a)No, prefiero otro tipo de trabajo\nb)Sí, sería un buen trabajo\nc)Sí, me encantaría");
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
				    System.out.println("¿Te gustaría ayudar a trare niños al mundo?");
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
				    		+ "CARRERAS CORTAS DE 3 AÑOS:\r\n"
				    		+ "-Zootecnia\r\n"
				    		+ "");}
			
				    /*Preguntas de carreras tecnicas*/
				    /*arte diseño y musica*/
				    
				System.out.println("----------------------------------------------------------------");
				System.out.println("PREGUNTAS RELACIONADAS CON EL ARTE, DISEÑO, MUSICA");
		    	puntajeSociales=0;
		    	
				    /*Pregunta 1*/
				    System.out.println("¿Te consideras una persona creativa e imaginativa?");
				    System.out.println("a)Poco\nb)Algo\nc)Mucho");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
			    
				    /*Pregunta 2*/
				    System.out.println("En comparación con gente de tu edad, destacas en música, creatividad u otra forma de arte");
				    System.out.println("a)Nada\nb)Algo\nc)Mucho");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
				    
				    /*Pregunta 3*/
				    System.out.println("¿Con qué frecuencia visitas una exposición artística?");
				    System.out.println("a)Nunca\nb)Cuando me parece interesante\nc)Siempre que tengo ocasión");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
				    
				    /*Pregunta 4*/
				    System.out.println("¿Te gustaría diseñar y fabricar productos?");
				    System.out.println("a)No, para nada\nb)Sería un buen trabajo\nc)!Me encantaría¡");
				    respuestaF2=input.nextLine();
				    if(respuestaF2.equals("c")) {puntajeSociales=puntajeSociales+2;}
				    if(respuestaF2.equals("b")) {puntajeSociales++;}
				    
				    System.out.println("----------------------------------------------------------------");
				    if(puntajeSociales>=2) {System.out.println("Recomendaciones:\nCarreras cortas de 3 meses\r\n"
				    		+ "-Fotografía de Moda\r\n"
				    		+ "-Cocina Peruana Clásica y Vanguardista\r\n"
				    		+ "\r\n"
				    		+ "Carreras cortas de 6 meses\r\n"
				    		+ "\r\n"
				    		+ "-Diseño de muebles\r\n"
				    		+ "\r\n"
				    		+ "Carreras cortas de 1 año\r\n"
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
				    if(puntajeSociales>=2) {System.out.println("La carrera recomendada es: Prevención de la Seguridad y Salud en el trabajo");}
			
				    
		    }
		    
	    }
	    
	    };

}
