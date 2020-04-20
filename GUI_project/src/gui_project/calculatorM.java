
package gui_project;

import java.awt.*;


public class calculatorM extends javax.swing.JFrame {


    public calculatorM() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jButton14 = new javax.swing.JButton();
        background = new javax.swing.JPanel();
        dash = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        del = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        C = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        onButton = new javax.swing.JRadioButton();
        offButton = new javax.swing.JRadioButton();
        screen = new javax.swing.JTextField();
        minus = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        multiplication = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        addition = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        equals = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        overX = new javax.swing.JButton();
        numNine = new javax.swing.JButton();
        numSix = new javax.swing.JButton();
        numThree = new javax.swing.JButton();
        decimalPoint = new javax.swing.JButton();
        numZero = new javax.swing.JButton();
        square = new javax.swing.JButton();
        numFive = new javax.swing.JButton();
        numEight = new javax.swing.JButton();
        numTwo = new javax.swing.JButton();
        numSeven = new javax.swing.JButton();
        numFour = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        numOne = new javax.swing.JButton();

        jButton14.setText("1");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 250));
        setMaximumSize(new java.awt.Dimension(290, 560));
        setMinimumSize(new java.awt.Dimension(290, 560));
        setPreferredSize(new java.awt.Dimension(360, 500));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        background.setBackground(new java.awt.Color(0, 0, 0));
        background.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        background.setPreferredSize(new java.awt.Dimension(400, 508));

        dash.setBackground(new java.awt.Color(239, 188, 2));
        dash.setForeground(new java.awt.Color(255, 255, 255));
        dash.setToolTipText("");
        dash.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        dash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("/");

        javax.swing.GroupLayout dashLayout = new javax.swing.GroupLayout(dash);
        dash.setLayout(dashLayout);
        dashLayout.setHorizontalGroup(
            dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );
        dashLayout.setVerticalGroup(
            dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        del.setBackground(new java.awt.Color(255, 0, 0));
        del.setForeground(new java.awt.Color(255, 255, 255));
        del.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DEL");

        javax.swing.GroupLayout delLayout = new javax.swing.GroupLayout(del);
        del.setLayout(delLayout);
        delLayout.setHorizontalGroup(
            delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        delLayout.setVerticalGroup(
            delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        C.setBackground(new java.awt.Color(255, 0, 0));
        C.setForeground(new java.awt.Color(255, 255, 255));
        C.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("C");

        javax.swing.GroupLayout CLayout = new javax.swing.GroupLayout(C);
        C.setLayout(CLayout);
        CLayout.setHorizontalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        CLayout.setVerticalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        onButton.setBackground(new java.awt.Color(0, 0, 0));
        onButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        onButton.setForeground(new java.awt.Color(255, 255, 255));
        onButton.setText(" on");
        onButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onButtonActionPerformed(evt);
            }
        });

        offButton.setBackground(new java.awt.Color(0, 0, 0));
        offButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        offButton.setForeground(new java.awt.Color(255, 255, 255));
        offButton.setText(" off");
        offButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offButtonActionPerformed(evt);
            }
        });

        screen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenActionPerformed(evt);
            }
        });

        minus.setBackground(new java.awt.Color(239, 188, 2));
        minus.setForeground(new java.awt.Color(255, 255, 255));
        minus.setToolTipText("");
        minus.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("-");

        javax.swing.GroupLayout minusLayout = new javax.swing.GroupLayout(minus);
        minus.setLayout(minusLayout);
        minusLayout.setHorizontalGroup(
            minusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );
        minusLayout.setVerticalGroup(
            minusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minusLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        multiplication.setBackground(new java.awt.Color(239, 188, 2));
        multiplication.setForeground(new java.awt.Color(255, 255, 255));
        multiplication.setToolTipText("");
        multiplication.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        multiplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                multiplicationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                multiplicationMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("x");

        javax.swing.GroupLayout multiplicationLayout = new javax.swing.GroupLayout(multiplication);
        multiplication.setLayout(multiplicationLayout);
        multiplicationLayout.setHorizontalGroup(
            multiplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );
        multiplicationLayout.setVerticalGroup(
            multiplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(multiplicationLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        addition.setBackground(new java.awt.Color(239, 188, 2));
        addition.setForeground(new java.awt.Color(255, 255, 255));
        addition.setToolTipText("");
        addition.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        addition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                additionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                additionMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("+");

        javax.swing.GroupLayout additionLayout = new javax.swing.GroupLayout(addition);
        addition.setLayout(additionLayout);
        additionLayout.setHorizontalGroup(
            additionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );
        additionLayout.setVerticalGroup(
            additionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additionLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        equals.setBackground(new java.awt.Color(239, 188, 2));
        equals.setForeground(new java.awt.Color(255, 255, 255));
        equals.setToolTipText("");
        equals.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        equals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                equalsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                equalsMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("=");

        javax.swing.GroupLayout equalsLayout = new javax.swing.GroupLayout(equals);
        equals.setLayout(equalsLayout);
        equalsLayout.setHorizontalGroup(
            equalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );
        equalsLayout.setVerticalGroup(
            equalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );

        button1.setLabel("button1");

        overX.setText("1/x");
        overX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overXActionPerformed(evt);
            }
        });

        numNine.setText("9");
        numNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numNineActionPerformed(evt);
            }
        });

        numSix.setText("6");
        numSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSixActionPerformed(evt);
            }
        });

        numThree.setText("3");
        numThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numThreeActionPerformed(evt);
            }
        });

        decimalPoint.setText(".");
        decimalPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalPointActionPerformed(evt);
            }
        });

        numZero.setText("0");
        numZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numZeroActionPerformed(evt);
            }
        });

        square.setText("x^2");
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });

        numFive.setText("5");
        numFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numFiveActionPerformed(evt);
            }
        });

        numEight.setText("8");
        numEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numEightActionPerformed(evt);
            }
        });

        numTwo.setText("2");
        numTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTwoActionPerformed(evt);
            }
        });

        numSeven.setText("7");
        numSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSevenActionPerformed(evt);
            }
        });

        numFour.setText("4");
        numFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numFourActionPerformed(evt);
            }
        });

        sqrt.setText("√");
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });

        numOne.setText("1");
        numOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(onButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offButton)
                                    .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(C, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(overX, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(numZero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(backgroundLayout.createSequentialGroup()
                                            .addComponent(numSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(numEight, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(backgroundLayout.createSequentialGroup()
                                            .addComponent(numFour, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(numFive, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(backgroundLayout.createSequentialGroup()
                                            .addComponent(numOne, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(numTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(numThree, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(decimalPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(numSix, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(addition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(numNine, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(77, 77, 77))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(overX, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(onButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(offButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(dash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(numSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numEight, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numNine, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numSix, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numFive, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numFour, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numOne, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(numThree, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(decimalPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numZero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void numOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numOneActionPerformed

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sqrtActionPerformed

    private void numFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numFourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numFourActionPerformed

    private void numSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSevenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numSevenActionPerformed

    private void numTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numTwoActionPerformed

    private void numEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numEightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numEightActionPerformed

    private void numFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numFiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numFiveActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_squareActionPerformed

    private void numZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numZeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numZeroActionPerformed

    private void decimalPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalPointActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decimalPointActionPerformed

    private void numThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numThreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numThreeActionPerformed

    private void numSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numSixActionPerformed

    private void numNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numNineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numNineActionPerformed

    private void overXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_overXActionPerformed

    private void equalsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalsMouseExited
      equals.setBackground(new Color(239,188,2));
    }//GEN-LAST:event_equalsMouseExited

    private void equalsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalsMouseEntered
      equals.setBackground(new Color(208,162,2));
    }//GEN-LAST:event_equalsMouseEntered

    private void additionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additionMouseExited
        addition.setBackground(new Color(239,188,2));
    }//GEN-LAST:event_additionMouseExited

    private void additionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additionMouseEntered
   addition.setBackground(new Color(208,162,2));
    }//GEN-LAST:event_additionMouseEntered

    private void multiplicationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplicationMouseExited
      multiplication.setBackground(new Color(239,188,2));
    }//GEN-LAST:event_multiplicationMouseExited

    private void multiplicationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplicationMouseEntered
    multiplication.setBackground(new Color(208,162,2));
    }//GEN-LAST:event_multiplicationMouseEntered

    private void minusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseExited
         minus.setBackground(new Color(239,188,2));
    }//GEN-LAST:event_minusMouseExited

    private void minusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseEntered
     minus.setBackground(new Color(208,162,2));
    }//GEN-LAST:event_minusMouseEntered

    private void screenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_screenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_screenActionPerformed

    private void offButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_offButtonActionPerformed

    private void onButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onButtonActionPerformed

    private void CMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseExited
        C.setBackground(Color.red);
    }//GEN-LAST:event_CMouseExited

    private void CMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseEntered
        C.setBackground(new Color(223,25,25));
    }//GEN-LAST:event_CMouseEntered

    private void delMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseExited
        del.setBackground(Color.red);
    }//GEN-LAST:event_delMouseExited

    private void delMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseEntered
        del.setBackground(new Color(223,25,25));
    }//GEN-LAST:event_delMouseEntered

    private void dashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashMouseExited
        dash.setBackground(new Color(239,188,2));
    }//GEN-LAST:event_dashMouseExited

    private void dashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashMouseEntered
        dash.setBackground(new Color(208,162,2));
    }//GEN-LAST:event_dashMouseEntered

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
            java.util.logging.Logger.getLogger(calculatorM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculatorM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculatorM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculatorM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculatorM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel C;
    private javax.swing.JPanel addition;
    private javax.swing.JPanel background;
    private java.awt.Button button1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JPanel dash;
    private javax.swing.JButton decimalPoint;
    private javax.swing.JPanel del;
    private javax.swing.JPanel equals;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel minus;
    private javax.swing.JPanel multiplication;
    private javax.swing.JButton numEight;
    private javax.swing.JButton numFive;
    private javax.swing.JButton numFour;
    private javax.swing.JButton numNine;
    private javax.swing.JButton numOne;
    private javax.swing.JButton numSeven;
    private javax.swing.JButton numSix;
    private javax.swing.JButton numThree;
    private javax.swing.JButton numTwo;
    private javax.swing.JButton numZero;
    private javax.swing.JRadioButton offButton;
    private javax.swing.JRadioButton onButton;
    private javax.swing.JButton overX;
    private javax.swing.JTextField screen;
    private javax.swing.JButton sqrt;
    private javax.swing.JButton square;
    // End of variables declaration//GEN-END:variables

}
