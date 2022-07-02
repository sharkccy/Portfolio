
import java.text.SimpleDateFormat;import java.util.Date;
import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {

    private Date date = new Date();
        
    public Frame() {
        initComponents();
        this.setLocationRelativeTo(null);        
        output.setVisible(false);
        jsout.setVisible(false);
        jd.setDate(date);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        show = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        jd = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jsout = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("新細明體", 1, 14)); // NOI18N
        jButton1.setText("確定");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        show.setFont(new java.awt.Font("新細明體", 1, 16)); // NOI18N
        show.setForeground(new java.awt.Color(204, 0, 0));

        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        area.setLineWrap(true);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jButton2.setFont(new java.awt.Font("新細明體", 1, 14)); // NOI18N
        jButton2.setText("清除");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seiya.jpg"))); // NOI18N

        jd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jd.setFont(new java.awt.Font("新細明體", 1, 13)); // NOI18N

        jButton3.setFont(new java.awt.Font("新細明體", 1, 14)); // NOI18N
        jButton3.setText("列印");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("新細明體", 1, 14)); // NOI18N
        jLabel1.setText("生日");

        jLabel2.setFont(new java.awt.Font("新細明體", 1, 14)); // NOI18N
        jLabel2.setText("血型");

        jComboBox1.setFont(new java.awt.Font("新細明體", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A型", "B型", "O型", "AB型" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("微軟正黑體", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("小宇宙星座命理");

        output.setColumns(20);
        output.setRows(5);
        jsout.setViewportView(output);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jd, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(13, 13, 13))))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)))
                                .addGap(21, 21, 21)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)))
                        .addComponent(img)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jsout, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jsout, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Date d = jd.getDate();
        SimpleDateFormat df = new SimpleDateFormat("M/dd");
        String s = df.format(d);
        String data[] = s.split("/");        
        int num = Integer.parseInt(data[0] + data[1]);               
        
        if(num >= 120 && num <= 219){
           show.setText("您的生日為:" + data[0] + "月" + data[1] + "日，水瓶座");
           area.setText("崇尚自由、創意十足、興趣廣闊、有前瞻性。\n獨立、有個人風格。對自己的感情忠實、對人非常友愛而富同情心。");
           img.setIcon(new javax.swing.ImageIcon(getClass().getResource("1.jpg"))); 
        } 
        
        if(num >= 220 && num <= 320){
           show.setText("您的生日為:" + data[0] + "月" + data[1] + "日，雙魚座");
           area.setText("感情豐富、慈悲心懷、善解人意、具有想像力。\n不自私、懂得包容、溫和有禮、直覺力強、不多疑、浪漫、多才多藝。");
           img.setIcon(new javax.swing.ImageIcon(getClass().getResource("2.jpg"))); 
        }
         
        if(num >= 321 && num <= 420){
           show.setText("您的生日為:" + data[0] + "月" + data[1] + "日，牡羊座");
           area.setText("深愛自由，不喜歡受到外界的壓抑、有企圖心。有冒險精神、勇於嘗試。一旦確定目標就會全力以赴。\n做事積極、熱情有活力有擔當。");
           img.setIcon(new javax.swing.ImageIcon(getClass().getResource("3.jpg"))); 
        }
        
        if(num >= 421 && num <= 520){
           show.setText("您的生日為:" + data[0] + "月" + data[1] + "日，金牛座");
           area.setText("耐性十足、一往情深、有藝術天份、腳踏實地。\n做事有計劃、能堅持到底、擇善固執、追求和平、生活有規律、值得信賴、有主見。");
           img.setIcon(new javax.swing.ImageIcon(getClass().getResource("4.jpg"))); 
        }
        
        if(num >= 521 && num <= 621){
           show.setText("您的生日為:" + data[0] + "月" + data[1] + "日，雙子座");
           area.setText("多才多藝、見人說人話、見鬼說鬼話、足智多謀。\n反應靈敏、八面玲瓏、善於交際、懂得隨機應變、充滿生命力、擅長溝通、知進退。");
           img.setIcon(new javax.swing.ImageIcon(getClass().getResource("5.jpg"))); 
        }
        
        if(num >= 622 && num <= 722){
           show.setText("您的生日為:" + data[0] + "月" + data[1] + "日，巨蟹座");
           area.setText("情感真摯深切、想像力豐富、念舊、重情義。\n有包容力、直覺敏銳、懂得體貼、關懷、親切、溫暖、善解人意、有同情心、善良、熱心。");
           img.setIcon(new javax.swing.ImageIcon(getClass().getResource("6.jpg"))); 
         }
        
        if(num >= 723 && num <= 822){
          show.setText("您的生日為:" + data[0] + "月" + data[1] + "日，獅子座");
          area.setText("有領導能力、具有激勵人心的氣質、組織力強。\n熱情開朗、對人慷慨、大方、心胸寬大，懂得寬恕、一言九鼎、有信用。");
          img.setIcon(new javax.swing.ImageIcon(getClass().getResource("7.jpg"))); 
        } 
        
        if(num >= 823 && num <= 922){
          show.setText("您的生日為:" + data[0] + "月" + data[1] + "日，處女座");
          area.setText("追求完美、永不氣餒、腳踏實地、事事謹慎、小心。\n善於蒐集資料、勤奮努力、守本份、靠得住、謙遜不誇大。");
          img.setIcon(new javax.swing.ImageIcon(getClass().getResource("8.jpg"))); 
        }
        
        if(num >= 923 && num <= 1022){
          show.setText("您的生日為:" + data[0] + "月" + data[1] + "日，天秤座");
          area.setText("公平客觀、有正義感、適應力強、對美感有鑑賞力。\n邏輯強，善分析、天生的優雅風采、浪漫的戀愛高手。");
          img.setIcon(new javax.swing.ImageIcon(getClass().getResource("9.jpg"))); 
        } 
        
        if(num >= 1023 && num <= 1121){
          show.setText("您的生日為:" + data[0] + "月" + data[1] + "日，天蠍座");
          area.setText("深謀遠慮、恩怨分明、直覺敏銳、有執行力。\n不畏挫折、堅持到底、對朋友講義氣、天生的性感魅力、堅持追求事情的真相。");
          img.setIcon(new javax.swing.ImageIcon(getClass().getResource("10.jpg"))); 
        } 
        
        if(num >= 1122 && num <= 1221){
          show.setText("您的生日為:" + data[0] + "月" + data[1] + "日，射手座");
          area.setText("天生樂觀、對人生充滿理想、正直坦率、豐富幽默感。\n酷愛和平、待人友善、行動力強、有自己的處世哲學、經得起打擊。");
          img.setIcon(new javax.swing.ImageIcon(getClass().getResource("11.jpg"))); 
        } 
        
        if(num >= 1222 || num <= 119){
          show.setText("您的生日為:" + data[0] + "月" + data[1] + "日，魔羯座");
          area.setText("有實際的人生觀、做事腳踏實地、意志力強。\n不容易受影響、處處謹慎、有克服困難的毅力、堅守原則、重視紀律、有家庭觀念。");
          img.setIcon(new javax.swing.ImageIcon(getClass().getResource("12.jpg"))); 
        } 
        area.setLineWrap(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jd.setDate(date);
        show.setText("");
        area.setText("");
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("seiya.jpg"))); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String ss = show.getText() +"\n" + area.getText();
        output.setText(ss);
        
        try {
            boolean ok = output.print();
            if(ok)
                JOptionPane.showMessageDialog(rootPane, "列印完成!!!");
            else
                JOptionPane.showMessageDialog(rootPane, "列印失敗!!!");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private com.toedter.calendar.JDateChooser jd;
    private javax.swing.JScrollPane jsout;
    private javax.swing.JTextArea output;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
