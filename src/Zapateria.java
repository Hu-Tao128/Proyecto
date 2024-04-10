/**
*
* @author aya
*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class Zapateria {

    public static void main(String[] args) {
        System.out.flush();
        //limpia los datos de la consola que vienen por defecto

        String opcion;
        /*opcion para los menus */
        
        /*opcion para el control de las compras, pudiendo comprar un maximo */
        int codigo = 0;//

        String categorias[] = {"Niña","Niño","Mujer","Hombre","Ver todos los productos"};
        /*Array con la categorias, estas van en el menu desplegable */
        String opciones[] = {"Ver catalogo","Conoce tu talla","Canjear un codigo","Dedicado a mi novia hermosa Kathya<3","Salir"};
        /*Array con las opciones del menu principal, igual mostrarlas en el menu desplegable */


        do{

            opcion = (String) JOptionPane.showInputDialog(null,
            "Que opcion desea realizar? \n",/*mensaje a mostar */
            "Menu Principal",/*titulo de la ventana */
            JOptionPane.DEFAULT_OPTION, null, opciones,opciones); 

            if (opcion == ""|| opcion == null) {

                caseNull();
                opcion = "Salir";
            }else{
                switch(opcion) {
                    case "Ver catalogo":
    
                        opcion = (String) JOptionPane.showInputDialog(null,
                        "Eliga",
                        "Menu De Categorias",
                        JOptionPane.DEFAULT_OPTION, null, categorias,categorias); 
                        /*Menu desplagable de las categorias */

                            if(opcion != "" || opcion != null){
                                
                                Catalogo(opcion, codigo);
                                /*llamamos la funcion de catalogo donde tenemos el switch segun la accion*/
                                opcion ="Salir";
                            }else{
                                
                                caseNull();
                                opcion ="Salir";
                            }
                        
                    break;
                    
                    case "Conoce tu talla":
                        //System.out.println("Bienvenido al modulo para conocer tu talla");
                        //System.out.println("Antes de comenzar indique si es hombre, mujer o Infante (H/M/I)");
                        //String Sexo = respuesta.next();
                        /*Mostrara una tabla segun sea el sexo del cliente o un infante */
                        String data[] = {"Hombre", "Mujer", "Infante"};
                        String Sexo = (String) JOptionPane.showInputDialog(null, 
                        "Seleccione el catalogo que busca\n",
                        "Conoce tu talla", 
                        JOptionPane.DEFAULT_OPTION, null, data, data);
    
                        //System.out.println("Utiliza la regla que se te proporciona en el establecimiento");
                    
                        //System.out.println("tabla de tallas \n talla 1 \n talla 2\n talla 3\n"); //mostrar tabla de tallas de ninos
                            if (Sexo == null|| Sexo == "") {
                                caseNull();
                                
                            }else {
                                if (Sexo.equals("Hombre")){
                
                                    //System.out.println("Leon \n No ha hewcho\n La tabla"); 
                                    //muestra las tallas de hombre
                                    JOptionPane.showMessageDialog(null, "Aqui van los datos que va a hacer el miguel", "Talla Hombre",0);
                                } else if (Sexo.equals("Mujer")) {
        
                                    //System.out.println("talla 1 \n talla 2\n talla 3"); 
                                    //muestra las tallas de mujer
                                    JOptionPane.showMessageDialog(null, "Aqui van los datos que va a hacer el miguel", "Talla Mujer",0);
                                }else{
        
                                    //System.out.println("talla 1 \n talla 2\n talla 3"); 
                                    //muestra las tallas de infantes
                                    JOptionPane.showMessageDialog(null, "Aqui van los datos que va a hacer el miguel", "Talla Infante",0);
                                }
                            }
        
                    break;
                    
                    case "Canjear un codigo":
                        
                        /*Si la respuesta es si a tener un codigo de canje preguntara cual es y verificara 
                        * si es igual al codigo de descuentos, sino arrojara otro mensaje
                        */
                        try {
                            /*Try como su nombre lo indica se refiere a que intentara hacer lo que esta dentro de las llaves
                            * de lo contrario realizara lo que se encuentra dentro del catch es decir la opcion por defectos
                            */
                            codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su codigo"));
                                
                                if (codigo == 277353 || codigo == 54321){
                                    JOptionPane.showMessageDialog(null, "Codigo correcto");
                                }else{
                                    JOptionPane.showMessageDialog(null, "Codigo invalido");
                                }

                        } catch (Exception e) {
                            // TODO: handle exception
                            JOptionPane.showMessageDialog(null, "Tu codigo es invalido");
                            /*En dado que no sea arroja una ventana donde dice que no es correcto y pregunta si desea continuar */
                        }
    
                    break;
    
                    case "Salir":
                            JOptionPane.showMessageDialog(null, "Vuelva Pronto", "Mensaje de Salida", JOptionPane.INFORMATION_MESSAGE);
                            /*opcion de salir, termina el codigo con un mensaje de salida */
                    break;


                    default:
                    break;
                }    
            }
            
        }while (opcion!="Salir");
        //do while se refiere a repetir mientras la condicion se cumpla
        
    }

    //asi se escribe una funcion
    private static void caseNull() {
        JOptionPane.showMessageDialog(null, "Vuelva Pronto", "Adios Usuario", JOptionPane.CLOSED_OPTION);
            /*Se compone de varias cosas el JOptionPane usamos null para decir que por defecto se vea en el main, lo siguiente es el mensaje que queremos muestre
            y con eso tenemos un simple messagebox pero para poner titulo lo ponemos entreparentesis seguido de la coma, y despues usamos
            el tipo de mensaje que es, ya que al tener titulo necesita un icono, por ejemplo advertencia, info, salir, aceptar etc. */    
    }

    private static void Catalogo(String opcioString, int codigo){

        String Products[] = {"Zapatos Shein color rosa, talla 8", "Sadak Huarache frozen con tacon, talla 9", "Zapatos shein color negro de vestir, talla 9", "Tenis de moda girls attitude color rosa, talla 8"," Tenis Nike Court Borought color rosa, talla 10",/*Termina Productos Nina */ 
            "Nautica Spinnaker Plebbed plano color blanco, talla 9", "Landhiker color blanco, talla 10", "Marvel botines de spiderman talla 9", "Bruno Marc zappatos Oxford de vestir, talla 9", "Tenis casual para niño Rokino Modelo 3186, talla 11", /*Termina Productos Nino */
            "Dream paris color blanco, talla 24", "Atoshopce color negro, talla 23", "Madden girl color durazno, talla 25", "Shoe land color negro, talla 24", "GUESS loven color blanco, talla 23", /*Termina Productos Mujer */
            "Vans Old Skool color negro, talla 26", "York Team Polo Club color negro, talla 26", "Quirelli modelo 8602 color cafe, talla 26.5", "Zapato casual de piel para hombre color negro, talla 27.5", "Zapato Bordon Serraje color cafe, talla 27" /*Termina Productos Hombre */};
            // Array de todos los nombres de los productos

        int precioProduct[] = {565, 620, 970, 700, 490,
                                600, 480, 865, 565, 700, 
                                1270, 895, 760, 870, 960,
                                1600, 800, 950, 650, 500};
            // Array con los precios de todos los productos

        JFrame f = new JFrame("Articulos para comprar");
        //JFrame es nuestra ventana que se emerge, dentro del parentess va el titulo entre comillas
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        //sirve que cuando cierro la ventana se sale del programa, pone fin

        f.setLayout(null);

        int contador = 0;
        int altura = 0;
        //altura igual a cero para que no se acumula o provoque errores dentro del for
        JCheckBox caja[];
        caja = new JCheckBox[20];
        int precio[];
        precio = new int[20];
        String CompraProductos[];
        CompraProductos = new String[20];

        int inicio;
        int finalCiclo;

            switch (opcioString) {
                // el Switch me da control sobre las opcione que elige el usuario en el menu desplegable sobre que productos ver
        
                    case "Niña":
                    // cada caso va en String que corresponde a los datos del menu desplegable, son opciones unicas
                        for(int i = 0; i<5;i++){
                            /*Dentro del for vamos de 5 en 5 empezando desde cero porque son 5 articulos por categoria 
                            *y los numeros de i se los asignaremos a los checkbox para que guarden el nombre y precio de cada uno 
                            */
                            caja[i] = new JCheckBox(Products[i] + " Precio: " + precioProduct[i]);
                            /*JCheckbox es la declaracion de un checkbox, donde le asignamos un nombre de variable, despes del 
                            * igual utilzamos lo que es new JchechkBox para indicar que es un nuevo objeto o vista
                            * y dentro del parentesis le damos el valor que queremos darle
                            */
                            altura += 30;
                            caja[i].setBounds(20,altura,500,30);
                            /*setBounds se encarga de acomodar la vista u objerto en algun lado del Jframe o ventana
                            * donde existen 4 valores, (x, y, ancho, largo) y acomodarlos como en un plano cartesiano
                            * dandole valores a x, y para acomodarlos y darles un ancho y largo y que no choquen entre si 
                            * o no se muestren completos los escritos
                            */
                            caja[i].setVisible(true);
                            /*setVisible se encarga de hacerlos visibles, ya que aveces falla y solo se ve el primero o uno a la vez */
                            f.add(caja[i]);
                            /*Con este ultimo agregamos nuestra caja, objeto o vista a la ventana con todos los valores que le dimos
                            * por eso va al ultimo
                            */
                            
                        }
                        inicio = 0;
                        finalCiclo = 5;
                    break;
                    case "Niño":
                        for (int i = 5; i < 10; i++) {
                            caja[i] = new JCheckBox(Products[i] + " Precio: " + precioProduct[i]);
                            altura += 30;
                            caja[i].setBounds(20,altura,500,30);
                            caja[i].setVisible(true);
                            f.add(caja[i]);
                        }
                        inicio = 5;
                        finalCiclo = 10;
                    break;
                    case "Mujer":
                        for(int i = 10; i<15;i++){
                            caja[i] = new JCheckBox(Products[i] + " Precio: " + precioProduct[i]);
                            altura += 30;
                            caja[i].setBounds(20,altura,500,30);
                            caja[i].setVisible(true);
                            f.add(caja[i]);
                        }
                        inicio = 10;
                        finalCiclo = 15;
                    break;
                    case "Hombre":
                        for(int i = 15; i<20;i++){
                            caja[i] = new JCheckBox(Products[i] + " Precio: " + precioProduct[i]);
                            altura += 30;
                            caja[i].setBounds(20,altura,500,30);
                            caja[i].setVisible(true);
                            f.add(caja[i]);
                        }
                        inicio = 15;
                        finalCiclo = 20;
                    break;
                    default:
                        for(int i = 0; i<20;i++){
                            contador +=1;
                            caja[i] = new JCheckBox(Products[i] + " Precio: " + precioProduct[i]);
                            altura += 30;
                            caja[i].setBounds(20,altura,400,30);
                            caja[i].setVisible(true);
                            f.add(caja[i]);
                            if (contador % 5 == 0 && i < 19) {
                                // Crear un JPanel como línea divisoria
                                JPanel dividir = new JPanel();
                                dividir.setBounds(20, altura + 32, 400, 2);
                                dividir.setBackground(Color.BLACK); // Cambia el color de la línea divisora
                                dividir.setVisible(true);
                                f.add(dividir);

                                altura += 4;// 4 porque al pasar el mouse no disminuye el tamano debido a los chkbx's
                            }
                        }
                        inicio = 0;
                        finalCiclo = 20;
                    break;
            }
            
        final int end = finalCiclo;
        final int start = inicio;

        JCheckBox no = new JCheckBox("No Comprar Nada");   
        altura += 30;
        no.setBounds(20, altura, 400, 30); 
        no.setVisible(true);
        f.add(no);

        JButton aceptar = new JButton("Comprar");
        /*boton para interactuar con la ventana y los checkboxs entre parentesis el titulo del boton */
        aceptar.setBounds(500, altura, 100, 50);
        /*Medidas y posicion de nuestro boton */
        aceptar.setVisible(true);
        /*Ver visible el boton */
        /*Agregar el boton */
        f.add(aceptar);

        JButton cancelar = new JButton("Cancelar Compra");
        cancelar.setBounds(610, altura, 200, 50);
        cancelar.setVisible(true);
        //cancelar.addActionListener((ActionListener) this);
        f.add(cancelar);

        JButton Imagenes = new JButton("Ver Galeria");
        Imagenes.setBounds(545, altura += 60, 200, 50);
        Imagenes.setVisible(true);
        f.add(Imagenes);

        f.setSize(850,altura + 100);
        /*El tamano que tendra de nuetra ventana por default*/
        f.setVisible(true);
        /*Ver la ventana, que sea visible */
    
        ActionListener botones = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int cont = 0;
                if (e.getSource() == aceptar){

                    if (no.isSelected()) {
                        JOptionPane.showMessageDialog(null,"Has precionado no comprar nada, tus elecciones se borraran", "No comprar",0);
                    }else {

                        Double Total = 0.0;
                        for (int i = start; i < end; i++){
                            if (caja[i].isSelected() && cont<10){
                                CompraProductos[i] = Products[i];
                                precio[i] = precioProduct[i];
                                Total += precio[i];
                                cont += 1;
                            }
                        }


                        pagar(start, end, precio, CompraProductos, Total, codigo);

                    }

                }else if (e.getSource() == cancelar){
                    //JOptionPane.showMessageDialog(null, "Apretaste que no quieres", "Cancelar", 0);
                    f.dispose();
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
                    //dispose cierra la ventana, es decirla elimina para no consumir memoria
                    } else if (e.getSource() == Imagenes) {
                        verImagen(start, end, Products);
                    }
            }
        };

        Imagenes.addActionListener(botones);
        aceptar.addActionListener(botones);
        cancelar.addActionListener(botones);
        
    }

    private static void pagar(int inicio, int end, int precio[], String CompraProductos[], double Total, int codigo) {
        JFrame Pagar = new JFrame("Pagar");
        Pagar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        Pagar.setLayout(null);

        //JLabel.CENTER_ALIGNMENT;

            JLabel Titulo = new JLabel("Productos seleccionados:\n");
            Titulo.setHorizontalAlignment(JLabel.CENTER);
            Titulo.setBounds(0, 30, 500, 30);
            Titulo.setVisible(true);
            Pagar.add(Titulo);

            int altura = 60;
            for (int i = inicio; i < end; i++) {
                if (CompraProductos[i] != null && precio[i] != 0) {
                    JLabel Products = new JLabel(CompraProductos[i] + " - Precio: " + precio[i]);
                    Products.setHorizontalAlignment(JLabel.CENTER);
                    Products.setBounds(0, altura, 500, 30);
                    Products.setVisible(true);
                    Pagar.add(Products);
                    altura += 30;
                }
            }
            
            String mensaje = "";
            if (codigo == 277353 || codigo == 54321 ) {
                Total = Total*0.9;
                // Agregar el total al mensaje
                mensaje = ("\nTienes descuento del 10% \nTotal: " + Total);
            }else{
                mensaje = ("\nTotal: " + Total);
            }

            JLabel lblTotal = new JLabel(mensaje);
            lblTotal.setHorizontalAlignment(JLabel.CENTER);
            lblTotal.setBounds(0, (altura += 30), 500, 30);
            lblTotal.setVisible(true);
            Pagar.add(lblTotal);


            JLabel lblpagar = new JLabel("Elija metodo de Pago");
            lblpagar.setHorizontalAlignment(JLabel.CENTER);
            lblpagar.setBounds(0, (altura += 30), 500, 30);
            lblpagar.setVisible(true);
            Pagar.add(lblpagar);

            JButton efectivo = new JButton("Efectivo");
            efectivo.setBounds(140, (altura + 40), 100, 30);
            efectivo.setVisible(true);
            Pagar.add(efectivo);            

            JButton Tarjeta = new JButton("Tarjeta");
            Tarjeta.setBounds(260, (altura + 40), 100, 30);
            Tarjeta.setVisible(true);
            Pagar.add(Tarjeta);

            final Double TTotal = Total;
            ActionListener Pagos = new ActionListener(){
            
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    if (e.getSource() == Tarjeta) {
                        Tarjeta();
                    }else if (e.getSource() == efectivo) {
                        Efectivo(TTotal);
                    }
                }
            };
            efectivo.addActionListener(Pagos);
            Tarjeta.addActionListener(Pagos);

        Pagar.setSize(500,500);
        Pagar.setVisible(true);
    
    }
    
    private static void Tarjeta() {
        
        JFrame pagarTarjeta = new JFrame("Pasos para pagar");
        pagarTarjeta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel para el formulario
        JPanel formularioPanel = new JPanel();
        formularioPanel.setLayout(new GridLayout(3, 2)); // Usamos GridLayout para organizar los campos del formulario

        
        JLabel lblnombre = new JLabel("Nombre Titular: ");
        formularioPanel.add(lblnombre);
        JTextField txtnombre = new JTextField();
        formularioPanel.add(txtnombre);
        
        JLabel lblNumTarheta = new JLabel("Numero de Tarjeta: ");
        formularioPanel.add(lblNumTarheta);
        JTextField NumTarheta = new JTextField();
        formularioPanel.add(NumTarheta);
        
        JLabel lblCVC = new JLabel("Ingrese CVC: ");
        formularioPanel.add(lblCVC);
        JTextField CVC = new JTextField();
        //CVC.se
        formularioPanel.add(CVC);

        // Crear un panel para contener el botón de pagar y la barra de progreso
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Agregar el panel del formulario en la parte superior del panel principal
        panel.add(formularioPanel, BorderLayout.NORTH);

        // Crear una barra de progreso y un botón de pagar
        JProgressBar ProcesoPago = new JProgressBar(0,100);
        ProcesoPago.setPreferredSize(new Dimension(200, 30)); // Establecer el tamaño del JProgressBar con Dimension
        ProcesoPago.setStringPainted(true);
        ProcesoPago.setValue(0);
        JButton pagarButton = new JButton("Pagar");

            pagarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub

                    String texto1 = txtnombre.getText();
                    String Num1 = NumTarheta.getText();
                    String CVC = lblCVC.getText();
                    
                    if (!texto1.isEmpty() && !Num1.isEmpty() && !CVC.isEmpty()) {

                        try {
                            
                            //Double ValidCVC = (Math.floor(Math.log10(Double.parseDouble(CVC)) + 1));
                            //Double ValidNUmTarjeta = (Math.floor(Math.log10(Double.parseDouble(Num1)) + 1));
                            
                            int ValidCVC = (int) (Math.log10(Double.parseDouble(CVC)) + 1);
                            int ValidNUmTarjeta = (int) (Math.log10(Double.parseDouble(Num1)) + 1);
                            
                            if (ValidCVC > 3 && ValidNUmTarjeta > 16) {
                                
                                for (int i = 0; i <= 30000; i++) {
                                    ProcesoPago.setValue(i);
                                    if (i == 30000) {
                                        JOptionPane.showConfirmDialog(null, "Verificado\nProductos Pagados", "Pago Exitoso", JOptionPane.CLOSED_OPTION);
                                    }
                                }

                            }else{

                            }
                        } catch (Exception exception) {
                            // TODO: handle exception

                            JOptionPane.showConfirmDialog(null, "Verifica los Campos del Formulario Por Favor \n Numero de Tarjeta o CVC estan Incompletos o no son validos", "Verificar Datos", JOptionPane.CLOSED_OPTION);
                        }
                        
                        // Cuando se presiona el botón "Pagar", avanzar la barra de progreso al 100%
                        
                    }else{
                        JOptionPane.showConfirmDialog(null, "Verifica los Campos del Formulario Por Favor", "Formulario Incompleto", JOptionPane.CLOSED_OPTION);
                    }
                }
            });

        // Agregar la barra de progreso y el botón de pagar al panel principal
        panel.add(ProcesoPago, BorderLayout.CENTER);
        panel.add(pagarButton, BorderLayout.SOUTH);

        // Agregar el panel principal en el contenedor del frame
        pagarTarjeta.getContentPane().add(panel);

        // Ajustar el tamaño y hacer visible el frame
        pagarTarjeta.setSize(300, 200);
        pagarTarjeta.setVisible(true);
    }

    private static void Efectivo(Double Total){

        JFrame PagoEfectivo = new JFrame("Pago en Efectivo");
        PagoEfectivo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Si cierra la pagina se temina el codigo o ejecucion
        PagoEfectivo.setLayout(null);


            JLabel lblmensaje1 = new JLabel("Monto de Pago: ");
            lblmensaje1.setBounds(10, 70, 150, 30);
            PagoEfectivo.add(lblmensaje1);

            JTextField montoPago = new JTextField();
            montoPago.setBounds(150, 70, 50, 30);
            PagoEfectivo.add(montoPago);

            JLabel MensajePago = new JLabel("Su Total es: " + Total);
            MensajePago.setBounds(150, 150, 200, 30);
            PagoEfectivo.add(MensajePago);

            JButton Pagar = new JButton("Pagar");
            Pagar.setBounds(150, 200, 150, 30);
            PagoEfectivo.add(Pagar);

            JLabel mensajeTotal = new JLabel();
            mensajeTotal.setBounds(100, 250, 300, 30);
            mensajeTotal.setVisible(false);
            mensajeTotal.setHorizontalAlignment(JLabel.CENTER);
            PagoEfectivo.add(mensajeTotal);

            ActionListener calculadora = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    final String textfield = montoPago.getText();
                    if (!textfield.isEmpty()) {
                        try {
                            Double Monto = Double.parseDouble(textfield);
                            Double resultado = Monto - Total;

                            if(resultado == 0){
                                mensajeTotal.setText("Pago Completo, Buen Dia :)");
                                mensajeTotal.setVisible(true);

                            }else if (resultado > 0) {
                                mensajeTotal.setText("Tu cambio es: " + Monto + ", Buen Dia :)");
                                mensajeTotal.setVisible(true);
                            }else{
                                mensajeTotal.setText("Saldo insuficiente :(");
                                mensajeTotal.setVisible(true);
                            }
                            
                        } catch (Exception excxepcion) {
                            // TODO: handle exception
                            JOptionPane.showMessageDialog(Pagar, "Datos Incorrectos, use numeros por favor", "Mensaje Error", JOptionPane.OK_OPTION, null);
                        }
                    }
                }
            }; 

            Pagar.addActionListener(calculadora);
        PagoEfectivo.setVisible(true);
        PagoEfectivo.setSize(500, 500);

    }

    private static void verImagen(int inicio, int limite, String productos[] ) {

        //String ruta = "/home/aya/Documentos/GitHub/Proyecto/src/Imagenes/";

        String Imagenes[] = {"0.jpeg", "1.jpeg", "2.jpeg", "3.jpeg", "4.jpeg",
                            "5.jpeg", "6.jpeg", "7.jpeg", "8.jpeg", "9.jpeg",
                            "10.jpeg", "11.jpeg", "12.jpeg", "13.jpeg", "14.jpeg",
                            "15.jpeg", "16.jpeg", "17.jpeg", "18.jpeg", "19.jpeg" };

        JFrame VerImagen = new JFrame("Imagen");
        VerImagen.setLayout(null);

            JPanel pabnel = new JPanel();

            int x = 10;
            int y = 220;
            //int index;

            for (int i = inicio; i < limite; i++){
                ImageIcon HuTao = new ImageIcon("/home/aya/Documentos/GitHub/Proyecto/src/Imagenes/" + Imagenes[i]);
                JLabel imagen = new JLabel();

                imagen.setBounds(x,y,200,200);
                imagen.setIcon(new ImageIcon(HuTao.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
                
                final int index = i;
                imagen.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {//cuando el mouse esta dentro de los limites de la imagen
                        // TODO Auto-generated method stub
                        imagen.setBorder(BorderFactory.createLineBorder(Color.RED));
                        //BorderFactory es una clase en Java Swing que proporciona métodos estáticos para crear bordes 
                        imagen.setBorder(BorderFactory.createTitledBorder(productos[index]));

                    }

                    @Override
                    public void mouseExited(MouseEvent e) { // cuando el mouse sale de los limites, para dejarlo igual que antes
                        // TODO Auto-generated method stub
                        imagen.setBorder(null); //elimina el borde 
                    }
                });
                pabnel.add(imagen);

                x += 250;

            }

            VerImagen.setContentPane(pabnel);

            if (inicio == 0 && limite == 20) {
                y = 810;
            }

        VerImagen.setSize(1070,y + 50);
        VerImagen.setVisible(true);
    }

}