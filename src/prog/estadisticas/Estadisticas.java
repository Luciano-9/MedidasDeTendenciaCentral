
package prog.estadisticas;

import java.util.Arrays;

public class Estadisticas extends javax.swing.JFrame {

   private double[] valores;
   private String[] cad;
   
   public Estadisticas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextPane1.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        jTextField1.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel1.setText("Numeros:");

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel2.setText("RESPUESTA");

        jMenu1.setText("Operaciones");
        jMenu1.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N

        jMenuItem1.setText("Media");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Mediana");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Moda");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Varianza");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Desviacion");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(173, 173, 173))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String[] cad =this.jTextField1.getText().split(",");
               double[] valores = new double[cad.length];
                        for(int i=0; i<valores.length; i++){
               valores[i] = Double.valueOf(cad[i]);   
    }//GEN-LAST:event_jMenuItem1ActionPerformed
       double media = getMedia(valores);
    jTextPane1.setText("Media: "+media+"\n\nMEDIA: Tambien se le conoce como promedio. Se halla sumando todos los numeros que tenemos y los dividimos entre el numero total de numeros."); 
    }                   
                        
                             
                        
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String[] cad =this.jTextField1.getText().split(",");
               double[] valores = new double[cad.length];
                        for(int i=0; i<valores.length; i++) {
                valores[i] = Double.valueOf(cad[i]);          
                }
    double mediana = getMediana(valores);
  jTextPane1.setText("Mediana: "+mediana+"\n\nMEDIANA: Es aquel valor que se encuentra en la parte central de los datos que se tienen una vez que estos han sido ordenados segun su valor o magnitud.\n\n* Si el numero de datos es impar la mediana es el valor que quede a la mitad de ese ordenamiento.\n\n* Cuando el numero de datos es par se les saca el promedio a los dos datos que queden a la mitad de ese ordenamiento."); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String[] cad = this.jTextField1.getText().split(",");
        double[] valores = new double[cad.length];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = Double.valueOf(cad[i]);
        }
        String moda = getModa(cad);
        jTextPane1.setText("Moda: " + moda + "\n\nMODA: La moda se define como aquel valor o valores que mas se repiten con mayor frecuencia entre los datos que se hacen obteniendo en una muestra.");  
  }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        String[] cad = this.jTextField1.getText().split(",");
        double[] valores = new double[cad.length];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = Double.valueOf(cad[i]);
        }
        double varianza = getVarianza(valores);
        jTextPane1.setText("Varianza: " + varianza + "\n\nVARIANZA: Es la medida aritmetica al cuadrado de la desviacion respecto a la medida de una distribucion estadistica.\n\n*Ejemplo: Tenemos 1,2,3 la media es 2.A cada número le restamos la media y luego elevamos al cuadrado.\n (1-2)^2 = 1\n (2-2)^2 = 0\n (3-2)^2 = 1 \nSe suman los resultados = 2 y dividimos entre el numero de términos -1. Es decir 2/2=1.");  
  }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        String[] cad = this.jTextField1.getText().split(",");
        double[] valores = new double[cad.length];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = Double.valueOf(cad[i]);
        }
        double desviacion = getDesviacion(valores);
        jTextPane1.setText("Desviación: " + desviacion + "\n\nDESVIACION: Es la raiz cuadrada de la varianza.");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    
     public static double getMedia(double...datos) {
    double media = 0.0;
    for (double dato : datos) {
        media+= dato;
    }
    return (media / datos.length);
}

  public static double getVarianza(double...datos){
      
           double media = 0.0;
      for (double dato : datos){
          media += dato;
      }     
          
          double m=media / datos.length;
          double suma = 0;
          double v=0;
          double va=0;
          for (int i=0; i<datos.length; i++){
              double Xi = datos[i];
              suma += Math.pow((Xi-m),2);
          }
          v+=datos.length-1;
                       va+=suma/v;
                       
          return va;             
  }

  public static double getDesviacion(double...datos){
      double media = 0.0;
    for (double dato : datos){
        media += dato;
    }  
    
       double m=media / datos.length;
       double suma = 0;
       double v=0;
       double va=0;
       for (int i=0; i<datos.length; i++) {
           double Xi = datos[i];
           suma += Math.pow((Xi-m),2);
       }
       v+=datos.length-1;
                 va+=suma/v;
    return Math.sqrt(va);             
  }
  
  
  public static double getMediana(double...datos) {
      double mediana=0.0;
      int x=0;
      
      Arrays.sort(datos);
      x = datos.length;
      
      if(x % 2==0){
          double x1=datos[((x-2)/2)];
          double x2=datos[x/2];
          mediana=(x1 + x2) / 2;
      }else{
          mediana=datos[(x - 1)/2];
      }
      return mediana;
  }

public static String getModa(String ... datos){
    
    String moda = "";
    Arrays.sort(datos);
    
     String[] grupos = new String[datos.length];
     
     int ngrupos=1;
     int igrupo=0;
     String grupo=datos[0];
     grupos[0]= datos[0];
     
     for(int i = 1; i<datos.length; i++){
         if(grupo.equals(datos[i])){
             continue;
         }else{
             ngrupos++;
             igrupo++;
             grupo=datos[i];
             grupos[igrupo]=grupo;
         }
     }
     
     
     int[]frecuencia = new int[ngrupos];
     
     for(int i = 0; i<ngrupos; i++){
         for(String evaluado : datos){
             if(evaluado != null && grupos[i].equals(evaluado)){
                 frecuencia[i]++;
             }             
         }
     }
     
     
     
     
     for(int i=0; i<ngrupos; i++){
         
         
                      moda+= "  Num. " + grupos[i] + " = " + frecuencia[i] + " repeticiones. \n";
                      
     }
     return moda;
}
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Estadisticas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
