
package gui_project;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;


public class calculatorM extends javax.swing.JFrame {


public void ChangeStatus(){
    DigTxt.setEnabled(!DigTxt.isEnabled());
    jRadioButton1.setEnabled(!jRadioButton1.isEnabled()); // ON button disabled
    jRadioButton3.setEnabled(!jRadioButton3.isEnabled());   // OFF button Enabled   
     jRadioButton1.setSelected(!jRadioButton1.isEnabled());
    jRadioButton3.setSelected(!jRadioButton3.isEnabled());
    Zero.setEnabled(!Zero.isEnabled());
    One.setEnabled(!One.isEnabled());
    Two.setEnabled(!Two.isEnabled());
    Three.setEnabled(!Three.isEnabled());
    Four.setEnabled(!Four.isEnabled());
    Five.setEnabled(!Five.isEnabled());
    Six.setEnabled(!Six.isEnabled());
    Seven.setEnabled(!Seven.isEnabled());
    Eight.setEnabled(!Eight.isEnabled());
    Nine.setEnabled(!Nine.isEnabled());
    Minus.setEnabled(!Minus.isEnabled());
    Plus.setEnabled(!Plus.isEnabled());
    Multiplication.setEnabled(!Multiplication.isEnabled());
    DeleteAll.setEnabled(!DeleteAll.isEnabled());
    Delete.setEnabled(!Delete.isEnabled());
    OverX.setEnabled(!OverX.isEnabled());
    Point.setEnabled(!Point.isEnabled());
    Sqrt.setEnabled(!Sqrt.isEnabled());
    Square.setEnabled(!Square.isEnabled());
    Division.setEnabled(!Division.isEnabled());
    Equal.setEnabled(!Equal.isEnabled());
}
double num,ans;
int calculation;
    public calculatorM() {
        initComponents();
    }
    javax.swing.InputVerifier verifier = new javax.swing.InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
        final javax.swing.text.JTextComponent source = (javax.swing.text.JTextComponent) input;
        String text = source.getText();
        if(!text.endsWith(".*[a-z].*")) {System.out.println("Wazaap"); return false;} return true;
            }
    };
    public void arithmetic_operation()
    {
        switch(calculation)
        {
            case 1: // ADDITON
                ans = num + Double.parseDouble(DigTxt.getText());
                DigTxt.setText(Double.toString(ans));
                break;
                
            case 2: // SUBTRACTION 
                ans = num - Double.parseDouble(DigTxt.getText());
                DigTxt.setText(Double.toString(ans));
                break;    
            case 3: // MULTIPLICATION
                ans = num * Double.parseDouble(DigTxt.getText());
                DigTxt.setText(Double.toString(ans));
                break;
            case 4:  // DIVISION
                ans = num / Double.parseDouble(DigTxt.getText());
                DigTxt.setText(Double.toString(ans));
                break; 
            case 5:  // 1/x 
                ans = 1 / Double.parseDouble(DigTxt.getText());
                DigTxt.setText(Double.toString(ans));
                break;    
            case 6:  // SQRT
                ans = num / Double.parseDouble(DigTxt.getText());
                DigTxt.setText(Double.toString(ans));
                break;    
            case 7:  // Square
                ans = num * num;
                DigTxt.setText(Double.toString(ans));
                break;    
                
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OnAndOff = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        Topone = new javax.swing.JPanel();
        DigitDisplay = new javax.swing.JPanel();
        DigTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Numbers = new javax.swing.JPanel();
        Zero = new javax.swing.JButton();
        One = new javax.swing.JButton();
        Two = new javax.swing.JButton();
        Three = new javax.swing.JButton();
        Four = new javax.swing.JButton();
        Five = new javax.swing.JButton();
        Six = new javax.swing.JButton();
        Seven = new javax.swing.JButton();
        Eight = new javax.swing.JButton();
        Nine = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        Multiplication = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Equal = new javax.swing.JButton();
        Point = new javax.swing.JButton();
        Sqrt = new javax.swing.JButton();
        Square = new javax.swing.JButton();
        OverX = new javax.swing.JButton();
        DeleteAll = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 250));
        setSize(new java.awt.Dimension(250, 500));
        setType(java.awt.Window.Type.UTILITY);

        Topone.setBackground(new java.awt.Color(0, 0, 0));

        DigitDisplay.setBackground(new java.awt.Color(0, 0, 0));

        DigTxt.setBackground(new java.awt.Color(204, 204, 204));
        DigTxt.setInputVerifier(verifier);
        DigTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigTxtActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText(".");

        javax.swing.GroupLayout DigitDisplayLayout = new javax.swing.GroupLayout(DigitDisplay);
        DigitDisplay.setLayout(DigitDisplayLayout);
        DigitDisplayLayout.setHorizontalGroup(
            DigitDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DigitDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DigitDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DigTxt)
                    .addGroup(DigitDisplayLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        DigitDisplayLayout.setVerticalGroup(
            DigitDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DigitDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DigTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        Numbers.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout ToponeLayout = new javax.swing.GroupLayout(Topone);
        Topone.setLayout(ToponeLayout);
        ToponeLayout.setHorizontalGroup(
            ToponeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DigitDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ToponeLayout.createSequentialGroup()
                .addComponent(Numbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ToponeLayout.setVerticalGroup(
            ToponeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToponeLayout.createSequentialGroup()
                .addComponent(DigitDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Numbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Zero.setBackground(new java.awt.Color(204, 204, 204));
        Zero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Zero.setText("0");
        Zero.setName("0"); // NOI18N
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToText(evt);
            }
        });

        One.setBackground(new java.awt.Color(204, 204, 204));
        One.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        One.setText("1");
        One.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToText(evt);
            }
        });

        Two.setBackground(new java.awt.Color(204, 204, 204));
        Two.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Two.setText("2");
        Two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToText(evt);
            }
        });

        Three.setBackground(new java.awt.Color(204, 204, 204));
        Three.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Three.setText("3");
        Three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToText(evt);
            }
        });

        Four.setBackground(new java.awt.Color(204, 204, 204));
        Four.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Four.setText("4");
        Four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToText(evt);
            }
        });

        Five.setBackground(new java.awt.Color(204, 204, 204));
        Five.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Five.setText("5");
        Five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToText(evt);
            }
        });

        Six.setBackground(new java.awt.Color(204, 204, 204));
        Six.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Six.setText("6");
        Six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToText(evt);
            }
        });

        Seven.setBackground(new java.awt.Color(204, 204, 204));
        Seven.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Seven.setText("7");
        Seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToText(evt);
            }
        });

        Eight.setBackground(new java.awt.Color(204, 204, 204));
        Eight.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Eight.setText("8");
        Eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToText(evt);
            }
        });

        Nine.setBackground(new java.awt.Color(204, 204, 204));
        Nine.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Nine.setText("9");
        Nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToText(evt);
            }
        });

        Plus.setBackground(new java.awt.Color(255, 204, 0));
        Plus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Plus.setText("+");
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });

        Minus.setBackground(new java.awt.Color(255, 204, 0));
        Minus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Minus.setText("-");
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });

        Multiplication.setBackground(new java.awt.Color(255, 204, 0));
        Multiplication.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Multiplication.setText("X");
        Multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicationActionPerformed(evt);
            }
        });

        Division.setBackground(new java.awt.Color(255, 204, 0));
        Division.setFont(new java.awt.Font("DecoType Thuluth", 1, 14)); // NOI18N
        Division.setText("/");
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });

        Equal.setBackground(new java.awt.Color(255, 204, 0));
        Equal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Equal.setText("=");
        Equal.setName("="); // NOI18N
        Equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualActionPerformed(evt);
            }
        });

        Point.setBackground(new java.awt.Color(204, 204, 204));
        Point.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Point.setText(".");
        Point.setToolTipText("");
        Point.setName("."); // NOI18N
        Point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToText(evt);
            }
        });

        Sqrt.setBackground(new java.awt.Color(204, 204, 204));
        Sqrt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Sqrt.setText("sqr");
        Sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SqrtActionPerformed(evt);
            }
        });

        Square.setBackground(new java.awt.Color(204, 204, 204));
        Square.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Square.setText("x^2");
        Square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquareActionPerformed(evt);
            }
        });

        OverX.setBackground(new java.awt.Color(204, 204, 204));
        OverX.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OverX.setText("1/x");
        OverX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OverXActionPerformed(evt);
            }
        });

        DeleteAll.setBackground(new java.awt.Color(255, 51, 51));
        DeleteAll.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        DeleteAll.setForeground(new java.awt.Color(255, 255, 255));
        DeleteAll.setText("C");
        DeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAllActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(255, 51, 51));
        Delete.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("DEL");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("on");
        jRadioButton1.setEnabled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("off");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Topone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Seven, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DeleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Eight, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Nine, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Four, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Five, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Six, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Sqrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Square, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OverX, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(One, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Two, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Point, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Three, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Equal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Topone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DeleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OverX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Square, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seven, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Five, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Four, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Six, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(One, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Two, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Three, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Point, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualActionPerformed
       arithmetic_operation();
       jLabel2.setText("");
       
    }//GEN-LAST:event_EqualActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        num = Double.parseDouble(DigTxt.getText());
        calculation = 1;
        DigTxt.setText("");
        jLabel2.setText(num + "+");
    }//GEN-LAST:event_PlusActionPerformed

    private void SqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SqrtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SqrtActionPerformed

    private void SquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquareActionPerformed
       num = Double.parseDouble(DigTxt.getText());
        calculation = 7;
        DigTxt.setText("");
        
    }//GEN-LAST:event_SquareActionPerformed

    private void OverXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OverXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OverXActionPerformed

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
        num = Double.parseDouble(DigTxt.getText());
        calculation = 2;
        DigTxt.setText("");
        jLabel2.setText(num + "-");
    }//GEN-LAST:event_MinusActionPerformed

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
        num = Double.parseDouble(DigTxt.getText());
        calculation = 4;
        DigTxt.setText("");
        jLabel2.setText(num + "/");
    }//GEN-LAST:event_DivisionActionPerformed

    private void DeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAllActionPerformed
        DigTxt.setText("");
      
        
    }//GEN-LAST:event_DeleteAllActionPerformed

    private void MultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicationActionPerformed
         num = Double.parseDouble(DigTxt.getText());
        calculation = 3;
        DigTxt.setText("");
        jLabel2.setText(num + "*");
    }//GEN-LAST:event_MultiplicationActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        
        int length = DigTxt.getText().length();
        int number = DigTxt.getText().length() - 1;
        String store;
        
        if(length > 0)
        {
            StringBuilder back =new StringBuilder(DigTxt.getText());
            back.deleteCharAt(number);
            store = back.toString();
            DigTxt.setText(store);
            //DigTxt.setInputVerifier(verifier);
        }
        
        
      
 
        
        
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       ChangeStatus(); // calling enable method 
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
       ChangeStatus(); // calling disable method
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void DigTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DigTxtActionPerformed

    }//GEN-LAST:event_DigTxtActionPerformed

    private void AddToText(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToText
        if(evt.getSource() instanceof javax.swing.JButton)
        {
        javax.swing.JButton b = (javax.swing.JButton)evt.getSource();
        DigTxt.setText(DigTxt.getText() + b.getText());
        }
    }//GEN-LAST:event_AddToText

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
    private javax.swing.JButton Delete;
    private javax.swing.JButton DeleteAll;
    private javax.swing.JTextField DigTxt;
    private javax.swing.JPanel DigitDisplay;
    private javax.swing.JButton Division;
    private javax.swing.JButton Eight;
    private javax.swing.JButton Equal;
    private javax.swing.JButton Five;
    private javax.swing.JButton Four;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Multiplication;
    private javax.swing.JButton Nine;
    private javax.swing.JPanel Numbers;
    private javax.swing.ButtonGroup OnAndOff;
    private javax.swing.JButton One;
    private javax.swing.JButton OverX;
    private javax.swing.JButton Plus;
    private javax.swing.JButton Point;
    private javax.swing.JButton Seven;
    private javax.swing.JButton Six;
    private javax.swing.JButton Sqrt;
    private javax.swing.JButton Square;
    private javax.swing.JButton Three;
    private javax.swing.JPanel Topone;
    private javax.swing.JButton Two;
    private javax.swing.JButton Zero;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables

}
