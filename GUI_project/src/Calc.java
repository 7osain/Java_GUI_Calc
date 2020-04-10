/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author فاروق أمين تكتوك
 */
public class Calc extends javax.swing.JFrame {

    /**
     * Creates new form Calc
     */
    public Calc() {
        initComponents();
    }
public void disable()
{
    DigTxt.setEnabled(false);
    jRadioButton1.setEnabled(true); // ON button Enable
    jRadioButton3.setEnabled(false); // OFF button Disable
    
    Zero.setEnabled(false);
    One.setEnabled(false);
    Two.setEnabled(false);
    Three.setEnabled(false);
    Four.setEnabled(false);
    Five.setEnabled(false);
    Six.setEnabled(false);
    Seven.setEnabled(false);
    Eight.setEnabled(false);
    Nine.setEnabled(false);
    Minus.setEnabled(false);
    Plus.setEnabled(false);
    Multiplication.setEnabled(false);
    DeleteAll1.setEnabled(false);
    Delete.setEnabled(false);
    OverX.setEnabled(false);
    Point.setEnabled(false);
    Sqrt.setEnabled(false);
    Square.setEnabled(false);
    Division.setEnabled(false);
    Equal.setEnabled(false);
}
public void enable(){
    DigTxt.setEnabled(false);
    
    jRadioButton1.setEnabled(false); // ON button disabled
    jRadioButton3.setEnabled(true);   // OFF button Enabled
    
    Zero.setEnabled(true);
    One.setEnabled(true);
    Two.setEnabled(true);
    Three.setEnabled(true);
    Four.setEnabled(true);
    Five.setEnabled(true);
    Six.setEnabled(true);
    Seven.setEnabled(true);
    Eight.setEnabled(true);
    Nine.setEnabled(true);
    Minus.setEnabled(true);
    Plus.setEnabled(true);
    Multiplication.setEnabled(true);
    DeleteAll1.setEnabled(true);
    Delete.setEnabled(true);
    OverX.setEnabled(true);
    Point.setEnabled(true);
    Sqrt.setEnabled(true);
    Square.setEnabled(true);
    Division.setEnabled(true);
    Equal.setEnabled(true);
}
double num,ans;
int calculation;
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
           
                
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        One = new javax.swing.JButton();
        Multiplication = new javax.swing.JButton();
        Two = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Three = new javax.swing.JButton();
        Equal = new javax.swing.JButton();
        Four = new javax.swing.JButton();
        Point = new javax.swing.JButton();
        Five = new javax.swing.JButton();
        Sqrt = new javax.swing.JButton();
        Six = new javax.swing.JButton();
        Square = new javax.swing.JButton();
        Seven = new javax.swing.JButton();
        OverX = new javax.swing.JButton();
        Eight = new javax.swing.JButton();
        DeleteAll1 = new javax.swing.JButton();
        Nine = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        Zero = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        DigTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 51, 204));
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        One.setBackground(new java.awt.Color(204, 204, 204));
        One.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        One.setForeground(new java.awt.Color(0, 0, 0));
        One.setText("1");
        One.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneActionPerformed(evt);
            }
        });

        Multiplication.setBackground(new java.awt.Color(255, 204, 0));
        Multiplication.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Multiplication.setForeground(new java.awt.Color(0, 0, 0));
        Multiplication.setText("X");
        Multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicationActionPerformed(evt);
            }
        });

        Two.setBackground(new java.awt.Color(204, 204, 204));
        Two.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Two.setForeground(new java.awt.Color(0, 0, 0));
        Two.setText("2");
        Two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoActionPerformed(evt);
            }
        });

        Division.setBackground(new java.awt.Color(255, 204, 0));
        Division.setFont(new java.awt.Font("DecoType Thuluth", 1, 14)); // NOI18N
        Division.setForeground(new java.awt.Color(0, 0, 0));
        Division.setText("/");
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });

        Three.setBackground(new java.awt.Color(204, 204, 204));
        Three.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Three.setForeground(new java.awt.Color(0, 0, 0));
        Three.setText("3");
        Three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeActionPerformed(evt);
            }
        });

        Equal.setBackground(new java.awt.Color(255, 204, 0));
        Equal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Equal.setForeground(new java.awt.Color(0, 0, 0));
        Equal.setText("=");
        Equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualActionPerformed(evt);
            }
        });

        Four.setBackground(new java.awt.Color(204, 204, 204));
        Four.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Four.setForeground(new java.awt.Color(0, 0, 0));
        Four.setText("4");
        Four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourActionPerformed(evt);
            }
        });

        Point.setBackground(new java.awt.Color(204, 204, 204));
        Point.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Point.setForeground(new java.awt.Color(0, 0, 0));
        Point.setText(".");
        Point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointActionPerformed(evt);
            }
        });

        Five.setBackground(new java.awt.Color(204, 204, 204));
        Five.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Five.setForeground(new java.awt.Color(0, 0, 0));
        Five.setText("5");
        Five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveActionPerformed(evt);
            }
        });

        Sqrt.setBackground(new java.awt.Color(204, 204, 204));
        Sqrt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Sqrt.setForeground(new java.awt.Color(0, 0, 0));
        Sqrt.setText("√");
        Sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SqrtActionPerformed(evt);
            }
        });

        Six.setBackground(new java.awt.Color(204, 204, 204));
        Six.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Six.setForeground(new java.awt.Color(0, 0, 0));
        Six.setText("6");
        Six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixActionPerformed(evt);
            }
        });

        Square.setBackground(new java.awt.Color(204, 204, 204));
        Square.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Square.setForeground(new java.awt.Color(0, 0, 0));
        Square.setText("x^2");
        Square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquareActionPerformed(evt);
            }
        });

        Seven.setBackground(new java.awt.Color(204, 204, 204));
        Seven.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Seven.setForeground(new java.awt.Color(0, 0, 0));
        Seven.setText("7");
        Seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenActionPerformed(evt);
            }
        });

        OverX.setBackground(new java.awt.Color(204, 204, 204));
        OverX.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OverX.setForeground(new java.awt.Color(0, 0, 0));
        OverX.setText("1/x");
        OverX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OverXActionPerformed(evt);
            }
        });

        Eight.setBackground(new java.awt.Color(204, 204, 204));
        Eight.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Eight.setForeground(new java.awt.Color(0, 0, 0));
        Eight.setText("8");
        Eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EightActionPerformed(evt);
            }
        });

        DeleteAll1.setBackground(new java.awt.Color(255, 51, 51));
        DeleteAll1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        DeleteAll1.setForeground(new java.awt.Color(255, 255, 255));
        DeleteAll1.setText("C");
        DeleteAll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAll1ActionPerformed(evt);
            }
        });

        Nine.setBackground(new java.awt.Color(204, 204, 204));
        Nine.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Nine.setForeground(new java.awt.Color(0, 0, 0));
        Nine.setText("9");
        Nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineActionPerformed(evt);
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

        Plus.setBackground(new java.awt.Color(255, 204, 0));
        Plus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Plus.setForeground(new java.awt.Color(0, 0, 0));
        Plus.setText("+");
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("on");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jRadioButton1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jRadioButton1PropertyChange(evt);
            }
        });

        Zero.setBackground(new java.awt.Color(204, 204, 204));
        Zero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Zero.setForeground(new java.awt.Color(0, 0, 0));
        Zero.setText("0");
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroActionPerformed(evt);
            }
        });

        Minus.setBackground(new java.awt.Color(255, 204, 0));
        Minus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Minus.setForeground(new java.awt.Color(0, 0, 0));
        Minus.setText("-");
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setForeground(java.awt.SystemColor.control);
        jRadioButton3.setText("off");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        DigTxt.setBackground(new java.awt.Color(255, 255, 255));
        DigTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigTxtActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText(".");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteAll1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Sqrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Square, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(OverX, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Nine, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(Four, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Five, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Six, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(One, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Two, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Point, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Three, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(Equal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DigTxt)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Seven, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Eight, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(DigTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DeleteAll1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OverX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Square, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seven, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nine, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Five, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Four, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Six, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(One, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Two, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Three, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Point, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        disable(); // calling disable method
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
        num = Double.parseDouble(DigTxt.getText());
        calculation = 2;
        DigTxt.setText("");
        jLabel2.setText(num + "-");
    }//GEN-LAST:event_MinusActionPerformed

    private void ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroActionPerformed
        DigTxt.setText(DigTxt.getText() + "0");
    }//GEN-LAST:event_ZeroActionPerformed

    private void jRadioButton1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jRadioButton1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1PropertyChange

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        enable(); // calling enable method
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        num = Double.parseDouble(DigTxt.getText());
        calculation = 1;
        DigTxt.setText("");
        jLabel2.setText(num + "+");
    }//GEN-LAST:event_PlusActionPerformed

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
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void NineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NineActionPerformed
        DigTxt.setText(DigTxt.getText() + "9");
    }//GEN-LAST:event_NineActionPerformed

    private void DeleteAll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAll1ActionPerformed
        DigTxt.setText("");
    }//GEN-LAST:event_DeleteAll1ActionPerformed

    private void EightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EightActionPerformed
        DigTxt.setText(DigTxt.getText() + "8");
    }//GEN-LAST:event_EightActionPerformed

    private void OverXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OverXActionPerformed
        num = Double.parseDouble(String.valueOf(DigTxt.getText()));
        num = (1 / num);
        DigTxt.setText(String.valueOf(num));
    }//GEN-LAST:event_OverXActionPerformed

    private void SevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenActionPerformed
        DigTxt.setText(DigTxt.getText() + "7");
    }//GEN-LAST:event_SevenActionPerformed

    private void SquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquareActionPerformed
        num = Double.parseDouble(String.valueOf(DigTxt.getText()));
        num = (num * num);
        DigTxt.setText(String.valueOf(num));
    }//GEN-LAST:event_SquareActionPerformed

    private void SixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixActionPerformed
        DigTxt.setText(DigTxt.getText() + "6");
    }//GEN-LAST:event_SixActionPerformed

    private void SqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SqrtActionPerformed
        num = Double.parseDouble(String.valueOf(DigTxt.getText()));
        num = Math.sqrt(num);
        DigTxt.setText(String.valueOf(num));
    }//GEN-LAST:event_SqrtActionPerformed

    private void FiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveActionPerformed
        DigTxt.setText(DigTxt.getText() + "5");
    }//GEN-LAST:event_FiveActionPerformed

    private void PointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointActionPerformed
        DigTxt.setText(DigTxt.getText() + ".");
    }//GEN-LAST:event_PointActionPerformed

    private void FourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourActionPerformed
        DigTxt.setText(DigTxt.getText() + "4");
    }//GEN-LAST:event_FourActionPerformed

    private void EqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualActionPerformed
        arithmetic_operation();
        jLabel2.setText("");
    }//GEN-LAST:event_EqualActionPerformed

    private void ThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeActionPerformed
        DigTxt.setText(DigTxt.getText() + "3");
    }//GEN-LAST:event_ThreeActionPerformed

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
        num = Double.parseDouble(DigTxt.getText());
        calculation = 4;
        DigTxt.setText("");
        jLabel2.setText(num + "/");
    }//GEN-LAST:event_DivisionActionPerformed

    private void TwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoActionPerformed
        DigTxt.setText(DigTxt.getText() + "2");
    }//GEN-LAST:event_TwoActionPerformed

    private void MultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicationActionPerformed
        num = Double.parseDouble(DigTxt.getText());
        calculation = 3;
        DigTxt.setText("");
        jLabel2.setText(num + "*");
    }//GEN-LAST:event_MultiplicationActionPerformed

    private void OneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneActionPerformed
        DigTxt.setText(DigTxt.getText() + "1");
    }//GEN-LAST:event_OneActionPerformed

    private void DigTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DigTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DigTxtActionPerformed

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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton DeleteAll1;
    private javax.swing.JTextField DigTxt;
    private javax.swing.JButton Division;
    private javax.swing.JButton Eight;
    private javax.swing.JButton Equal;
    private javax.swing.JButton Five;
    private javax.swing.JButton Four;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Multiplication;
    private javax.swing.JButton Nine;
    private javax.swing.JButton One;
    private javax.swing.JButton OverX;
    private javax.swing.JButton Plus;
    private javax.swing.JButton Point;
    private javax.swing.JButton Seven;
    private javax.swing.JButton Six;
    private javax.swing.JButton Sqrt;
    private javax.swing.JButton Square;
    private javax.swing.JButton Three;
    private javax.swing.JButton Two;
    private javax.swing.JButton Zero;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}