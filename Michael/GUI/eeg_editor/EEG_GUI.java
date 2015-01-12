
/**
 *
 * @author Michael
 */
public class EEG_GUI extends javax.swing.JFrame {

    /**
     * Creates new form EEG_GUI
     */
    public EEG_GUI() {
        initComponents();
    }

    /**
     * 
     * WARNING: Do NOT modify this code. 
     *      */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        Painel_Marcador_Eventos = new javax.swing.JPanel();
        Button_Event_1 = new javax.swing.JToggleButton();
        Event_Field_1 = new javax.swing.JTextField();
        Event_Field_2 = new javax.swing.JTextField();
        Button_Event_2 = new javax.swing.JToggleButton();
        Event_Field_3 = new javax.swing.JTextField();
        Button_Event_3 = new javax.swing.JToggleButton();
        Button_Event_4 = new javax.swing.JToggleButton();
        Event_Field_4 = new javax.swing.JTextField();
        Event_Field_5 = new javax.swing.JTextField();
        Button_Event_5 = new javax.swing.JToggleButton();
        Button_Event_6 = new javax.swing.JToggleButton();
        Event_Field_6 = new javax.swing.JTextField();
        Button_Event_7 = new javax.swing.JToggleButton();
        Event_Field_7 = new javax.swing.JTextField();
        Event_Field_8 = new javax.swing.JTextField();
        Button_Event_8 = new javax.swing.JToggleButton();
        Event_Field_9 = new javax.swing.JTextField();
        Button_Event_9 = new javax.swing.JToggleButton();
        Event_Field_10 = new javax.swing.JTextField();
        Button_Event_10 = new javax.swing.JToggleButton();
        Button_Event_11 = new javax.swing.JToggleButton();
        Event_Field_11 = new javax.swing.JTextField();
        Event_Field_12 = new javax.swing.JTextField();
        Button_Event_12 = new javax.swing.JToggleButton();
        Event_Field_13 = new javax.swing.JTextField();
        Button_Event_13 = new javax.swing.JToggleButton();
        Event_Field_14 = new javax.swing.JTextField();
        Button_Event_14 = new javax.swing.JToggleButton();
        Button_Event_15 = new javax.swing.JToggleButton();
        Event_Field_15 = new javax.swing.JTextField();
        Painel_Inferior = new javax.swing.JPanel();
        Painel_Graficos = new javax.swing.JPanel();
        Menu_Bar = new javax.swing.JMenuBar();
        Menu_Abrir = new javax.swing.JMenu();
        Menu_Salvar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Painel_Marcador_Eventos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Button_Event_1.setText("<F1>");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button_Event_1, org.jdesktop.beansbinding.ELProperty.create("${selected}"), Button_Event_1, org.jdesktop.beansbinding.BeanProperty.create("action"));
        bindingGroup.addBinding(binding);

        Button_Event_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Event_1ActionPerformed(evt);
            }
        });
        Button_Event_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F1_Pressed(evt);
            }
        });

        Event_Field_1.setText("Evento1");
        Event_Field_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event_Field_1ActionPerformed(evt);
            }
        });

        Event_Field_2.setText("Evento2");

        Button_Event_2.setText("<F2>");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button_Event_2, org.jdesktop.beansbinding.ELProperty.create("${selected}"), Button_Event_2, org.jdesktop.beansbinding.BeanProperty.create("action"));
        bindingGroup.addBinding(binding);

        Button_Event_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F2_Pressed(evt);
            }
        });

        Event_Field_3.setText("Evento3");

        Button_Event_3.setText("<F3>");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button_Event_3, org.jdesktop.beansbinding.ELProperty.create("${selected}"), Button_Event_3, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        Button_Event_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F3_Pressed(evt);
            }
        });

        Button_Event_4.setText("<F4>");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button_Event_4, org.jdesktop.beansbinding.ELProperty.create("${selected}"), Button_Event_4, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        Button_Event_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F4_Pressed(evt);
            }
        });

        Event_Field_4.setText("Evento4");

        Event_Field_5.setText("Evento5");

        Button_Event_5.setText("<F5>");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button_Event_5, org.jdesktop.beansbinding.ELProperty.create("${selected}"), Button_Event_5, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        Button_Event_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F5_Pressed(evt);
            }
        });

        Button_Event_6.setText("<F6>");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button_Event_6, org.jdesktop.beansbinding.ELProperty.create("${selected}"), Button_Event_6, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        Button_Event_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F6_Pressed(evt);
            }
        });

        Event_Field_6.setText("Evento6");

        Button_Event_7.setText("<F7>");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button_Event_7, org.jdesktop.beansbinding.ELProperty.create("${selected}"), Button_Event_7, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        Button_Event_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F7_Pressed(evt);
            }
        });

        Event_Field_7.setText("Evento7");
        Event_Field_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event_Field_7ActionPerformed(evt);
            }
        });

        Event_Field_8.setText("Evento8");

        Button_Event_8.setText("<F8>");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button_Event_8, org.jdesktop.beansbinding.ELProperty.create("${selected}"), Button_Event_8, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        Button_Event_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F8_Pressed(evt);
            }
        });

        Event_Field_9.setText("Evento9");

        Button_Event_9.setText("<F9>");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button_Event_9, org.jdesktop.beansbinding.ELProperty.create("${selected}"), Button_Event_9, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        Button_Event_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F9_Pressed(evt);
            }
        });

        Event_Field_10.setText("Evento10");

        Button_Event_10.setText("<F10>");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button_Event_10, org.jdesktop.beansbinding.ELProperty.create("${selected}"), Button_Event_10, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        Button_Event_10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F10_Pressed(evt);
            }
        });

        Button_Event_11.setText("<F11>");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button_Event_11, org.jdesktop.beansbinding.ELProperty.create("${selected}"), Button_Event_11, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        Button_Event_11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                F11_Pressed(evt);
            }
        });

        Event_Field_11.setText("Evento11");
        Event_Field_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event_Field_11ActionPerformed(evt);
            }
        });

        Event_Field_12.setText("Evento12");

        Button_Event_12.setText("<F12>");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button_Event_12, org.jdesktop.beansbinding.ELProperty.create("${selected}"), Button_Event_12, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        Button_Event_12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F12_Pressed(evt);
            }
        });

        Event_Field_13.setText("Evento13");

        Button_Event_13.setText("<F1>+<Alt>");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button_Event_13, org.jdesktop.beansbinding.ELProperty.create("${selected}"), Button_Event_13, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        Button_Event_13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F1_Alt_Pressed(evt);
            }
        });

        Event_Field_14.setText("Evento14");
        Event_Field_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event_Field_14ActionPerformed(evt);
            }
        });

        Button_Event_14.setText("<F2>+<Alt>");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button_Event_14, org.jdesktop.beansbinding.ELProperty.create("${selected}"), Button_Event_14, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        Button_Event_14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F2_Alt_Pressed(evt);
            }
        });

        Button_Event_15.setText("<F3>+<Alt>");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button_Event_15, org.jdesktop.beansbinding.ELProperty.create("${selected}"), Button_Event_15, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        Button_Event_15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F3_Alt_Pressed(evt);
            }
        });

        Event_Field_15.setText("Evento15");

        javax.swing.GroupLayout Painel_Marcador_EventosLayout = new javax.swing.GroupLayout(Painel_Marcador_Eventos);
        Painel_Marcador_Eventos.setLayout(Painel_Marcador_EventosLayout);
        Painel_Marcador_EventosLayout.setHorizontalGroup(
            Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addComponent(Event_Field_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Event_1))
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addComponent(Event_Field_2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Event_2))
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addComponent(Event_Field_3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Event_3))
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addComponent(Event_Field_4, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Event_4))
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addComponent(Event_Field_5, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Event_5))
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addComponent(Event_Field_6, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Event_6))
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addComponent(Event_Field_7, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Event_7))
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addComponent(Event_Field_8, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Event_8))
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addComponent(Event_Field_9, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Event_9))
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addComponent(Event_Field_10, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Event_10))
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addComponent(Event_Field_11, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Event_11))
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addComponent(Event_Field_12, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Event_12))
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addComponent(Event_Field_13, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Event_13))
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addComponent(Event_Field_14, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Event_14))
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addComponent(Event_Field_15, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Event_15))
        );
        Painel_Marcador_EventosLayout.setVerticalGroup(
            Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_Marcador_EventosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_Field_1)
                    .addComponent(Button_Event_1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_Field_2)
                    .addComponent(Button_Event_2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_Field_3)
                    .addComponent(Button_Event_3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_Field_4)
                    .addComponent(Button_Event_4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_Field_5)
                    .addComponent(Button_Event_5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_Field_6)
                    .addComponent(Button_Event_6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_Field_7)
                    .addComponent(Button_Event_7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_Field_8)
                    .addComponent(Button_Event_8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_Field_9)
                    .addComponent(Button_Event_9, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_Field_10)
                    .addComponent(Button_Event_10, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_Field_11)
                    .addComponent(Button_Event_11, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_Field_12)
                    .addComponent(Button_Event_12, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_Field_13)
                    .addComponent(Button_Event_13, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_Field_14)
                    .addComponent(Button_Event_14, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(Painel_Marcador_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_Field_15)
                    .addComponent(Button_Event_15, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Painel_Inferior.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Painel_InferiorLayout = new javax.swing.GroupLayout(Painel_Inferior);
        Painel_Inferior.setLayout(Painel_InferiorLayout);
        Painel_InferiorLayout.setHorizontalGroup(
            Painel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Painel_InferiorLayout.setVerticalGroup(
            Painel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        Painel_Graficos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Painel_GraficosLayout = new javax.swing.GroupLayout(Painel_Graficos);
        Painel_Graficos.setLayout(Painel_GraficosLayout);
        Painel_GraficosLayout.setHorizontalGroup(
            Painel_GraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1397, Short.MAX_VALUE)
        );
        Painel_GraficosLayout.setVerticalGroup(
            Painel_GraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        Menu_Abrir.setText("Abrir");
        Menu_Abrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_AbrirMouseClicked(evt);
            }
        });
        Menu_Bar.add(Menu_Abrir);

        Menu_Salvar.setText("Salvar");
        Menu_Bar.add(Menu_Salvar);

        setJMenuBar(Menu_Bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Painel_Marcador_Eventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Painel_Inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel_Graficos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Marcador_Eventos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Painel_Graficos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel_Inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Event_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Event_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Event_1ActionPerformed

    private void Event_Field_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event_Field_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event_Field_1ActionPerformed

    private void Event_Field_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event_Field_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event_Field_7ActionPerformed

    private void Event_Field_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event_Field_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event_Field_11ActionPerformed

    private void Event_Field_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event_Field_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event_Field_14ActionPerformed

    private void F1_Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F1_Pressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F1_Pressed

    private void F2_Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F2_Pressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F2_Pressed

    private void F3_Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F3_Pressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F3_Pressed

    private void F4_Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F4_Pressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F4_Pressed

    private void F9_Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F9_Pressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F9_Pressed

    private void F10_Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F10_Pressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F10_Pressed

    private void F11_Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F11_Pressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F11_Pressed

    private void F12_Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F12_Pressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F12_Pressed

    private void F1_Alt_Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F1_Alt_Pressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F1_Alt_Pressed

    private void F2_Alt_Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F2_Alt_Pressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F2_Alt_Pressed

    private void F3_Alt_Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F3_Alt_Pressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F3_Alt_Pressed

    private void F5_Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F5_Pressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F5_Pressed

    private void F6_Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F6_Pressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F6_Pressed

    private void F7_Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F7_Pressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F7_Pressed

    private void F8_Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F8_Pressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F8_Pressed

    private void Menu_AbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_AbrirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_AbrirMouseClicked

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
            java.util.logging.Logger.getLogger(EEG_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EEG_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EEG_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EEG_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EEG_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Button_Event_1;
    private javax.swing.JToggleButton Button_Event_10;
    private javax.swing.JToggleButton Button_Event_11;
    private javax.swing.JToggleButton Button_Event_12;
    private javax.swing.JToggleButton Button_Event_13;
    private javax.swing.JToggleButton Button_Event_14;
    private javax.swing.JToggleButton Button_Event_15;
    private javax.swing.JToggleButton Button_Event_2;
    private javax.swing.JToggleButton Button_Event_3;
    private javax.swing.JToggleButton Button_Event_4;
    private javax.swing.JToggleButton Button_Event_5;
    private javax.swing.JToggleButton Button_Event_6;
    private javax.swing.JToggleButton Button_Event_7;
    private javax.swing.JToggleButton Button_Event_8;
    private javax.swing.JToggleButton Button_Event_9;
    private javax.swing.JTextField Event_Field_1;
    private javax.swing.JTextField Event_Field_10;
    private javax.swing.JTextField Event_Field_11;
    private javax.swing.JTextField Event_Field_12;
    private javax.swing.JTextField Event_Field_13;
    private javax.swing.JTextField Event_Field_14;
    private javax.swing.JTextField Event_Field_15;
    private javax.swing.JTextField Event_Field_2;
    private javax.swing.JTextField Event_Field_3;
    private javax.swing.JTextField Event_Field_4;
    private javax.swing.JTextField Event_Field_5;
    private javax.swing.JTextField Event_Field_6;
    private javax.swing.JTextField Event_Field_7;
    private javax.swing.JTextField Event_Field_8;
    private javax.swing.JTextField Event_Field_9;
    private javax.swing.JMenu Menu_Abrir;
    private javax.swing.JMenuBar Menu_Bar;
    private javax.swing.JMenu Menu_Salvar;
    private javax.swing.JPanel Painel_Graficos;
    private javax.swing.JPanel Painel_Inferior;
    private javax.swing.JPanel Painel_Marcador_Eventos;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
